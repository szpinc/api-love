package org.szpinc.api.love.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.szpinc.api.love.entity.Photo;
import org.szpinc.api.love.service.PhotoService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/17 13:31
 */

@RestController
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    @GetMapping("/slide_list")
    public Map<String, Object> getPhotoById(@RequestParam("user_id") Integer userId) {
        List<Photo> photoList = photoService.getPhotoByUserId(userId);
        Map<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("slide_list", photoList);
        return result;
    }

}
