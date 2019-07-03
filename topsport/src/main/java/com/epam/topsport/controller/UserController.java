package com.epam.topsport.controller;

import com.epam.topsport.model.Article;
import com.epam.topsport.model.Comment;
import com.epam.topsport.model.User;
import com.epam.topsport.service.ArticleServiceImplementation;
import com.epam.topsport.service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImplementation userService;
    @Autowired
    private ArticleServiceImplementation articleService;

    @GetMapping("/list")
    public String getAllUsers(Model model){
        List<User> list = userService.getAllUsers();
        model.addAttribute("user_list", list);
        return "tests";
    }

    @GetMapping(value = "/update/{email}")
    public String editUser(@PathVariable String email, Model model){
        User user = userService.findUserByEmail(email);
        model.addAttribute("user_form", user);
        return "tests";
    }

    @GetMapping(value = "/add")
    public String addUser(Model model){
        User user = new User();
        model.addAttribute("user_form", user);
        return "addUser";
    }

    @PostMapping(value = "/save")
    public String saveOrUpdate(@ModelAttribute("userForm") User user){
        if(user.getEmail() !=null){
            userService.updateUser(user);
        }else {
            userService.addUser(user);
        }

        return "redirect:/user/list";
    }
    @GetMapping(value = "/delete/{email}")
    public String deleteUser(@PathVariable("email") String email){
        userService.deleteUser(email);

        return "redirect:/user/list";
    }
}
