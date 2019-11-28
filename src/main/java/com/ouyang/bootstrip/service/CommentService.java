package com.ouyang.bootstrip.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.dao.CommentDao;
import com.ouyang.bootstrip.vo.CommentVo;

@Service
public class CommentService {
	
	private Logger log_ = LoggerFactory.getLogger(CommentService.class);
	
	@Autowired
	private CommentDao commentDao;
	
	public List<CommentVo> findCommentByParam(String json)throws Exception{
		Page<CommentVo> page = pageCommentByParam(json);
		return page.getContent();
	}
	public Page<CommentVo> pageCommentByParam(String json)throws Exception{
		CommentVo vo = new CommentVo();
		log_.info("接收到前端传入的参数为:{}",json);
		JSONObject param = JSONObject.parseObject(json);
		Integer pageIndex = 1;
		Integer pageSize = 10;
		Integer commentUserId = 0;
		Integer commentModuleId = 0;
		Integer pageStart = 0 ;
		String commentModule = null;
		String commentIsWork = null;
		String commentLevel = null;
		if (param.containsKey("pageIndex")) {
			pageIndex = param.getInteger("pageIndex");
		}
		if (param.containsKey("pageSize")) {
			pageSize = param.getInteger("pageSize");
		}
		if (param.containsKey("commentUserId")) {
			commentUserId = param.getInteger("commentUserId");
			vo.setCommentUserId(commentUserId);
		}
		if (param.containsKey("commentModuleId")) {
			commentModuleId = param.getInteger("commentModuleId");
			vo.setCommentModuleId(commentModuleId);
		}
		if(param.containsKey("commentModule")){
			commentModule = param.getString("commentModule");
			vo.setCommentModule(commentModule);
		}
		if(param.containsKey("commentIsWork")){
			commentIsWork = param.getString("commentIsWork");
			vo.setCommentIsWork(commentIsWork);
		}
		if(param.containsKey("commentLevel")){
			commentLevel = param.getString("commentLevel");
			vo.setCommentLevel(commentLevel);
		}
		pageStart = pageIndex.equals(1)?0:pageIndex-1;
		return queryCommentAndPage(vo,pageStart,pageSize);
	}
	/**
	 * 提供根据评论对象，评论人，评论模块来查询评论的分页数据
	 * */
	public Page<CommentVo> queryCommentAndPage(final CommentVo vo,Integer pageIndex,Integer pageSize){
		Specification<CommentVo> specification = new Specification<CommentVo>(){
			@Override
			public Predicate toPredicate(Root<CommentVo> root,
					CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicates = new ArrayList<Predicate>();
				Integer commentUserId = vo.getCommentId();
				Integer commentModuleId = vo.getCommentModuleId();
				String commentModule = vo.getCommentModule();
				String commentIsWork = vo.getCommentIsWork();
				String commentLevel = vo.getCommentLevel();
				if(commentUserId!=null&&commentUserId!=0){
					predicates.add(cb.equal(root.get("commentUserId"),commentUserId));
				}
				if(commentModuleId!=null&&commentModuleId!=0){
					predicates.add(cb.equal(root.get("commentModuleId"),commentModuleId));
				}
				if(!StringUtils.isEmpty(commentModule)){
					predicates.add(cb.equal(root.get("commentModule"),commentModule));
				}
				if(!StringUtils.isEmpty(commentIsWork)){
					predicates.add(cb.equal(root.get("commentIsWork"),commentIsWork));
				}
				if(!StringUtils.isEmpty(commentLevel)){
					predicates.add(cb.equal(root.get("commentLevel"),commentLevel));
				}
				return cb.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		};
		//JPA设置分页并按照评论时间倒序排序
		Sort sort = new Sort(Sort.Direction.DESC,"commentCreateTime");
		Pageable pageable = new PageRequest(pageIndex,pageSize,sort);
		return commentDao.findAll(specification,pageable);
	}
	/**
	 * 添加评论
	 * */
	public CommentVo addComment(String json)throws Exception{
		log_.info("本次添加的评论内容为：{}",json);
		CommentVo vo = JSON.parseObject(json, CommentVo.class);
		return commentDao.save(vo);
	}
}
