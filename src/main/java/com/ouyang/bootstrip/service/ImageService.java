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
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.dao.ImagesDao;
import com.ouyang.bootstrip.vo.ImagesVo;

@Service
public class ImageService {
	private Logger log_ = LoggerFactory.getLogger(ImageService.class);
	@Autowired
	private ImagesDao imagesDao;
	
	public Page<ImagesVo> getAllImages ()throws Exception{
		ImagesVo imagesVo = new ImagesVo();
		return getImagesByParam(imagesVo, null, null);
	}
	
	public Page<ImagesVo> getImagesByCategoryId(String json) throws Exception{
		ImagesVo imagesVo = new ImagesVo();
		JSONObject param = JSONObject.parseObject(json);
		Integer imageCategoryId = 0 ;
		Integer imageCategoryObjectId = 0 ;
		String imageCategoryShowFlag = null;
		Integer pageIndex = 1;
		Integer pageSize = 10;
		if(param.containsKey("imageCategoryId")){
			imageCategoryId = param.getInteger("imageCategoryId");
			imagesVo.setImageCategoryId(imageCategoryId);
		}
		if(param.containsKey("imageCategoryShowFlag")){
			imageCategoryShowFlag = param.getString("imageCategoryShowFlag");
			imagesVo.setImageCategoryShowFlag(imageCategoryShowFlag);
		}
		if(param.containsKey("imageCategoryObjectId")){
			imageCategoryObjectId = param.getInteger("imageCategoryObjectId");
			imagesVo.setImageCategoryObjectId(imageCategoryObjectId);
		}
		if (param.containsKey("pageIndex")) {
			pageIndex = param.getInteger("pageIndex");
		}
		if (param.containsKey("pageSize")) {
			pageSize = param.getInteger("pageSize");
		}
		pageIndex = pageIndex.equals(1)?0:pageIndex-1;
		return getImagesByParam(imagesVo,pageIndex,pageSize);
	}
	
	public Page<ImagesVo> getImagesByParam(final ImagesVo vo ,Integer pageIndex,Integer pageSize)throws Exception{
		Specification<ImagesVo> specification = new Specification<ImagesVo>() {
			@Override
			public Predicate toPredicate(Root<ImagesVo> root, CriteriaQuery<?> query,
					CriteriaBuilder cb) {
				List<Predicate> predicates = new ArrayList<Predicate>();
				Integer imageCategoryId = vo.getImageCategoryId();
				Integer imageCategoryObjectId = vo.getImageCategoryObjectId();
				String imageCategoryShowFlag = vo.getImageCategoryShowFlag();
				if(imageCategoryId!=null&&imageCategoryId!=0){
					predicates.add(cb.equal(root.get("imageCategoryId"),imageCategoryId));
				}
				if(imageCategoryObjectId!=null&&imageCategoryObjectId!=0){
					predicates.add(cb.equal(root.get("imageCategoryObjectId"),imageCategoryObjectId));
				}
				if(!StringUtils.isEmpty(imageCategoryShowFlag)){
					predicates.add(cb.equal(root.get("imageCategoryShowFlag"),imageCategoryShowFlag));
				}
				return cb.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		};
		Pageable pageable = new PageRequest(pageIndex,pageSize);
		return imagesDao.findAll(specification,pageable);
	}
	
	public ImagesVo getImageById(String json)throws Exception{
		log_.info("接收到前端参数为：{}",json);
		JSONObject param = JSONObject.parseObject(json);
		Integer imageId = 0 ;
		String updateFlag = null;
		if(param.containsKey("imageId")){
			imageId = param.getInteger("imageId");
		}else{
			return null;
		}
		log_.info("imageId is {}",imageId);
		ImagesVo vo = imagesDao.getOne(imageId);
		if(param.containsKey("updateFlag")){
			updateFlag = param.getString("updateFlag");
			if("Y".equals(updateFlag)){
				vo.setImageViewTime(vo.getImageViewTime()+1);
				imagesDao.save(vo);
			}
		}
		return vo;
	}
}
