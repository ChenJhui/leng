package com.lengmo.authorization.mapper;

import com.lengmo.authorization.entity.PermissionElement;

public interface PermissionElementMapper {
    int insert(PermissionElement record);

    int insertSelective(PermissionElement record);
}