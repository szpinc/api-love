package org.szpinc.api.love.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/17 12:29
 */
@TableName("photo")
@Data
@ToString
public class Photo {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("user_id")
    @JsonProperty("user_id")
    private Integer userId;
    @TableField
    private String name;
    @TableField
    private String image;
    @TableField("add_time")
    @JsonProperty("add_time")
    private Long addTime;
}
