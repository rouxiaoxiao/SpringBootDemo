package com.liangxiao.demo.Enums;

/**
 * 状态码对应信息的枚举
 *
 * @Author: liangxiao
 * @Date: Created in 23:15 2018/5/27
 */
public enum ResultEnum {

    UNKONW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"小学生"),
    MIDDLE_SCHOOL(101,"初中生"),

    ;

    private Integer code;
    private String msg;
    //构造方法

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
