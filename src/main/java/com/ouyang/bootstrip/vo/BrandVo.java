package com.ouyang.bootstrip.vo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vue_brand")
public class BrandVo {
	@Id
	@Column(name="brand_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer brandId ;
	@Column(name="brand_name")
	private String brandName ;
	@Column(name="brand_create_time")
	private Timestamp brandCreateTime ;
	
	public BrandVo() {
	}

	public BrandVo(Integer brandId, String brandName, Timestamp brandCreateTime) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.brandCreateTime = brandCreateTime;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Timestamp getBrandCreateTime() {
		return brandCreateTime;
	}

	public void setBrandCreateTime(Timestamp brandCreateTime) {
		this.brandCreateTime = brandCreateTime;
	}
	
}
