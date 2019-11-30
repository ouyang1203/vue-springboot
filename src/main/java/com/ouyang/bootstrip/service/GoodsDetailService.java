package com.ouyang.bootstrip.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ouyang.bootstrip.dao.GoodsDetailDao;
import com.ouyang.bootstrip.vo.GoodsDetailVO;

@Service
public class GoodsDetailService {
	
	private Logger log_ = LoggerFactory.getLogger(GoodsDetailService.class);
	@Autowired
	private GoodsDetailDao goodsDetailDao;
	
	public GoodsDetailVO findGoodsDetailById(Integer goodsId )throws Exception{
		log_.info("接收到前端传递的参数为:{}",goodsId);
		if(goodsId==0){
			return null;
		}
		return goodsDetailDao.findOne(goodsId);
	}
}
