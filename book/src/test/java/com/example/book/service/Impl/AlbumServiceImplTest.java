package com.example.book.service.Impl;


import com.example.book.service.AlbumService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumServiceImplTest {

    @Resource
    private AlbumService albumService;
    @Test
    public void findOne() {
        System.out.println(albumService);
    }
}