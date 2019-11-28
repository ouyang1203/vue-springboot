package com.ouyang.bootstrip.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootStripController {
	@RequestMapping(value="/")
	public String index(){
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
		return "已请求后端。。。。";
	}
}
