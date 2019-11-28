package com.ouyang.bootstrip.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.service.NewsService;
import com.ouyang.bootstrip.vo.NewsVo;

@RestController
@RequestMapping(value="/news")
public class NewsController {
	
	private Logger log_ = LoggerFactory.getLogger(NewsController.class);
	
	@Autowired
	private NewsService newsService;
	
	@GetMapping(value="/getAllNews")
	public String getAllNews(){
		log_.info("查询所有新闻接口调用开始。。。");
		JSONObject obj = new JSONObject();
		Integer status = 0 ; 
		String statusText = "";
		try {
			List<NewsVo> list = newsService.getAllNews();
			obj.put("list", list);
		} catch (Exception e) {
			status = 500;
			statusText = "查询新闻列表报错,请联系管理员查看日志:"+e.getMessage();
			e.printStackTrace();
		}
		obj.put("status", status);
		obj.put("statusText", statusText);
		return obj.toString();
	}
	
	@PostMapping(value="/getNewsInfo")
	public String getNewsInfo(@RequestBody String json){
		log_.info("查询新闻详情调用开始。。。");
		JSONObject obj = new JSONObject();
		Integer status = 0 ; 
		String statusText = "";
		try {
			NewsVo news = newsService.getNewsInfo(json);
			obj.put("message", news);
		} catch (Exception e) {
			status = 500;
			statusText = "查询新闻详情报错,请联系管理员查看日志:"+e.getMessage();
			e.printStackTrace();
		}
		obj.put("status", status);
		obj.put("statusText", statusText);
		return obj.toString();
	}
}
