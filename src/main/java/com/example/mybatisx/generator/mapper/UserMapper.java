package com.example.mybatisx.generator.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.mybatisx.generator.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author z
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-04-24 15:24:04
* @Entity com.example.mybatisx.generator.pojo.User
*/
@Repository
public interface UserMapper extends BaseMapper<User> {
    int insertAll(User user);

    List<User> selectAllByName(@Param("name") String name);
}




