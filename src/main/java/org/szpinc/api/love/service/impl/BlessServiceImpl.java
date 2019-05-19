package org.szpinc.api.love.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.szpinc.api.love.entity.Bless;
import org.szpinc.api.love.mapper.BlessMapper;
import org.szpinc.api.love.service.BlessService;

import java.util.List;

@Service
public class BlessServiceImpl extends ServiceImpl<BlessMapper, Bless> implements BlessService {
    @Override
    public Bless findBlessByOpenId(String openid) {
        return this.getOne(new QueryWrapper<Bless>().eq("openid", openid));
    }
}
