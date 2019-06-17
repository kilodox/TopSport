package com.epam.topsport.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Comments {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public Comments(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> sortList() {
        return jdbcTemplate.queryForList("SELECT aisle DISTINCT text from comments", new CommentMapper());
    }

}
