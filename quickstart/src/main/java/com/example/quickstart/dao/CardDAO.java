package com.example.quickstart.dao;

import com.example.quickstart.entity.Card;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@Data
public class CardDAO {
    public List<Card> getCards(){
        Card[] cards={
                new Card("12.png","Hover","21分钟之前", "通过 RSSHub 订阅不支持 RSS 的网站","前言 就我个人而言，无法割舍 RSS 的原因最重要的是以下两点： 没有遗漏地收取信息——像少数派首页新的文章、教务系统新的通知等，都是我不希望有所遗漏的信息。 集中地收取信息——我是个很怕麻烦的的...","19.png","1","5"),
                new Card("13.png","Zihan Gu","一天之前", "手机运行卡顿？把流氓软件“冻”起来吧！——冰箱 IceBox","在我们安装一些常驻后台的应用后，我们的手机可能运行速度会变慢，而且这些应用一般都是开机自启的。这些应用在后台可能会消耗流量、推送通知、占用内存。也有少部分人认为，一个 App 只应该去做一件事，不需要...","20.png","3","0"),
                new Card("14.png","瘦子说","34分钟之前", "坚果Pro 2S，似乎不是多了一个S那么简单","前言：8月份锤子科技推出了坚果手机的新品：坚果Pro 2S。多了一个“S”，给我们的感觉是对于上一代坚果Pro 2的一个迭代升级罢了。只不过上手之后，给我的感觉似乎它并不是简单的升级，而更多的是一个肩...,","21.png","1","1"),
                new Card("15.png","熊猫小A","29分钟之前", "使用 Workflow 给 GIF 加上进度条","本文也发布于我的个人博客：使用 Workflow 给 GIF 加上进度条 - 熊猫小A的博客看到一张 GIF：……不知道有多少人被这样的段子套路过，反正我是中招过很多次。一切都是因为 GIF 是可...","22.png","1","0"),
                new Card("16.png","JOKER鹏少","一天之前", "为什么谷歌浏览器的更新，成了大家吐槽的话题？","9月4号，谷歌在chrome十周年之际向全平台发布浏览器最新版本，到现在为止，在windows、macos、Linux、ios和安卓均可下载使用。当然，对于手机用户可能会有更好的选择，所以，我今天就在...","23.png","6","0"),
                new Card("17.png","heyisaac","38分钟之前", "「睡眠」法宝，BOSE SleepBuds睡眠遮噪耳塞上手体验","睡不好觉整个人都会变得暴躁， 而且还会对身体有严重的伤害，这并不是一件开玩笑的事情。我想，对于睡不好这一件事来说相信大家都曾经试过。很多时候睡得不好都会存在可观的因素，比如说出门在外不习惯或是环境噪声...","24.png","1","3"),
                new Card("18.png","Maxi","两天之前", "探索网页密码填充的最快方法","我一直在思索：哪些是每天需要重复的琐事？作为学生党，频繁地输入校园网的账号密码必然是其中之一。也有人对这十几秒的时间不屑一顾，质问我：“你的时间有那么宝贵吗？”冤枉！其实这一切的源动力正是由于我懒。下...","25.png","5","8"),
        };
        List<Card> cardList= Arrays.asList(cards);
        return cardList;
    }

}