package com.example.quickstart.entity;

import lombok.Data;

@Data
public class Card {
    private String avatar;
    private String name;
    private String time;
    private String title;
    private String introduce;
    private  String picture;
    private String number1;
    private String number2;


    public Card(String avatar, String name, String time, String title, String introduce, String picture, String number1, String number2) {
        this.avatar = avatar;
        this.name = name;
        this.time = time;
        this.title = title;
        this.introduce = introduce;
        this.picture = picture;
        this.number1 = number1;
        this.number2 = number2;
    }
}