package com.lengmo.authorization.entity;

import java.io.Serializable;

public class PermissionElement implements Serializable {
    private Integer permissionId;

    private Integer elementId;

    private static final long serialVersionUID = 1L;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }
}