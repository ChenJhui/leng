package com.lengmo.authorization.mapper;

import com.lengmo.authorization.entity.Element;

public interface ElementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Element record);

    int insertSelective(Element record);

    Element selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Element record);

    int updateByPrimaryKey(Element record);
}