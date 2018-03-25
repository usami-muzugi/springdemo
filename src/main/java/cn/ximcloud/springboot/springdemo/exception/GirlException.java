package cn.ximcloud.springboot.springdemo.exception;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-03-25
 * Time: 22:18
 * ProjectName: springdemo
 * To change this template use File | Settings | File Templates.
 **/
public class GirlException extends RuntimeException {
    //SpringBoot 只对RuntimeException 的异常做事物回滚 Exception 则不会
}
