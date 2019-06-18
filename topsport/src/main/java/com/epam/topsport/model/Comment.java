package com.epam.topsport.model;

import java.util.Date;

public class Comment {
    private int commentId;
    private String text;
    private String email;
    private Date time;

    public Comment(int commentId, String text, String email, Date time) {
        this.commentId = commentId;
        this.text = text;
        this.email = email;
        this.time = time;
    }

    public int getCommentId() {
        return commentId;
    }

    public String getText() {
        return text;
    }

    public String getEmail() {
        return email;
    }

    public Date getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", text='" + text + '\'' +
                ", email='" + email + '\'' +
                ", time=" + time +
                '}';
    }
}
