package com.example.mybatisx.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisx.generator.pojo.User;
import com.example.mybatisx.generator.service.UserService;
import com.example.mybatisx.generator.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author z
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-04-24 15:24:04
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




