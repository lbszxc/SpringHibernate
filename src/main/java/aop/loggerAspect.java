package aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * @author Administrator
 * @date 2020/5/13 17:36
 * @description
 **/
@Aspect
public class loggerAspect {
   Logger logger = Logger.getLogger("loggerAspect.class");
   @Before("execution(* service..*.*(..))")
   public void methodBefore(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        if ("save".equals(method)){
            logger.info("\n前置："+new Timestamp(System.currentTimeMillis())+""+args[0]+"\t保存成功");
        }
        if ("list".equals(method)){
            logger.info("\n前置："+new Timestamp(System.currentTimeMillis())+""+args[0]+"\t查询成功");
        }
        if ("delete".equals(method)){
            logger.info("\n前置："+new Timestamp(System.currentTimeMillis())+""+args[0]+"\t删除成功");
        }
   }
}