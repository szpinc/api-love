package org.szpinc.api.love.web.api;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.szpinc.api.love.entity.MainInfo;
import org.szpinc.api.love.service.MainInfoService;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/17 10:15
 */

@RestController
@Slf4j
public class MainInfoController {

    @Autowired
    private MainInfoService mainInfoService;

    @GetMapping("/info")
    public Map<String, Object> getMainInfo(@RequestParam("user_id") Integer userId) {

        Map<String, Object> result = new HashMap<>();

        if (StringUtils.isEmpty(userId)) {
            if (log.isErrorEnabled()) {
                log.info("user_id不能为空");
            }
            throw new RuntimeException("user_id不能为空");

        }

        QueryWrapper<MainInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id", userId);
        MainInfo info = mainInfoService.getOne(wrapper);
        result.put("main_info", info);
        result.put("code", 0);
        return result;
    }


}
