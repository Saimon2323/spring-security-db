package com.hasan.springsecuritydb.service;

import com.hasan.springsecuritydb.model.User;

/**
 * @Author Muhammad Saimon
 * @since Dec 20, 2020 10:33
 */

public interface UserService {

    void addUser(User user);

    User getUserByEmail(String email);
}
