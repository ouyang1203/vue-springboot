package com.ouyang.bootstrip.util;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ouyang.bootstrip.service.RoleService;
import com.ouyang.bootstrip.service.UserService;
import com.ouyang.bootstrip.vo.RoleVo;
import com.ouyang.bootstrip.vo.UserVo;

@Service
public class UserServiceUtil {
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	
	@Transactional
	public void addUser(UserVo user,Set<RoleVo> roles){
		userService.save(user);
	}
	
	public UserVo findUserById(Integer userId){
		return userService.getOne(userId);
	}
}
