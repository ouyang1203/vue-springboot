package com.ouyang.bootstrip.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaBuilder.In;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.dao.GoodsCarDao;
import com.ouyang.bootstrip.vo.GoodsCarVO;
@Service
public class GoodsCarService {
	private Logger log_ = LoggerFactory.getLogger(GoodsCarService.class);
	@Autowired
	private GoodsCarDao goodsCarDao;
	
	public Page<GoodsCarVO> findGoodsCarList(String json)throws Exception{
		JSONObject param = JSONObject.parseObject(json);
		log_.info("接收到前端传递的参数为：{}",json);
		GoodsCarVO vo = new GoodsCarVO();
		Integer userId = null;
		Integer pageIndex = 1;
		Integer pageSize = 10;
		String goodsIds = null;
		if(param.containsKey("user_id")){
			userId = param.getInteger("user_id");
			vo.setUserId(userId);
		}
		if(param.containsKey("goodsIds")){
			goodsIds = param.getString("goodsIds");
		}
		if (param.containsKey("pageIndex")) {
			pageIndex = param.getInteger("pageIndex");
		}
		if (param.containsKey("pageSize")) {
			pageSize = param.getInteger("pageSize");
		}
		pageIndex = pageIndex<=1?0:pageIndex-1;
		return findGoodsCars(vo,goodsIds,pageIndex,pageSize);
	}
	
	public Page<GoodsCarVO> findGoodsCars(final GoodsCarVO vo,final String goodsIds,Integer pageIndex,Integer pageSize)throws Exception{
		Specification<GoodsCarVO> specification = new Specification<GoodsCarVO>() {
			@Override
			public Predicate toPredicate(Root<GoodsCarVO> root, CriteriaQuery<?> query,
					CriteriaBuilder cb) {
				Integer userId = vo.getUserId();
				List<Predicate> predicates = new ArrayList<Predicate>();
				if(userId!=null&&userId!=0){
					predicates.add(cb.equal(root.get("userId"),userId));
				}
				if(!StringUtils.isEmpty(goodsIds)){
					String[] goodsId = goodsIds.split(",");
					if(goodsId.length>0){
						In<Object> in = cb.in(root.get("goodsId"));
						for(String str :goodsId){
							if(!StringUtils.isEmpty(str)){
								in.value(Integer.parseInt(str));
							}
						}
						predicates.add(in);
					}
				}
				return cb.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		};
		Pageable pageable = new PageRequest(pageIndex,pageSize);
		return goodsCarDao.findAll(specification,pageable);
	}
}
