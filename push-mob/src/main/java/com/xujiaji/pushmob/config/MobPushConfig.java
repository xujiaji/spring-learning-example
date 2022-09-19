package com.xujiaji.pushmob.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author jiajixu
 * @date 2022/9/19 10:09
 */
@Data
@Component
@ConfigurationProperties(prefix = "mob.push")
public class MobPushConfig {
    /**
     * MobTech提供的AppKey
     */
    private String appKey;

    /**
     * MobAppSecret
     */
    private String appSecret;
}
