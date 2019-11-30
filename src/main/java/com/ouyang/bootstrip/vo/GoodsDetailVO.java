package com.ouyang.bootstrip.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vue_goods_detail")
public class GoodsDetailVO {
	@Id
	@Column(name="goods_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer goodsId;
	@Column(name="goods_title")
	private String goodsTitle;
	@Column(name="goods_detail_info")
	private String goodsDetailInfo;
	
	public GoodsDetailVO() {
	}

	public GoodsDetailVO(Integer goodsId, String goodsTitle,
			String goodsDetailInfo) {
		super();
		this.goodsId = goodsId;
		this.goodsTitle = goodsTitle;
		this.goodsDetailInfo = goodsDetailInfo;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsTitle() {
		return goodsTitle;
	}

	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public String getGoodsDetailInfo() {
		return goodsDetailInfo;
	}

	public void setGoodsDetailInfo(String goodsDetailInfo) {
		this.goodsDetailInfo = goodsDetailInfo;
	}
	
}
