package com.xujiaji.pushmob.dto;

/**
 * @author jiajixu
 * @date 2022/9/19 07:55
 */
public class MobPushNotifyIOS {
    private Integer badge; //	number	可选	角标
    private Integer badgeType; //	number	可选	badge类型, 1:绝对值 不能为负数，2增减(正数增加，负数减少)，减到0以下会设置为0
    private String category; //	string	可选	APNs的category字段，只有IOS8及以上系统才支持此参数推送
    private String sound; //	string	可选	APNs通知，通过这个字段指定声音，默认为default（系统默认声音），如设置为空值则为静音。如设置为其他字符，则需要您的应用中配置了该声音才可以正常发声。
    private String subtitle; //	string	可选	副标题
    private Integer slientPush; //	number	可选	如果只携带content-available: 1,不携带任何badge，sound 和消息内容等参数， 则可以不打扰用户的情况下进行内容更新等操作即为“Silent Remote Notifications”
    private Integer contentAvailable; //	number	可选	将该键设为 1 则表示有新的可用内容。带上这个键值，意味着你的 App 在后台启动了或恢复运行了，application:didReceiveRemoteNotification:fetchCompletionHandler:被调用了
    private Integer mutableContent; //	number	可选	1 使用富文本 ;0 默认为0不设置 配合attachmentType 和attachment使用
    private Integer attachmentType; //	number	可选	富文本类型- 0：无 - 1：图片 - 2：视频 - 3：音频
    private String attachment; //	string	可选	ios富文本内容
}
