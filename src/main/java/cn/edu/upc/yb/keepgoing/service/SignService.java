package cn.edu.upc.yb.keepgoing.service;

import cn.edu.upc.yb.keepgoing.dao.KeepGoingProjectDao;
import cn.edu.upc.yb.keepgoing.dao.KeepGoingSignDao;
import cn.edu.upc.yb.keepgoing.model.KeepGoingProject;
import cn.edu.upc.yb.keepgoing.model.KeepGoingSign;
import cn.edu.upc.yb.keepgoing.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Explorer on 2016/6/5.
 */
@Service
public class SignService {

    @Autowired
    private KeepGoingSignDao keepGoingSignDao;
    @Autowired
    private KeepGoingProjectDao keepGoingProjectDao;

    @Autowired
    HttpSession httpSession;

    public String signToday(int projectid) {
        String currentTime = DateUtils.Date2String(new Date());
        KeepGoingSign sign = new KeepGoingSign(projectid,
                (int) httpSession.getAttribute("userid"), currentTime);
        keepGoingSignDao.save(sign);

        KeepGoingProject project = keepGoingProjectDao.findById(projectid);
//        用当前日期去对比最后签到时间的nextday,看是否一致,一致的话说明是连续签到
//        更新最后签到日期为当前日期,连续天数+1
//        如果不一致,更新最后签到日期为当前日期,连续天数归零
        Calendar nextDay = DateUtils.nextDay(DateUtils.String2Calendar(project.getEndDate()));
        if (DateUtils.isSameDay(currentTime, DateUtils.Calendar2String(nextDay))) {
            int lastDays = project.getLastDays();
            project.setLastDays(++lastDays);
        } else {
            project.setEndDate(currentTime);
            project.setLastDays(0);
        }

        keepGoingProjectDao.save(project);

        return "SIGN SUCCESS";
    }

}
