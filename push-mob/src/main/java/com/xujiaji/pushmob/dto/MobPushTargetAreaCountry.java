package com.xujiaji.pushmob.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author jiajixu
 * @date 2022/9/19 07:40
 */
@Data
@Builder
public class MobPushTargetAreaCountry {
    private String country; //	string	必填	国家名称
    private MobPushTargetAreaCountryProvince[] provinces; //	object []	可选	指定需要推送的省份列表
}
