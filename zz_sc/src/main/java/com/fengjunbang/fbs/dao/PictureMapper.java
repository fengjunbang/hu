package com.fengjunbang.fbs.dao;

import java.util.List;
import java.util.Map;

import com.fengjunbang.fbs.pojo.Picture;

public interface PictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
    
    List<Map> selectAll();
}