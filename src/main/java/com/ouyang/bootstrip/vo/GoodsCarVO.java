package com.ouyang.bootstrip.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vue_goods_car")
public class GoodsCarVO {
	@Id
	@Column(name="goods_car_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer goodsCarId;
	@Column(name="goods_id")
	private Integer goodsId;
	@Column(name="user_id")
	private Integer userId;
	@Column(name="goods_count")
	private Integer goodsCount;
	@Column(name="goods_title")
	private String goodsTitle;
	@Column(name="goods_image_path")
	private String goodsImagePath;
	@Column(name="goods_sell_price")
	private BigDecimal goodsSellPrice;
	@Column(name="goods_car_create_time")
	private Timestamp goodsCarCreateTime;
	
	public GoodsCarVO() {
	}

	public GoodsCarVO(Integer goodsCarId, Integer goodsId, Integer userId,
			Integer goodsCount, String goodsTitle, String goodsImagePath,
			BigDecimal goodsSellPrice, Timestamp goodsCarCreateTime) {
		super();
		this.goodsCarId = goodsCarId;
		this.goodsId = goodsId;
		this.userId = userId;
		this.goodsCount = goodsCount;
		this.goodsTitle = goodsTitle;
		this.goodsImagePath = goodsImagePath;
		this.goodsSellPrice = goodsSellPrice;
		this.goodsCarCreateTime = goodsCarCreateTime;
	}

	public Integer getGoodsCarId() {
		return goodsCarId;
	}

	public void setGoodsCarId(Integer goodsCarId) {
		this.goodsCarId = goodsCarId;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	public String getGoodsTitle() {
		return goodsTitle;
	}

	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public String getGoodsImagePath() {
		return goodsImagePath;
	}

	public void setGoodsImagePath(String goodsImagePath) {
		this.goodsImagePath = goodsImagePath;
	}

	public BigDecimal getGoodsSellPrice() {
		return goodsSellPrice;
	}

	public void setGoodsSellPrice(BigDecimal goodsSellPrice) {
		this.goodsSellPrice = goodsSellPrice;
	}

	public Timestamp getGoodsCarCreateTime() {
		return goodsCarCreateTime;
	}

	public void setGoodsCarCreateTime(Timestamp goodsCarCreateTime) {
		this.goodsCarCreateTime = goodsCarCreateTime;
	}
	
}
