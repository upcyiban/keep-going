package cn.edu.upc.yb.keepgoing.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by skyADMIN on 16/6/4.
 */
@Entity
@Table(name = "keepgoing_project")
public class KeepGoingProject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int yibanid;
    private String yibanusername;

    private String projectname;

    private int lastDays;  //连续签到的天数
    private String endDate; //最后的签到时间
    private String creattime;

    public KeepGoingProject() {
    }

    public KeepGoingProject(String projectname, String creattime) {
        this.projectname = projectname;
        this.creattime = creattime;
    }

    public int getLastDays() {
        return lastDays;
    }

    public void setLastDays(int lastDays) {
        this.lastDays = lastDays;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYibanid() {
        return yibanid;
    }

    public void setYibanid(int yibanid) {
        this.yibanid = yibanid;
    }

    public String getYibanusername() {
        return yibanusername;
    }

    public void setYibanusername(String yibanusername) {
        this.yibanusername = yibanusername;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getCreattime() {
        return creattime;
    }

    public void setCreattime(String creattime) {
        this.creattime = creattime;
    }
}
