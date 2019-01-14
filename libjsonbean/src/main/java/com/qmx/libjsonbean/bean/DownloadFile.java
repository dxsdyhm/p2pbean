package com.qmx.libjsonbean.bean;

import com.qmx.libjsonbean.BaseJsonBean;
import com.qmx.libjsonbean.JsonCode;

/**
 * @Author: dxs
 * @time: 2018/12/12
 * @Email: duanxuesong12@126.com
 */
public class DownloadFile extends BaseJsonBean {
    private String url;
    private String downloadfile;
    private String name;
    private boolean needunzip;
    private boolean redownload;
    private String targetfile;

    public DownloadFile() {
        super(JsonCode.JSON_CODE_DOWNLOADFILE);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDownloadfile() {
        return downloadfile;
    }

    public void setDownloadfile(String downloadfile) {
        this.downloadfile = downloadfile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNeedunzip() {
        return needunzip;
    }

    public void setNeedunzip(boolean needunzip) {
        this.needunzip = needunzip;
    }

    public boolean isRedownload() {
        return redownload;
    }

    public void setRedownload(boolean redownload) {
        this.redownload = redownload;
    }

    public String getTargetfile() {
        return targetfile;
    }

    public void setTargetfile(String targetfile) {
        this.targetfile = targetfile;
    }
}
