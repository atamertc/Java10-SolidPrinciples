package com.atamertc.aksam.b_02;

import com.atamertc.aksam.b_02.Utility.Notification;
import com.atamertc.aksam.b_02.Utility.User;

public class Facebook extends SocialMedia implements IEmailSendable, IPostable, IShareableStory,IChatable{

    @Override
    public void resizePhoto(SocialMedia socialMedia, String type) {
        if (type.equalsIgnoreCase("jpg")) {
            socialMedia.setKucultmeKatsayisi(34);
        } else if (type.equalsIgnoreCase("png")) {
            socialMedia.setKucultmeKatsayisi(37);
        } else {
            socialMedia.setKucultmeKatsayisi(45);
        }
    }
    @Override
    public void emailBildirimGonder(User user) {
        if (user.getEmail() != null) {
            Notification.emailGonder(user.getEmail());
        }
    }


    @Override
    public void SharePost() {

    }

    @Override
    public void shareStory() {

    }

    @Override
    public void SharePhoto() {

    }

    @Override
    public void chat() {

    }
}
