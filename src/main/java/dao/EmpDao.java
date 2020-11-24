package dao;

import org.springframework.stereotype.Repository;
import pojo.Emp;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/5/13 17:07
 * @description
 **/
public interface EmpDao {
    public void save(Emp emp);
    public List<Emp> list();
    public void delete(Emp emp);
}
