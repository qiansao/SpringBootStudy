package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.entity.Book;
import com.example.springdatajpa.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceImplTest {
    @Resource
    private BookService bookService;

    @Test
    public void save() {
        String[] names = {"你是人间四月天", "bb", "cc", "dd", "ee"};
        String[] writers = {"林徽因", "l", "y", "x", "a"};
        String[] introductions = {"x", "z", "q", "na", "ha"};
        String[] avatars = {"la", "sao", "mi", "dou", "rai"};

        for (int i = 0; i < 5; i++) {
            Book book = new Book();
            book.setAvatar(avatars[i]);
            book.setName(names[i]);
            book.setWriter(writers[i]);
            book.setIntroduction(introductions[i]);
            System.out.println(bookService.save(book));

        }
    }

    @Test
    public void getAll() {
    }

    @Test
    public void get() {
    }

    @Test
    public void delete() {
    }
}