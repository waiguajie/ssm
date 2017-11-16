package com.test;

import com.alibaba.fastjson.JSON;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 * Project: ssmDemo
 * FileName: com.test.TestMybatis
 * Created By IntelliJ IDEA
 * Author Mr.XIE
 * Date: 2017/11/15
 * Time: 16:20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis
{
    private static Logger logger = Logger.getLogger(TestMybatis.class);

    @Autowired
    private UserService userService;
    @Test
    public void test1() {
        User user = userService.getUserById(1);
        logger.info(JSON.toJSONString(user));
    }
}
