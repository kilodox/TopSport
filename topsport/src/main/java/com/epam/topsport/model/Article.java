package com.epam.topsport.model;

public class Article {
    private int articleId;
    private String title;
    private String text;
    private int likes;
    private int dislikes;
    private int commentId;

    public Article(int articleId, String title, String text, int likes, int dislikes, int commentId) {
        this.articleId = articleId;
        this.title = title;
        this.text = text;
        this.likes = likes;
        this.dislikes = dislikes;
        this.commentId = commentId;
    }

    public int getArticleId() {
        return articleId;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public int getCommentId() {
        return commentId;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", commentId=" + commentId +
                '}';
    }
}
