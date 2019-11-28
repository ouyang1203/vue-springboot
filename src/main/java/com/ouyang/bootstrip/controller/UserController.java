package com.ouyang.bootstrip.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.util.UserServiceUtil;
import com.ouyang.bootstrip.vo.RoleVo;
import com.ouyang.bootstrip.vo.UserVo;

@RestController
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserServiceUtil serviceUtil;
	@RequestMapping(value="/addUser")
	public String addUser(){
		UserVo user = new UserVo();
		Set<RoleVo> roles = new HashSet<RoleVo>();
		user.setUserName("张三");
		user.setUserAccount("zhangsan");
		RoleVo role = new RoleVo();
		role.setRoleName("角色1");
		role.setRoleNo("r1");
		RoleVo role1 = new RoleVo();
		role1.setRoleName("角色2");
		role1.setRoleNo("r2");
		roles.add(role);
		roles.add(role1);
		user.setRoles(roles);
		serviceUtil.addUser(user, roles);
		return "添加成功";
	}
	@RequestMapping(value="/findUserById/{userId}")
	public String findUserById(@PathVariable Integer userId ){
		JSONObject obj = new JSONObject();
		obj.put("user", serviceUtil.findUserById(userId));
		return obj.toString();
	}
	@GetMapping(value="/getInfo")
	public String getInfo(){
		JSONObject obj = new JSONObject();
		obj.put("flag", "Y");
		return obj.toString();
	}
	@PostMapping(value="/postInfo")
	public String postInfo(){
		JSONObject obj = new JSONObject();
		obj.put("flag", "Y");
		return obj.toString();
	}
}
