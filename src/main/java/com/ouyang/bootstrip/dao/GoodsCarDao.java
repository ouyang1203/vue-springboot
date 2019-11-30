package com.ouyang.bootstrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ouyang.bootstrip.vo.GoodsCarVO;


@Repository
public interface GoodsCarDao extends JpaRepository<GoodsCarVO,Integer>,JpaSpecificationExecutor<GoodsCarVO>{

}
