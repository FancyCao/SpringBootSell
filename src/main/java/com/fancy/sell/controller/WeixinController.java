package com.fancy.sell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName WeixinController
 * @Description TODO
 * @Author fancyyyy
 * @Date 2019/12/30 10:56
 * @Version 1.0
 **/
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) {
        // 通过code换取网页授权access_token
        log.info("进入auth方法。。。");
        log.info("code={}", code);
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxfb9e3debd2a6ef71&secret=b420a5255611d7f2993e29b990bf98a6&code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response={}", response);

        // 拉取用户信息(需scope为 snsapi_userinfo)
        /*String url2 = "https://api.weixin.qq.com/sns/userinfo?access_token=28_mOEApF0Y8IKOZ8VShSUIRxvmP2HPLLRJmfsdXwmV3anEb0bkl4AERJPP4hLixqXZrYeXsDzYskheEz5kqEwAfRgaqC-hfP6KfGx0lMONP6w&openid=oUIdgs-IbD2C_Itx71DeVX5xlGRw&lang=zh_CN";
        RestTemplate restTemplate1 = new RestTemplate();
        String response2 = restTemplate1.getForObject(url2, String.class);
        String jsonResult = null;
        try {
            jsonResult = new String(response2.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        log.info("response2={}", jsonResult);*/
    }
}
