package com.hasan.springsecuritydb.service.impl;

import com.hasan.springsecuritydb.model.Role;
import com.hasan.springsecuritydb.repository.RoleRepository;
import com.hasan.springsecuritydb.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Muhammad Saimon
 * @since Dec 20, 2020 10:36
 */

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public void addRole(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Role getRoleByRole(String role) {
        return roleRepository.findRoleByRole(role);
    }
}
