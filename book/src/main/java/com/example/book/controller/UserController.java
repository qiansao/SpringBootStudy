package com.example.book.controller;

import com.example.book.entity.SysUser;
import com.example.book.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping(value = "/all")
    public List<SysUser> getAll(){
        return userService.getAll();
    }
    @GetMapping("/{id}")
 public SysUser getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping(value = "/{nickname}")
    public List<SysUser> getUserfindByNicknameLike(String nickname){
        return userService.getUserfindByNicknameLike(nickname);
    }
    @GetMapping(value = "/{account}")
    public SysUser getUserfindByAccount(String account){
        return  userService.getUserfindByAccount(account);
    }
    @GetMapping("/order")
    public List<SysUser> getUsersOrderByFans(@RequestParam String nickname) {
        return userService.getUsersOrderByFans(nickname);
        }
}
