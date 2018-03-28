package cn.ximcloud.springboot.springdemo;

import cn.ximcloud.springboot.springdemo.domain.Girl;
import cn.ximcloud.springboot.springdemo.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-03-26
 * Time: 15:21
 * ProjectName: springdemo
 * To change this template use File | Settings | File Templates.
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    GirlService girlService;

    @Test
    public void findOneTest() {
        Girl girl = girlService.findOneGril(1);
        Assert.assertEquals(new Integer(1),new Integer(1));
    }
}
