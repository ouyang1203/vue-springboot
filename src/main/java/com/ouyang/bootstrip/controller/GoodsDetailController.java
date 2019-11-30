package com.ouyang.bootstrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.service.GoodsDetailService;

@RestController
@RequestMapping(value="/goodsDetail")
public class GoodsDetailController {
	@Autowired
	private GoodsDetailService goodsDetailService;
	@GetMapping(value="/findGoodsDetailById/{goodsId}")
	public String findGoodsDetailById(@PathVariable Integer goodsId){
		JSONObject obj = new JSONObject();
		Integer status = 0 ; 
		String statusText = "";
		try {
			obj.put("message", goodsDetailService.findGoodsDetailById(goodsId));
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
