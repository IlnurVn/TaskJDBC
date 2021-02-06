package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost/bdone";
    private static final String USERMANE = "root";
    private static final String PASSWORD = "root";

    private Connection connection;

    public Util() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/bdone", "root", "root");
            System.out.println("Connection OK");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection ERROR");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}