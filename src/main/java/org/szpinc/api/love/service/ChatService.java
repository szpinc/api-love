package org.szpinc.api.love.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.szpinc.api.love.entity.Chat;

import java.util.List;

public interface ChatService extends IService<Chat> {

    List<Chat> findChatListByOpenid (String openid);
}
