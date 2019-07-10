package com.epam.topsport.model.dao;

import com.epam.topsport.model.mappers.ArticleMapper;
import com.epam.topsport.model.pojos.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArticleDaoImplementation implements ArticleDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ArticleDaoImplementation(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Article> showArticle(int id) {
        return jdbcTemplate.query("SELECT * FROM public.articles WHERE articles.article_id ='" + id + "' ", new ArticleMapper());
    }
}
