package cn.edu.upc.yb.keepgoing.dao;

import cn.edu.upc.yb.keepgoing.model.KeepGoingProject;
import cn.edu.upc.yb.keepgoing.model.KeepGoingSign;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Explorer on 2016/6/5.
 */

public interface KeepGoingProjectDao extends CrudRepository<KeepGoingProject,Integer> {
    public KeepGoingProject findById(int id);

    public List<KeepGoingProject> findByYibanid(int yibanid);

}
