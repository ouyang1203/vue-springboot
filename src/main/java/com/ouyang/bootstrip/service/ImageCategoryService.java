package com.ouyang.bootstrip.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.dao.ImageCategoryDao;
import com.ouyang.bootstrip.vo.ImageCategory;

@Service
public class ImageCategoryService {
	private Logger log_ = LoggerFactory.getLogger(ImageCategoryService.class);
	@Autowired
	private ImageCategoryDao imageCategoryDao;
	
	public List<ImageCategory> findAllImageCategory(){
		log_.info("查询所有图片分类");
		return imageCategoryDao.findAll();
	}
	
	public Page<ImageCategory> findImageCategoryByParam(String json)throws Exception{
		ImageCategory vo = new ImageCategory();
		JSONObject param = JSONObject.parseObject(json);
		String imageCategoryName = null;
		String imageCategoryCode = null;
		String imageCategoryShowFlag = null;
		Integer pageIndex = 1;
		Integer pageSize = 10;
		if(param.containsKey("imageCategoryName")){
			imageCategoryName = param.getString("imageCategoryName").trim();
			vo.setImageCategoryName(imageCategoryName);
		}
		if(param.containsKey("imageCategoryCode")){
			imageCategoryCode = param.getString("imageCategoryCode").trim();
			vo.setImageCategoryCode(imageCategoryCode);
		}
		if(param.containsKey("imageCategoryShowFlag")){
			imageCategoryShowFlag = param.getString("imageCategoryShowFlag").trim();
			vo.setImageCategoryShowFlag(imageCategoryShowFlag);
		}
		if(param.containsKey("pageIndex")){
			pageIndex = param.getInteger("pageIndex");
		}
		if(param.containsKey("pageSize")){
			pageSize = param.getInteger("pageSize");
		}
		pageIndex = pageIndex.equals(1)?0:pageIndex-1;
		return findImageCategoryByParam(vo,pageIndex,pageSize);
	}
	
	public Page<ImageCategory> findImageCategoryByParam(final ImageCategory vo,Integer pageIndex,Integer pageSize)throws Exception{
		Specification<ImageCategory> specification = new Specification<ImageCategory>(){
			@Override
			public Predicate toPredicate(Root<ImageCategory> root,
					CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicates = new ArrayList<Predicate>();
				String imageCategoryName = vo.getImageCategoryName();
				String imageCategoryCode = vo.getImageCategoryCode();
				String imageCategoryShowFlag = vo.getImageCategoryShowFlag();
				if(!StringUtils.isEmpty(imageCategoryName)){
					predicates.add(cb.like(root.<String>get("imageCategoryName"),"%"+imageCategoryName+"%"));
				}
				if(!StringUtils.isEmpty(imageCategoryCode)){
					predicates.add(cb.equal(root.get("imageCategoryCode"), imageCategoryCode));
				}
				if(!StringUtils.isEmpty(imageCategoryShowFlag)){
					predicates.add(cb.equal(root.get("imageCategoryShowFlag"), imageCategoryShowFlag));
				}
				return cb.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		};
		Pageable pageable = new PageRequest(pageIndex,pageSize);
		return imageCategoryDao.findAll(specification,pageable);
	}
}
