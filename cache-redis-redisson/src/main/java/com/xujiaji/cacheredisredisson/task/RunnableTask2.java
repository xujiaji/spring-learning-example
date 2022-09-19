package com.xujiaji.cacheredisredisson.task;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
public class RunnableTask2 implements Runnable, Serializable {

    private int num = 0;

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        log.info(Thread.currentThread().getName() + " RunnableTask run " + num);
//        RMap<String, Integer> map = redissonClient.getMap("myMap");
//        Long result = 0L;
//        for (Integer value : map.values()) {
//            result += value;
//        }
//        redissonClient.getTopic("myMapTopic").publish(result);
    }

}
