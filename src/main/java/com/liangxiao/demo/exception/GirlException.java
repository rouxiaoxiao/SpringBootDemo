package com.liangxiao.demo.exception;

/**
 * 自定义异常类
 *
 * @Author: liangxiao
 * @Date: Created in 17:32 2018/5/27
 */
public class GirlException extends RuntimeException {

    private Integer code;

    //重写构造方法
    public GirlException(Integer code, String message) {
        super(message);//父类的构造方法本来就可以传一个message进去
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
