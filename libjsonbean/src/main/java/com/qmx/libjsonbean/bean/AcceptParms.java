package com.qmx.libjsonbean.bean;

import com.qmx.libjsonbean.BaseJsonBean;
import com.qmx.libjsonbean.JsonCode;

/**
 * @Author: dxs
 * @time: 2018/12/6
 * @Email: duanxuesong12@126.com
 */
public class AcceptParms extends BaseJsonBean {
    private int version;
    private int audiorate;
    private int audiochenl;
    private int cameraw;
    private int camerah;
    private int videobitrate;
    private int videorate;
    public AcceptParms() {
        super(JsonCode.JSON_CODE_ACCEPT_DATA);
    }
    public AcceptParms(int version, int audiorate, int audiochenl, int cameraw, int camerah, int videobitrate, int videorate) {
        super(JsonCode.JSON_CODE_ACCEPT_DATA);
        this.version = version;
        this.audiorate = audiorate;
        this.audiochenl = audiochenl;
        this.cameraw = cameraw;
        this.camerah = camerah;
        this.videobitrate = videobitrate;
        this.videorate = videorate;
    }
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getAudiorate() {
        return audiorate;
    }

    public void setAudiorate(int audiorate) {
        this.audiorate = audiorate;
    }

    public int getAudiochenl() {
        return audiochenl;
    }

    public void setAudiochenl(int audiochenl) {
        this.audiochenl = audiochenl;
    }

    public int getCameraw() {
        return cameraw;
    }

    public void setCameraw(int cameraw) {
        this.cameraw = cameraw;
    }

    public int getCamerah() {
        return camerah;
    }

    public void setCamerah(int camerah) {
        this.camerah = camerah;
    }

    public int getVideobitrate() {
        return videobitrate;
    }

    public void setVideobitrate(int videobitrate) {
        this.videobitrate = videobitrate;
    }

    public int getVideorate() {
        return videorate;
    }

    public void setVideorate(int videorate) {
        this.videorate = videorate;
    }
}
