package com.liangxiao.demo.controller;

import com.liangxiao.demo.domain.Girl;
import com.liangxiao.demo.repository.GirlRepository;
import com.liangxiao.demo.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * RestFul API设计实现
 *
 * @Author: liangxiao
 * @Date: Created in 23:09 2018/5/21
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /**
     * 查询所有女生列表
     *
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    /**
     * 添加一个女生
     *
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        girl.setAge(girl.getAge());
        girl.setHair(girl.getHair());
        return girlRepository.save(girl);
    }

    //查询一个女生
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id) {
        return girlRepository.findOne(id);
    }

    //更新
    @PutMapping(value = "/girls/{id}")
    public Object girlUpdateOne(@PathVariable("id") Integer id,
                              @Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return bindingResult.getFieldError().getDefaultMessage();
        }
        girl.setId(girl.getId());
        girl.setAge(girl.getAge());
        girl.setHair(girl.getHair());
//        girl.setRange(girl.getRange());
        girlRepository.save(girl);
        return girl;
    }

    //删除
    @DeleteMapping(value = "/girls/{id}")
    public void deleteOne(@PathVariable("id") Integer id) {
        girlRepository.delete(girlRepository.getOne(id));
    }

    //根据年龄查询一个女生
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }

    //添加两个女生（事务管理）
    @PostMapping(value = "/girls/two")
    public void girlTwo() {
        girlService.insertTwo();
    }
}
