package com.epam.topsport.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarMapper implements RowMapper<Car> {

    @Override
    public Car mapRow(ResultSet resultSet, int i) throws SQLException {
        String model = resultSet.getString("model");
        double price = resultSet.getDouble("price");
        return new Car(model, price);
    }

}
