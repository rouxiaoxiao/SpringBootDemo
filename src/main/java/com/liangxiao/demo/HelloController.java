package com.liangxiao.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot的第一个helloworld
 *
 * @Author: liangxiao
 * @Date: Created in 16:23 2018/5/21
 */
@RestController
public class HelloController {

    @Value("${parmDemo}")
    private String parmDemo;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return girlProperties.getHair();
    }
}
