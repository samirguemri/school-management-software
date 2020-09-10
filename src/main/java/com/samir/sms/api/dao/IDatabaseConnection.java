package com.samir.sms.api.dao;

import java.sql.SQLException;

public interface IDatabaseConnection {

    public void connect();
    public void closeConnection() throws SQLException;
}
