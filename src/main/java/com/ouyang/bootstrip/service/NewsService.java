package com.ouyang.bootstrip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.dao.NewsDao;
import com.ouyang.bootstrip.vo.NewsVo;
@Service
public class NewsService {
	@Autowired
	private NewsDao newsDao;
	
	public List<NewsVo> getAllNews()throws Exception{
		return newsDao.findAll();
	}
	/**
	 * 根据前端传递过来的JSON字符串查询指定新闻内容,同时将新闻的阅读次数加一
	 * @param json
	 * @return NewsVo
	 * */
	public NewsVo getNewsInfo(String json)throws Exception{
		JSONObject param = JSONObject.parseObject(json);
		Integer newsId = 0;
		if(param.containsKey("newsId")){
			newsId = param.getInteger("newsId");
		}
		NewsVo news = newsDao.findOne(newsId);
		news.setNewsViewCount(news.getNewsViewCount()+1);
		newsDao.saveAndFlush(news);
		return news;
	}
}
