package pojo;

import java.sql.Timestamp;

/**
 * @author Administrator
 * @date 2020/5/13 12:20
 * @description
 **/
public class Emp {
    private int empno;
    private String ename;
    private String job;
    private Integer mar;
    private Timestamp hiredate;
    private Integer sal;
    private Integer comm;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMar() {
        return mar;
    }

    public void setMar(Integer mar) {
        this.mar = mar;
    }

    public Timestamp getHiredate() {
        return hiredate;
    }

    public void setHiredate(Timestamp hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getComm() {
        return comm;
    }

    public void setComm(Integer comm) {
        this.comm = comm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emp emp = (Emp) o;

        if (empno != emp.empno) return false;
        if (ename != null ? !ename.equals(emp.ename) : emp.ename != null) return false;
        if (job != null ? !job.equals(emp.job) : emp.job != null) return false;
        if (mar != null ? !mar.equals(emp.mar) : emp.mar != null) return false;
        if (hiredate != null ? !hiredate.equals(emp.hiredate) : emp.hiredate != null) return false;
        if (sal != null ? !sal.equals(emp.sal) : emp.sal != null) return false;
        if (comm != null ? !comm.equals(emp.comm) : emp.comm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empno;
        result = 31 * result + (ename != null ? ename.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (mar != null ? mar.hashCode() : 0);
        result = 31 * result + (hiredate != null ? hiredate.hashCode() : 0);
        result = 31 * result + (sal != null ? sal.hashCode() : 0);
        result = 31 * result + (comm != null ? comm.hashCode() : 0);
        return result;
    }
}
