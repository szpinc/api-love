package org.szpinc.api.love.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.szpinc.api.love.entity.MainInfo;
import org.szpinc.api.love.mapper.MainInfoMapper;
import org.szpinc.api.love.service.MainInfoService;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/17 9:42
 */
@Service
public class MainInfoServiceImpl extends ServiceImpl<MainInfoMapper, MainInfo> implements MainInfoService {
}
