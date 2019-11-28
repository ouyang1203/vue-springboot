package com.ouyang.bootstrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.service.ImageCategoryService;
import com.ouyang.bootstrip.vo.ImageCategory;

@RestController
@RequestMapping(value="/imageCategory")
public class ImageCategoryController {
	@Autowired
	private ImageCategoryService imageCategoryService;
	@PostMapping(value="/findAllImageCategory")
	public String findAllImageCategory(@RequestBody String json){
		JSONObject obj = new JSONObject();
		Integer status = 0 ; 
		String statusText = "";
		try {
			Page<ImageCategory> pageList = imageCategoryService.findImageCategoryByParam(json);
			obj.put("totalPage", pageList.getTotalPages());
			obj.put("size", pageList.getTotalElements());
			obj.put("list", pageList.getContent());
		} catch (Exception e) {
			status = 500;
			statusText = "查询图片分类报错,请联系管理员查看日志:"+e.getMessage();
			e.printStackTrace();
		}
		obj.put("status", status);
		obj.put("statusText", statusText);
		return obj.toString();
	}
}
