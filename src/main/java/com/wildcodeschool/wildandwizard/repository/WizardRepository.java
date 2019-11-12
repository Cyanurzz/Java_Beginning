package com.wildcodeschool.wildandwizard.repository;

import com.wildcodeschool.wildandwizard.entity.Wizard;

import java.sql.*;

public class WizardRepository {

    private final static String DB_URL = "jdbc:mysql://localhost:3306/spring_jdbc_quest?serverTimezone=GMT";
    private final static String DB_USER = "h4rryp0tt3r";
    private final static String DB_PASSWORD = "Horcrux4life!";

    public Wizard update(Long id, String firstName, String lastName, Date birthday,
                         String birthPlace, String biography, boolean muggle) {

        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE wizard SET first_name=?, last_name=?, birthday=?, birth_place=?, biography=?, is_muggle=? WHERE id=?"
            );
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setDate(3, birthday);
            statement.setString(4, birthPlace);
            statement.setString(5, biography);
            statement.setBoolean(6, muggle);
            statement.setLong(7, id);

            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to update data");
            }
            return new Wizard(id, firstName, lastName, birthday,
                    birthPlace, biography, muggle);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Wizard findById(Long id) {

        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM wizard WHERE id = ?;"
            );
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                Date birthday = resultSet.getDate("birthday");
                String birthPlace = resultSet.getString("birth_place");
                String biography = resultSet.getString("biography");
                boolean muggle = resultSet.getBoolean("is_muggle");
                return new Wizard(id, firstName, lastName, birthday, birthPlace, biography, muggle);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
