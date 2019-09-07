package com.cslg.lrp.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class JDBCUtil {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;
    private static final Logger logger = Logger.getLogger(String.valueOf(JDBCUtil.class));
    static {
        ClassLoader classLoader = JDBCUtil.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("db.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");

    }
    public static Connection getConnection()  {
        //Driver driver;
        Connection connection=null;
        try {
            Class.forName(driver);
            connection= DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void release(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        if(connection!=null)
        {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(preparedStatement!=null)
        {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(resultSet!=null)
        {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
