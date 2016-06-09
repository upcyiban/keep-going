package cn.edu.upc.yb.keepgoing.controller;

import cn.edu.upc.yb.keepgoing.model.KeepGoingProject;
import cn.edu.upc.yb.keepgoing.service.LoginService;
import cn.edu.upc.yb.keepgoing.service.ProjectService;
import cn.edu.upc.yb.keepgoing.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Explorer on 2016/6/5.
 */
@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/project_list",method = RequestMethod.GET)
    public List<KeepGoingProject> getProjectList(){
        return projectService.getProject();
    }

}
