package org.szpinc.api.love.entity;


import lombok.Data;



@Data
public class Chat {

    private String id;

    private String content;

    private String time;

    private String userId;
}
