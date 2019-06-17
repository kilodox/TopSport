package com.epam.topsport.controller;

import com.epam.topsport.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DashboardController {

    private Users users;

    @Autowired
    public DashboardController(Users users) {
        this.users = users;
    }

//    @GetMapping("/")
//    public String dashboard(Model model) {
//        model.addAttribute("users", users.getAllUsers());
//        return "dashboard";
//    }

    @RequestMapping(value = {"/", "/home", "/index"})
    public String two(Model model) {
        List<User> allUsers = users.getAllUsers();
        allUsers.addAll(users.getAllUsers());
        model.addAttribute("users", allUsers);
        return "dashboard";
    }

}
