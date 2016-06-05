package cn.edu.upc.yb.keepgoing.service;

import cn.edu.upc.yb.keepgoing.dao.KeepGoingProjectDao;
import cn.edu.upc.yb.keepgoing.model.KeepGoingProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Explorer on 2016/6/5.
 */
@Service
public class ProjectService {

    @Autowired
    private KeepGoingProjectDao keepGoingProjectDao;
    @Autowired
    HttpSession httpSession;


    public List<KeepGoingProject> getProject() {

        return keepGoingProjectDao.findByYibanid((Integer) httpSession.getAttribute("userid"));
    }

}
