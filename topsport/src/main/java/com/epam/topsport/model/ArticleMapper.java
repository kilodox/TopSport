package com.epam.topsport.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ArticleMapper implements RowMapper<Article> {
    @Override
    public Article mapRow(ResultSet resultSet, int i) throws SQLException {
        int articleId = resultSet.getInt("article_id");
        String title = resultSet.getString("title");
        String authorFullName = resultSet.getString("author_full_name");
        int likes = resultSet.getInt("likes");
        int dislikes = resultSet.getInt("dislikes");
        String text = resultSet.getString("text");

        return new Article(articleId, authorFullName, title, text, likes, dislikes);
    }
}
