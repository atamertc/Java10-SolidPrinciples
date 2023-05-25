package com.atamertc.aksam.b_02.Utility;

public class Notification {
    public static void smsGonder(String phone) {
        System.out.println(phone+" --> sms gonderildi");
    }

    public static void emailGonder(String email) {
        System.out.println(email+" --> email gonderildi");
    }
}
