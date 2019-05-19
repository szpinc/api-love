package org.szpinc.api.love.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@TableName("bless")
public class Bless {

    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField
    private String openid;
    @TableField("nick_name")
    @JsonProperty("nickname")
    private String nickName;
    @TableField
    private String face;
    @TableField
    private Long time;
}
