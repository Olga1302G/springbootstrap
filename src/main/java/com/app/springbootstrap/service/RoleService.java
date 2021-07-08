package com.app.springbootstrap.service;

import com.app.springbootstrap.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    List<Role> getAllRoles();
    Set<Role> getRoleByName(String[] roles);
}
