package com.ouyang.bootstrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ouyang.bootstrip.vo.NewsVo;

//继承JpaSpecificationExecutor实现动态拼接sql
@Repository
public interface NewsDao extends JpaRepository<NewsVo, Integer>,JpaSpecificationExecutor<NewsVo>{

}
