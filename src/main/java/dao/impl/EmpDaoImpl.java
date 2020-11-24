package dao.impl;

import dao.EmpDao;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import pojo.Emp;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/5/13 17:10
 * @description
 **/
public class EmpDaoImpl extends HibernateDaoSupport implements EmpDao {
    @Override
    public void save(Emp emp) {
        this.getHibernateTemplate().save(emp);
    }

    @Override
    public List<Emp> list() {
        return (List<Emp>) this.getHibernateTemplate().find("from Emp");
    }

    @Override
    public void delete(Emp emp) {
        this.getHibernateTemplate().delete(emp);
    }
}
