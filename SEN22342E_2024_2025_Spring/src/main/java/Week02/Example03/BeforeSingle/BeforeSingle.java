/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02.Example03.BeforeSingle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ali.nizam
 */
public class BeforeSingle {
    static class BadDatabaseConnection {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
       
        BadDatabaseConnection db1 = new BadDatabaseConnection();
        BadDatabaseConnection db2 = new BadDatabaseConnection();

        Connection conn1 = db1.getConnection();
        Connection conn2 = db2.getConnection();

        System.out.println(conn1 == conn2); // false ❌
    }
}
}
