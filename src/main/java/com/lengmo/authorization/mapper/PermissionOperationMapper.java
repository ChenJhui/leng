package com.lengmo.authorization.mapper;

import com.lengmo.authorization.entity.PermissionOperation;

public interface PermissionOperationMapper {
    int insert(PermissionOperation record);

    int insertSelective(PermissionOperation record);
}