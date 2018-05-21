package com.liangxiao.demo;

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
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "Hello world!";
    }
}
