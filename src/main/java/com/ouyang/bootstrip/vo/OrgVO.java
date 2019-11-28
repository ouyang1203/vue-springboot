//package com.ouyang.bootstrip.vo;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//
//@Entity
//@Table(name="arch_org")
//public class OrgVO {
//	@Id
//	@GeneratedValue
//	@Column(name="ORG_ID")
//	private String orgId;
//	@Column(name="ORG_NAME")
//	private String orgName;
//	@Column(name="ORG_NO")
//	private String orgno;
//	@Column(name="FLAG")
//	private String flag;
//	@Column(name="LAST_UPDATED_DATE")
//	private Date lastUpdatedDate;
//	@Column(name="IS_PARENT")
//	private String isParent;
//
//	public OrgVO() {
//	}
//	
//	public OrgVO(String orgId,String orgName, String orgno,String flag,Date lastUpdatedDate,String isParent) {
//		this.orgId = orgId;
//		this.orgName = orgName;
//		this.orgno = orgno;
//		this.flag = flag;
//		this.lastUpdatedDate = lastUpdatedDate;
//		this.isParent = isParent;
//	}
//
//	public String getOrgId() {
//		return orgId;
//	}
//
//	public void setOrgId(String orgId) {
//		this.orgId = orgId;
//	}
//
//	public String getOrgName() {
//		return orgName;
//	}
//
//	public void setOrgName(String orgName) {
//		this.orgName = orgName;
//	}
//
//	public String getOrgno() {
//		return orgno;
//	}
//
//	public void setOrgno(String orgno) {
//		this.orgno = orgno;
//	}
//
//	public String getFlag() {
//		return flag;
//	}
//
//	public void setFlag(String flag) {
//		this.flag = flag;
//	}
//
//	public Date getLastUpdatedDate() {
//		return lastUpdatedDate;
//	}
//
//	public void setLastUpdatedDate(Date lastUpdatedDate) {
//		this.lastUpdatedDate = lastUpdatedDate;
//	}
//
//	public String getIsParent() {
//		return isParent;
//	}
//
//	public void setIsParent(String isParent) {
//		this.isParent = isParent;
//	}
//
//}
