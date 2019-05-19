package org.szpinc.api.love.web.api;


import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.szpinc.api.love.config.WxMaConfiguration;
import org.szpinc.api.love.utils.JsonUtils;

@RestController
@Slf4j
public class UserController {

    @GetMapping("/user/openid")
    public String getUserOpenId(@RequestParam("appid") String appid, @RequestParam("code") String code) {

        final WxMaService wxMaService = WxMaConfiguration.getMaService(appid);

        try {
            WxMaJscode2SessionResult sessionInfo = wxMaService.getUserService().getSessionInfo(code);
            log.info("获取的用户openid为:[{}]",sessionInfo.getOpenid());
            log.info("获取的用户sessionKey为:[{}]",sessionInfo.getSessionKey());
            return JsonUtils.toJson(sessionInfo);
        } catch (WxErrorException e) {
            return e.toString();
        }
    }

}
