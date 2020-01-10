package kr.or.connect.webapiexam.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;
import kr.or.connect.jdbcexam.dao.RoleDao;

/**
 * Servlet implementation class RolesServlet
 */
@WebServlet("/roles")
public class RolesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RolesServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");//Encoding --> UTF-8
		response.setContentType("application/json");
		//json 타입으로 응답
		
		RoleDao dao = new RoleDao();

		List<Role> list = dao.getRoles();
		
		ObjectMapper objectMapper = new ObjectMapper();
		//json 문자열로 바꾸거나,json 문자열을 객체로 바꿈 
		String json = objectMapper.writeValueAsString(list);
		//파라미터로 넣어준 list가 json 문자열로 바뀜
		PrintWriter out = response.getWriter();
		out.println(json);
		out.close();
	}

}
