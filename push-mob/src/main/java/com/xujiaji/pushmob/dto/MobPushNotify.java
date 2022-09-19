package com.xujiaji.pushmob.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author jiajixu
 * @date 2022/9/19 07:33
 */
@Data
@Builder
public class MobPushNotify {
    private Integer[] plats; //	number []	必填	推送生效渠道- 1：android - 2：iOS 例：[1, 2]
    private Integer iosProduction; //	number	plats数组值含有2时可选	iOS环境- 0：测试环境 - 1：生产环境（默认）
    private Integer offlineSeconds; //	number	可选	离线消息保存时间，单位：秒，默认值为86400注：魅族厂商的离线保留时间范围是1~72小时，设置的离线保留时间如超出该范围将会导致消息无法使用魅族厂商通道，其他厂商不受影响
    private String content; //	string	必填	推送内容注1：内容长度超过厂商限制会被截断。 注2：vivo不支持纯表情。
    private String title; //	string	可选	通知标题注1：默认通知标题为应用名称 注2：标题长度超过厂商限制会被截断 注3：vivo不允许纯表情
    private Integer type; //	number	必填	推送类型- 1：通知 - 2：自定义
    private MobPushNotifyAndroid androidNotify; //	object	可选	Android通知消息对象
    private MobPushNotifyIOS iosNotify; //	object	可选	iOS通知消息对象
    private Integer taskCron; //	number	可选	是否是定时消息- 0：否（默认） - 1：是
    private Integer taskTime; //	number	taskCron=1时必填	定时消息发送时间，单位：毫秒时间戳 例：1594277916000
    private Integer speed; //	number	可选	每秒推送速率的趋势，默认为0（代表不开启）
    private Integer skipOnline; //	number	可选	是否跳过在线设备- 1：跳过 - 0：不跳过（默认）
    private Integer skipFactory; //	number	可选	是否跳过厂商通道- 1：跳过 - 0：不跳过（默认）
    private Integer policy; //	number	可选	推送策略- 1：先走tcp，再走厂商 - 2：先走厂商，再走tcp - 3：只走厂商 - 4：只走tcp注：厂商透传只支持策略3或4
    private List<Map<String, Object>> extrasMapList; //	object []	可选	附加参数列表例： [ { "key": "name", "value": "jason" }, { "key": "age", "value": 18 } ]
}
