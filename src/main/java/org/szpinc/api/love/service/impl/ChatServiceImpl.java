package org.szpinc.api.love.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.szpinc.api.love.entity.Chat;
import org.szpinc.api.love.mapper.ChatMapper;
import org.szpinc.api.love.service.ChatService;

import java.util.List;

@Service
public class ChatServiceImpl extends ServiceImpl<ChatMapper, Chat> implements ChatService {
    @Override
    public List<Chat> findChatListByOpenid(String openid) {
        return this.list(new QueryWrapper<Chat>().eq("openid", openid));
    }
}
