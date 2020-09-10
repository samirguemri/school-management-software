package com.samir.sms.api.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSqlDatabaseConnectionImpl implements IDatabaseConnection {

    private final String url = "jdbc:postgresql://localhost:8080/school_database";
    private final String user;
    private final String password;
    private Connection connection;

    public PostgreSqlDatabaseConnectionImpl(String user, String pwd) {
        this.user = user;
        this.password = pwd;
    }

    @Override
    public void connect() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        this.connection = connection;
    }

    @Override
    public void closeConnection() throws SQLException {
        this.connection.close();
    }
}
