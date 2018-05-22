package com.liangxiao.demo.repository;

import com.liangxiao.demo.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: liangxiao
 * @Date: Created in 23:13 2018/5/21
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {
    //扩展：通过年龄来查询(方法名一定按着这个格式来写，他才会根据年龄的字段进行查询)
    public List<Girl> findByAge(Integer age);
}
