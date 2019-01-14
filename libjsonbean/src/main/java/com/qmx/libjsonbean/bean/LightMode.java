package com.qmx.libjsonbean.bean;

import com.qmx.libjsonbean.BaseJsonBean;
import com.qmx.libjsonbean.JsonCode;

/**
 * @Author: dxs
 * @time: 2018/10/19
 * @Email: duanxuesong12@126.com
 */
public class LightMode extends BaseJsonBean {
    private int lightSwitch;
    private int lightMode;

    public LightMode() {
        super(JsonCode.JSON_CODE_LIGHT_SWITCH);
    }

    public int getLightSwitch() {
        return lightSwitch;
    }

    public void setLightSwitch(int lightSwitch) {
        this.lightSwitch = lightSwitch;
    }

    public int getLightMode() {
        return lightMode;
    }

    public void setLightMode(int lightMode) {
        this.lightMode = lightMode;
    }

    @Override
    public String toString() {
        return "LightMode{" +
                "lightSwitch=" + lightSwitch +
                ", lightMode=" + lightMode +
                '}';
    }
}
