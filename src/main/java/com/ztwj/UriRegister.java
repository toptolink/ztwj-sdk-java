package com.ztwj;

import com.ztwj.requests.flowpool.*;
import com.ztwj.requests.handle.*;
import com.ztwj.requests.query.*;
import com.ztwj.requests.shrepool.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 资源注册
 *
 * @author LIUSF
 * @date 2019-03-27 18:32:06
 */
public final class UriRegister {
    private static Map<String, String> uriMap = new ConcurrentHashMap<String, String>();

    private UriRegister() {
    }

    static {
        /** 查询类接口 */
        uriMap.put(GetAllCardInfoRequest.class.getName(), "/card/getAllCardInfo");
        uriMap.put(GetBatchAllCardNumberRequest.class.getName(), "/card/getBatchAllCardNumber");
        uriMap.put(GetCardAuthInfoRequest.class.getName(), "/card/getCardAuthInfo");
        uriMap.put(GetCardDetailsRequest.class.getName(), "/card/getDetails");
        uriMap.put(GetCardFlowDataByPeriodRequest.class.getName(), "/card/getFlowDataByPeriod");
        uriMap.put(GetCardInfoByImeiRequest.class.getName(), "/card/getCardInfoByImei");
        uriMap.put(GetCardMemberDetailsExtRequest.class.getName(), "/card/getMemberDetails2");
        uriMap.put(GetCardMemberDetailsRequest.class.getName(), "/card/getMemberDetails");
        uriMap.put(GetCardPwdListByUserRequest.class.getName(), "/cardpwd/getListByUser");
        uriMap.put(GetPackageListByUserRequest.class.getName(), "/package/getListByUser");
        uriMap.put(GetPackageListRequest.class.getName(), "/package/getList");
        uriMap.put(GetPackageRechargeListRequest.class.getName(), "/package/getRechargeList");
        uriMap.put(GetSmsDetailsRequest.class.getName(), "/sms/getDetails");
        uriMap.put(GetSmsHistoryInfoRequest.class.getName(), "/sms/getSmsHistoryInfo");

        /** 办理类接口 */
        uriMap.put(ActivePackageRequest.class.getName(), "/package/active");
        uriMap.put(ChangeCardSwitchRequest.class.getName(), "/card/changeSwitch");
        uriMap.put(RechargeCardPwdByIdRequest.class.getName(), "/cardpwd/rechargeById");
        uriMap.put(RechargeCardPwdRequest.class.getName(), "/cardpwd/recharge");
        uriMap.put(RechargePackageRequest.class.getName(), "/package/recharge");
        uriMap.put(RechargeVoicePackageRequest.class.getName(), "/package/voiceRecharge");
        uriMap.put(SendSmsRequest.class.getName(), "/sms/send");

        /** 流量池接口 */
        uriMap.put(AddCardsToPoolRequest.class.getName(), "/cardPool/addCardsToPool");
        uriMap.put(QueryPoolFlowRequest.class.getName(), "/cardPool/queryPoolFlow");
        uriMap.put(UpdateFlowDataByControlTypeRequest.class.getName(), "/card/updateFlowDataByControlType");

        /** 共享池接口 */
        uriMap.put(QueryFlowPoolInfoRequest.class.getName(), "/cardPool/queryFlowPoolInfo");
        uriMap.put(QuerySharedPoolListRequest.class.getName(), "/cardPool/toQuerySharedPoolList");
    }

    public static String getUri(String className) {
        return uriMap.get(className);
    }
}
