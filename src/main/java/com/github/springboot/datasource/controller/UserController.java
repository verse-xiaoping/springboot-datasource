package com.github.springboot.datasource.controller;

import com.github.springboot.datasource.entity.User;
import com.github.springboot.datasource.service.UserService;
import com.github.springboot.datasource.test1.dao.UserMapperTest1;
import com.github.springboot.datasource.test1.service.UserServiceTest1;
import com.github.springboot.datasource.test2.dao.UserMapperTest2;
import com.github.springboot.datasource.test2.service.UserServiceTest2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xiaoping
 * @date 2018-04-10 16:06
 */
@RestController
public class UserController {
    @Resource
    UserService userService;
    @Autowired
    UserMapperTest1 userMapperTest1;
    @Autowired
    UserMapperTest2 userMapperTest2;
    @Autowired
    UserServiceTest1 userServiceTest1;
    @Autowired
    UserServiceTest2 userServiceTest2;

    @RequestMapping("/findByName")
    public User findByName() {
        return userService.findByName("verse");
    }

    @RequestMapping("/saveTest1")
    public String saveTest1(String name, Integer age) {
        userMapperTest1.insert(name, age);
        return "success";
    }
    @RequestMapping("/saveTest2")
    public String saveTest2(String name, Integer age) {
        userMapperTest2.insert(name, age);
        return "success";
    }
    @RequestMapping("/saveTest3")
    public String saveTest3(String name, Integer age) {
        userServiceTest1.insertTest1(name, age);
        return "success";
    }
}
