package com.epam.topsport.controller;

import com.epam.topsport.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class DashboardController {

    private Users users;
    private Comments comments;
    private Articles articles;

    @Autowired
    public DashboardController(Users users, Comments comments, Articles articles) {
        this.users = users;
        this.comments = comments;
        this.articles = articles;
    }

//    @GetMapping("/")
//    public String dashboard(Model model) {
//        model.addAttribute("users", users.getAllUsers());
//        return "dashboard";
//    }

    @RequestMapping(value = {"/", "/users"})
    public String two(Model model) {
        List<User> allUsers = users.getAllUsers();
       // allUsers.addAll(users.getAllUsers()); tova zashto go slojihme
        model.addAttribute("users", allUsers);
        return "dashboard";
    }
    @RequestMapping(value = "/comments")
    public String comments(Model model) {
        List<Comment> allComments = comments.sortList();
        model.addAttribute("comments", allComments);
        return "tests";
    }

    @RequestMapping("/comments/{id}")
    public String comment(@PathVariable int id, Model model){
        List<Comment> commentId = comments.getCommentById(id);
        model.addAttribute("comments", commentId);
        return "demo";
    }
    @RequestMapping(method = RequestMethod.POST, value = "/comments")
    public void addComment(@RequestBody Comment comment){
        comments.addComment(comment);
    }

//    @RequestMapping("/comments/{id}")
//    public String comment(Integer id){
//        Comment commentId = comments.getCommentById(id);
//        return commentId.toString();
//    }

}
