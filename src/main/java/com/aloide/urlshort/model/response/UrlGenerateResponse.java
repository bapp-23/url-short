package com.aloide.urlshort.model.response;

public class UrlGenerateResponse {

    String urlShort;
    String url;

    public UrlGenerateResponse( String url, String urlShort) {
        this.urlShort = urlShort;
        this.url = url;
    }

    public String getUrlShort() {
        return urlShort;
    }

    public void setUrlShort(String urlShort) {
        this.urlShort = urlShort;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
