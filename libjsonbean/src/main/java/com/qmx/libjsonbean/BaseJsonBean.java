package com.qmx.libjsonbean;

import java.io.Serializable;

public class BaseJsonBean implements Serializable {	
	private int cmd;
    private int option;
    private int msgid;
    private int error;

    public BaseJsonBean(int cmd) {
        this.cmd = cmd;
    }

    public int getCmd() {
        return cmd;
    }

//    public void setCmd(int cmd) {
//        this.cmd = cmd;
//    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public boolean isGet(){
        return option==JsonCode.OPTION_GET;
    }

    public boolean isSet(){
        return option==JsonCode.OPTION_SET;
    }

    public int getMsgid() {
        return msgid;
    }

    public void setMsgid(int msgid) {
        this.msgid = msgid;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "BaseJsonBean{" +
                "cmd=" + cmd +
                ", option=" + option +
                ", msgid=" + msgid +
                ", error=" + error +
                '}';
    }
}
