//package com.ouyang.bootstrip.service;
//
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.ouyang.bootstrip.vo.OrgVO;
//
//@Repository
//public interface OrgService extends JpaRepository<OrgVO, String>{
//	@Query("FROM OrgVO o WHERE 1=1 AND o.orgName like :orgName order by o.lastUpdatedDate DESC ")
//	Page<OrgVO> findAllOrg(@Param("orgName")String orgName,Pageable pageable);
//}
