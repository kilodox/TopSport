package com.epam.topsport.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        int articleId = resultSet.getInt("article_id");
        String title = resultSet.getString("title");
        String authirFullName = resultSet.getString("author_full_name");
        int likes = resultSet.getInt("likes");
        int dislikes = resultSet.getInt("dislikes");
        int commentId = resultSet.getInt("comment_id");
        return null;
    }
}
