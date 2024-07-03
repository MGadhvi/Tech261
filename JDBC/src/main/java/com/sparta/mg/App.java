package com.sparta.mg;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class App {
    //Connection
    //Statements
    //Results
    //Connection -> Statement -> Result
    public static void main(String[] args) {

        Properties properties = new Properties();

        try {
            properties.load(new FileReader("src/main/resources/mysql.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(
                    properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password")
            );

            /***
             * preparedStatement = connection.prepareStatement(
             *                     "INSERT INTO actor (first_name, last_name) VALUES (?, ?)");
             *             preparedStatement.setString(1, "Ben");
             *             preparedStatement.setString(2,"Wong");
             */

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM northwind.customers WHERE CustomerName = ?");
            preparedStatement.setString(1, "Manish");
            preparedStatement.executeQuery();


            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM northwind.customers");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
