package com.ouyang.bootstrip.vo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vue_comments")
public class CommentVo {
	@Id
	@Column(name="comment_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer commentId;
	@Column(name="comment_user_id")
	private Integer commentUserId;
	@Column(name="comment_message")
	private String commentMessage;
	@Column(name="comment_module")
	private String commentModule;
	@Column(name="comment_module_id")
	private Integer commentModuleId;
	@Column(name="comment_level")
	private String commentLevel;
	@Column(name="comment_create_time")
	private Timestamp commentCreateTime;
	@Column(name="comment_is_work")
	private String commentIsWork;
	
	public CommentVo() {
	}

	public CommentVo(Integer commentId, Integer commentUserId,
			String commentMessage, String commentModule,
			Integer commentModuleId, String commentLevel,
			Timestamp commentCreateTime, String commentIsWork) {
		super();
		this.commentId = commentId;
		this.commentUserId = commentUserId;
		this.commentMessage = commentMessage;
		this.commentModule = commentModule;
		this.commentModuleId = commentModuleId;
		this.commentLevel = commentLevel;
		this.commentCreateTime = commentCreateTime;
		this.commentIsWork = commentIsWork;
	}

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getCommentUserId() {
		return commentUserId;
	}

	public void setCommentUserId(Integer commentUserId) {
		this.commentUserId = commentUserId;
	}

	public String getCommentMessage() {
		return commentMessage;
	}

	public void setCommentMessage(String commentMessage) {
		this.commentMessage = commentMessage;
	}

	public String getCommentModule() {
		return commentModule;
	}

	public void setCommentModule(String commentModule) {
		this.commentModule = commentModule;
	}

	public Integer getCommentModuleId() {
		return commentModuleId;
	}

	public void setCommentModuleId(Integer commentModuleId) {
		this.commentModuleId = commentModuleId;
	}

	public String getCommentLevel() {
		return commentLevel;
	}

	public void setCommentLevel(String commentLevel) {
		this.commentLevel = commentLevel;
	}

	public Timestamp getCommentCreateTime() {
		return commentCreateTime;
	}

	public void setCommentCreateTime(Timestamp commentCreateTime) {
		this.commentCreateTime = commentCreateTime;
	}

	public String getCommentIsWork() {
		return commentIsWork;
	}

	public void setCommentIsWork(String commentIsWork) {
		this.commentIsWork = commentIsWork;
	}

	@Override
	public String toString() {
		return "{commentId:"+this.commentId+",commentUserId:"+this.commentUserId+",commentMessage:"
				+this.commentMessage+",commentModule:"+this.commentModule+",commentLevel:"+this.commentLevel+
				",commentCreateTime:"+this.commentCreateTime+",commentIsWork:"+this.commentIsWork+"}";
	}
}
