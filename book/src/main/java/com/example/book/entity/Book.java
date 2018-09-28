package com.example.book.entity;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@Configuration
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String avatar;
    private String name;
    private String writer;
    private String introduction;

}
