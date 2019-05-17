package org.szpinc.api.love.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.szpinc.api.love.entity.MainInfo;
import org.szpinc.api.love.service.MainInfoService;

import java.util.List;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/17 9:44
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainInfoServiceTest {

    @Autowired
    private MainInfoService mainInfoService;

    @Test
    public void testGetMainInfo() {
        mainInfoService.list().forEach(System.out::println);
    }

}
