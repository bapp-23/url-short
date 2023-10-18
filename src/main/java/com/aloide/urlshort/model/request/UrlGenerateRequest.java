package com.aloide.urlshort.model.request;

public class UrlGenerateRequest {

    private String nm;

    private String userId;

    public UrlGenerateRequest(String nm, String userId) {
        this.nm = nm;
        this.userId = userId;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
