package cn.edu.upc.yb.keepgoing.service;

import cn.edu.upc.yb.keepgoing.dao.KeepGoingProjectDao;
import cn.edu.upc.yb.keepgoing.dao.KeepGoingSignDao;
import cn.edu.upc.yb.keepgoing.model.KeepGoingProject;
import cn.edu.upc.yb.keepgoing.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by Explorer on 2016/6/5.
 */
@Service
public class CreateNewService {

    @Autowired
    private KeepGoingProjectDao keepGoingProjectDao;

    @Autowired
    private LoginService loginService;

    @Autowired
    HttpSession httpSession;

    /**
     * 新建签到项目
     */
    public String buildProject(String name) {
        if (!loginService.isLogin()){
            return "fail";
        }
        KeepGoingProject project = new KeepGoingProject(name, DateUtils.Date2String(new Date()));
        project.setYibanid((int) httpSession.getAttribute("userid"));
        project.setYibanusername((String) httpSession.getAttribute("username"));
        keepGoingProjectDao.save(project);
        return "success";
    }


}
