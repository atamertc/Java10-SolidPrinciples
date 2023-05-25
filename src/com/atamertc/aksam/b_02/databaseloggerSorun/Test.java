package com.atamertc.aksam.b_02.databaseloggerSorun;

import com.atamertc.aksam.b_02.Whatsapp;
import com.atamertc.aksam.b_02.databaseloggerSorun.DatabaseLogger;
import com.atamertc.aksam.b_02.exception.StoryException;
import com.atamertc.aksam.b_02.exception.VideoException;

public class Test {

    public static void main(String[] args) {

        Whatsapp whatsapp = new Whatsapp();
        DatabaseLogger databaseLogger = new DatabaseLogger();

        try {
            whatsapp.videoConferencing();
        } catch (VideoException e) {
            databaseLogger.logToMongo(e.getMessage());
    }

        try {
            whatsapp.shareStory();
        } catch (StoryException e) {
            databaseLogger.logToPostgre(e.getMessage());
        }

    }
}
