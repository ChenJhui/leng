package com.lengmo.authorization.mapper;

import com.lengmo.authorization.entity.PermissionMenu;

public interface PermissionMenuMapper {
    int insert(PermissionMenu record);

    int insertSelective(PermissionMenu record);
}