package cn.edu.upc.yb.keepgoing.model;

import javax.persistence.*;

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
    private String projectdetail;

    private String creattime;

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

    public String getProjectdetail() {
        return projectdetail;
    }

    public void setProjectdetail(String projectdetail) {
        this.projectdetail = projectdetail;
    }

    public String getCreattime() {
        return creattime;
    }

    public void setCreattime(String creattime) {
        this.creattime = creattime;
    }
}
