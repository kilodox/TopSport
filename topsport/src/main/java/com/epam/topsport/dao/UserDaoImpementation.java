package com.epam.topsport.dao;

import com.epam.topsport.model.User;
import com.epam.topsport.model.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository

public class UserDaoImpementation implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getAllUsers() {
        String query = "SELECT * FROM users";
        RowMapper<User> rowMapper = new UserMapper();
        List<User> list = jdbcTemplate.query(query, rowMapper);
        return list;
    }

    @Override
    public User findUserByEmail(String email) {
        String query = "SELECT * FROM users WHERE email = ?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        User user = jdbcTemplate.queryForObject(query, rowMapper, email);

        return user;
    }

    @Override
    public void addUser(User user) {
        String query = "INSERT INTO users(email, password, nickname, full_name, profile_picture) VALUES(?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(query,user.getEmail(), user.getPassword(), user.getNickname(), user.getFullName(), user.getPicture());
    }

    @Override
    public void updateUser(User user) {
        String query = "UPDATE users SET password=?, nickname=?, full_name=?, profile_picture=? WHERE email=?";
        jdbcTemplate.update(query, user.getPassword(), user.getNickname(), user.getFullName(), user.getPicture(), user.getEmail());
    }

    @Override
    public void deleteUser(String email) {
        String query = "DELETE FROM users WHERE email=?";
        jdbcTemplate.update(query, email);
    }
}
