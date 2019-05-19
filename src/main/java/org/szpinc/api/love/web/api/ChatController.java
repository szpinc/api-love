package org.szpinc.api.love.web.api;


import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.szpinc.api.love.entity.Chat;
import org.szpinc.api.love.service.ChatService;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class ChatController {

    @Autowired
    private ChatService chatService;

    private Map<String, Object> result;


    @GetMapping("/chat/list")
    public Map<String, Object> list() {
        handle();
        return result;
    }


    @PostMapping("/chat/add")
    public Map<String, Object> add(@RequestBody Chat chat) {
        chat.setTime(System.currentTimeMillis());
        chatService.save(chat);
        handle();
        return result;
    }

    @PostMapping("/attend")
    public Map<String, Object> attend(@RequestBody Map<String, String> request) {


        request.forEach((k, v) -> log.info("Param:[name={},value={}]", k, v));

        result = Maps.newHashMap();
        result.put("code", 0);
        result.put("msg", "success");
        return result;
    }

    private void handle() {
        result = Maps.newHashMap();
        List<Chat> chatList = chatService.list();
        chatList.sort(Comparator.comparing(Chat::getTime).reversed());
        result.put("code", 0);
        result.put("msg", "留言成功");
        result.put("chat_list", chatList);
        result.put("chat_num", chatService.count());
    }


}
