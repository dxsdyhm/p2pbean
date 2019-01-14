package com.qmx.libjsonbean.bean;
/*
   群聊消息
   1.普通文本  text 内容  设备端TTS读出
   2.表情      text 表情地址
               url  语音地址
               localuri 表情在手机端显示的地址
   3.语音       text 空
                url OSS地址
                localuri 本地下载地址（正常情况下语音不用下载。直接地址播放）
 */
import com.qmx.libjsonbean.BaseJsonBean;
import com.qmx.libjsonbean.JsonCode;

/**
 * @Author: dxs
 * @time: 2018/12/16
 * @Email: duanxuesong12@126.com
 */
public class ChatP2P extends BaseJsonBean {
    private int type;
    private String text;
    private String url;
    private String localuri;
    private long time;
    private long duration;
    private String sendid;
    private String buckname;
    private String objkey;
    private String extra;
    private long chatmsgid;
    public ChatP2P() {
        super(JsonCode.JSON_CODE_CHATMSEG);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLocaluri() {
        return localuri;
    }

    public void setLocaluri(String localuri) {
        this.localuri = localuri;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getSendid() {
        return sendid;
    }

    public void setSendid(String sendid) {
        this.sendid = sendid;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getBuckname() {
        return buckname;
    }

    public void setBuckname(String buckname) {
        this.buckname = buckname;
    }

    public String getObjkey() {
        return objkey;
    }

    public void setObjkey(String objkey) {
        this.objkey = objkey;
    }

    public long getChatmsgid() {
        return chatmsgid;
    }

    public void setChatmsgid(long chatmsgid) {
        this.chatmsgid = chatmsgid;
    }

    @Override
    public String toString() {
        return "ChatP2P{" +
                "type=" + type +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", localuri='" + localuri + '\'' +
                ", time=" + time +
                ", duration=" + duration +
                ", sendid='" + sendid + '\'' +
                ", extra='" + extra + '\'' +
                '}';
    }
}
