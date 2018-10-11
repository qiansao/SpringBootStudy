package com.example.book.service;

import com.example.book.entity.SysUser;

import java.util.List;

public interface UserService {
    SysUser save(SysUser sysUser);

    List<SysUser> getAll();

    SysUser getUser(Long id);

    List<SysUser> getUserfindByNicknameLike(String nickname);

    SysUser getUserfindByAccount(String account);

    List<SysUser> getUsersOrderByFans(String nickname);
}
