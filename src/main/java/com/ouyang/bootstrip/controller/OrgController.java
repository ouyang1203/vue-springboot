//package com.ouyang.bootstrip.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.alibaba.fastjson.JSONObject;
//import com.ouyang.bootstrip.service.OrgService;
//import com.ouyang.bootstrip.vo.OrgVO;
//
//@RestController
//@RequestMapping(value="/org")
//public class OrgController {
//	@Autowired
//	OrgService orgService;
//	@RequestMapping(value="/findAllOrg")
//	public String findALlOrg(int limit, int offset, String departmentname){
//		if(limit==0){
//			limit = 10;
//		}
//		if(offset<0){
//			offset = 0 ;
//		}
//		if(offset>0){
//			offset = offset/limit;
//		}
//		Pageable pageable = new PageRequest(offset,limit);
//		if(departmentname!=null){
//			departmentname = "%"+departmentname.trim()+"%";
//		}else{
//			departmentname = "%%";
//		}
//		Page<OrgVO> orgList = orgService.findAllOrg(departmentname,pageable);
//		List<OrgVO> list = orgList.getContent();
//		JSONObject obj = new JSONObject();
//		obj.put("total", orgList.getTotalElements());
//		obj.put("rows", list);
//		return obj.toString();
//	}
//}
