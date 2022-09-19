package com.xujiaji.pushmob.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

/**
 * @author jiajixu
 * @date 2022/9/19 07:34
 */
@Data
@Builder
public class MobPushCallback {
    private String string; //	可选	回调地址点击查看详情
    private Map<String, Object> object; //	可选	JSON对象自定义参数例： { "key": "value" }
}
