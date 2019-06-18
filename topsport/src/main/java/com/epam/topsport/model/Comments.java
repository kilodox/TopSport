package com.epam.topsport.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class Comments {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public Comments(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Comment> sortList() {
        return jdbcTemplate.query("SELECT * from comments WHERE comment_id >1 ORDER BY time", new CommentMapper());
        //SELECT DISTINCT text from comments ORDER BY TIME
    }

}
