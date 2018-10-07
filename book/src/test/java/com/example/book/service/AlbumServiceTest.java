package com.example.book.service;

import com.example.book.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumServiceTest {

    @Resource
    private AlbumService albumService;

}