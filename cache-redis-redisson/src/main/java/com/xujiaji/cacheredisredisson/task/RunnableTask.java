package com.xujiaji.cacheredisredisson.task;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
public class RunnableTask implements Runnable, Serializable {


    @Override
    public void run() {
        log.info("RunnableTask run");
//        RMap<String, Integer> map = redissonClient.getMap("myMap");
//        Long result = 0L;
//        for (Integer value : map.values()) {
//            result += value;
//        }
//        redissonClient.getTopic("myMapTopic").publish(result);
    }

}
