package com.epam.topsport.model.mappers;

import com.epam.topsport.model.pojos.Comment;
import org.springframework.jdbc.core.RowMapper;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentMapper implements RowMapper<Comment> {
    @Override
    public Comment mapRow(ResultSet resultSet, int i) throws SQLException {
        int commentId = resultSet.getInt("comment_id");
        String text = resultSet.getString("text");
        String email = resultSet.getString("email");
        Date time = resultSet.getTimestamp("time");
        int articleId = resultSet.getInt("article_id");

        return new Comment(commentId, text, email, time, articleId);
    }
}
