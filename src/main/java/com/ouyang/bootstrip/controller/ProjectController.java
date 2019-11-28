//package com.ouyang.bootstrip.controller;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.ouyang.bootstrip.service.ProjectService;
//import com.ouyang.bootstrip.vo.ObjectGrantVo;
//import com.ouyang.bootstrip.vo.ProjectVo;
//
//@RequestMapping(value="/project")
//@RestController
//public class ProjectController {
//	@Autowired
//	ProjectService projectService;
//	
//	@RequestMapping(value="/addProject")
//	public String addProject(){
//		ObjectGrantVo grant1 = new ObjectGrantVo();
//		grant1.setObjectTypeCode("PROJECT");
//		grant1.setCompanyId(7702);
//		grant1.setDepartmentId(193001);
//		grant1.setBudgetAllowedFlag("Y");
//		grant1.setReimbursementAllowedFlag("Y");
//		grant1.setCreateBy(9999999);
//		grant1.setLastUpdateBy(9999999);
//		grant1.setProjectDeptTotalCost(new BigDecimal(100000));
//		ObjectGrantVo grant2 = new ObjectGrantVo();
//		grant2.setObjectTypeCode("PROJECT");
//		grant2.setCompanyId(7702);
//		grant2.setDepartmentId(193022);
//		grant2.setBudgetAllowedFlag("N");
//		grant2.setReimbursementAllowedFlag("Y");
//		grant2.setCreateBy(9999999);
//		grant2.setLastUpdateBy(9999999);
//		grant2.setProjectDeptTotalCost(new BigDecimal(100000));
//		List<ObjectGrantVo> grants = new ArrayList<ObjectGrantVo>();
//		grants.add(grant1);
//		grants.add(grant2);
//		ProjectVo project = new ProjectVo();
//		project.setProjectNumber("JPAPROJECT");
//		project.setProjectName("JPA项目插入测试");
//		project.setProjectTypeLookupCode("OPEX");
//		project.setProjectCategoryLookupCode("OTHER");
//		project.setProjectClassLookupCode("GENERAL");
//		project.setProjectPropertyLookupCode("KEY");
//		project.setStatusLookupCode("IMPLEMENTING");
//		project.setCompanyNatureLookupCode("LD");
//		project.setHierarchyLevel(1);
//		project.setSummaryFlag("N");
//		project.setEnabledFlag("Y");
//		project.setCompanyId(7702);
//		project.setLaunchedByEmployeeId(2);
//		project.setManagedByEmployeeId(2);
//		project.setManagedByDepartmentId(193001);
//		project.setProjectStartDate(new Date("2019-01-01"));
//		project.setProjectEndDate(new Date("2019-12-31"));
//		project.setGrants(grants);
//		projectService.saveAndFlush(project);
//		return "插入成功!";
//	}
//}
