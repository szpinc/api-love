package org.szpinc.api.love.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.szpinc.api.love.entity.Bless;

import java.util.List;

public interface BlessService extends IService<Bless> {

    Bless findBlessByOpenId (String openid);
}
