package com.ouyang.bootstrip.vo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vue_Images")
public class ImagesVo {
	@Id
	@Column(name="image_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer imageId ;
	@Column(name="image_name")
	private String imageName ;
	@Column(name="image_path")
	private String imagePath ;
	@Column(name="image_title")
	private String imageTitle ;
	@Column(name="image_content")
	private String imageContent;
	@Column(name="image_category_id")
	private Integer imageCategoryId;
	@Column(name="image_category_object_id")
	private Integer imageCategoryObjectId;
	@Column(name="image_category_show_flag")
	private String imageCategoryShowFlag ;
	@Column(name="image_create_time")
	private Timestamp imageCreateTime;
	@Column(name="image_view_time")
	private Integer imageViewTime;
	
	public ImagesVo() {
	}

	public ImagesVo(Integer imageId, String imageName, String imagePath,
			String imageTitle, String imageContent, Integer imageCategoryId,
			Integer imageCategoryObjectId, String imageCategoryShowFlag,
			Timestamp imageCreateTime, Integer imageViewTime) {
		super();
		this.imageId = imageId;
		this.imageName = imageName;
		this.imagePath = imagePath;
		this.imageTitle = imageTitle;
		this.imageContent = imageContent;
		this.imageCategoryId = imageCategoryId;
		this.imageCategoryObjectId = imageCategoryObjectId;
		this.imageCategoryShowFlag = imageCategoryShowFlag;
		this.imageCreateTime = imageCreateTime;
		this.imageViewTime = imageViewTime;
	}

	public Integer getImageId() {
		return imageId;
	}

	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getImageTitle() {
		return imageTitle;
	}

	public void setImageTitle(String imageTitle) {
		this.imageTitle = imageTitle;
	}

	public String getImageContent() {
		return imageContent;
	}

	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

	public Integer getImageCategoryId() {
		return imageCategoryId;
	}

	public void setImageCategoryId(Integer imageCategoryId) {
		this.imageCategoryId = imageCategoryId;
	}

	public Integer getImageCategoryObjectId() {
		return imageCategoryObjectId;
	}

	public void setImageCategoryObjectId(Integer imageCategoryObjectId) {
		this.imageCategoryObjectId = imageCategoryObjectId;
	}

	public String getImageCategoryShowFlag() {
		return imageCategoryShowFlag;
	}

	public void setImageCategoryShowFlag(String imageCategoryShowFlag) {
		this.imageCategoryShowFlag = imageCategoryShowFlag;
	}

	public Timestamp getImageCreateTime() {
		return imageCreateTime;
	}

	public void setImageCreateTime(Timestamp imageCreateTime) {
		this.imageCreateTime = imageCreateTime;
	}

	public Integer getImageViewTime() {
		return imageViewTime;
	}

	public void setImageViewTime(Integer imageViewTime) {
		this.imageViewTime = imageViewTime;
	}
}
