package com.qmx.libjsonbean;

/**
 * @Author: dxs
 * @time: 2018/10/16
 * @Email: duanxuesong12@126.com
 */
public class JsonCode {
    public static final int OPTION_GET=0;//获取
    public static final int OPTION_SET=1;//设置

    //基本设置项
    public static final int JSON_CODE_SETTING=1;
    public static final int JSON_CODE_SETTING_ACK=2;
    //wifi
    public static final int JSON_CODE_BLE_WIFIINFO=3;
    public static final int JSON_CODE_BLE_WIFIINFO_ACK=4;
    //小夜灯
    public static final int JSON_CODE_LIGHT_SWITCH=5;
    public static final int JSON_CODE_LIGHT_SWITCH_ACK=6;
    //夜间模式
    public static final int JSON_CODE_NIGHT_MODE=7;
    public static final int JSON_CODE_NIGHT_MODE_ACK=8;
    //童锁开关
    public static final int JSON_CODE_CHILDLOOK=9;
    public static final int JSON_CODE_CHILDLOOK_ACK=10;
    //智能绘本搜索
    public static final int JSON_CODE_SMARTPICBOOK=11;
    public static final int JSON_CODE_SMARTPICBOOK_ACK=12;
    //音量
    public static final int JSON_CODE_VOLUME=13;
    public static final int JSON_CODE_VOLUME_ACK=14;
    //昵称
    public static final int JSON_CODE_NICKNAME=15;
    public static final int JSON_CODE_NICKNAME_ACK=16;
    //系统信息
    public static final int JSON_CODE_INFOOS=17;
    public static final int JSON_CODE_INFOOS_ACK=18;
    //清除数据
    public static final int JSON_CODE_CLEARDATA=19;
    public static final int JSON_CODE_CLEARDATA_ACK=20;
    //呼叫附带数据
    public static final int JSON_CODE_CALL_DATA=21;
    public static final int JSON_CODE_ACCEPT_DATA=22;
    //摄像头校准
    public static final int JSON_CODE_CAMERA_MODIFY=23;
    //设备工作软件重启
    public static final int JSON_CODE_RELUNCHER=24;
    //升级主APP
    public static final int JSON_CODE_UPDATE_WORK=25;
    //下载文件
    public static final int JSON_CODE_DOWNLOADFILE=26;
    //聊天消息
    public static final int JSON_CODE_CHATMSEG=27;
    //触摸唤醒
    public static final int JSON_CODE_TOUCHWAKE=28;
    //解绑主人信息（不是必然需要处理结果,功能由web完成）
    public static final int JSON_CODE_UNBIND=29;
}
