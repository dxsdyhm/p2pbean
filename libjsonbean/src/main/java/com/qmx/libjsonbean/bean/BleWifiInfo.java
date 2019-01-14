package com.qmx.libjsonbean.bean;

import com.qmx.libjsonbean.utils.ByteUtils;
import com.qmx.libjsonbean.utils.StringUtils;

import java.util.Arrays;

/**
 * @Author: dxs
 * @time: 2018/10/16
 * @Email: duanxuesong12@126.com
 */
public class BleWifiInfo {
    public static int OPERITION_CONNECT=0;
    public static int OPERITION_CONNECT_ACK_ING=1;
    public static int OPERITION_CONNECT_ACK_SUCCESS=2;
    public static int OPERITION_CONNECT_ACK_ERROR=3;
    private int opriton;
    private int errorCode;
    private String wifiSSID="";//128 byte
    private String wifiPwd="";//128 byte

    public BleWifiInfo(int opriton, String wifiSSID, String wifiPwd) {
        this.opriton = opriton;
        this.wifiSSID = wifiSSID;
        this.wifiPwd = wifiPwd;
    }

    public int getOpriton() {
        return opriton;
    }

    public void setOpriton(int opriton) {
        this.opriton = opriton;
    }

    public String getWifiSSID() {
        return wifiSSID;
    }

    public void setWifiSSID(String wifiSSID) {
        this.wifiSSID = wifiSSID;
    }

    public String getWifiPwd() {
        return wifiPwd;
    }

    public void setWifiPwd(String wifiPwd) {
        this.wifiPwd = wifiPwd;
    }

    @Override
    public String toString() {
        return "BleWifiInfo{" +
                "opriton=" + opriton +
                ", wifiSSID='" + wifiSSID + '\'' +
                ", wifiPwd='" + wifiPwd + '\'' +
                '}';
    }
}
