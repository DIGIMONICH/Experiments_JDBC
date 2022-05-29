package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    final static String userName = "root";
    final static String pass = "4815162342Ww";
    final static String connectionURL = "jdbc:mysql://localhost:3305/public";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(connectionURL, userName, pass);
        return connection;
    }
}
