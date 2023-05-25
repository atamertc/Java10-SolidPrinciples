package com.atamertc.aksam.b_02;

public class Twitter extends SocialMedia implements IPostable, IChatable{
    @Override
    void resizePhoto(SocialMedia socialMedia, String type) {
        if (type.equalsIgnoreCase("jpg")) {
            socialMedia.setKucultmeKatsayisi(41);
        } else if (type.equalsIgnoreCase("png")) {
            socialMedia.setKucultmeKatsayisi(55);
        } else {
            socialMedia.setKucultmeKatsayisi(55);
        }
    }


    @Override
    public void SharePost() {

    }

    @Override
    public void SharePhoto() {

    }

    @Override
    public void chat() {

    }
}
