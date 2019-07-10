package com.epam.topsport.model.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Comment {

    @Id
    private int commentId;
    private String text;
    private String email;
    private Date time;
    private int articleId;

    public Comment(int commentId, String text, String email, Date time, int articleId) {
        this.commentId = commentId;
        this.text = text;
        this.email = email;
        this.time = time;
        this.articleId = articleId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getArticleId() {
        return articleId;
    }
    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", text='" + text + '\'' +
                ", email='" + email + '\'' +
                ", time=" + time +
                ", articleId=" + articleId +
                '}';
    }
}
