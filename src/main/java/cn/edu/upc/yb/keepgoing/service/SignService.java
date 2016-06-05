package cn.edu.upc.yb.keepgoing.service;

import cn.edu.upc.yb.keepgoing.dao.KeepGoingSignDao;
import cn.edu.upc.yb.keepgoing.model.KeepGoingProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Explorer on 2016/6/5.
 */
@Service
public class SignService {

    @Autowired
    private KeepGoingSignDao keepGoingSignDao;

    @Autowired
    HttpSession httpSession;

    public String signToday() {


        return "SIGN SUCCESS";
    }

}
