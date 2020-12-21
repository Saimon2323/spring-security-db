package com.hasan.springsecuritydb.repository;

import com.hasan.springsecuritydb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Muhammad Saimon
 * @since Dec 20, 2020 10:28
 */

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByEmail(String email);

}
