package com.ouyang.bootstrip.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.ouyang.bootstrip.dao.BrandDao;
import com.ouyang.bootstrip.vo.BrandVo;

@Service
public class BrandService {
	@Autowired
	private BrandDao brandDao;
	
	//jpa动态查询
	public Page<BrandVo> findBrandByName( final BrandVo brand)throws Exception{
		Specification<BrandVo> specification = new Specification<BrandVo>() {
			@Override
			public Predicate toPredicate(Root<BrandVo> root,
					CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicates = new ArrayList<Predicate>();
				if(brand.getBrandId()!=null&&brand.getBrandId()!=0){
					predicates.add(cb.equal(root.get("brandId"), brand.getBrandId()));
				}
				if(brand.getBrandName()!=null&&!"".equals(brand.getBrandName())){
					predicates.add(cb.like(root.<String>get("brandName"), "%"+brand.getBrandName()+"%"));
				}
				return cb.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		};
		Pageable pageable = new PageRequest(0,10);
		return brandDao.findAll(specification,pageable);
	}
	
	public BrandVo addBrand(BrandVo brand)throws Exception{
		return brandDao.save(brand);
	}
	
	public void delBrandById(Integer brandId)throws Exception{
		brandDao.delete(brandId);
	}
}
