package com.example.book.dao;

import com.example.book.entity.PictureList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PictureListRepositoryTest {
    @Resource
    private PictureListRepository pictureListRepository;
    @Test
    public void initData(){
        PictureList[] pictureLists={
                new PictureList("我的早餐日记","https://upload-images.jianshu.io/upload_images/11468272-668494f7783a415c.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("轻食主义","https://upload-images.jianshu.io/upload_images/12610183-1258eaeaeb61d539?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
new PictureList("懒人早餐","https://upload-images.jianshu.io/upload_images/7342402-5eef6bfa673581eb.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("养生要点","https://upload-images.jianshu.io/upload_images/14199023-9268afa3cda07afe.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("五仁月饼","https://upload-images.jianshu.io/upload_images/12691544-1184c400ba85af57.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("维生素食谱","https://upload-images.jianshu.io/upload_images/1947090-afea2a8791dbb53e.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("日落美景","https://upload-images.jianshu.io/upload_images/5488604-4ea78be8dc1eac93?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("日落之初","https://upload-images.jianshu.io/upload_images/7148343-5e11890db132c0bb.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("乡村小游","https://upload-images.jianshu.io/upload_images/12606662-eae8b2d6290c5d3f.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("麦黄了","https://upload-images.jianshu.io/upload_images/6188079-b818a32589bad6f7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("逛灯","https://upload-images.jianshu.io/upload_images/1621580-a38b04ef0b042ad4.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("清明","https://upload-images.jianshu.io/upload_images/2882374-8b18d0854320a420.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("乡情","https://upload-images.jianshu.io/upload_images/8396681-63d944c8be75590f.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("悲惨命运","https://upload-images.jianshu.io/upload_images/5039838-431d8863bd5c50a7.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),


        };
        for (int i=0;i<pictureLists.length;i++){
            pictureListRepository.save(pictureLists[i]);
        }
    }

}