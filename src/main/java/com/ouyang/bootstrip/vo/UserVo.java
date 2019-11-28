package com.ouyang.bootstrip.vo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="test_user")
public class UserVo {
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_account")
	private String userAccount;
	
	//用户拥有的角色列表,用户和角色是多对多映射
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="test_user_role",joinColumns = @JoinColumn(name="user_Id")
	,inverseJoinColumns = @JoinColumn(name="role_Id"))
	//1、关系维护端，负责多对多关系的绑定和解除
    //2、@JoinTable注解的name属性指定关联表的名字，joinColumns指定外键的名字，关联到关系维护端(User)
    //3、inverseJoinColumns指定外键的名字，要关联的关系被维护端(RoleVo)
    //4、其实可以不使用@JoinTable注解，默认生成的关联表名称为主表表名+下划线+从表表名
	private Set<RoleVo> roles = new HashSet<RoleVo>();
	
	public UserVo() {
	}

	public UserVo(Integer userId, String userName, String userAccount) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAccount = userAccount;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public Set<RoleVo> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleVo> roles) {
		this.roles = roles;
	}
	
}
