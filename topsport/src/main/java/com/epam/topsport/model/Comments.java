package com.epam.topsport.model;

import com.epam.topsport.model.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Comments {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    public Comments(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Comment> sortList() {
        return jdbcTemplate.query("SELECT comments.text FROM articles  INNER JOIN comments ON articles.article_id = comments.article_id WHERE comments.article_id = 1;", new CommentMapper());

    }

    public List<Comment> getCommentById(int id){
        return jdbcTemplate.query("SELECT * FROM comments WHERE article_id='" + id + "' ", new CommentMapper());
    }

    public void addComment(Comment comment) {
        jdbcTemplate.query("INSERT INTO comments '" + comment + "'", new CommentMapper());
    }
}
