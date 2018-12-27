package com.ucloud.library.netanalysis.api.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * Created by joshua on 2018/10/17 15:44.
 * Company: UCloud
 * E-mail: joshua.yin@ucloud.cn
 */
public class UCApiBaseRequestBean {
    @SerializedName("app_key")
    protected String app_key;
    
    public UCApiBaseRequestBean(String app_key) {
        this.app_key = app_key;
    }
    
    public String getApp_key() {
        return app_key;
    }
    
    public void setApp_key(String app_key) {
        this.app_key = app_key;
    }
    
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
