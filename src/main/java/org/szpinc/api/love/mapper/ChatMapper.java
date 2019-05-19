package org.szpinc.api.love.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.szpinc.api.love.entity.Chat;

@Mapper
public interface ChatMapper extends BaseMapper<Chat> {
}
