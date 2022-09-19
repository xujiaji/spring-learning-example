package com.xujiaji.pushmob.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author jiajixu
 * @date 2022/9/19 07:54
 */
@Data
@Builder
public class MobPushNotifyAndroidCustomStyle {
    private Integer styleNo; //	integer	可选	样式序号- 1：样式1 - 2：样式2 - 3：样式3
    private String backgroundUrl; //	string	可选	背景图Url
    private String smallIcons; //	string	可选	小图标
    private String buttonCopy; //	string	可选	按钮文案
    private String buttonJumpUrl; //	string	可选	点击按钮跳转的链接
}
