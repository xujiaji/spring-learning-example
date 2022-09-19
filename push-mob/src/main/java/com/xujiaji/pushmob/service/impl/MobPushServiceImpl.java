package com.xujiaji.pushmob.service.impl;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.json.JSONUtil;
import com.xujiaji.pushmob.config.MobPushConfig;
import com.xujiaji.pushmob.dto.MobPushData;
import com.xujiaji.pushmob.dto.MobPushNotify;
import com.xujiaji.pushmob.dto.MobPushTarget;
import com.xujiaji.pushmob.service.MobPushService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * @author jiajixu
 * @date 2022/9/19 07:23
 */
@AllArgsConstructor
@Service
@Slf4j
public class MobPushServiceImpl implements MobPushService {

    private final MobPushConfig mobPushConfig;
    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public void createPush() {
        val data = MobPushData.builder()
                .appkey(mobPushConfig.getAppKey())
                .source("webapi")
                .pushTarget(MobPushTarget.builder().target(1).build())
                .pushNotify(MobPushNotify.builder().plats(new Integer[] {1}).content("推送的内容2").type(1).build())
                .build();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("key", mobPushConfig.getAppKey());
        val dataJsonStr = JSONUtil.toJsonStr(data);
        headers.set("sign", SecureUtil.md5(dataJsonStr + mobPushConfig.getAppSecret()));
        val entity = new HttpEntity<>(dataJsonStr, headers);

        try {
            val response = restTemplate.postForEntity("http://api.push.mob.com/v3/push/createPush", entity, String.class);
            log.info("response: statusCode = {}, body = {}", response.getStatusCode(), response.getBody());
        } catch (HttpClientErrorException e) {
            log.info("response: statusCode = {}, body = {}", e.getRawStatusCode(), e.getMessage());
        }
    }
}
