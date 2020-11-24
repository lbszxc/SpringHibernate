import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Emp;
import service.EmpService;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/5/13 18:16
 * @description
 **/
public class testSpring {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        EmpService empService = (EmpService) context.getBean("empService");
        List<Emp> empList = empService.list();
        for (Emp emp:empList){
            System.out.println(emp);
        }
    }

}
