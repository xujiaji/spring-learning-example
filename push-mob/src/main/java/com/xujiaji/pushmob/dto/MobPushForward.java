package com.xujiaji.pushmob.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author jiajixu
 * @date 2022/9/19 07:34
 */
@Data
@Builder
public class MobPushForward {
    private String url; //	string	可选	link跳转 moblink功能的的uri
    private String scheme; //	string	必填	scheme moblink功能的的scheme
    private List<Map<String, Object>> schemeDataList; //	object []	可选	scheme参数例： [ { "key": "name", "value": "jason" }, { "key": "age", "value": 18 } ]
    private Integer nextType; //	integer	可选	后续动作- 0：打开首页 - 1：link跳转 - 2：scheme 跳转 - 3：Intent
    private String intentUrl; //	string	可选	Intent页面地址
}
