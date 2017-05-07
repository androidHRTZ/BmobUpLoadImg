package com.riven.tuploadimg;

/**
 * Created by Riven on 2017/5/7.
 * Email: 1819485687@qq.com
 */

public class ResponseBean {

    private String filename;
    private String url;
    private String cdnname;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCdnname() {
        return cdnname;
    }

    public void setCdnname(String cdnname) {
        this.cdnname = cdnname;
    }
}
