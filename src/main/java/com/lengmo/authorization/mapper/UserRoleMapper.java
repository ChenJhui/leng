package com.lengmo.authorization.mapper;

import com.lengmo.authorization.entity.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}