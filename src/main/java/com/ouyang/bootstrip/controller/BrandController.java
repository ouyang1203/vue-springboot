package com.ouyang.bootstrip.controller;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.ouyang.bootstrip.service.BrandService;
import com.ouyang.bootstrip.vo.BrandVo;

@RestController
@RequestMapping(value="/brand")
public class BrandController {
	
	private Logger log_ = LoggerFactory.getLogger(BrandController.class);
	
	@Autowired
	private BrandService brandService;
	@PostMapping(value="/findBrand")
	public String findBrand(@RequestBody String json){
		JSONObject obj = new JSONObject();
		String progressFlag = "Y";
		String progressMsg = "";
		try {
			log_.info("findBrand接收到入参json字符串为：{}",json);
			Integer brandId = null;
			String brandName = null;
			if(json!=null){
				JSONObject param = JSONObject.parseObject(json);
				if(param.containsKey("brand_id")){
					brandId = param.getInteger("brand_id");
				}
				if(param.containsKey("brand_name")){
					brandName = param.getString("brand_name");
				}
				
			}
			BrandVo brand = new BrandVo();
			if(!StringUtils.isEmpty(brandId)){
				brand.setBrandId(brandId);
			}
			if(!StringUtils.isEmpty(brandName)){
				brand.setBrandName(brandName);
			}
			Page<BrandVo> page = brandService.findBrandByName(brand);
			obj.put("total", page.getTotalElements());
			obj.put("list", page.getContent());
		} catch (Exception e) {
			progressFlag = "N";
			progressMsg = "查询分页报错,请联系管理员查看日志:"+e.getMessage();
			e.printStackTrace();
		}
		obj.put("progressFlag", progressFlag);
		obj.put("progressMsg", progressMsg);
		return obj.toString();
	}
	@PostMapping(value="/addBrand")
	public String addBrand(@RequestBody String json){
		JSONObject obj = new JSONObject();
		String progressFlag = "Y";
		String progressMsg = "";
		try {
			log_.info("addBrand接收到入参json字符串为：{}",json);
			Integer brandId = null;
			String brandName = null;
			if(json!=null){
				JSONObject param = JSONObject.parseObject(json);
				if(param.containsKey("brand_id")){
					brandId = param.getInteger("brand_id");
				}
				if(param.containsKey("brand_name")){
					brandName = param.getString("brand_name");
				}
			}
			BrandVo brand = new BrandVo();
			if(!StringUtils.isEmpty(brandId)){
				brand.setBrandId(brandId);
			}else{
				brand.setBrandCreateTime(new Timestamp(System.currentTimeMillis()));
			}
			if(!StringUtils.isEmpty(brandName)){
				brand.setBrandName(brandName);
			}
			brand = brandService.addBrand(brand);
			log_.info("品牌添加完成,本次品牌ID为:{}",brand.getBrandId());
		} catch (Exception e) {
			progressFlag = "N";
			progressMsg = "新增报错,请联系管理员查看日志:"+e.getMessage();
			e.printStackTrace();
		}
		obj.put("progressFlag", progressFlag);
		obj.put("progressMsg", progressMsg);
		return obj.toString();
	}
	@PostMapping(value="/delBrand")
	public String delBrand(@RequestBody String json){
		JSONObject obj = new JSONObject();
		String progressFlag = "Y";
		String progressMsg = "";
		try {
			log_.info("addBrand接收到入参json字符串为：{}",json);
			Integer brandId = null;
			if(!StringUtils.isEmpty(json)){
				JSONObject param = JSONObject.parseObject(json);
				if(param.containsKey("brand_id")){
					brandId = param.getInteger("brand_id");
				}
				if(!StringUtils.isEmpty(brandId)){
					brandService.delBrandById(brandId);
					log_.info("删除品牌成功，本次删除的ID是{}",brandId);
				}
			}
		} catch (Exception e) {
			progressFlag = "N";
			progressMsg = "删除报错,请联系管理员查看日志:"+e.getMessage();
			e.printStackTrace();
		}
		obj.put("progressFlag", progressFlag);
		obj.put("progressMsg", progressMsg);
		return obj.toString();
	}
}
