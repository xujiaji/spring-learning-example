package com.xujiaji.pushmob.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author jiajixu
 * @date 2022/9/19 07:40
 */
@Data
@Builder
public class MobPushTargetAreas {
    private MobPushTargetAreaCountry[] countries; //	object []	必填	国家列表
}
