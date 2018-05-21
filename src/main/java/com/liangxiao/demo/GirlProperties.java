package com.liangxiao.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 获取yml配置文件中的一类属性
 *
 * @Author: liangxiao
 * @Date: Created in 17:40 2018/5/21
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private String hair;
    private String language;

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
