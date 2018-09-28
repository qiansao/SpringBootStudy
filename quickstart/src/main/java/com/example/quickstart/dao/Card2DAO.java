package com.example.quickstart.dao;

import com.example.quickstart.entity.Card2;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@Data
public class Card2DAO {
    public List<Card2> getCard2s() {
        Card2[] card2s = {
                new Card2("28.png","读书笔记","分享我们的笔记与心得，记录阅读中与作者产生的碰撞，以及给我们带来的改变...","238人关注"),
                new Card2("29.png","提升效率之路","一个优秀的工具，能让你在提升效率之路事半功倍。你是如何通过这些工具，技...","2550关注"),
                new Card2("30.png","装了啥","你的手机装了哪些常见或小众的 App？它们如何帮你提高效率，给生活带来更多...","1241人关注"),
                new Card2("31.png","一日一技","你可以在这里分享各种简单又实用的小技巧，它可能是一个系统的的操作技巧...","733人关注"),

        };
        List<Card2> card2List= Arrays.asList(card2s);
        return card2List;
    }
}
