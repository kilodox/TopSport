package com.epam.topsport.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;

public class CommentMapper implements RowMapper {
    @Override
    public Comment mapRow(ResultSet resultSet, int i) throws SQLException {
        int commentId = resultSet.getInt("comment_id");
        String text = resultSet.getString("text");
        String email = resultSet.getString("email");
        Date time = resultSet.getDate("time");

        return new Comment(commentId, text, email, time);
    }
}
