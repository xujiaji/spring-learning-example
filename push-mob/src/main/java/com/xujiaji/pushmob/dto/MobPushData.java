package com.xujiaji.pushmob.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author jiajixu
 * @date 2022/9/19 07:32
 */
@Data
@Builder
public class MobPushData {
    private String workno; //	string	可选	自定义任务id，默认由MobTech自动生成，无需传递（需保证唯一性）
    private String source; //	string	必填	固定值webapi
    private String appkey; //	string	必填	MobTech提供的AppKey
    private MobPushTarget pushTarget; //	object	必填	推送目标
    private MobPushNotify pushNotify; //	object	必填	推送展示细节配置
    private MobPushOperator pushOperator; //	object	可选	运营保障相关配置
    private MobPushForward pushForward; //	object	可选	link 相关打开配置
    private MobPushCallback pushCallback; //	object	可选	推送回调配置
    private MobPushFactoryExtra pushFactoryExtra; //	object	可选	厂商特殊配置
    private MobPushUserExtra userExtra; //	object	可选	用于给客户提供一些用于解释推送任务的字段扩充
    private String groupId; //	string	可选	AB分组测试ID
}
