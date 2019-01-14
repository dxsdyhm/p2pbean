package com.qmx.libjsonbean.bean;

import com.qmx.libjsonbean.BaseJsonBean;
import com.qmx.libjsonbean.JsonCode;

/**
 * @Author: dxs
 * @time: 2018/10/22
 * @Email: duanxuesong12@126.com
 */
public class SmartPicBook extends BaseJsonBean {
    private boolean smart;
    public SmartPicBook() {
        super(JsonCode.JSON_CODE_SMARTPICBOOK);
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
