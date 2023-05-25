package com.atamertc.aksam.b_02;

import com.atamertc.aksam.b_02.Utility.Notification;
import com.atamertc.aksam.b_02.Utility.User;

public class Instagram extends SocialMedia implements IEmailSendable, ISmsSendable, IPostable,IShareableStory,IChatable {

    @Override
    public void resizePhoto(SocialMedia socialMedia, String type) {
        if (type.equalsIgnoreCase("jpg")) {
            socialMedia.setKucultmeKatsayisi(38);
        } else if (type.equalsIgnoreCase("png")) {
            socialMedia.setKucultmeKatsayisi(30);
        } else {
            socialMedia.setKucultmeKatsayisi(40);
        }
    }

    @Override
    public void emailBildirimGonder(User user) {
        if (user.getEmail() != null) {
            Notification.emailGonder(user.getEmail());
        }
    }

    @Override
    public void smsBildirimGonder(User user) {
        if (user.getPhone() != null) {
            Notification.smsGonder(user.getPhone());
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