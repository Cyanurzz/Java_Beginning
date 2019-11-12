package com.wildcodeschool.wildandwizard.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wildcodeschool.wildandwizard.entity.Wizard;

public class WizardRepository {

	
    private final static String DB_URL = "jdbc:mysql://localhost:3306/spring_jdbc_quest?serverTimezone=GMT";
    private final static String DB_USER = "h4rryp0tt3r";
    private final static String DB_PASSWORD = "Horcrux4life!";

    public List<Wizard> findAll() {

        try {
            Connection connection = DriverManager.getConnection(       //Me Connecte avec les identifiant juste au dessus
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement( // Prépare ma requète
                    "SELECT * FROM wizard;"
            );
            ResultSet resultSet = statement.executeQuery(); 		   //Récupère ma requète

            List<Wizard> wizards = new ArrayList<>(); 		           //Crée une arrayList de wizard 

            while (resultSet.next()) { 								   // Temps que info a récup ... continué 
                Long id = resultSet.getLong("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                Date birthday = resultSet.getDate("birthday");
                String birthPlace = resultSet.getString("birth_place");
                String biography = resultSet.getString("biography");
                boolean muggle = resultSet.getBoolean("is_muggle");
                wizards.add(new Wizard(id, firstName, lastName, birthday, birthPlace, biography, muggle));
            }
            return wizards;
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    public List<Wizard> findByLastName(String researchLastName){
	
    	try {
    		Connection connection = DriverManager.getConnection(
    				DB_URL, DB_USER, DB_PASSWORD
    				);
    		PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM wizard WHERE last_name LIKE ?;"
    				);
    		statement.setString(1, researchLastName);
    		ResultSet resultSet = statement.executeQuery();
	    
    		List<Wizard> wizards = new ArrayList<>();
    		while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                Date birthday = resultSet.getDate("birthday");
                String birthPlace = resultSet.getString("birth_place");
                String biography = resultSet.getString("biography");
                boolean muggle = resultSet.getBoolean("is_muggle");
                wizards.add(new Wizard(id, firstName, lastName, birthday, birthPlace, biography, muggle));
    			
    		}						// Temps que info a récup ... continué 
    		return wizards;
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
       

        
