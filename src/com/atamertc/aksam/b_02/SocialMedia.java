package com.atamertc.aksam.b_02;

public abstract class SocialMedia {
    private double kucultmeKatsayisi;

    abstract void resizePhoto(SocialMedia socialMedia, String type);

    public double getKucultmeKatsayisi() {
        return kucultmeKatsayisi;
    }

    public void setKucultmeKatsayisi(double kucultmeKatsayisi) {
        this.kucultmeKatsayisi = kucultmeKatsayisi;
    }









}
