package org.example.advantageJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc",
                    "root",
                    "12Rose#2323");

            System.out.println("Connection established: " + connection);

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException("Failed to establish connection.", e);
        }
    }
}