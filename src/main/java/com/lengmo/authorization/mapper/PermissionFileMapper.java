package com.lengmo.authorization.mapper;

import com.lengmo.authorization.entity.PermissionFile;

public interface PermissionFileMapper {
    int insert(PermissionFile record);

    int insertSelective(PermissionFile record);
}