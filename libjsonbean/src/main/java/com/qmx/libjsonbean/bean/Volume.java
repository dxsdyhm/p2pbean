package com.qmx.libjsonbean.bean;

import com.qmx.libjsonbean.BaseJsonBean;
import com.qmx.libjsonbean.JsonCode;

/**
 * @Author: dxs
 * @time: 2018/10/22
 * @Email: duanxuesong12@126.com
 */
public class Volume extends BaseJsonBean{
    private int VolumeMax=15;
    //百分比
    private int CurrentVolume;
    public Volume() {
        super(JsonCode.JSON_CODE_VOLUME);
    }

    public int getVolumeMax() {
        return VolumeMax;
    }

    public void setVolumeMax(int volumeMax) {
        VolumeMax = volumeMax;
    }

    public int getCurrentVolume() {
        return CurrentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        CurrentVolume = currentVolume;
    }
}
