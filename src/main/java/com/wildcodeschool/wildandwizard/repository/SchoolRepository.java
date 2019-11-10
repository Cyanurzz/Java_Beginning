package com.wildcodeschool.wildandwizard.repository;

import com.wildcodeschool.wildandwizard.entity.School;

import java.util.List;

public class SchoolRepository {

    private final static String DB_URL = "jdbc:mysql://localhost:3306/spring_jdbc_quest?serverTimezone=GMT";
    private final static String DB_USER = "h4rryp0tt3r";
    private final static String DB_PASSWORD = "Horcrux4life!";

    public List<School> findAll() {

        // TODO : find all schools
        return null;
    }

    public School findById(Long id) {

        // TODO : find a school by id
        return null;
    }

    public List<School> findByCountry(String country) {

        // TODO : search schools by country
        return null;
    }
}
