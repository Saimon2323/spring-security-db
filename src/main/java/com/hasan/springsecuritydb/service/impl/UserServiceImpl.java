package com.hasan.springsecuritydb.service.impl;

import com.hasan.springsecuritydb.model.User;
import com.hasan.springsecuritydb.repository.UserRepository;
import com.hasan.springsecuritydb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Muhammad Saimon
 * @since Dec 20/12/2020 10:34
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
}
