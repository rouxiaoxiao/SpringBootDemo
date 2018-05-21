package com.liangxiao.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     * @param hair
     * @param age
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("hair") String hair,
                        @RequestParam("age") int age) {
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setHair(hair);
        return girlRepository.save(girl);
    }

    //查询一个女生
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id) {
        return girlRepository.findOne(id);
    }

    //更新
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdateOne(@PathVariable("id") Integer id,
                              @RequestParam("hair") String hair,
                              @RequestParam("age") int age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setHair(hair);
        girl.setAge(age);
        girlRepository.save(girl);
        return girl;
    }

    //删除
    @DeleteMapping(value = "/girls/{id}")
    public void deleteOne(@PathVariable("id") Integer id) {
        girlRepository.delete(girlRepository.getOne(id));
    }
}
