package com.xujiaji.pushmob.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author jiajixu
 * @date 2022/9/19 07:33
 */
@Data
@Builder
public class MobPushTarget {
    private Integer target; //	number	必填	推送目标类型- 1：广播 - 2：别名（alias） - 3：标签（tags） - 4：rid - 5：地理位置（city） - 6：用户分群 - 9：复杂地理位置推送（pushAreas） - 14：fileid推送
    private String[] alias; //	string []	target等于2时必填	推送别名集合，集合元素限制1000个以内。例：["alias1","alias2"]
    private String[] tags; //	string []	target等于3时必填	推送标签集合，集合元素限制1000个以内例：["tag1","tag2"]
    private Integer tagsType; //	number	target等于3时必填	标签组合方式，target等于3时可用- 1：并集 - 2：交集 - 3：补集(暂未实现)
    private String[] rids; //	string[]	target等于4时必填	推送rid集合，集合元素限制1000个以内例：["id1","id2"]
    private String city; //	string	target等于5时可选，且city、province、country 必选一个不为空	推送地理位置的城市例：上海市
    private String province; //	string	target等于5时可选，且city、province、country 必选一个不为空	推送地理位置的省份例：浙江省
    private String country; //	string	target等于5时可选，且city、province、country 必选一个不为空	推送地理位置的国家例：中国
    private String block; //	string	target等于6时必填	用户分群ID注：该功能暂未实现
    private MobPushTargetAreas pushAreas; //	object	target等于9时必填	复杂地理位置
    private String fileId; //	string	target等于14时必填	fileid
    private String[] appPackages; //	string []	可选	指定推送的包名列表，如不填则使用默认包名进行推送
}
