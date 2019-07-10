package com.epam.topsport.model.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Article {

    @Id
    private int articleId;
    private String authorFullName;
    private String title;
    private String text;
    private int likes;
    private int dislikes;

    public Article(int articleId, String authorFullName, String title, String text, int likes, int dislikes) {
        this.articleId = articleId;
        this.authorFullName = authorFullName;
        this.title = title;
        this.text = text;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", authorFullName='" + authorFullName + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                '}';
    }
}
