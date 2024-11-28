package org.example.corejava.exception.checkexception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedException {


    /*
    **IOException**
   Thrown when there is an input/output failure, such as when reading from a file or network resource.

   try {
       FileReader file = new FileReader("example.txt");
   } catch (IOException e) {
       e.printStackTrace();
   }
     */

    public static class IOException extends Exception{

        public IOException(){
            super("I/O Exception occurs");
        }
        public IOException(String message) {
            super(message);
        }

        public IOException(String message, Throwable cause) {
            super(message, cause);
        }

        public IOException(Throwable cause) {
            super(cause);
        }

        public static void main(String[] args) {
            try {
                // Simulating an I/O operation failure
                throw new IOException("Custom I/O error occurred");
            } catch (IOException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
        }
    }
    /*
    2. **SQLException**
   Thrown when there is a database access error or other issues related to SQL operations.
   ```java
   try {
       Connection conn = DriverManager.getConnection(url, user, password);
   } catch (SQLException e) {
       e.printStackTrace();
   }

     */


    public static class SQLException extends Exception {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/mydatabase"; // Example JDBC URL
            String user = "root"; // Example username
            String password = "password"; // Example password

            try {
                // Attempting to connect to the database
                Connection conn = DriverManager.getConnection(url, user, password);
                System.out.println("Connection established successfully!");
            } catch (java.sql.SQLException e) {
                // Handle SQL exceptions
                System.out.println("Error while connecting to the database:");
                e.printStackTrace();
            }
        }
    }



}
