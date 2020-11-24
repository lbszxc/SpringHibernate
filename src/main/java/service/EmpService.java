package service;

import pojo.Emp;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/5/13 17:21
 * @description
 **/
public interface EmpService {
    public void save(Emp emp);
    public List<Emp> list();
    public void delete(Emp emp);
}
