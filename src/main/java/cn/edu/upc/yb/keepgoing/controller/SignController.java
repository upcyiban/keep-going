package cn.edu.upc.yb.keepgoing.controller;

import cn.edu.upc.yb.keepgoing.model.KeepGoingProject;
import cn.edu.upc.yb.keepgoing.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Explorer on 2016/6/5.
 */
@Controller
public class SignController {

    @Autowired
    private SignService signService;


    @RequestMapping(value = "/sign", method = RequestMethod.POST)
    public String sign() {

        return signService.signToday();
    }

}
