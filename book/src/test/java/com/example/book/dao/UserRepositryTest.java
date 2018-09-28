package com.example.book.dao;

import com.example.book.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositryTest {
    @Resource
    private UserRepositry userRepositry;
@Test
    public void initData(){
    SysUser[] users={
            new SysUser("sdy@qq.com","111","素心若霞",247),
            new SysUser("yjj@qq.com","222","与君绝",283),
            new SysUser("ygkld@qq.com","333","一个快乐的退休俱乐部",1834),
    new SysUser("jrys@qq.com","444","孑然一身",732),
    new SysUser("yxyy@qq.com","555","诗心悠远",539)
    };
    for (int i=0;i<5;i++){
        userRepositry.save(users[i]);
    }
}
    @Test
 public void findOne() {
        SysUser user = userRepositry.findById(42L).get();
         System.out.println(user);
}

@Test
    public void findByFansBetween() {
        List<SysUser> sysUsers =userRepositry.findByFansBetween(200,300);
        sysUsers.forEach(sysUser -> System.out.println(sysUser));

    }

    @Test
    public void findByNicknameLike() {
        List<SysUser> sysUsers=userRepositry.findByNicknameLike("心");
        sysUsers.forEach(sysUser -> System.out.println(sysUser));
    }

    @Test
    public void findByAccount() {
    SysUser sysUser=userRepositry.findByAccount("sdy@qq.com");
        System.out.println(sysUser);
    }

    @Test
  public void findUsers() {
        List<SysUser> users = userRepositry.findUsers("心");
         users.forEach(sysUser -> System.out.println(sysUser)); }

}