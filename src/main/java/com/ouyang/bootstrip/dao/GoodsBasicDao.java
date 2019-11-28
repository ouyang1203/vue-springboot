package com.ouyang.bootstrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ouyang.bootstrip.vo.GoodsBasicVO;

@Repository
public interface GoodsBasicDao extends JpaRepository<GoodsBasicVO,Integer>,JpaSpecificationExecutor<GoodsBasicVO> {

}
