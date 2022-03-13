package com.example.demo.security;

import org.springframework.security.core.GrantedAuthority;

import java.util.Set;


public enum ApplicationUserRolePermission {
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write"),
    COURSE_READ("course:read"),
    COURSE_WRITE("course:wrirte");



    private final String permission;

    ApplicationUserRolePermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }


}
