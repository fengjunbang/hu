package com.fengjunbang.fbs.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.fengjunbang.fbs.pojo.SchoolStudent;

public interface StudentService {
	 int deleteByPrimaryKey(Integer id);

	    int insert(SchoolStudent record);

	    int insertSelective(SchoolStudent record);

	    SchoolStudent selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(SchoolStudent record);

	    int updateByPrimaryKey(SchoolStudent record);
	    
	   List<Map> selectStudent(@Param("name")String name);

}
