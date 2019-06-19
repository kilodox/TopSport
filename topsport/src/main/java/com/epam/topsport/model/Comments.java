package com.epam.topsport.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Comments {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public Comments(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Comment> sortList() {
        return jdbcTemplate.query("SELECT * FROM comments WHERE comment_id >0 ORDER BY time", new CommentMapper());
    }

    public List<Comment> getCommentById(int id){
        return jdbcTemplate.query("SELECT * FROM comments WHERE comment_id='" + id + "' ", new CommentMapper());
    }

    public void addComment(Comment comment) {
        jdbcTemplate.query("INSERT INTO comments '" + comment + "'", new CommentMapper());
    }
}
