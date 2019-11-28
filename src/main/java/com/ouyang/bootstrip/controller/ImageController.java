package com.ouyang.bootstrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.service.ImageService;
import com.ouyang.bootstrip.vo.ImagesVo;

@RestController
@RequestMapping(value="/image")
public class ImageController {
	@Autowired
	ImageService imageService;
	
	@GetMapping(value="/getAllImages")
	public String getAllImages(){
		JSONObject obj = new JSONObject();
		Integer status = 0 ; 
		String statusText = "";
		try {
			Page<ImagesVo> list = imageService.getAllImages();
			obj.put("totalPage", list.getTotalPages());
			obj.put("size", list.getTotalElements());
			obj.put("list", list.getContent());
		} catch (Exception e) {
			status = 500;
			statusText = "查询图片列表报错,请联系管理员查看日志:"+e.getMessage();
			e.printStackTrace();
		}
		obj.put("status", status);
		obj.put("statusText", statusText);
		return obj.toString();
	}
	@PostMapping(value="/getImageById")
	public String getImageById(@RequestBody String json){
		JSONObject obj = new JSONObject();
		Integer status = 0 ; 
		String statusText = "";
		try {
			obj.put("message", imageService.getImageById(json));
		} catch (Exception e) {
			status = 500;
			statusText = "查询图片明细报错,请联系管理员查看日志:"+e.getMessage();
			e.printStackTrace();
		}
		obj.put("status", status);
		obj.put("statusText", statusText);
		return obj.toString();
	}
	
	@PostMapping(value="/postImageListByCategoryId")
	public String postImageListByCategoryId(@RequestBody String json){
		JSONObject obj = new JSONObject();
		Integer status = 0 ; 
		String statusText = "";
		try {
			Page<ImagesVo> pageList = imageService.getImagesByCategoryId(json);
			obj.put("totalPage", pageList.getTotalPages());
			obj.put("size", pageList.getTotalElements());
			obj.put("list", pageList.getContent());
		} catch (Exception e) {
			status = 500;
			statusText = "查询图片列表报错,请联系管理员查看日志:"+e.getMessage();
			e.printStackTrace();
		}
		obj.put("status", status);
		obj.put("statusText", statusText);
		return obj.toString();
	}
}
