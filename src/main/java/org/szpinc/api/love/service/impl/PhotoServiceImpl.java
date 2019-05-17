package org.szpinc.api.love.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.szpinc.api.love.entity.Photo;
import org.szpinc.api.love.mapper.PhotoMapper;
import org.szpinc.api.love.service.PhotoService;

import java.util.List;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/17 13:33
 */
@Service
public class PhotoServiceImpl extends ServiceImpl<PhotoMapper, Photo> implements PhotoService {
    @Override
    public List<Photo> getPhotoByUserId(Integer userId) {
        return this.list(new QueryWrapper<Photo>().eq("user_id",userId));
    }
}
