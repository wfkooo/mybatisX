package com.example.mybatisx;

import com.example.mybatisx.generator.mapper.UserMapper;
import com.example.mybatisx.generator.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisXApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> list = new ArrayList<>();
        list = userMapper.selectAllByName("Jone");
        System.out.println(list);
    }

}
