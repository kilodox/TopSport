package com.epam.topsport.controller;

import com.epam.topsport.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = {"/", "/users"})
    public String two(Model model) {
        List<User> allUsers = users.getAllUsers();
        model.addAttribute("users", allUsers);
        return "dashboard";
    }
    @RequestMapping(value = "/comments/{id}")
    public String showArticle(@PathVariable int id, Model model1, Model model2) {
        List<Article> article = articles.showArticle(id);
        List<Comment> commentsOfAnArticle = comments.getCommentById(id);
        model1.addAttribute("article", article);
        model2.addAttribute("comments", commentsOfAnArticle);
        return "comments";
    }

//    @RequestMapping("/comments/{id}")
//    public String comment(@PathVariable int id, Model model){
//        List<Comment> commentId = comments.getCommentById(id);
//        model.addAttribute("comments", commentId);
//        return "demo";
//    }
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
