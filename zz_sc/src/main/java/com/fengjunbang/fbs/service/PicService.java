package com.fengjunbang.fbs.service;

import java.util.List;
import java.util.Map;

import com.fengjunbang.fbs.pojo.Picture;

public interface PicService {
	
	
	int insertSelective(Picture record);
	List<Map> selectAll();
}
