package com.ouyang.bootstrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ouyang.bootstrip.vo.CommentVo;
@Repository
public interface CommentDao extends JpaRepository<CommentVo,Integer>,JpaSpecificationExecutor<CommentVo>{

}
