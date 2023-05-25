package com.atamertc.aksam.b_02.databaseloggerCozum;

public class DatabaseLogger {
    IDatabase iDatabase;

    public DatabaseLogger(IDatabase iDatabase) {
        this.iDatabase = iDatabase;
    }

    public void log(String ex) {
        iDatabase.log(ex);
    }
}
