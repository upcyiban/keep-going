package cn.edu.upc.yb.keepgoing.service;

import cn.edu.upc.yb.keepgoing.dao.KeepGoingProjectDao;
import cn.edu.upc.yb.keepgoing.dao.KeepGoingSignDao;
import cn.edu.upc.yb.keepgoing.model.KeepGoingProject;
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
    private KeepGoingSignDao keepGoingSignDao;

    @Autowired
    HttpSession httpSession;

    /**
     * 新建签到项目
     */
    public String BuildProject(String name, String detail) {
        KeepGoingProject project = new KeepGoingProject(name, detail, new Date().toString());
        project.setYibanid((int) httpSession.getAttribute("userid"));
        project.setYibanusername((String) httpSession.getAttribute("username"));
        keepGoingProjectDao.save(project);

        return "SUCCESS";
    }


}
