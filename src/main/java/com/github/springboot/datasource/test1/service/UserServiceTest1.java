package com.github.springboot.datasource.test1.service;

import com.github.springboot.datasource.test1.dao.UserMapperTest1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xiaoping
 * @date 2018-04-10 17:10
 */
@Service
public class UserServiceTest1 {
    @Autowired
    UserMapperTest1 userMapperTest1;
    @Transactional
    public String insertTest1(String name, Integer age) {
        userMapperTest1.insert(name, age);
        int i = 1 / 0;
        return "success";
    }
}
