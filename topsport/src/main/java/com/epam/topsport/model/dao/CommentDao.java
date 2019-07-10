package com.epam.topsport.model.dao;

import com.epam.topsport.model.pojos.Comment;

import java.util.List;

public interface CommentDao {

    List<Comment> sortList();

    List<Comment> getCommentById(int id);

    void addComment(Comment comment);
}
