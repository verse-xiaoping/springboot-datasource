package com.github.springboot.datasource.test2.dao;

import com.github.springboot.datasource.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author xiaoping
 * @date 2018-04-10 16:03
 */
public interface UserMapperTest2 {
    @Select("Select * from user where name=#{name}")
    User findByName(@Param("name") String name);

    @Insert("insert into user values(null, #{name},#{age})")
    int insert(@Param("name") String name,@Param("age") Integer age);
}
