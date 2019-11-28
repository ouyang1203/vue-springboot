package com.ouyang.bootstrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.service.CommentService;
import com.ouyang.bootstrip.vo.CommentVo;

@RestController
@RequestMapping(value="/comment")
public class CommentController {
	@Autowired
	private CommentService commentService;
	@PostMapping(value="/findComments")
	public String findComments(@RequestBody String json){
		JSONObject obj = new JSONObject();
		Integer status = 0 ; 
		String statusText = "";
		try {
			Page<CommentVo> pageList = commentService.pageCommentByParam(json);
			obj.put("totalPage", pageList.getTotalPages());
			obj.put("size", pageList.getTotalElements());
			obj.put("list", pageList.getContent());
		} catch (Exception e) {
			status = 500;
			statusText = "查询评论详情报错,请联系管理员查看日志:"+e.getMessage();
			e.printStackTrace();
		}
		obj.put("status", status);
		obj.put("statusText", statusText);
		return obj.toString();
	}
	@PostMapping(value="/addComment")
	public String addComment(@RequestBody String json){
		JSONObject obj = new JSONObject();
		Integer status = 0 ; 
		String statusText = "";
		try {
			CommentVo vo = commentService.addComment(json);
			obj.put("message", vo);
		} catch (Exception e) {
			status = 500;
			statusText = "添加评论报错,请联系管理员查看日志:"+e.getMessage();
			e.printStackTrace();
		}
		obj.put("status", status);
		obj.put("statusText", statusText);
		return obj.toString();
	}
}
