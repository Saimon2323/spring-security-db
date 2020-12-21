package com.hasan.springsecuritydb.repository;

import com.hasan.springsecuritydb.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Muhammad Saimon
 * @since Dec 20, 2020 10:29
 */

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findRoleByRole(String role);

}
