package com.epam.topsport.dao;

import com.epam.topsport.model.Article;
import com.epam.topsport.model.ArticleMapper;
import com.epam.topsport.model.Comment;
import com.epam.topsport.model.CommentMapper;
import com.epam.topsport.model.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class ArticleDaoImplementation implements ArticleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Article> getAllComments() {
        String query = "SELECT comments.text FROM articles  INNER JOIN comments ON articles.article_id = comments.article_id WHERE comments.article_id = 1;";
        RowMapper<Article> rowMapper = new ArticleMapper();
        List<Article> list = jdbcTemplate.query(query, rowMapper);
        return list;
    }
}
