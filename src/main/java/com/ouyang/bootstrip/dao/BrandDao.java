package com.ouyang.bootstrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ouyang.bootstrip.vo.BrandVo;
//继承JpaSpecificationExecutor实现动态拼接sql
@Repository
public interface BrandDao extends JpaRepository<BrandVo,Integer>,JpaSpecificationExecutor<BrandVo>{

}
