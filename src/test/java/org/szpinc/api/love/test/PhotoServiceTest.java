package org.szpinc.api.love.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.szpinc.api.love.entity.Photo;
import org.szpinc.api.love.service.PhotoService;

import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.util.Date;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/17 13:42
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhotoServiceTest {

    @Autowired
    private PhotoService photoService;

    @Test
    public void testAddPhoto() {
        Photo photo = new Photo();
        photo.setUserId(1);
        photo.setImage("https://ws1.sinaimg.cn/large/005LP3H3gy1g341jibmm5j318g1woww1.jpg");
        photo.setName("");
        photo.setAddTime(new Date().getTime());
        photoService.save(photo);
    }


}
