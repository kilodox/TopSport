package com.epam.topsport.controller;

import com.epam.topsport.model.Car;
import com.epam.topsport.model.CarMapper;
import com.epam.topsport.model.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {

    private Cars cars;

    @Autowired
    public DashboardController(Cars cars) {
        this.cars = cars;
    }

    @GetMapping("/")
    public String dashboard(Model model) {
        model.addAttribute("cars", cars.getAllCars());
        return "dashboard";
    }

    @GetMapping("/two")
    public String two(Model model) {
        List<Car> allCars = cars.getAllCars();
        allCars.addAll(cars.getAllCars());
        model.addAttribute("cars", allCars);
        return "dashboard";
    }

}
