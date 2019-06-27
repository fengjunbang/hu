package com.fengjunbang.fbs.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengjunbang.fbs.dao.PictureMapper;
import com.fengjunbang.fbs.pojo.Picture;
import com.fengjunbang.fbs.service.PicService;
@Service("picService")
public class PicServiceImpl implements PicService {
	
	@Autowired
	private PictureMapper pictureMapper;

	public int insertSelective(Picture record) {
		// TODO Auto-generated method stub
		return pictureMapper.insertSelective(record);
	}

	public List<Map> selectAll() {
		// TODO Auto-generated method stub
		return pictureMapper.selectAll();
	}

}
