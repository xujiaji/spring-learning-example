package com.xujiaji.cacheredisredisson;

import com.xujiaji.cacheredisredisson.service.ScheduledTestService;
import org.junit.jupiter.api.Test;
import org.redisson.api.RScheduledExecutorService;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

@SpringBootTest
class CacheRedisRedissonApplicationTests {

    @Autowired
    ScheduledTestService scheduledTestService;
    @Autowired
    private RedissonClient redissonClient;

    @Test
    void contextLoads() {
        redissonClient.getBucket("hello").set("bug");
        String test = (String) redissonClient.getBucket("hello").get();
        System.out.println(test);
    }

    @Test
    void testScheduled() {
        scheduledTestService.testScheduled();
    }

    @Test
    void testCancelTask() {
        RScheduledExecutorService executorService = redissonClient.getExecutorService("myExecutor");
        final Set<String> taskIds = executorService.getTaskIds();
        for (String taskId : taskIds) {
            System.out.println("taskId: " + taskId);
            executorService.cancelTask(taskId);
        }
    }
}
