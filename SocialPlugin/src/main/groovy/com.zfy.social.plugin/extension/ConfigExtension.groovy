package com.zfy.social.plugin.extension

class ConfigExtension  {

    public String  version      = null
    public String  appId        = ""
    public boolean enable       = true
    public String  appSecret    = ""
    public String  url          = ""
    public boolean onlyAuthCode = false

    String getVersion() {
        return version
    }

    void setVersion(String version) {
        this.version = version
    }

    String getAppId() {
        return appId
    }

    void setAppId(String appId) {
        this.appId = appId
    }

    boolean getEnable() {
        return enable
    }

    void setEnable(boolean enable) {
        this.enable = enable
    }

    String getAppSecret() {
        return appSecret
    }

    void setAppSecret(String appSecret) {
        this.appSecret = appSecret
    }

    String getUrl() {
        return url
    }

    void setUrl(String url) {
        this.url = url
    }

    boolean getOnlyAuthCode() {
        return onlyAuthCode
    }

    void setOnlyAuthCode(boolean onlyAuthCode) {
        this.onlyAuthCode = onlyAuthCode
    }
}