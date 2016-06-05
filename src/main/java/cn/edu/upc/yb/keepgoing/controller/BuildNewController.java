package cn.edu.upc.yb.keepgoing.controller;

import cn.edu.upc.yb.keepgoing.service.CreateNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Explorer on 2016/6/5.
 */
@Controller
public class BuildNewController {

    @Autowired
    private CreateNewService keepGoingService;

    @RequestMapping("/formshow")
    public String showform(){
        return "newProject";
    }

    /**
     * 新建签到项目
     */
    @RequestMapping(value = "/build", method = RequestMethod.POST)
    public String NewProject(String name, String detail) {
        return keepGoingService.BuildProject(name, detail);
    }

}
