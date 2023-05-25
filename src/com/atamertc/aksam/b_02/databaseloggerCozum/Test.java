package com.atamertc.aksam.b_02.databaseloggerCozum;

import com.atamertc.aksam.b_02.Whatsapp;
import com.atamertc.aksam.b_02.exception.StoryException;
import com.atamertc.aksam.b_02.exception.VideoException;

public class Test {
    public static void main(String[] args) {
        Whatsapp whatsapp = new Whatsapp();

        try {
            whatsapp.videoConferencing();
        } catch (VideoException e) {
            new DatabaseLogger(new MongoDb()).log(e.getMessage());
        }
        try {
            whatsapp.shareStory();
        } catch (StoryException e) {
            new DatabaseLogger(new PostgreSql()).log(e.getMessage());
        }
    }
}
