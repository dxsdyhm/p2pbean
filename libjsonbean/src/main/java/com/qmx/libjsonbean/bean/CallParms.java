package com.qmx.libjsonbean.bean;

import com.qmx.libjsonbean.BaseJsonBean;
import com.qmx.libjsonbean.JsonCode;

/**
 * @Author: dxs
 * @time: 2018/12/6
 * @Email: duanxuesong12@126.com
 */
public class CallParms extends BaseJsonBean {
    private int version;
    private int quality;
    public CallParms() {
        super(JsonCode.JSON_CODE_CALL_DATA);
    }

    public CallParms(int quality) {
        super(JsonCode.JSON_CODE_CALL_DATA);
        this.quality = quality;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
