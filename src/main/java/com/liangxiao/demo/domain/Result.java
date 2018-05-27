package com.liangxiao.demo.domain;

/**
 * http请求返回的最外层对象（为统一返回数据的格式而定义的对象）
 *
 * @Author: liangxiao
 * @Date: Created in 16:19 2018/5/27
 */
public class Result<T> {
    //错误码
    private Integer code;
    //提示信息
    private String msg;
    //具体内容(用泛型表示)
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
