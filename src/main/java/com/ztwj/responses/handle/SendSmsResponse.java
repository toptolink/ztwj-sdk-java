package com.ztwj.responses.handle;

import com.ztwj.responses.BaseResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:44
 */
public class SendSmsResponse extends BaseResponse {
    private String[] failIccidList;

    public String[] getFailIccidList() {
        return failIccidList;
    }

    public void setFailIccidList(String[] failIccidList) {
        this.failIccidList = failIccidList;
    }
}
