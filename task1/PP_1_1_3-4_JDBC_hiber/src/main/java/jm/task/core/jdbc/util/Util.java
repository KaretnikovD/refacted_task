package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String url = "jdbc:mysql://localhost:3306/mydatabase1";
    private static final String user = "root";
    private static final String password = "springcourse";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println("Error with DB connection: " + e.getMessage());
            throw new RuntimeException("Failed to establish a connection to the database" + e);
        }
        return connection;
    }
}
