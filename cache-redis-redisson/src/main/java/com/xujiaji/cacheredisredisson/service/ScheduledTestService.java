package com.xujiaji.cacheredisredisson.service;

import com.xujiaji.cacheredisredisson.task.RunnableTask;
import com.xujiaji.cacheredisredisson.task.RunnableTask2;
import lombok.extern.slf4j.Slf4j;
import org.redisson.RedissonNode;
import org.redisson.api.CronSchedule;
import org.redisson.api.RScheduledExecutorService;
import org.redisson.api.RScheduledFuture;
import org.redisson.api.RedissonClient;
import org.redisson.config.RedissonNodeConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author jiajixu
 * @date 2022/9/14 19:14
 */
@Slf4j
@Service
public class ScheduledTestService {

    @Autowired
    private RedissonClient redissonClient;

    public void testScheduled() {
        log.info("called testScheduled");

        RScheduledExecutorService executorService = redissonClient.getExecutorService("myExecutor");
//        RScheduledFuture<?> future = executorService.schedule(new RunnableTask(), 10, TimeUnit.SECONDS);

        for (int i = 0; i < 10; i++) {
            final RunnableTask2 runnableTask2 = new RunnableTask2();
            runnableTask2.setNum(i);
            executorService.schedule(runnableTask2,10,TimeUnit.SECONDS);
        }

        log.info(executorService.getName());
//
//        try {
//            future.get();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

        final RScheduledFuture<?> schedule = executorService.schedule(new RunnableTask(), CronSchedule.of("0 54 * * * ?"));

//        executorService.cancelTask(schedule.getTaskId());

//        executorService.schedule(new RunnableTask(), CronSchedule.dailyAtHourAndMinute(10, 5));
//
//        executorService.schedule(new RunnableTask(), CronSchedule.weeklyOnDayAndHourAndMinute(12, 4, Calendar.MONDAY, Calendar.FRIDAY));

//        future.get();
//        // or cancel it
//        future.cancel(true);
//
//        // cancel by taskId
//        executorService.cancelTask(future.getTaskId());

    }
}
