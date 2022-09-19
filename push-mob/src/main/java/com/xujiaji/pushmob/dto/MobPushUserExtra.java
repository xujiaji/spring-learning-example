package com.xujiaji.pushmob.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author jiajixu
 * @date 2022/9/19 07:35
 */
@Data
@Builder
public class MobPushUserExtra {
    private String pushWorkDesc; //	string	可选	推送任务的解释说明，由用户设置
    private Integer activityTask; //	integer	可选	活动任务- 0：不是活动任务（默认） - 1：是活动任务
    private String activityWorkId; //	string	activityTask为1时必传	活动ID，不能超过20个字符，且唯一不可重复
}
