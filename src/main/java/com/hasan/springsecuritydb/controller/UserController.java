package com.hasan.springsecuritydb.controller;

import com.hasan.springsecuritydb.model.Role;
import com.hasan.springsecuritydb.model.User;
import com.hasan.springsecuritydb.service.RoleService;
import com.hasan.springsecuritydb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author Muhammad Saimon
 * @since 20/12/2020 16:40
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/registration")
    public String userRegistrationView(User user, Model model) {
//        model.addAttribute("user", new User());
        model.addAttribute("result", "");
        return "add-user";
    }

    @PostMapping("/registration")
    public String userRegistration(@ModelAttribute User user, Model model) {
        user.setActive(true);
        Role role = new Role();
        role.setActiveStatus(true);
        role.setRole("ADMIN");
        roleService.addRole(role);
        user.setRoles(new HashSet<>(Arrays.asList(roleService.getRoleByRole(role.getRole()))));
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userService.addUser(user);
        model.addAttribute("result", "Registration successful");
        return "login";
    }

}
