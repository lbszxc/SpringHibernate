package service.impl;

import dao.EmpDao;
import pojo.Emp;
import service.EmpService;

import java.util.List;
import java.util.Random;

/**
 * @author Administrator
 * @date 2020/5/13 18:38
 * @description
 **/
public class EmpServiceImpl implements EmpService {
    private EmpDao empDao;


    @Override
    public void save(pojo.Emp emp) {
        try {
            Thread.sleep(new Random().nextInt(4000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        empDao.save(emp);
    }

    @Override
    public List<Emp> list() {
        try {
            Thread.sleep(new Random().nextInt(4000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return empDao.list();
    }

    @Override
    public void delete(pojo.Emp emp) {
        try {
            Thread.sleep(new Random().nextInt(4000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        empDao.delete(emp);
    }

    public EmpDao getEmpDao() {
        return empDao;
    }

    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }
}
