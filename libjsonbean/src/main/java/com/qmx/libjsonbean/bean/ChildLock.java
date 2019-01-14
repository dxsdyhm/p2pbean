package com.qmx.libjsonbean.bean;

import com.qmx.libjsonbean.BaseJsonBean;
import com.qmx.libjsonbean.JsonCode;

/**
 * @Author: dxs
 * @time: 2018/10/22
 * @Email: duanxuesong12@126.com
 */
public class ChildLock extends BaseJsonBean {
    private boolean look;
    public ChildLock() {
        super(JsonCode.JSON_CODE_CHILDLOOK);
    }

    public boolean isLook() {
        return look;
    }

    public void setLook(boolean look) {
        this.look = look;
    }

    @Override
    public String toString() {
        return "ChildLock{" +
                "look=" + look +
                '}';
    }
}
