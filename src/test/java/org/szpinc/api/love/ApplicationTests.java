package org.szpinc.api.love;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.szpinc.api.love.entity.MainInfo;
import org.szpinc.api.love.repository.MainInfoRespository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private MainInfoRespository mainInfoRespository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testAddMainInfo() {

        MainInfo mainInfo = new MainInfo();
        mainInfo.setName("appid");
        mainInfo.setValue("wxade372ce7f2da061");
        mainInfoRespository.save(mainInfo);
    }

}
