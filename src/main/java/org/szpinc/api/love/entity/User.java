package org.szpinc.api.love.entity;


import lombok.Data;

import java.util.Date;

/**
 * @author GhostDog
 */
@Data
public class User {
    private Integer id;
    private String nickName;
    private String openId;
    private String face;
    private Date createTime;
    private Date updateTime;

}
