package com.epam.topsport.service;

import com.epam.topsport.dao.ArticleDaoImplementation;
import com.epam.topsport.model.Article;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ArticleServiceImplementation implements ArticleService {

    private ArticleDaoImplementation articleDaoImplementation;
    @Override
    public List<Article> getAllComments() {
        return articleDaoImplementation.getAllComments();
    }
}
