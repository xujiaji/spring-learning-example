package com.xujiaji.pushmob;

import cn.hutool.json.JSONUtil;
import com.xujiaji.pushmob.config.MobPushConfig;
import com.xujiaji.pushmob.service.MobPushService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class PushMobApplicationTests {

    @Autowired
    private MobPushConfig mobPushConfig;
    @Autowired
    private MobPushService mobPushService;

    @Test
    void contextLoads() {
        System.out.println(JSONUtil.toJsonPrettyStr(mobPushConfig));
    }

    @Test
    void testNormalPush() {
        mobPushService.createPush();
    }
}
