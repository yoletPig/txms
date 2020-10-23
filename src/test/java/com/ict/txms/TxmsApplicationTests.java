package com.ict.txms;

import com.ict.txms.mapper.UserMapper;
import com.ict.txms.model.Role;
import com.ict.txms.model.User;
import com.ict.txms.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TxmsApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;
    @Test
    public void contextLoads() {
//        User user = userMapper.loadUserByUsername("admin");
//        List<Role> roles = userMapper.getRolesByUserId(1);
//        System.out.println(user);
//        System.out.println(roles);
        System.out.println(userService.loadUserByUsername("admin"));
    }

}
