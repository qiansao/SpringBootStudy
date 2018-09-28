package com.example.quickstart.entity;


import lombok.Data;

@Data
    public class Card2 {
        private String pic;
        private String title;
        private String text;
        private String number;

        public Card2(String pic, String title, String text, String number) {
            this.pic = pic;
            this.title = title;
            this.text = text;
            this.number = number;
        }
    }


