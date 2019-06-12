package com.epam.topsport.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Cars {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public Cars(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Car> getAllCars() {
        return jdbcTemplate.query("SELECT * FROM cars;", new CarMapper());
    }
}
