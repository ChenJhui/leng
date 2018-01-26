package com.lengmo.authorization.mapper;

import com.lengmo.authorization.entity.DeptPermission;

public interface DeptPermissionMapper {
    int insert(DeptPermission record);

    int insertSelective(DeptPermission record);
}