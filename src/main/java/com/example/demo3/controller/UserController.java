/*
package com.example.demo3.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.bean.User;
import com.example.demo3.mapper.UserMapper;

*/
/**
 * @author zhangkeshun
 * @description
 * @date 2020/1/2 10:48
 * @since jdk 1.8
 *//*

@RestController
@RequestMapping("/user/")
public class UserController {


    @Resource
    private UserMapper userMapper;

    @GetMapping("users")
    public List<User> getUsers() {
        return userMapper.getUsers();
    }

    @PostMapping("user")
    public void saveUser(@RequestBody User u) {
        userMapper.save(u);
    }

    @DeleteMapping("user")
    public void deleteUser(String id) {
        userMapper.deleteById(id);
    }

    @PutMapping("user")
    public void updateUser(@RequestBody User u) {
        userMapper.updateUserById(u);
    }


}
*/
