package org.szpinc.api.love.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.szpinc.api.love.entity.Photo;

import java.util.List;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/17 13:32
 */
public interface PhotoService extends IService<Photo> {

    List<Photo> getPhotoByUserId (Integer userId);

}
