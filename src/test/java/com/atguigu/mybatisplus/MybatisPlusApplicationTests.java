package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {


    //@Autowired // Spring
    @Resource // J2EE
    private UserMapper userMapper;
    @Test
    void testSelectList() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);



    }
    @Test
    void testInsert() {
//    List<User> users = userMapper.selectList(null);
//        users.forEach(System.out::println);
        User user = new User();
        user.setAge("101");
        user.setEmail("zhanghao@qq.com");
        user.setName("zhanghao");
        int res = userMapper.insert(user);
        System.out.println("结果"+res);



    }

}
