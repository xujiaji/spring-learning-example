package com.xujiaji.pushmob.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author jiajixu
 * @date 2022/9/19 07:52
 */
@Data
@Builder
public class MobPushNotifyAndroid {
    private String[] content; //	string []	可选	推送内容，配合style参数使用- style=0 不生效 - style=1 部分机型可以生效覆盖- style=2 传入图片链接，部分低版本手机不支持- style=3 对应传入文字内容默认: 0
    private MobPushNotifyAndroidCustomStyle customStyle; //	object	可选	自定义样式
    private String warn; //	string	可选	提醒类型，可多选组合- 1：提示音 - 2：震动 - 3：指示灯 例：12（提示音+震动）
    private Integer style; //	integer	可选	显示样式标识- 0：默认 - 1：长内容 - 2：大图 - 3：横幅 - 4：自定义样式
    private String sound; //	string	可选	自定义声音
    private String icon; //	string	可选	附带小图标的推送注1：icon和image只能二选一，同时传输则取icon中的数据 注2：目前客户端版本暂不支持
    private String image; //	string	可选	推送大图标的url地址注1：icon和image只能二选一，同时传输则取icon中的数据 注2：透传消息不支持 注3：小米厂商对图片尺寸有严格要求，不符合要求则不会按照大图样式进行推送，具体要求为：宽高固定为876*324px，格式需为PNG/JPG/JPEG，大小小于1M 注4：OPPO厂商大图需要申请权限，否则会报错导致客户端收不到推送消息
    private String androidChannelId; //	string	可选	安卓通知渠道ID注：当输入该参数后，MobPush通道和厂商通道都会使用该channelId；当androidChannelId 和 pushFactoryExtra中的channelId同时使用填写时，那MobPush通道使用androidChannelId，厂商通道使用pushFactoryExtra中设置的channelId
    private Integer androidBadgeType; //	number	可选	角标类型- 1：角标数值取androidBadge值 - 2：角标数值为androidBadge当前值加1注：透传消息不支持
    private Integer androidBadge; //	number	可选	角标数值
}
