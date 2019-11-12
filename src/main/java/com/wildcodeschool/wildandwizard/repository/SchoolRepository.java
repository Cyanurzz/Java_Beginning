package com.wildcodeschool.wildandwizard.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wildcodeschool.wildandwizard.entity.School;

public class SchoolRepository {

	
    private final static String DB_URL = "jdbc:mysql://localhost:3306/spring_jdbc_quest?serverTimezone=GMT";
    private final static String DB_USER = "h4rryp0tt3r";
    private final static String DB_PASSWORD = "Horcrux4life!";
    
    public List<School> findAll(){
        try {
            Connection connection = DriverManager.getConnection(       //Me Connecte avec les identifiant juste au dessus
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement( // Prépare ma requète
                    "SELECT * FROM school;"
            );
            ResultSet resultSet = statement.executeQuery(); 		   //Récupère ma requète

            List<School> schools = new ArrayList<>(); 		           //Crée une arrayList de wizard 

            while (resultSet.next()) { 
            	int id = resultSet.getInt("id"); 
            	String name = resultSet.getString("name"); 
            	int capacity = resultSet.getInt("capacity");
            	String country = resultSet.getString("country");
            	schools.add(new School(id, name, country, capacity));
            }
            return schools;
           
        } catch (
        		SQLException e) {
            	e.printStackTrace();
        }
        return null;
    }
    public List<School> findByCountry(String researchCountry){
        try {
            Connection connection = DriverManager.getConnection(       //Me Connecte avec les identifiant juste au dessus
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement( // Prépare ma requète
                    "SELECT * FROM school WHERE country LIKE ?;"
            );
            statement.setString(1, researchCountry);
            ResultSet resultSet = statement.executeQuery(); 		   //Récupère ma requète

            List<School> schools = new ArrayList<>(); 		           //Crée une arrayList de wizard 

            while (resultSet.next()) { 
            	int id = resultSet.getInt("id"); 
            	String name = resultSet.getString("name"); 
            	int capacity = resultSet.getInt("capacity");
            	String country = resultSet.getString("country");
            	schools.add(new School(id, name, country, capacity));
            }
            return schools;
           
        } catch (
        		SQLException e) {
            	e.printStackTrace();
        }
        return null;
    }
    public List<School> findById(String researchId){
        try {
            Connection connection = DriverManager.getConnection(       //Me Connecte avec les identifiant juste au dessus
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement( // Prépare ma requète
                    "SELECT * FROM school WHERE id LIKE ?;"
            );
            
            if (researchId.equals("%")) 
            	statement.setString(1, researchId);
            else {
            	int convertId = Integer.parseInt(researchId);
            	statement.setInt(1, convertId);
            }
            
            
            
            ResultSet resultSet = statement.executeQuery(); 		   //Récupère ma requète

            List<School> schools = new ArrayList<>(); 		           //Crée une arrayList de wizard 

            while (resultSet.next()) { 
            	int id = resultSet.getInt("id"); 
            	String name = resultSet.getString("name"); 
            	int capacity = resultSet.getInt("capacity");
            	String country = resultSet.getString("country");
            	schools.add(new School(id, name, country, capacity));
            }
            return schools;
           
        } catch (
        		SQLException e) {
            	e.printStackTrace();
        }
        return null;
    }
}

