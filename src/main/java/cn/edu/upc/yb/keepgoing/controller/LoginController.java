package cn.edu.upc.yb.keepgoing.controller;

import cn.edu.upc.yb.keepgoing.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by skyADMIN on 16/3/27.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/yibanauth")
    public String auth(){
        return loginService.toYibanAuth();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, params = "verify_request")
    public String processAuth(String verify_request) throws Exception {
        return loginService.processAuth(verify_request);
    }
}
