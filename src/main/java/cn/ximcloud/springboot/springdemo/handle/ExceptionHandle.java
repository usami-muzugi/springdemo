package cn.ximcloud.springboot.springdemo.handle;

import cn.ximcloud.springboot.springdemo.domain.Result;
import cn.ximcloud.springboot.springdemo.utils.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-03-25
 * Time: 22:14
 * ProjectName: springdemo
 * To change this template use File | Settings | File Templates.
 **/
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        return ResultUtil.error(100,e.getMessage());
    }
}
