package org.szpinc.api.love.web.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.szpinc.api.love.entity.Bless;
import org.szpinc.api.love.service.BlessService;

import javax.servlet.http.HttpServletRequest;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class BlessController {

    @Autowired
    private BlessService blessService;

    @PostMapping("/bless/add")
    public Map<String, Object> addBless(@RequestBody Bless bless) {

        Map<String, Object> result = new HashMap<>();

        log.info("Bless[{}]", bless);

        if (bless == null || StringUtils.isEmpty(bless.getOpenid()) || StringUtils.isEmpty(bless.getNickName()) || StringUtils.isEmpty(bless.getFace())) {
            result.put("code", 1);
            result.put("msg", "openid,nickname或face不能为空");
            return result;
        }

        if (blessService.findBlessByOpenId(bless.getOpenid()) != null) {
            result.put("code", 1);
            result.put("msg", "您已祝福过了!");
            return result;
        }

        bless.setTime(System.currentTimeMillis());
        blessService.save(bless);

        result.put("code", 0);
        result.put("msg", "添加成功");
        return result;
    }

    @GetMapping("/bless/list")
    public Map<String, Object> listBless(@RequestParam Integer user_id) {
        Map<String, Object> result = new HashMap<>();
        List<Bless> blessList = blessService.list();
        blessList.sort(Comparator.comparing(Bless::getTime));
        result.put("code", 0);
        result.put("bless_list", blessList);
        result.put("bless_num", blessList.size());
        return result;
    }


}
