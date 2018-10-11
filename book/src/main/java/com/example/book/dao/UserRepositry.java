package com.example.book.dao;

import com.example.book.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface UserRepositry extends JpaRepository<SysUser, Long> {
    SysUser findByAccount(String account);

    List<SysUser> findByFansBetween(Integer num1, Integer num2);

    List<SysUser> findByNicknameLike(String nickname);

    @Query("from SysUser u where u.nickname like CONCAT('%',:nickname,'%') order by u.fans desc ")
    List<SysUser> findUsers(@Param("nickname") String nickname);
}
