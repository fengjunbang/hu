package com.fengjunbang.fbs.service;

import java.util.List;
import java.util.Map;

import com.fengjunbang.fbs.pojo.SchoolRooms;

public interface RoomService {
	 int insert(SchoolRooms record);

	    int insertSelective(SchoolRooms record);
	    
	    List<Map> selectAllById(Integer id); 
	    
	    int updateByDid (Integer did);
}
