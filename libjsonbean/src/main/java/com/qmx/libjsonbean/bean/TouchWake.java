package com.qmx.libjsonbean.bean;

import com.qmx.libjsonbean.BaseJsonBean;
import com.qmx.libjsonbean.JsonCode;

/**
 * @Author: dxs
 * @time: 2019/1/24
 * @Email: duanxuesong12@126.com
 */
public class TouchWake extends BaseJsonBean {
    private boolean touchwake;

    public TouchWake() {
        super(JsonCode.JSON_CODE_TOUCHWAKE);
    }

    public boolean isTouchwake() {
        return touchwake;
    }

    public void setTouchwake(boolean touchwake) {
        this.touchwake = touchwake;
    }
}
