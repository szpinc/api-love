package org.szpinc.api.love.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/17 9:33
 */
@TableName("main_info")
@Data
@ToString
public class MainInfo {
    @TableId
    private Integer id;
    @TableField("user_id")
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("app_name")
    @TableField("app_name")
    private String appName;
    @TableField
    private String he;
    @TableField
    private String she;
    @TableField("he_tel")
    @JsonProperty("he_tel")
    private String heTel;
    @TableField("she_tel")
    @JsonProperty("she_tel")
    private String sheTel;
    @TableField
    private String date;
    @TableField
    private String lunar;
    @TableField
    private String music;
    @TableField
    private String address;
    @TableField
    private String hotel;
    @TableField
    private String lat;
    @TableField
    private String lng;
    @TableField
    private String share;
    @TableField
    private String cover;
    @TableField
    private String qrimg;
    @TableField
    private String thumb;
    @TableField
    private String code;
}
