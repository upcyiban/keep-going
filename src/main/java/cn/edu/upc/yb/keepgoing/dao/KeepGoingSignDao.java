package cn.edu.upc.yb.keepgoing.dao;

import cn.edu.upc.yb.keepgoing.model.KeepGoingSign;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Explorer on 2016/6/5.
 */
public interface KeepGoingSignDao extends CrudRepository<KeepGoingSign, Integer> {
    public KeepGoingSign findById(int id);

}
