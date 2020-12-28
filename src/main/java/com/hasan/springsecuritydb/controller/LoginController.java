package com.hasan.springsecuritydb.controller;

import com.hasan.springsecuritydb.model.User;
import com.hasan.springsecuritydb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Muhammad Saimon
 * @since 20/12/2020 16:41
 */

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping(value = {"/", "/login"})
    public String login(Model model, @RequestParam(value = "error", required = false) String error) {
        if (error != null) {
            model.addAttribute("result", "Email or Password is incorrect. Please try again.");
        } else {
            model.addAttribute("result", "");
        }
        return "login";
    }

    @GetMapping("/admin/home")
    public String home(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.getUserByEmail(authentication.getName());
        String nameWithMsg = "Hello, " + user.getName() + ", Welcome to Spring Security";
        model.addAttribute("name", nameWithMsg);
        return "home";
    }

    @GetMapping("/access-denied")
    public String accessDeniedPage() {
        return "access-denied";
    }


}
