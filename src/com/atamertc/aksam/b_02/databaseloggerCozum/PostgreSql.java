package com.atamertc.aksam.b_02.databaseloggerCozum;

public class PostgreSql implements IDatabase{

    @Override
    public void log(String ex) {
        System.out.println(ex + "---> postgreye loglandi");
    }
}
