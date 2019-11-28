//package com.ouyang.bootstrip.vo;
//
//import java.math.BigDecimal;
//import java.sql.Timestamp;
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="tbm_projects")
//public class ProjectVo {
//	@Id
//	@Column(name="PROJECT_ID")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "projectSeq")
//	@SequenceGenerator(initialValue = 1,name = "projectSeq", sequenceName = "TBM_PROJECTS_S")
//	private Integer projectId;
//	
//	@Column(name="PROJECT_NUMBER")
//	private	String projectNumber;
//	@Column(name="PROJECT_NAME")
//	private	String projectName;
//	@Column(name="PROJECT_TYPE_LOOKUP_CODE")
//	private	String projectTypeLookupCode;
//	@Column(name="PROJECT_CATEGORY_LOOKUP_CODE")
//	private	String projectCategoryLookupCode;
//	@Column(name="PROJECT_CLASS_LOOKUP_CODE")
//	private	String projectClassLookupCode;
//	@Column(name="PROJECT_PROPERTY_LOOKUP_CODE")
//	private	String projectPropertyLookupCode;
//	@Column(name="STATUS_LOOKUP_CODE")
//	private	String statusLookupCode;
//	@Column(name="COMPANY_NATURE_LOOKUP_CODE")
//	private	String companyNatureLookupCode;
//	@Column(name="CENTRALIZATION_LINE_ID")
//	private	Integer centralizationLineId;
//	@Column(name="PARENT_PROJECT_ID")
//	private	Integer parentProjectId;
//	@Column(name="HIERARCHY_LEVEL")
//	private	Integer hierarchyLevel;
//	@Column(name="SUMMARY_FLAG")
//	private	String summaryFlag;
//	@Column(name="ENABLED_FLAG")
//	private	String enabledFlag;
//	@Column(name="COMPANY_ID")
//	private	Integer companyId;
//	@Column(name="STRATEGY_ID")
//	private	Integer strategyId;
//	@Column(name="DUTY_DEPARTMENT_ID")
//	private	Integer dutyDepartmentId;
//	@Column(name="LAUNCHED_BY_EMPLOYEE_ID")
//	private	Integer launchedByEmployeeId;
//	@Column(name="LAUNCHED_BY_DEPARTMENT_ID")
//	private	Integer launchedByDepartmentId;
//	@Column(name="MANAGED_BY_EMPLOYEE_ID")
//	private	Integer managedByEmployeeId;
//	@Column(name="MANAGED_BY_DEPARTMENT_ID")
//	private	Integer managedByDepartmentId;
//	@Column(name="BILL_TO_DEPARTMENT_ID")
//	private	Integer billToDepartmentId;
//	
//	@Column(name="PROJECT_START_DATE")
//	private	Date projectStartDate;
//	@Column(name="PROJECT_END_DATE")
//	private	Date projectEndDate;
//	@Column(name="PAYMENT_START_DATE")
//	private	Date paymentStartDate;
//	@Column(name="PAYMENT_END_DATE")
//	private	Date paymentEndDate;
//	@Column(name="PROJECT_PURPOSE")
//	private	String projectPurpose;
//	@Column(name="PROJECT_CONTENTS")
//	private	String projectContents;
//	@Column(name="COMMENTS")
//	private	String comments;
//	@Column(name="CREATE_BY")
//	private	Long createBy;
//	@Column(name="LAST_UPDATE_BY")
//	private	Long lastUpdateBy;
//	@Column(name="CREATE_DATE")
//	private	Timestamp createDate;
//	@Column(name="LAST_UPDATE_DATE")
//	private	Timestamp lastUpdateDate;
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
//	@Column(name="PROJECT_DISCOUNT_AMOUNT")
//	private	BigDecimal projectDiscountAmount;
//	@Column(name="PROJECT_TOTAL_AMOUNT")
//	private	BigDecimal projectTotalAmount;
//	@Column(name="PROJECT_TOTAL_COST")
//	private	BigDecimal projectTotalCost;
//	@Column(name="PROJECT_TOTAL_FUNDS")
//	private	BigDecimal projectTotalFunds;
//	@Column(name="PROJECT_PRI_KEY")
//	private	String projectPriKey;
//	@Column(name="PARENT_PROJECT_PRI_KEY")
//	private	String parentProjectPriKey;
//	@Column(name="SOURCE_SYSTEM")
//	private	String sourceSystem;
//	@Column(name="PROJECT_TOTAL_CAPEX")
//	private	BigDecimal projectTotalCapex;
//	@Column(name="TAX_AMOUNT")
//	private	BigDecimal taxAmount;
//	@Column(name="BUDGET_YEAR")
//	private	Integer budgetYear;
//	@Column(name="STRATEGY_PLAN")
//	private	String strategyPlan;
//	@Column(name="PROJECT_REASON")
//	private	String projectReason;
//	@Column(name="CONTENT_DESCRIPTION")
//	private	String contentDescription;
//	@Column(name="EXPECT_RESULT_FLAG")
//	private	String expectResultFlag;
//	@Column(name="APPLICATION_SCOPE_LOOKUP_CODE")
//	private	String applicationScopeLookupCode;
//	@Column(name="AMORTIZATION_FLAG")
//	private	String amortizationFlag;
//	@Column(name="PRIORITY_LOOKUP_CODE")
//	private	String priorityLookupCode;
//	@Column(name="PROJECT_IS_NEW_ADD")
//	private	String projectIsNewAdd;
//	@Column(name="FORM_TYPE_LOOKUP_CODE")
//	private	String formTypeLookupCode;
//	@Column(name="MARKET_CATEGORY_LOOKUP_CODE")
//	private	String marketCategoryLookupCode;
//	@Column(name="REPAIR_ASSET_CLASS_LOOKUP_CODE")
//	private	String repairAssetClassLookupCode;
//	@Column(name="REPAIR_ASSET_USE_BIG_CLASS_LOOKUP_CODE")
//	private	String repairAssetUseBigClassLookupCode;
//	@Column(name="REPAIR_ASSET_USE_SMALL_CLASS_LOOKUP_CODE")
//	private	String repairAssetUseSmallClassLookupCode;
//	@Column(name="REPAIR_CONTENT_CATEGORY_LOOKUP_CODE")
//	private	String repairContentCategoryLookupCode;
//	@Column(name="REPAIR_ASSET_NETWORK_CATEGORY")
//	private	String repairAssetNetworkCategory;
//	@Column(name="TECHNOLOGY_CONTENT")
//	private	String technologyContent;
//	@Column(name="PRODUCT_LOOKUP_CODE")
//	private	String productLookupCode;
//	@Column(name="PROJECT_DESCRIPTION")
//	private	String projectDescription;
//	@Column(name="OLD_COST_AMOUNT")
//	private	BigDecimal oldCostAmount;
//	@Column(name="OLD_FUND_AMOUNT")
//	private	BigDecimal oldFundAmount;
//	@Column(name="OLD_CAPEX_AMOUNT")
//	private	BigDecimal oldCapexAmount;
//	@Column(name="PARENT_PROJECT_NAME")
//	private	String parentProjectName;
//	
//	public ProjectVo(Integer projectId, String projectNumber,
//			String projectName, String projectTypeLookupCode,
//			String projectCategoryLookupCode, String projectClassLookupCode,
//			String projectPropertyLookupCode, String statusLookupCode,
//			String companyNatureLookupCode, Integer centralizationLineId,
//			Integer parentProjectId, Integer hierarchyLevel,
//			String summaryFlag, String enabledFlag, Integer companyId,
//			Integer strategyId, Integer dutyDepartmentId,
//			Integer launchedByEmployeeId, Integer launchedByDepartmentId,
//			Integer managedByEmployeeId, Integer managedByDepartmentId,
//			Integer billToDepartmentId, Date projectStartDate,
//			Date projectEndDate, Date paymentStartDate, Date paymentEndDate,
//			String projectPurpose, String projectContents, String comments,
//			Long createBy, Long lastUpdateBy, Timestamp createDate,
//			Timestamp lastUpdateDate, String custText01, String custText02,
//			String custText03, String custText04, String custText05,
//			String custText06, String custText07, String custText08,
//			String custText09, String custText10, Integer custNumber01,
//			Integer custNumber02, Timestamp custDate01, Timestamp custDate02,
//			BigDecimal projectDiscountAmount, BigDecimal projectTotalAmount,
//			BigDecimal projectTotalCost, BigDecimal projectTotalFunds,
//			String projectPriKey, String parentProjectPriKey,
//			String sourceSystem, BigDecimal projectTotalCapex,
//			BigDecimal taxAmount, Integer budgetYear, String strategyPlan,
//			String projectReason, String contentDescription,
//			String expectResultFlag, String applicationScopeLookupCode,
//			String amortizationFlag, String priorityLookupCode,
//			String projectIsNewAdd, String formTypeLookupCode,
//			String marketCategoryLookupCode, String repairAssetClassLookupCode,
//			String repairAssetUseBigClassLookupCode,
//			String repairAssetUseSmallClassLookupCode,
//			String repairContentCategoryLookupCode,
//			String repairAssetNetworkCategory, String technologyContent,
//			String productLookupCode, String projectDescription,
//			BigDecimal oldCostAmount, BigDecimal oldFundAmount,
//			BigDecimal oldCapexAmount, String parentProjectName) {
//		super();
//		this.projectId = projectId;
//		this.projectNumber = projectNumber;
//		this.projectName = projectName;
//		this.projectTypeLookupCode = projectTypeLookupCode;
//		this.projectCategoryLookupCode = projectCategoryLookupCode;
//		this.projectClassLookupCode = projectClassLookupCode;
//		this.projectPropertyLookupCode = projectPropertyLookupCode;
//		this.statusLookupCode = statusLookupCode;
//		this.companyNatureLookupCode = companyNatureLookupCode;
//		this.centralizationLineId = centralizationLineId;
//		this.parentProjectId = parentProjectId;
//		this.hierarchyLevel = hierarchyLevel;
//		this.summaryFlag = summaryFlag;
//		this.enabledFlag = enabledFlag;
//		this.companyId = companyId;
//		this.strategyId = strategyId;
//		this.dutyDepartmentId = dutyDepartmentId;
//		this.launchedByEmployeeId = launchedByEmployeeId;
//		this.launchedByDepartmentId = launchedByDepartmentId;
//		this.managedByEmployeeId = managedByEmployeeId;
//		this.managedByDepartmentId = managedByDepartmentId;
//		this.billToDepartmentId = billToDepartmentId;
//		this.projectStartDate = projectStartDate;
//		this.projectEndDate = projectEndDate;
//		this.paymentStartDate = paymentStartDate;
//		this.paymentEndDate = paymentEndDate;
//		this.projectPurpose = projectPurpose;
//		this.projectContents = projectContents;
//		this.comments = comments;
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
//		this.projectDiscountAmount = projectDiscountAmount;
//		this.projectTotalAmount = projectTotalAmount;
//		this.projectTotalCost = projectTotalCost;
//		this.projectTotalFunds = projectTotalFunds;
//		this.projectPriKey = projectPriKey;
//		this.parentProjectPriKey = parentProjectPriKey;
//		this.sourceSystem = sourceSystem;
//		this.projectTotalCapex = projectTotalCapex;
//		this.taxAmount = taxAmount;
//		this.budgetYear = budgetYear;
//		this.strategyPlan = strategyPlan;
//		this.projectReason = projectReason;
//		this.contentDescription = contentDescription;
//		this.expectResultFlag = expectResultFlag;
//		this.applicationScopeLookupCode = applicationScopeLookupCode;
//		this.amortizationFlag = amortizationFlag;
//		this.priorityLookupCode = priorityLookupCode;
//		this.projectIsNewAdd = projectIsNewAdd;
//		this.formTypeLookupCode = formTypeLookupCode;
//		this.marketCategoryLookupCode = marketCategoryLookupCode;
//		this.repairAssetClassLookupCode = repairAssetClassLookupCode;
//		this.repairAssetUseBigClassLookupCode = repairAssetUseBigClassLookupCode;
//		this.repairAssetUseSmallClassLookupCode = repairAssetUseSmallClassLookupCode;
//		this.repairContentCategoryLookupCode = repairContentCategoryLookupCode;
//		this.repairAssetNetworkCategory = repairAssetNetworkCategory;
//		this.technologyContent = technologyContent;
//		this.productLookupCode = productLookupCode;
//		this.projectDescription = projectDescription;
//		this.oldCostAmount = oldCostAmount;
//		this.oldFundAmount = oldFundAmount;
//		this.oldCapexAmount = oldCapexAmount;
//		this.parentProjectName = parentProjectName;
//	}
//
//	public ProjectVo() {
//	}
//
//	/**
//	 * 级联保存、更新、删除。当删除项目时所属授权也会删除
//	 * mappedBy="project"中的project是授权对象中的属性
//	 * */
//	@OneToMany(mappedBy="project",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//	private List<ObjectGrantVo> grants;
//
//	public Integer getProjectId() {
//		return projectId;
//	}
//
//	public void setProjectId(Integer projectId) {
//		this.projectId = projectId;
//	}
//
//	public String getProjectNumber() {
//		return projectNumber;
//	}
//
//	public void setProjectNumber(String projectNumber) {
//		this.projectNumber = projectNumber;
//	}
//
//	public String getProjectName() {
//		return projectName;
//	}
//
//	public void setProjectName(String projectName) {
//		this.projectName = projectName;
//	}
//
//	public String getProjectTypeLookupCode() {
//		return projectTypeLookupCode;
//	}
//
//	public void setProjectTypeLookupCode(String projectTypeLookupCode) {
//		this.projectTypeLookupCode = projectTypeLookupCode;
//	}
//
//	public String getProjectCategoryLookupCode() {
//		return projectCategoryLookupCode;
//	}
//
//	public void setProjectCategoryLookupCode(String projectCategoryLookupCode) {
//		this.projectCategoryLookupCode = projectCategoryLookupCode;
//	}
//
//	public String getProjectClassLookupCode() {
//		return projectClassLookupCode;
//	}
//
//	public void setProjectClassLookupCode(String projectClassLookupCode) {
//		this.projectClassLookupCode = projectClassLookupCode;
//	}
//
//	public String getProjectPropertyLookupCode() {
//		return projectPropertyLookupCode;
//	}
//
//	public void setProjectPropertyLookupCode(String projectPropertyLookupCode) {
//		this.projectPropertyLookupCode = projectPropertyLookupCode;
//	}
//
//	public String getStatusLookupCode() {
//		return statusLookupCode;
//	}
//
//	public void setStatusLookupCode(String statusLookupCode) {
//		this.statusLookupCode = statusLookupCode;
//	}
//
//	public String getCompanyNatureLookupCode() {
//		return companyNatureLookupCode;
//	}
//
//	public void setCompanyNatureLookupCode(String companyNatureLookupCode) {
//		this.companyNatureLookupCode = companyNatureLookupCode;
//	}
//
//	public Integer getCentralizationLineId() {
//		return centralizationLineId;
//	}
//
//	public void setCentralizationLineId(Integer centralizationLineId) {
//		this.centralizationLineId = centralizationLineId;
//	}
//
//	public Integer getParentProjectId() {
//		return parentProjectId;
//	}
//
//	public void setParentProjectId(Integer parentProjectId) {
//		this.parentProjectId = parentProjectId;
//	}
//
//	public Integer getHierarchyLevel() {
//		return hierarchyLevel;
//	}
//
//	public void setHierarchyLevel(Integer hierarchyLevel) {
//		this.hierarchyLevel = hierarchyLevel;
//	}
//
//	public String getSummaryFlag() {
//		return summaryFlag;
//	}
//
//	public void setSummaryFlag(String summaryFlag) {
//		this.summaryFlag = summaryFlag;
//	}
//
//	public String getEnabledFlag() {
//		return enabledFlag;
//	}
//
//	public void setEnabledFlag(String enabledFlag) {
//		this.enabledFlag = enabledFlag;
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
//	public Integer getStrategyId() {
//		return strategyId;
//	}
//
//	public void setStrategyId(Integer strategyId) {
//		this.strategyId = strategyId;
//	}
//
//	public Integer getDutyDepartmentId() {
//		return dutyDepartmentId;
//	}
//
//	public void setDutyDepartmentId(Integer dutyDepartmentId) {
//		this.dutyDepartmentId = dutyDepartmentId;
//	}
//
//	public Integer getLaunchedByEmployeeId() {
//		return launchedByEmployeeId;
//	}
//
//	public void setLaunchedByEmployeeId(Integer launchedByEmployeeId) {
//		this.launchedByEmployeeId = launchedByEmployeeId;
//	}
//
//	public Integer getLaunchedByDepartmentId() {
//		return launchedByDepartmentId;
//	}
//
//	public void setLaunchedByDepartmentId(Integer launchedByDepartmentId) {
//		this.launchedByDepartmentId = launchedByDepartmentId;
//	}
//
//	public Integer getManagedByEmployeeId() {
//		return managedByEmployeeId;
//	}
//
//	public void setManagedByEmployeeId(Integer managedByEmployeeId) {
//		this.managedByEmployeeId = managedByEmployeeId;
//	}
//
//	public Integer getManagedByDepartmentId() {
//		return managedByDepartmentId;
//	}
//
//	public void setManagedByDepartmentId(Integer managedByDepartmentId) {
//		this.managedByDepartmentId = managedByDepartmentId;
//	}
//
//	public Integer getBillToDepartmentId() {
//		return billToDepartmentId;
//	}
//
//	public void setBillToDepartmentId(Integer billToDepartmentId) {
//		this.billToDepartmentId = billToDepartmentId;
//	}
//
//	public Date getProjectStartDate() {
//		return projectStartDate;
//	}
//
//	public void setProjectStartDate(Date projectStartDate) {
//		this.projectStartDate = projectStartDate;
//	}
//
//	public Date getProjectEndDate() {
//		return projectEndDate;
//	}
//
//	public void setProjectEndDate(Date projectEndDate) {
//		this.projectEndDate = projectEndDate;
//	}
//
//	public Date getPaymentStartDate() {
//		return paymentStartDate;
//	}
//
//	public void setPaymentStartDate(Date paymentStartDate) {
//		this.paymentStartDate = paymentStartDate;
//	}
//
//	public Date getPaymentEndDate() {
//		return paymentEndDate;
//	}
//
//	public void setPaymentEndDate(Date paymentEndDate) {
//		this.paymentEndDate = paymentEndDate;
//	}
//
//	public String getProjectPurpose() {
//		return projectPurpose;
//	}
//
//	public void setProjectPurpose(String projectPurpose) {
//		this.projectPurpose = projectPurpose;
//	}
//
//	public String getProjectContents() {
//		return projectContents;
//	}
//
//	public void setProjectContents(String projectContents) {
//		this.projectContents = projectContents;
//	}
//
//	public String getComments() {
//		return comments;
//	}
//
//	public void setComments(String comments) {
//		this.comments = comments;
//	}
//
//	public Long getCreateBy() {
//		return createBy;
//	}
//
//	public void setCreateBy(Long createBy) {
//		this.createBy = createBy;
//	}
//
//	public Long getLastUpdateBy() {
//		return lastUpdateBy;
//	}
//
//	public void setLastUpdateBy(Long lastUpdateBy) {
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
//	public BigDecimal getProjectDiscountAmount() {
//		return projectDiscountAmount;
//	}
//
//	public void setProjectDiscountAmount(BigDecimal projectDiscountAmount) {
//		this.projectDiscountAmount = projectDiscountAmount;
//	}
//
//	public BigDecimal getProjectTotalAmount() {
//		return projectTotalAmount;
//	}
//
//	public void setProjectTotalAmount(BigDecimal projectTotalAmount) {
//		this.projectTotalAmount = projectTotalAmount;
//	}
//
//	public BigDecimal getProjectTotalCost() {
//		return projectTotalCost;
//	}
//
//	public void setProjectTotalCost(BigDecimal projectTotalCost) {
//		this.projectTotalCost = projectTotalCost;
//	}
//
//	public BigDecimal getProjectTotalFunds() {
//		return projectTotalFunds;
//	}
//
//	public void setProjectTotalFunds(BigDecimal projectTotalFunds) {
//		this.projectTotalFunds = projectTotalFunds;
//	}
//
//	public String getProjectPriKey() {
//		return projectPriKey;
//	}
//
//	public void setProjectPriKey(String projectPriKey) {
//		this.projectPriKey = projectPriKey;
//	}
//
//	public String getParentProjectPriKey() {
//		return parentProjectPriKey;
//	}
//
//	public void setParentProjectPriKey(String parentProjectPriKey) {
//		this.parentProjectPriKey = parentProjectPriKey;
//	}
//
//	public String getSourceSystem() {
//		return sourceSystem;
//	}
//
//	public void setSourceSystem(String sourceSystem) {
//		this.sourceSystem = sourceSystem;
//	}
//
//	public BigDecimal getProjectTotalCapex() {
//		return projectTotalCapex;
//	}
//
//	public void setProjectTotalCapex(BigDecimal projectTotalCapex) {
//		this.projectTotalCapex = projectTotalCapex;
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
//	public Integer getBudgetYear() {
//		return budgetYear;
//	}
//
//	public void setBudgetYear(Integer budgetYear) {
//		this.budgetYear = budgetYear;
//	}
//
//	public String getStrategyPlan() {
//		return strategyPlan;
//	}
//
//	public void setStrategyPlan(String strategyPlan) {
//		this.strategyPlan = strategyPlan;
//	}
//
//	public String getProjectReason() {
//		return projectReason;
//	}
//
//	public void setProjectReason(String projectReason) {
//		this.projectReason = projectReason;
//	}
//
//	public String getContentDescription() {
//		return contentDescription;
//	}
//
//	public void setContentDescription(String contentDescription) {
//		this.contentDescription = contentDescription;
//	}
//
//	public String getExpectResultFlag() {
//		return expectResultFlag;
//	}
//
//	public void setExpectResultFlag(String expectResultFlag) {
//		this.expectResultFlag = expectResultFlag;
//	}
//
//	public String getApplicationScopeLookupCode() {
//		return applicationScopeLookupCode;
//	}
//
//	public void setApplicationScopeLookupCode(String applicationScopeLookupCode) {
//		this.applicationScopeLookupCode = applicationScopeLookupCode;
//	}
//
//	public String getAmortizationFlag() {
//		return amortizationFlag;
//	}
//
//	public void setAmortizationFlag(String amortizationFlag) {
//		this.amortizationFlag = amortizationFlag;
//	}
//
//	public String getPriorityLookupCode() {
//		return priorityLookupCode;
//	}
//
//	public void setPriorityLookupCode(String priorityLookupCode) {
//		this.priorityLookupCode = priorityLookupCode;
//	}
//
//	public String getProjectIsNewAdd() {
//		return projectIsNewAdd;
//	}
//
//	public void setProjectIsNewAdd(String projectIsNewAdd) {
//		this.projectIsNewAdd = projectIsNewAdd;
//	}
//
//	public String getFormTypeLookupCode() {
//		return formTypeLookupCode;
//	}
//
//	public void setFormTypeLookupCode(String formTypeLookupCode) {
//		this.formTypeLookupCode = formTypeLookupCode;
//	}
//
//	public String getMarketCategoryLookupCode() {
//		return marketCategoryLookupCode;
//	}
//
//	public void setMarketCategoryLookupCode(String marketCategoryLookupCode) {
//		this.marketCategoryLookupCode = marketCategoryLookupCode;
//	}
//
//	public String getRepairAssetClassLookupCode() {
//		return repairAssetClassLookupCode;
//	}
//
//	public void setRepairAssetClassLookupCode(String repairAssetClassLookupCode) {
//		this.repairAssetClassLookupCode = repairAssetClassLookupCode;
//	}
//
//	public String getRepairAssetUseBigClassLookupCode() {
//		return repairAssetUseBigClassLookupCode;
//	}
//
//	public void setRepairAssetUseBigClassLookupCode(
//			String repairAssetUseBigClassLookupCode) {
//		this.repairAssetUseBigClassLookupCode = repairAssetUseBigClassLookupCode;
//	}
//
//	public String getRepairAssetUseSmallClassLookupCode() {
//		return repairAssetUseSmallClassLookupCode;
//	}
//
//	public void setRepairAssetUseSmallClassLookupCode(
//			String repairAssetUseSmallClassLookupCode) {
//		this.repairAssetUseSmallClassLookupCode = repairAssetUseSmallClassLookupCode;
//	}
//
//	public String getRepairContentCategoryLookupCode() {
//		return repairContentCategoryLookupCode;
//	}
//
//	public void setRepairContentCategoryLookupCode(
//			String repairContentCategoryLookupCode) {
//		this.repairContentCategoryLookupCode = repairContentCategoryLookupCode;
//	}
//
//	public String getRepairAssetNetworkCategory() {
//		return repairAssetNetworkCategory;
//	}
//
//	public void setRepairAssetNetworkCategory(String repairAssetNetworkCategory) {
//		this.repairAssetNetworkCategory = repairAssetNetworkCategory;
//	}
//
//	public String getTechnologyContent() {
//		return technologyContent;
//	}
//
//	public void setTechnologyContent(String technologyContent) {
//		this.technologyContent = technologyContent;
//	}
//
//	public String getProductLookupCode() {
//		return productLookupCode;
//	}
//
//	public void setProductLookupCode(String productLookupCode) {
//		this.productLookupCode = productLookupCode;
//	}
//
//	public String getProjectDescription() {
//		return projectDescription;
//	}
//
//	public void setProjectDescription(String projectDescription) {
//		this.projectDescription = projectDescription;
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
//	public String getParentProjectName() {
//		return parentProjectName;
//	}
//
//	public void setParentProjectName(String parentProjectName) {
//		this.parentProjectName = parentProjectName;
//	}
//
//	public List<ObjectGrantVo> getGrants() {
//		return grants;
//	}
//
//	public void setGrants(List<ObjectGrantVo> grants) {
//		this.grants = grants;
//	}
//}
