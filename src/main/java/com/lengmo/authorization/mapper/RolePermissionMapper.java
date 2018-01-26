package com.lengmo.authorization.mapper;

import com.lengmo.authorization.entity.RolePermission;

public interface RolePermissionMapper {
    int insert(RolePermission record);

    int insertSelective(RolePermission record);
}