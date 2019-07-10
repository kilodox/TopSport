package com.epam.topsport.controller;

import com.epam.topsport.model.dao.ArticleDaoImplementation;
import com.epam.topsport.model.dao.CommentDaoImplementation;
import com.epam.topsport.model.dao.UserDao;
import com.epam.topsport.model.dto.UserDto;
import com.epam.topsport.model.pojos.Article;
import com.epam.topsport.model.pojos.Comment;
import com.epam.topsport.model.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Controller
public class DashboardController {

    private UserDao users;
    private CommentDaoImplementation commentDaoImplementation;
    private ArticleDaoImplementation articleDaoImplementation;

    @Autowired
    public DashboardController(UserDao users, CommentDaoImplementation commentDaoImplementation, ArticleDaoImplementation articleDaoImplementation) {
        this.users = users;
        this.commentDaoImplementation = commentDaoImplementation;
        this.articleDaoImplementation = articleDaoImplementation;
    }

    @RequestMapping(value = {"/", "/users"})
    public String two(Model model) {
        List<User> allUsers = users.getAllUsers();
        model.addAttribute("users", allUsers);
        return "dashboard";
    }
    @RequestMapping(value = "/articles/{id}")
    public String showArticle(@PathVariable int id, Model model1, Model model2) {
        List<Article> article = articleDaoImplementation.showArticle(id);
        List<Comment> commentsOfAnArticle = commentDaoImplementation.getCommentById(id);
        model1.addAttribute("article", article);
        model2.addAttribute("commentDaoImplementation", commentsOfAnArticle);
        return "articles";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/commentDaoImplementation")
    public void addComment(@RequestBody Comment comment){
        commentDaoImplementation.addComment(comment);
    }

    @RequestMapping(value = "/user/registration", method = RequestMethod.GET)
    public String showRegistrationForm(WebRequest request, Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "registration";
    }

    @RequestMapping
    public String logging(){

    }

}
