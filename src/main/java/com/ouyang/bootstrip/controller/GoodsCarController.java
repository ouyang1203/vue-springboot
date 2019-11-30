package com.ouyang.bootstrip.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.service.GoodsCarService;
import com.ouyang.bootstrip.vo.GoodsCarVO;

@RestController
@RequestMapping(value="/goodsCar")
public class GoodsCarController {
	private Logger log_ = LoggerFactory.getLogger(GoodsCarController.class);
	@Autowired
	private GoodsCarService goodsCarService;
	@PostMapping(value="/findGoodsCarList")
	public String findGoodsCarList(@RequestBody String json){
		log_.info("查询购物车列表信息开始");
		JSONObject obj = new JSONObject();
		Integer status = 0 ; 
		String statusText = "";
		try {
			Page<GoodsCarVO> pageList = goodsCarService.findGoodsCarList(json);
			obj.put("totalPage", pageList.getTotalPages());
			obj.put("size", pageList.getTotalElements());
			obj.put("list", pageList.getContent());
		} catch (Exception e) {
			status = 500;
			statusText = "查询购物车列表报错,请联系管理员查看日志:"+e.getMessage();
			e.printStackTrace();
		}
		obj.put("status", status);
		obj.put("statusText", statusText);
		return obj.toString();
	}
}
