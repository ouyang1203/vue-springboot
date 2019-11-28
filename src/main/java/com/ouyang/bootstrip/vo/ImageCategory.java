package com.ouyang.bootstrip.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vue_image_category")
public class ImageCategory {
	@Id
	@Column(name="image_category_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer imageCategoryId;
	@Column(name="image_category_name")
	private String imageCategoryName;
	@Column(name="image_category_code")
	private String imageCategoryCode ;
	@Column(name="image_category_show_flag")
	private String imageCategoryShowFlag ;
	
	public ImageCategory() {
	}

	public ImageCategory(Integer imageCategoryId, String imageCategoryName,
			String imageCategoryCode,String imageCategoryShowFlag) {
		super();
		this.imageCategoryId = imageCategoryId;
		this.imageCategoryName = imageCategoryName;
		this.imageCategoryCode = imageCategoryCode;
		this.imageCategoryShowFlag = imageCategoryShowFlag;
	}

	public Integer getImageCategoryId() {
		return imageCategoryId;
	}

	public void setImageCategoryId(Integer imageCategoryId) {
		this.imageCategoryId = imageCategoryId;
	}

	public String getImageCategoryName() {
		return imageCategoryName;
	}

	public void setImageCategoryName(String imageCategoryName) {
		this.imageCategoryName = imageCategoryName;
	}

	public String getImageCategoryCode() {
		return imageCategoryCode;
	}

	public void setImageCategoryCode(String imageCategoryCode) {
		this.imageCategoryCode = imageCategoryCode;
	}

	public String getImageCategoryShowFlag() {
		return imageCategoryShowFlag;
	}

	public void setImageCategoryShowFlag(String imageCategoryShowFlag) {
		this.imageCategoryShowFlag = imageCategoryShowFlag;
	}
	
}
