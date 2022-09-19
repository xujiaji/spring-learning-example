package com.xujiaji.pushmob.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author jiajixu
 * @date 2022/9/19 07:34
 */
@Data
@Builder
public class MobPushOperator {
    private Integer dropType; //	number	可选	运营保障消息修改类型，推荐使用专用接口进行操作 - 1：取消 - 2：替换 - 3：撤回
    private String dropId; //	string	必填	推送任务的唯一ID
}
