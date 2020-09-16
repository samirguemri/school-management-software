package com.samir.sms.controller.data.dao;

import java.sql.SQLException;

public interface IDatabaseConnection {

    public void connect() throws SQLException;
    public void closeConnection() throws SQLException;
}
