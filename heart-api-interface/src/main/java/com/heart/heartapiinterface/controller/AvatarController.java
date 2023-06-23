package com.heart.heartapiinterface.controller;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import com.heart.heartApiCommon.model.entity.BaiduParams;
import com.heart.heartapiclientsdk.model.AvatarParams;
import com.heart.heartapiinterface.utils.SslUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/**
 * @ClassName AvatarController
 * @Description TODO
 * @Author lish
 * @Date 2023/5/9 0:37
 */
@RestController
@RequestMapping("/avatar")
public class AvatarController {


    @PostMapping("/avatarUrl")
    public String getAvatarUrlByPost(@RequestBody(required = false) AvatarParams avatarParams, HttpServletRequest request) throws Exception {
        //https://restapi.amap.com/v3/weather/weatherInfo?
        String avatarUrl = "https://www.loliapi.com/acg/pp/";
//        HashMap<String, Object> paramMap = new HashMap<>();
//        paramMap.put("type", "json");
//        paramMap.put("tx", "b1");
//        paramMap.put("key", "2yta7ZzxPfP6YqZZLzQi413D3B");
//        HttpRequest get = HttpUtil.createGet(avatarUrl, true);
        String redirectUrl = getRedirectUrl(avatarUrl);
        return redirectUrl;
    }


    /**
     * 获取重定向地址
     * @param path
     * @return
     * @throws Exception
     */
    private String getRedirectUrl(String path) throws Exception {
        HttpURLConnection conn = (HttpURLConnection) new URL(path)
                .openConnection();
        conn.setInstanceFollowRedirects(false);
        conn.setConnectTimeout(5000);
        String location = conn.getHeaderField("Location");
        return location;
    }

}
