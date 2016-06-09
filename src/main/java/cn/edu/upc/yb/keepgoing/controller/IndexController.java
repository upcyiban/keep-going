package cn.edu.upc.yb.keepgoing.controller;

import cn.edu.upc.yb.keepgoing.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by skyADMIN on 16/6/4.
 */
@Controller
public class IndexController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/")
    public String showIndex(Model model) {
        if (!loginService.isLogin()) {
            return loginService.toYibanAuth();
        }
        return "index";
    }
}
