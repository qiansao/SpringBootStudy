package com.example.book.dao;

import com.example.book.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumRepositoryTest {

    @Resource
    private AlbumRepository albumRepository;

    @Test
    public void initData() {
        Album[] albums = {
                new Album("https://upload-images.jianshu.io/upload_images/11468272-668494f7783a415c.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240", "我的早餐日记", "我的早餐日记|把日子过成一首诗", 3344),
                new Album("https://upload-images.jianshu.io/upload_images/5488604-4ea78be8dc1eac93?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240", "日落美景", "拍日落美景的 6 大构图套路，你最喜欢哪一个？", 2112),
                new Album("https://upload-images.jianshu.io/upload_images/10838589-bb815c204367fa2c.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240", "三生三世", "三生三世佛如烟雨,东华有眼中又忽然闪过一星亮光。", 1323),
                new Album("https://upload-images.jianshu.io/upload_images/3409672-f55d7566084e0cd6.png?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240", "手账", "似乎做了很多事，又似乎很多事情还未完成", 3145),
                new Album("https://upload-images.jianshu.io/upload_images/11782942-42806dc13465fae1.jpeg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240", "90天养成阅读+晨跑+早睡早起的习惯", "想改变自己，想让生活变得更好，从养成好习惯开始。", 728),
                new Album("https://upload-images.jianshu.io/upload_images/13982460-c851a1db65e39b22.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240", "手绘", "手绘水彩之萌宠系列", 226),

        };
        for (int i = 0; i < albums.length; i++) {
            albumRepository.save(albums[i]);
        }
    }

    @Test
    public void findhotAlbums() {

    }
}