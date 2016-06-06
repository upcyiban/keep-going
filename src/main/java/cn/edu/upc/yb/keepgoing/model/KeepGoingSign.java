package cn.edu.upc.yb.keepgoing.model;

import javax.persistence.*;

/**
 * Created by skyADMIN on 16/6/4.
 */
@Entity
@Table(name = "keepgoing_sign")
public class KeepGoingSign {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int projectid;
    private int yibanid;
    private String signtime;

    public KeepGoingSign() {
    }

    public KeepGoingSign(int projectid, int yibanid, String signtime) {
        this.projectid = projectid;
        this.yibanid = yibanid;
        this.signtime = signtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public int getYibanid() {
        return yibanid;
    }

    public void setYibanid(int yibanid) {
        this.yibanid = yibanid;
    }

    public String getSigntime() {
        return signtime;
    }

    public void setSigntime(String signtime) {
        this.signtime = signtime;
    }
}
