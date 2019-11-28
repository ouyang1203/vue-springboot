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

import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.dao.GoodsBasicDao;
import com.ouyang.bootstrip.vo.GoodsBasicVO;

@Service
public class GoodsService {
	
	private Logger log_ = LoggerFactory.getLogger(GoodsService.class);
	@Autowired
	private GoodsBasicDao goodsBasicDao;
	
	public GoodsBasicVO findGoodsBasicInfoById(Integer goodsId)throws Exception{
		log_.info("前端传递过来的商品Id：{}",goodsId);
		return goodsBasicDao.findOne(goodsId);
	}
	
	public Page<GoodsBasicVO> findGoodsBasicInfoList(String json)throws Exception{
		log_.info("接收到前端传递的参数为:{}",json);
		JSONObject param = JSONObject.parseObject(json);
		GoodsBasicVO vo = new GoodsBasicVO();
		Integer pageIndex = 1;
		Integer pageSize = 10;
		String goodsEnableFlag = null;
		if (param.containsKey("pageIndex")) {
			pageIndex = param.getInteger("pageIndex");
		}
		if (param.containsKey("pageSize")) {
			pageSize = param.getInteger("pageSize");
		}
		if(param.containsKey("goodsEnableFlag")){
			goodsEnableFlag = param.getString("goodsEnableFlag");
			vo.setGoodsEnableFlag(goodsEnableFlag);
		}
		pageIndex = pageIndex==1?0:pageIndex-1;
		return findGoodsBasicInfoListAndPage(vo,pageIndex,pageSize);
	}
	
	public Page<GoodsBasicVO> findGoodsBasicInfoListAndPage(final GoodsBasicVO vo ,
			Integer pageIndex,Integer pageSize)throws Exception{
		Specification<GoodsBasicVO> specification = new Specification<GoodsBasicVO>() {
			
			@Override
			public Predicate toPredicate(Root<GoodsBasicVO> root,
					CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicates = new ArrayList<Predicate>();
				String goodsEnableFlag = vo.getGoodsEnableFlag();
				if(!StringUtils.isEmpty(goodsEnableFlag)){
					predicates.add(cb.equal(root.get("goodsEnableFlag"),goodsEnableFlag));
				}
				return cb.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		};
		Sort sort = new Sort(Sort.Direction.DESC,"goodsCreateTime");
		Pageable pageable = new PageRequest(pageIndex,pageSize,sort);
		return goodsBasicDao.findAll(specification,pageable);
	}
	
}
