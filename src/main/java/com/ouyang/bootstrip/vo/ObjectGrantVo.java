//package com.ouyang.bootstrip.vo;
//
//import java.math.BigDecimal;
//import java.sql.Timestamp;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//
//@Entity
//@Table(name="tbm_object_grants")
//public class ObjectGrantVo {
//	@Id
//	@Column(name="OBJECT_GRANT_ID")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "objectGrantSeq")
//	@SequenceGenerator(initialValue = 1,name = "objectGrantSeq", sequenceName = "TBM_OBJECT_GRANTS_S")
//	private Integer objectGrantId;
//	
//	@Column(name="OBJECT_TYPE_CODE")
//	private	String objectTypeCode;
//	
//	@Column(name="OBJECT_ID")
//	private	Integer objectId;
//	
//	@Column(name="COMPANY_ID")
//	private	Integer companyId;
//	
//	@Column(name="DEPARTMENT_ID")
//	private	Integer departmentId;
//	
//	@Column(name="BUDGET_ALLOWED_FLAG")
//	private	String budgetAllowedFlag;
//	
//	@Column(name="REIMBURSEMENT_ALLOWED_FLAG")
//	private	String reimbursementAllowedFlag;
//	
//	@Column(name="CREATE_BY")
//	private	Integer createBy;
//	
//	@Column(name="LAST_UPDATE_BY")
//	private	Integer lastUpdateBy;
//	
//	@Column(name="CREATE_DATE")
//	private	Timestamp createDate;
//	
//	@Column(name="LAST_UPDATE_DATE")
//	private	Timestamp lastUpdateDate;
//	
//	@Column(name="CUST_TEXT01")
//	private	String custText01;
//	@Column(name="CUST_TEXT02")
//	private	String custText02;
//	@Column(name="CUST_TEXT03")
//	private	String custText03;
//	@Column(name="CUST_TEXT04")
//	private	String custText04;
//	@Column(name="CUST_TEXT05")
//	private	String custText05;
//	@Column(name="CUST_TEXT06")
//	private	String custText06;
//	@Column(name="CUST_TEXT07")
//	private	String custText07;
//	@Column(name="CUST_TEXT08")
//	private	String custText08;
//	@Column(name="CUST_TEXT09")
//	private	String custText09;
//	@Column(name="CUST_TEXT10")
//	private	String custText10;
//	@Column(name="CUST_NUMBER01")
//	private	Integer custNumber01;
//	@Column(name="CUST_NUMBER02")
//	private	Integer custNumber02;
//	@Column(name="CUST_DATE01")
//	private	Timestamp custDate01;
//	@Column(name="CUST_DATE02")
//	private	Timestamp custDate02;
//	@Column(name="PROJECT_DEPT_TOTAL_COST")
//	private	BigDecimal projectDeptTotalCost;
//	@Column(name="PROJECT_DEPT_TOTAL_FUNDS")
//	private	BigDecimal projectDeptTotalFunds;
//	@Column(name="PROJECT_DEPT_TOTAL_CAPEX")
//	private	BigDecimal projectDeptTotalCapex;
//	@Column(name="TAX_AMOUNT")
//	private	BigDecimal taxAmount;
//	@Column(name="APPLY_AMOUNT")
//	private	BigDecimal applyAmount;
//	@Column(name="APPLY_FUND_AMOUNT")
//	private	BigDecimal applyFundAmount;
//	@Column(name="APPLY_CAPEX_AMOUNT")
//	private	BigDecimal applyCapexAmount;
//	@Column(name="COMPANY_NAME")
//	private	String companyName;
//	@Column(name="DEPT_NAME")
//	private	String deptName;
//	@Column(name="COST_CENTER_CODE")
//	private	String costCenterCode;
//	@Column(name="COST_CENTER_NAME")
//	private	String costCenterName;
//	@Column(name="OLD_COST_AMOUNT")
//	private	BigDecimal oldCostAmount;
//	@Column(name="OLD_FUND_AMOUNT")
//	private	BigDecimal oldFundAmount;
//	@Column(name="OLD_CAPEX_AMOUNT")
//	private	BigDecimal oldCapexAmount;
//	@Column(name="GRANT_APPLY_AMOUNT")
//	private BigDecimal grantApplyAmount;
//	
//	public Integer getObjectGrantId() {
//		return objectGrantId;
//	}
//
//	public void setObjectGrantId(Integer objectGrantId) {
//		this.objectGrantId = objectGrantId;
//	}
//
//	public String getObjectTypeCode() {
//		return objectTypeCode;
//	}
//
//	public void setObjectTypeCode(String objectTypeCode) {
//		this.objectTypeCode = objectTypeCode;
//	}
//
//	public Integer getObjectId() {
//		return objectId;
//	}
//
//	public void setObjectId(Integer objectId) {
//		this.objectId = objectId;
//	}
//
//	public Integer getCompanyId() {
//		return companyId;
//	}
//
//	public void setCompanyId(Integer companyId) {
//		this.companyId = companyId;
//	}
//
//	public Integer getDepartmentId() {
//		return departmentId;
//	}
//
//	public void setDepartmentId(Integer departmentId) {
//		this.departmentId = departmentId;
//	}
//
//	public String getBudgetAllowedFlag() {
//		return budgetAllowedFlag;
//	}
//
//	public void setBudgetAllowedFlag(String budgetAllowedFlag) {
//		this.budgetAllowedFlag = budgetAllowedFlag;
//	}
//
//	public String getReimbursementAllowedFlag() {
//		return reimbursementAllowedFlag;
//	}
//
//	public void setReimbursementAllowedFlag(String reimbursementAllowedFlag) {
//		this.reimbursementAllowedFlag = reimbursementAllowedFlag;
//	}
//
//	public Integer getCreateBy() {
//		return createBy;
//	}
//
//	public void setCreateBy(Integer createBy) {
//		this.createBy = createBy;
//	}
//
//	public Integer getLastUpdateBy() {
//		return lastUpdateBy;
//	}
//
//	public void setLastUpdateBy(Integer lastUpdateBy) {
//		this.lastUpdateBy = lastUpdateBy;
//	}
//
//	public Timestamp getCreateDate() {
//		return createDate;
//	}
//
//	public void setCreateDate(Timestamp createDate) {
//		this.createDate = createDate;
//	}
//
//	public Timestamp getLastUpdateDate() {
//		return lastUpdateDate;
//	}
//
//	public void setLastUpdateDate(Timestamp lastUpdateDate) {
//		this.lastUpdateDate = lastUpdateDate;
//	}
//
//	public String getCustText01() {
//		return custText01;
//	}
//
//	public void setCustText01(String custText01) {
//		this.custText01 = custText01;
//	}
//
//	public String getCustText02() {
//		return custText02;
//	}
//
//	public void setCustText02(String custText02) {
//		this.custText02 = custText02;
//	}
//
//	public String getCustText03() {
//		return custText03;
//	}
//
//	public void setCustText03(String custText03) {
//		this.custText03 = custText03;
//	}
//
//	public String getCustText04() {
//		return custText04;
//	}
//
//	public void setCustText04(String custText04) {
//		this.custText04 = custText04;
//	}
//
//	public String getCustText05() {
//		return custText05;
//	}
//
//	public void setCustText05(String custText05) {
//		this.custText05 = custText05;
//	}
//
//	public String getCustText06() {
//		return custText06;
//	}
//
//	public void setCustText06(String custText06) {
//		this.custText06 = custText06;
//	}
//
//	public String getCustText07() {
//		return custText07;
//	}
//
//	public void setCustText07(String custText07) {
//		this.custText07 = custText07;
//	}
//
//	public String getCustText08() {
//		return custText08;
//	}
//
//	public void setCustText08(String custText08) {
//		this.custText08 = custText08;
//	}
//
//	public String getCustText09() {
//		return custText09;
//	}
//
//	public void setCustText09(String custText09) {
//		this.custText09 = custText09;
//	}
//
//	public String getCustText10() {
//		return custText10;
//	}
//
//	public void setCustText10(String custText10) {
//		this.custText10 = custText10;
//	}
//
//	public Integer getCustNumber01() {
//		return custNumber01;
//	}
//
//	public void setCustNumber01(Integer custNumber01) {
//		this.custNumber01 = custNumber01;
//	}
//
//	public Integer getCustNumber02() {
//		return custNumber02;
//	}
//
//	public void setCustNumber02(Integer custNumber02) {
//		this.custNumber02 = custNumber02;
//	}
//
//	public Timestamp getCustDate01() {
//		return custDate01;
//	}
//
//	public void setCustDate01(Timestamp custDate01) {
//		this.custDate01 = custDate01;
//	}
//
//	public Timestamp getCustDate02() {
//		return custDate02;
//	}
//
//	public void setCustDate02(Timestamp custDate02) {
//		this.custDate02 = custDate02;
//	}
//
//	public BigDecimal getProjectDeptTotalCost() {
//		return projectDeptTotalCost;
//	}
//
//	public void setProjectDeptTotalCost(BigDecimal projectDeptTotalCost) {
//		this.projectDeptTotalCost = projectDeptTotalCost;
//	}
//
//	public BigDecimal getProjectDeptTotalFunds() {
//		return projectDeptTotalFunds;
//	}
//
//	public void setProjectDeptTotalFunds(BigDecimal projectDeptTotalFunds) {
//		this.projectDeptTotalFunds = projectDeptTotalFunds;
//	}
//
//	public BigDecimal getProjectDeptTotalCapex() {
//		return projectDeptTotalCapex;
//	}
//
//	public void setProjectDeptTotalCapex(BigDecimal projectDeptTotalCapex) {
//		this.projectDeptTotalCapex = projectDeptTotalCapex;
//	}
//
//	public BigDecimal getTaxAmount() {
//		return taxAmount;
//	}
//
//	public void setTaxAmount(BigDecimal taxAmount) {
//		this.taxAmount = taxAmount;
//	}
//
//	public BigDecimal getApplyAmount() {
//		return applyAmount;
//	}
//
//	public void setApplyAmount(BigDecimal applyAmount) {
//		this.applyAmount = applyAmount;
//	}
//
//	public BigDecimal getApplyFundAmount() {
//		return applyFundAmount;
//	}
//
//	public void setApplyFundAmount(BigDecimal applyFundAmount) {
//		this.applyFundAmount = applyFundAmount;
//	}
//
//	public BigDecimal getApplyCapexAmount() {
//		return applyCapexAmount;
//	}
//
//	public void setApplyCapexAmount(BigDecimal applyCapexAmount) {
//		this.applyCapexAmount = applyCapexAmount;
//	}
//
//	public String getCompanyName() {
//		return companyName;
//	}
//
//	public void setCompanyName(String companyName) {
//		this.companyName = companyName;
//	}
//
//	public String getDeptName() {
//		return deptName;
//	}
//
//	public void setDeptName(String deptName) {
//		this.deptName = deptName;
//	}
//
//	public String getCostCenterCode() {
//		return costCenterCode;
//	}
//
//	public void setCostCenterCode(String costCenterCode) {
//		this.costCenterCode = costCenterCode;
//	}
//
//	public String getCostCenterName() {
//		return costCenterName;
//	}
//
//	public void setCostCenterName(String costCenterName) {
//		this.costCenterName = costCenterName;
//	}
//
//	public BigDecimal getOldCostAmount() {
//		return oldCostAmount;
//	}
//
//	public void setOldCostAmount(BigDecimal oldCostAmount) {
//		this.oldCostAmount = oldCostAmount;
//	}
//
//	public BigDecimal getOldFundAmount() {
//		return oldFundAmount;
//	}
//
//	public void setOldFundAmount(BigDecimal oldFundAmount) {
//		this.oldFundAmount = oldFundAmount;
//	}
//
//	public BigDecimal getOldCapexAmount() {
//		return oldCapexAmount;
//	}
//
//	public void setOldCapexAmount(BigDecimal oldCapexAmount) {
//		this.oldCapexAmount = oldCapexAmount;
//	}
//
//	public BigDecimal getGrantApplyAmount() {
//		return grantApplyAmount;
//	}
//
//	public void setGrantApplyAmount(BigDecimal grantApplyAmount) {
//		this.grantApplyAmount = grantApplyAmount;
//	}
//
//	public ObjectGrantVo() {
//	}
//
//	public ObjectGrantVo(Integer objectGrantId, String objectTypeCode,
//			Integer objectId, Integer companyId, Integer departmentId,
//			String budgetAllowedFlag, String reimbursementAllowedFlag,
//			Integer createBy, Integer lastUpdateBy, Timestamp createDate,
//			Timestamp lastUpdateDate, String custText01, String custText02,
//			String custText03, String custText04, String custText05,
//			String custText06, String custText07, String custText08,
//			String custText09, String custText10, Integer custNumber01,
//			Integer custNumber02, Timestamp custDate01, Timestamp custDate02,
//			BigDecimal projectDeptTotalCost, BigDecimal projectDeptTotalFunds,
//			BigDecimal projectDeptTotalCapex, BigDecimal taxAmount,
//			BigDecimal applyAmount, BigDecimal applyFundAmount,
//			BigDecimal applyCapexAmount, String companyName, String deptName,
//			String costCenterCode, String costCenterName,
//			BigDecimal oldCostAmount, BigDecimal oldFundAmount,
//			BigDecimal oldCapexAmount, BigDecimal grantApplyAmount) {
//		super();
//		this.objectGrantId = objectGrantId;
//		this.objectTypeCode = objectTypeCode;
//		this.objectId = objectId;
//		this.companyId = companyId;
//		this.departmentId = departmentId;
//		this.budgetAllowedFlag = budgetAllowedFlag;
//		this.reimbursementAllowedFlag = reimbursementAllowedFlag;
//		this.createBy = createBy;
//		this.lastUpdateBy = lastUpdateBy;
//		this.createDate = createDate;
//		this.lastUpdateDate = lastUpdateDate;
//		this.custText01 = custText01;
//		this.custText02 = custText02;
//		this.custText03 = custText03;
//		this.custText04 = custText04;
//		this.custText05 = custText05;
//		this.custText06 = custText06;
//		this.custText07 = custText07;
//		this.custText08 = custText08;
//		this.custText09 = custText09;
//		this.custText10 = custText10;
//		this.custNumber01 = custNumber01;
//		this.custNumber02 = custNumber02;
//		this.custDate01 = custDate01;
//		this.custDate02 = custDate02;
//		this.projectDeptTotalCost = projectDeptTotalCost;
//		this.projectDeptTotalFunds = projectDeptTotalFunds;
//		this.projectDeptTotalCapex = projectDeptTotalCapex;
//		this.taxAmount = taxAmount;
//		this.applyAmount = applyAmount;
//		this.applyFundAmount = applyFundAmount;
//		this.applyCapexAmount = applyCapexAmount;
//		this.companyName = companyName;
//		this.deptName = deptName;
//		this.costCenterCode = costCenterCode;
//		this.costCenterName = costCenterName;
//		this.oldCostAmount = oldCostAmount;
//		this.oldFundAmount = oldFundAmount;
//		this.oldCapexAmount = oldCapexAmount;
//		this.grantApplyAmount = grantApplyAmount;
//	}
//	
//	@ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)//可选属性optional=false,表示project不能为空。删除授权，不影响项目
//	@JoinColumn(name="object_id",insertable = false, updatable = false)//设置在project表中的关联字段(外键)
//	private ProjectVo project;//授权所属项目
//
//	public ProjectVo getProject() {
//		return project;
//	}
//
//	public void setProject(ProjectVo project) {
//		this.project = project;
//	}
//}
