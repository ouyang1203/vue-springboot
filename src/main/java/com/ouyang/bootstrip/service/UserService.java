package com.ouyang.bootstrip.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ouyang.bootstrip.vo.UserVo;
@Repository
public interface UserService extends JpaRepository<UserVo,Integer>{

}
