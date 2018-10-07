package com.example.book.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Picture {
    @Id
    @GeneratedValue
    private Integer id;
    private String pictureRoad;

    public Picture(String pictureRoad) {
        this.pictureRoad = pictureRoad;
    }
}
