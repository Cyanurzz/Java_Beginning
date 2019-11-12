package com.wildcodeschool.wildandwizard.repository;

import com.wildcodeschool.wildandwizard.entity.School;


import java.sql.*;

public class SchoolRepository {

    private final static String DB_URL = "jdbc:mysql://localhost:3306/spring_jdbc_quest?serverTimezone=GMT";
    private final static String DB_USER = "h4rryp0tt3r";
    private final static String DB_PASSWORD = "Horcrux4life!";

    public School update(Long id, String name, Long capacity, String country) {

        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE school SET name=?, capacity=?, country=? WHERE id=?"
            );
            statement.setString(1, name);
            statement.setLong(2, capacity);
            statement.setString(3, country);
            statement.setLong(4, id);

            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to update data");
            }
            return new School(id, name, capacity, country);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;        

    }

    public School findById(Long id) {

        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM school WHERE id = ?;"
            );
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                Long capacity = resultSet.getLong("capacity");
                String country = resultSet.getString("country");
                return new School(id, name, capacity, country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
