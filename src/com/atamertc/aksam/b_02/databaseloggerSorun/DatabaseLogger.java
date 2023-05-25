package com.atamertc.aksam.b_02.databaseloggerSorun;

public class DatabaseLogger {

    MongoDb mongoDb = new MongoDb();
    PostgreSql postgreSql = new PostgreSql();
    public void logToMongo(String exception) {
        mongoDb.log(exception);
    }

    public void logToPostgre(String exception) {
        postgreSql.log(exception);
    }
}
