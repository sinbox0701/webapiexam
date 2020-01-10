package kr.or.connect.jdbcexam.dto;

public class Role {// coonectdb의 role 테이블과 연동할 class
	private Integer roleId;
	private String  description;
	// connect db의 컬럼들
	public Role() {

	}

	public Role(Integer roleId, String description) {
		super();
		this.roleId = roleId;
		this.description = description;
	}
	
	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", description=" + description + "]";
	}
}
