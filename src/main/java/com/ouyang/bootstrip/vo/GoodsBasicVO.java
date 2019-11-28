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
@Table(name="vue_goods_basic")
public class GoodsBasicVO {
	@Id
	@Column(name="goods_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer goodsId;
	@Column(name="goods_title")
	private String goodsTitle;
	@Column(name="goods_number")
	private String goodsNumber;
	@Column(name="goods_basic_info")
	private String goodsBasicInfo;
	@Column(name="goods_view_time")
	private Integer goodsViewTime;
	@Column(name="goods_image_path")
	private String goodsImagePath;
	@Column(name="goods_sell_price")
	private BigDecimal goodsSellPrice;
	@Column(name="goods_market_price")
	private BigDecimal goodsMarketPrice;
	@Column(name="goods_stock_quantity")
	private Integer goodsStockQuantity;
	@Column(name="goods_enable_flag")
	private String goodsEnableFlag;
	@Column(name="goods_create_time")
	private Timestamp goodsCreateTime;
	
	public GoodsBasicVO() {
	}

	public GoodsBasicVO(Integer goodsId, String goodsTitle, String goodsNumber,
			String goodsBasicInfo, Integer goodsViewTime,
			String goodsImagePath, BigDecimal goodsSellPrice,
			BigDecimal goodsMarketPrice, Integer goodsStockQuantity,
			String goodsEnableFlag, Timestamp goodsCreateTime) {
		super();
		this.goodsId = goodsId;
		this.goodsTitle = goodsTitle;
		this.goodsNumber = goodsNumber;
		this.goodsBasicInfo = goodsBasicInfo;
		this.goodsViewTime = goodsViewTime;
		this.goodsImagePath = goodsImagePath;
		this.goodsSellPrice = goodsSellPrice;
		this.goodsMarketPrice = goodsMarketPrice;
		this.goodsStockQuantity = goodsStockQuantity;
		this.goodsEnableFlag = goodsEnableFlag;
		this.goodsCreateTime = goodsCreateTime;
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

	public String getGoodsNumber() {
		return goodsNumber;
	}

	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	public String getGoodsBasicInfo() {
		return goodsBasicInfo;
	}

	public void setGoodsBasicInfo(String goodsBasicInfo) {
		this.goodsBasicInfo = goodsBasicInfo;
	}

	public Integer getGoodsViewTime() {
		return goodsViewTime;
	}

	public void setGoodsViewTime(Integer goodsViewTime) {
		this.goodsViewTime = goodsViewTime;
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

	public BigDecimal getGoodsMarketPrice() {
		return goodsMarketPrice;
	}

	public void setGoodsMarketPrice(BigDecimal goodsMarketPrice) {
		this.goodsMarketPrice = goodsMarketPrice;
	}

	public Integer getGoodsStockQuantity() {
		return goodsStockQuantity;
	}

	public void setGoodsStockQuantity(Integer goodsStockQuantity) {
		this.goodsStockQuantity = goodsStockQuantity;
	}

	public String getGoodsEnableFlag() {
		return goodsEnableFlag;
	}

	public void setGoodsEnableFlag(String goodsEnableFlag) {
		this.goodsEnableFlag = goodsEnableFlag;
	}

	public Timestamp getGoodsCreateTime() {
		return goodsCreateTime;
	}

	public void setGoodsCreateTime(Timestamp goodsCreateTime) {
		this.goodsCreateTime = goodsCreateTime;
	}
	
}
