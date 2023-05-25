package com.atamertc.aksam.b_02;

import com.atamertc.aksam.b_02.exception.StoryException;
import com.atamertc.aksam.b_02.exception.VideoException;

public class Whatsapp extends SocialMedia implements IConferencable, IShareableStory,IChatable {

    @Override
    public void resizePhoto(SocialMedia socialMedia, String type) {
        if (type.equalsIgnoreCase("jpg")) {
            socialMedia.setKucultmeKatsayisi(28);
        } else if (type.equalsIgnoreCase("png")) {
            socialMedia.setKucultmeKatsayisi(32);
        } else {
            socialMedia.setKucultmeKatsayisi(36);
        }
    }


    @Override
    public void shareStory() {
        throw new StoryException("Story Hatasi");
    }

    @Override
    public void SharePhoto() {

    }

    @Override
    public void chat() {

    }

    @Override
    public void videoConferencing() {
        throw new VideoException("Video Hatasi");
    }
}
