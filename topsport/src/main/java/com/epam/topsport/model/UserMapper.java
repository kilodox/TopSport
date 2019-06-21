package com.epam.topsport.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
       User user = new User();
       user.setEmail(resultSet.getString("email"));
       user.setPassword(resultSet.getInt("password"));
       user.setNickname(resultSet.getString("nickname"));
       user.setFullName(resultSet.getString("full_name"));
       user.setPicture(resultSet.getString("profile_picture"));
       return user;
    }
}
