package com.liangxiao.demo.utils;

import com.liangxiao.demo.domain.Result;

/**
 * @Author: liangxiao
 * @Date: Created in 16:33 2018/5/27
 */
public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
    //成功有时也不返回data
    public static Result sccess(){
        return success(null);
    }

    public static Result error(Integer code, String mgs) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(mgs);
        return result;
    }
}
