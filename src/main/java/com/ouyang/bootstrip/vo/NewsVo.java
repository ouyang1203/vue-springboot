package com.ouyang.bootstrip.vo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vue_news")
public class NewsVo {
	@Id
	@Column(name="news_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer newsId;
	@Column(name="news_title")
	private String newsTitle;
	@Column(name="news_content")
	private String newsContent;
	@Column(name="news_image_path")
	private String newsImagePath;
	@Column(name="news_view_count")
	private Integer newsViewCount;
	@Column(name="news_created_by")
	private Integer newsCreatedBy;
	@Column(name="news_updated_by")
	private Integer newsUpdatedBy;
	@Column(name="news_create_date")
	private Timestamp newsCreatedDate;
	@Column(name="news_update_date")
	private Timestamp newsUpdatedDate;
	
	public NewsVo() {
	}

	public NewsVo(Integer newsId, String newsTitle, String newsContent,
			String newsImagePath, Integer newsViewCount, Integer newsCreatedBy,
			Integer newsUpdatedBy, Timestamp newsCreatedDate,
			Timestamp newsUpdatedDate) {
		super();
		this.newsId = newsId;
		this.newsTitle = newsTitle;
		this.newsContent = newsContent;
		this.newsImagePath = newsImagePath;
		this.newsViewCount = newsViewCount;
		this.newsCreatedBy = newsCreatedBy;
		this.newsUpdatedBy = newsUpdatedBy;
		this.newsCreatedDate = newsCreatedDate;
		this.newsUpdatedDate = newsUpdatedDate;
	}

	public Integer getNewsId() {
		return newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	public String getNewsImagePath() {
		return newsImagePath;
	}

	public void setNewsImagePath(String newsImagePath) {
		this.newsImagePath = newsImagePath;
	}

	public Integer getNewsViewCount() {
		return newsViewCount;
	}

	public void setNewsViewCount(Integer newsViewCount) {
		this.newsViewCount = newsViewCount;
	}

	public Integer getNewsCreatedBy() {
		return newsCreatedBy;
	}

	public void setNewsCreatedBy(Integer newsCreatedBy) {
		this.newsCreatedBy = newsCreatedBy;
	}

	public Integer getNewsUpdatedBy() {
		return newsUpdatedBy;
	}

	public void setNewsUpdatedBy(Integer newsUpdatedBy) {
		this.newsUpdatedBy = newsUpdatedBy;
	}

	public Timestamp getNewsCreatedDate() {
		return newsCreatedDate;
	}

	public void setNewsCreatedDate(Timestamp newsCreatedDate) {
		this.newsCreatedDate = newsCreatedDate;
	}

	public Timestamp getNewsUpdatedDate() {
		return newsUpdatedDate;
	}

	public void setNewsUpdatedDate(Timestamp newsUpdatedDate) {
		this.newsUpdatedDate = newsUpdatedDate;
	}
	
}
