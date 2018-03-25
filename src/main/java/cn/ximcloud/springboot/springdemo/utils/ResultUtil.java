package cn.ximcloud.springboot.springdemo.utils;

import cn.ximcloud.springboot.springdemo.domain.Result;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-03-25
 * Time: 21:47
 * ProjectName: springdemo
 * To change this template use File | Settings | File Templates.
 **/
public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(1);
        result.setMsg(msg);
        return result;
    }
}
