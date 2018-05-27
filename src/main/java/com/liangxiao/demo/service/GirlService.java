package com.liangxiao.demo.service;

import com.liangxiao.demo.Enums.ResultEnum;
import com.liangxiao.demo.domain.Girl;
import com.liangxiao.demo.exception.GirlException;
import com.liangxiao.demo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * springboot的事务管理
 *
 * @Author: liangxiao
 * @Date: Created in 21:16 2018/5/22
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl A = new Girl();
        A.setAge(12);
        A.setHair("black");
        girlRepository.save(A);

        Girl B = new Girl();
        B.setAge(12);
        B.setHair("black");
        girlRepository.save(B);
    }

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.getOne(id);
        Integer age = girl.getAge();
        if (age < 10) {
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        } else if (age >= 10 && age > 16) {
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }


    //通过id查询一个女生的信息并返回
    public Girl findOne(Integer id) {
        return girlRepository.findOne(id);
    }
}
