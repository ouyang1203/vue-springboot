package com.ouyang.bootstrip.vo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="test_role")
public class RoleVo {
	@Id
	@Column(name="role_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roleId;
	@Column(name="role_name")
	private String roleName;
//	@Column(name="role_number")
//	private String roleNumber;
	@Column(name="role_no")
	private String roleNo;
	
	@ManyToMany(mappedBy="roles")
	private Set<UserVo> users = new HashSet<UserVo>() ;
	
	public RoleVo() {
	}
	
//	public RoleVo(Integer roleId, String roleName, String roleNumber) {
//		super();
//		this.roleId = roleId;
//		this.roleName = roleName;
//		this.roleNumber = roleNumber;
//	}
	public RoleVo(Integer roleId, String roleName, String roleNo) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleNo = roleNo;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
//	public String getRoleNumber() {
//		return roleNumber;
//	}
//
//	public void setRoleNumber(String roleNumber) {
//		this.roleNumber = roleNumber;
//	}

	public String getRoleNo() {
		return roleNo;
	}

	public void setRoleNo(String roleNo) {
		this.roleNo = roleNo;
	}

	public Set<UserVo> getUsers() {
		return users;
	}
	public void setUsers(Set<UserVo> users) {
		this.users = users;
	}
	
}
