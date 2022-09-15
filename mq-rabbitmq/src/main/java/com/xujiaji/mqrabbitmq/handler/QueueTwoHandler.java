package com.xujiaji.mqrabbitmq.handler;

import cn.hutool.json.JSONUtil;
import com.rabbitmq.client.Channel;
import com.xujiaji.mqrabbitmq.constants.RabbitConsts;
import com.xujiaji.mqrabbitmq.message.MessageStruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * 直接队列1处理器
 * @author jiajixu
 * @date 2022/9/14 08:34
 */
@Slf4j
@RabbitListener(queues = RabbitConsts.QUEUE_TWO)
@Component
public class QueueTwoHandler {

    @RabbitHandler
    public void directHandlerManualAck(MessageStruct messageStruct, Message message, Channel channel) {
        // 如果手动ACK，消息会被监听消费，但是消息在MQ中依旧存在
        final long deliveryTag = message.getMessageProperties().getDeliveryTag();
        log.info("队列2，手动ACK，接收消息：{}", JSONUtil.toJsonStr(messageStruct));
        try {
            channel.basicAck(deliveryTag, false);
        } catch (IOException e) {
            try {
                // 处理失败，重新压入MQ
                channel.basicRecover();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
