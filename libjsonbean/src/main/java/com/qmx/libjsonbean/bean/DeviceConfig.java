package com.qmx.libjsonbean.bean;

import com.qmx.libjsonbean.BaseJsonBean;
import com.qmx.libjsonbean.JsonCode;

/**
 * @Author: dxs
 * @time: 2018/10/22
 * @Email: duanxuesong12@126.com
 */
public class DeviceConfig extends BaseJsonBean{
    private String nikname;
    private String nightmode;
    private int volume;
    private int maxvolume;
    private boolean childlockswitch;
    private int lightswitch;
    private int lightmode;
    private String wifissid;
    private boolean smartpicbookswitch;
    private boolean nightmodeswitch;

    public DeviceConfig() {
        super(JsonCode.JSON_CODE_SETTING);
    }

    public String getNikname() {
        return nikname;
    }

    public void setNikname(String nikname) {
        this.nikname = nikname;
    }

    public String getNightmode() {
        return nightmode;
    }

    public void setNightmode(String nightmode) {
        this.nightmode = nightmode;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMaxvolume() {
        return maxvolume;
    }

    public void setMaxvolume(int maxvolume) {
        this.maxvolume = maxvolume;
    }

    public boolean isChildlockswitch() {
        return childlockswitch;
    }

    public void setChildlockswitch(boolean childlockswitch) {
        this.childlockswitch = childlockswitch;
    }

    public int getLightswitch() {
        return lightswitch;
    }

    public void setLightswitch(int lightswitch) {
        this.lightswitch = lightswitch;
    }

    public int getLightmode() {
        return lightmode;
    }

    public void setLightmode(int lightmode) {
        this.lightmode = lightmode;
    }

    public String getWifissid() {
        return wifissid;
    }

    public void setWifissid(String wifissid) {
        this.wifissid = wifissid;
    }

    public boolean isSmartpicbookswitch() {
        return smartpicbookswitch;
    }

    public void setSmartpicbookswitch(boolean smartpicbookswitch) {
        this.smartpicbookswitch = smartpicbookswitch;
    }

    public boolean isNightmodeswitch() {
        return nightmodeswitch;
    }

    public void setNightmodeswitch(boolean nightmodeswitch) {
        this.nightmodeswitch = nightmodeswitch;
    }

    @Override
    public String toString() {
        return "DeviceConfig{" +
                "nikname='" + nikname + '\'' +
                ", nightmode='" + nightmode + '\'' +
                ", volume=" + volume +
                ", maxvolume=" + maxvolume +
                ", childlockswitch=" + childlockswitch +
                ", lightswitch=" + lightswitch +
                ", lightmode=" + lightmode +
                ", wifissid='" + wifissid + '\'' +
                ", smartpicbookswitch=" + smartpicbookswitch +
                ", nightmodeswitch=" + nightmodeswitch +
                '}';
    }
}
