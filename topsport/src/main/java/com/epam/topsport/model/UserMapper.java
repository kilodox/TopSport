package com.epam.topsport.model;

import org.springframework.jdbc.core.RowMapper;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        String email = resultSet.getString("email");
        int password = resultSet.getInt("password");
        String nickname = resultSet.getString("nickname");
        String fullName = resultSet.getString("full_name");
        String picture = resultSet.getString("profile_picture");

        return new User(email, password, nickname, fullName, picture);
    }
}
