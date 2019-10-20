package home.test;

import java.sql.*;

//JDBC connection for select - works
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/home_test?serverTimezone=Europe/Kiev&useSSL=false";
        String username = "root";
        String password = "root";
        System.out.println("Connecting via JDBC...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection successful!");

            String selectTableSQL = "SELECT * FROM user";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectTableSQL);

            while (rs.next()) {
                String userId = rs.getString("USER_ID");
                String firstName = rs.getString("FIRST_NAME");
                String lastName = rs.getString("LAST_NAME");


                System.out.println("userid : " + userId);
                System.out.println("userFirstName : " + firstName);
                System.out.println("userLastName : " + lastName);
            }



        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
