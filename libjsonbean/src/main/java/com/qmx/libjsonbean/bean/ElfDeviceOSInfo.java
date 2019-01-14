package com.qmx.libjsonbean.bean;

import com.qmx.libjsonbean.BaseJsonBean;
import com.qmx.libjsonbean.JsonCode;

/**
 * @Author: dxs
 * @time: 2018/10/23
 * @Email: duanxuesong12@126.com
 */
public class ElfDeviceOSInfo extends BaseJsonBean {
    private String deviceid;
    private int battery;
    private long sdcapacity;
    private long sdcapacityspace;
    private int versioncode;
    private String versionname;
    private int lunvercode;
    private String lunvername;

    public ElfDeviceOSInfo() {
        super(JsonCode.JSON_CODE_INFOOS);
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public long getSdcapacity() {
        return sdcapacity;
    }

    public void setSdcapacity(long sdcapacity) {
        this.sdcapacity = sdcapacity;
    }

    public long getSdcapacityspace() {
        return sdcapacityspace;
    }

    public void setSdcapacityspace(long sdcapacityspace) {
        this.sdcapacityspace = sdcapacityspace;
    }

    public int getVersioncode() {
        return versioncode;
    }

    public void setVersioncode(int versioncode) {
        this.versioncode = versioncode;
    }

    public String getVersionname() {
        return versionname;
    }

    public void setVersionname(String versionname) {
        this.versionname = versionname;
    }

    public int getLunvercode() {
        return lunvercode;
    }

    public void setLunvercode(int lunvercode) {
        this.lunvercode = lunvercode;
    }

    public String getLunvername() {
        return lunvername;
    }

    public void setLunvername(String lunvername) {
        this.lunvername = lunvername;
    }
}
