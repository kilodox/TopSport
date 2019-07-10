package com.epam.topsport.model.dao;

import com.epam.topsport.model.pojos.Article;

import java.util.List;

public interface ArticleDao {
    List<Article> showArticle(int id);
}
