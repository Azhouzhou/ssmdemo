package com.ssmdemo.dao;

import com.ssmdemo.model.User;
import com.sun.tools.internal.ws.processor.model.Model;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.servlet.http.HttpServletRequest;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectUser() throws Exception {
        Integer id = 1;
        User user = userMapper.selectById(id);
        System.out.println(user.getUsername());
    }

}
