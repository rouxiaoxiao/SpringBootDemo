package com.liangxiao.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * 新建一个女孩类对应MySQL中的一个表
 *
 * @Author: liangxiao
 * @Date: Created in 22:57 2018/5/21
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;
    private String hair;
    @Min(value = 18, message = "未成年")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
