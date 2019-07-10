package com.epam.topsport.config;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebSecurity implements WebMvcConfigurer {

    public UserDetailsService userDetailsService(){
        return new JdbcUserDetailsManager();
    }

}
