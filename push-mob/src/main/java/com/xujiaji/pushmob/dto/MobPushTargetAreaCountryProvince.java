package com.xujiaji.pushmob.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author jiajixu
 * @date 2022/9/19 07:40
 */
@Data
@Builder
public class MobPushTargetAreaCountryProvince {
    private String province; //	string	必填	省份名称
    private String[] cities; //	string []	可选	需要推送的城市列表
    private String[] excludeCities; //	string []	可选	指定不需要推送的城市列表，当指定[cities]时，这个字段不起作用
    private String[] excludeProvinces; //	string []	可选	指定不需要推送的省份列表，当设置[provinces]时，这个不起作用
}
