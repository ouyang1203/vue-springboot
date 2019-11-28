package com.ouyang.bootstrip.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ouyang.bootstrip.vo.RoleVo;

@Repository
public interface RoleService extends JpaRepository<RoleVo, Integer>{

}
