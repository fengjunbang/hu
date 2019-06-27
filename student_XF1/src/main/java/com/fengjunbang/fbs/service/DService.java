package com.fengjunbang.fbs.service;

import java.util.List;
import java.util.Map;

import com.fengjunbang.fbs.pojo.SchoolD;

public interface DService {
	  int deleteByPrimaryKey(Integer did);

	    int insert(SchoolD record);

	    int insertSelective(SchoolD record);

	    SchoolD selectByPrimaryKey(Integer did);

	    int updateByPrimaryKeySelective(SchoolD record);

	    int updateByPrimaryKey(SchoolD record);
	    
	    List<Map> selectBydids();
}
