package com.qmx.libjsonbean.bean;

import com.qmx.libjsonbean.BaseJsonBean;
import com.qmx.libjsonbean.JsonCode;

import java.util.Arrays;

/**
 * @Author: dxs
 * @time: 2018/12/9
 * @Email: duanxuesong12@126.com
 */
public class UpdateWorkApp extends BaseJsonBean {
    private int upgFlag;
    private int version;
    private String showVersion;
    private String url;
    private String md5;
    private int size;
    private String[] upgInfoList;

    public UpdateWorkApp() {
        super(JsonCode.JSON_CODE_UPDATE_WORK);
    }

    public int getUpgFlag() {
        return upgFlag;
    }

    public void setUpgFlag(int upgFlag) {
        this.upgFlag = upgFlag;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getShowVersion() {
        return showVersion;
    }

    public void setShowVersion(String showVersion) {
        this.showVersion = showVersion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String[] getUpgInfoList() {
        return upgInfoList;
    }

    public void setUpgInfoList(String[] upgInfoList) {
        this.upgInfoList = upgInfoList;
    }

    @Override
    public String toString() {
        return "UpdateWorkApp{" +
                "upgFlag=" + upgFlag +
                ", version=" + version +
                ", showVersion='" + showVersion + '\'' +
                ", url='" + url + '\'' +
                ", md5='" + md5 + '\'' +
                ", size=" + size +
                ", upgInfoList=" + Arrays.toString(upgInfoList) +
                '}';
    }
}
