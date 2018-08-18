package com.Andersen8.MetroTest.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class JdbcUtil {
    public static JdbcTemplate datasource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
        driverManagerDataSource.setPassword("password");
        driverManagerDataSource.setUsername("postgres");
        driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5432/metro");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(driverManagerDataSource);
        return jdbcTemplate;
    }
}
