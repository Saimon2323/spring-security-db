package com.hasan.springsecuritydb.service;

import com.hasan.springsecuritydb.model.Role;

/**
 * @Author Muhammad Saimon
 * @since Dec 20, 2020 10:33
 */

public interface RoleService {

    void addRole(Role role);

    Role getRoleByRole(String role);
}
