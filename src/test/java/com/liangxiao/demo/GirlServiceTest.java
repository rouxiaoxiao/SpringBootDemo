package com.liangxiao.demo;

import com.liangxiao.demo.domain.Girl;
import com.liangxiao.demo.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Service的测试
 *
 * @Author: liangxiao
 * @Date: Created in 23:43 2018/5/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    //注入GirlService
    @Autowired
    private GirlService girlService;

    //在测试的方法上要加上@Test注解
    @Test
    public void findOneTest(){
        Girl girl =girlService.findOne(1);
        Assert.assertEquals(new Integer(19),girl.getAge());
    }


}
