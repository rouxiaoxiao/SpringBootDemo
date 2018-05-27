package com.liangxiao.demo.service;

import com.liangxiao.demo.domain.Girl;
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
//        A.setRange(61);
        girlRepository.save(A);

        Girl B = new Girl();
        B.setAge(12);
        B.setHair("black");
//        B.setRange(72);
        girlRepository.save(B);
    }
}
