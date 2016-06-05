package cn.edu.upc.yb.keepgoing.controller;

import cn.edu.upc.yb.keepgoing.KeepgoingApplication;
import cn.edu.upc.yb.keepgoing.service.CreateNewService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Explorer on 2016/6/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = KeepgoingApplication.class)
@WebAppConfiguration
public class TestCreateNew {

    @Autowired
    private CreateNewService keepGoingService;

    @Test
    public void contextLoads() {
        keepGoingService.BuildProject("test","测试用");
    }
}
