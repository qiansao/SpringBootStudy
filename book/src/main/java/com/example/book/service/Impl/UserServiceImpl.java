package com.example.book.service.Impl;


import com.example.book.dao.UserRepositry;
import com.example.book.entity.SysUser;
import com.example.book.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepositry userRepositry;

    @Override
    @Transactional
    public SysUser save(SysUser sysUser) {
        return userRepositry.save(sysUser);
    }

    @Override
    public List<SysUser> getAll() {
        return userRepositry.findAll();
    }

    @Override
 public SysUser getUser(Long id) {
        return userRepositry.findById(id).get();
        }

    @Override
    public List<SysUser> getUserfindByNicknameLike(String nickname){
        return userRepositry.findByNicknameLike(nickname);
    }
@Override
    public SysUser getUserfindByAccount(String account){
        return userRepositry.findByAccount(account);
}
    @Override
 public List<SysUser> getUsersOrderByFans(String nickname) {
        return userRepositry.findUsers(nickname);
    }



}
