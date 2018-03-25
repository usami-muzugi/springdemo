package cn.ximcloud.springboot.springdemo.aspect;

import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-03-25
 * Time: 20:23
 * ProjectName: springdemo
 * To change this template use File | Settings | File Templates.
 **/
@Aspect
@Component
public class HttpAspect {
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * cn.ximcloud.springboot.springdemo.controller.GirlController.girlList(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest httpServletRequest = servletRequestAttributes.getRequest();

        //url
        logger.info("url={}", httpServletRequest.getRequestURL());

        //method
        logger.info("methid={}", httpServletRequest.getMethod());

        //ip
        logger.info("ip={}", httpServletRequest.getRemoteAddr());

        //类方法
        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());

        //参数
        logger.info("args={}", joinPoint.getArgs());
    }

    @After("execution(public * cn.ximcloud.springboot.springdemo.controller.GirlController.girlList(..))")
    public void doAfter() {
        logger.info("222222222222222222");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object) {
        logger.info("response={}",object);
    }
}
