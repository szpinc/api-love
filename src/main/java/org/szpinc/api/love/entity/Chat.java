package org.szpinc.api.love.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("chat")
public class Chat {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField
    private String openid;
    @TableField
    private String nickname;
    @TableField
    private String face;
    @TableField
    private String words;
    @TableField
    private Long time;
}
