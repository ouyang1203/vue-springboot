package com.ouyang.bootstrip.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.service.GoodsService;
import com.ouyang.bootstrip.vo.GoodsBasicVO;

@RestController
@RequestMapping(value="/goodsBasic")
public class GoodsBasicController {
	
	private Logger log_ = LoggerFactory.getLogger(GoodsBasicController.class);
	@Autowired
	private GoodsService goodsService;
	@PostMapping(value="/findGoodsBasicInfoList")
	public String findGoodsBasicInfoList(@RequestBody String json){
		log_.info("查询商品列表信息开始");
		JSONObject obj = new JSONObject();
		Integer status = 0 ; 
		String statusText = "";
		try {
			Page<GoodsBasicVO> pageList = goodsService.findGoodsBasicInfoList(json);
			obj.put("totalPage", pageList.getTotalPages());
			obj.put("size", pageList.getTotalElements());
			obj.put("list", pageList.getContent());
		} catch (Exception e) {
			status = 500;
			statusText = "查询商品列表报错,请联系管理员查看日志:"+e.getMessage();
			e.printStackTrace();
		}
		obj.put("status", status);
		obj.put("statusText", statusText);
		return obj.toString();
	}
	@GetMapping(value="/findGoodsBasicInfoById/{goodsId}")
	public String findGoodsBasicInfoById(@PathVariable Integer goodsId){
		JSONObject obj = new JSONObject();
		Integer status = 0 ; 
		String statusText = "";
		try {
			obj.put("message", goodsService.findGoodsBasicInfoById(goodsId));
		} catch (Exception e) {
			status = 500;
			statusText = "查询商品明细报错,请联系管理员查看日志:"+e.getMessage();
			e.printStackTrace();
		}
		obj.put("status", status);
		obj.put("statusText", statusText);
		return obj.toString();
	}
}
