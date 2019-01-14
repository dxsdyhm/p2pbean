package com.qmx.libjsonbean.bean;

import com.qmx.libjsonbean.BaseJsonBean;
import com.qmx.libjsonbean.JsonCode;


/**
 * @Author: dxs
 * @time: 2018/10/22
 * @Email: duanxuesong12@126.com
 * 这里记录的时非夜间模式
 */
public class NightMode extends BaseJsonBean {
    private boolean nighModeOn;
    private int startTime=7*60;
    private int endTime=20*60;
    public NightMode() {
        super(JsonCode.JSON_CODE_NIGHT_MODE);
    }

    public boolean isNighModeOn() {
        return nighModeOn;
    }

    public void setNighModeOn(boolean nighModeOn) {
        this.nighModeOn = nighModeOn;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return String.format("%d|%d",startTime,endTime);
    }

    public void paserArgs(String info){
        try {
            String[] light=info.split("\\|");
            if(light.length>=2){
                startTime=Integer.parseInt(light[0]);
                endTime=Integer.parseInt(light[1]);
            }else {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
