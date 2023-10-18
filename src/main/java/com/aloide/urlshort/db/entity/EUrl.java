package com.aloide.urlshort.db.entity;

import javax.persistence.*;
import javax.persistence.Entity;

/**
 * Clase representante de la entidad de la tabla T_URL
 */
@Entity
public class EUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Basic
    private String url;
    private String urlShort;
    private boolean active;
    private long user_id;


    public EUrl() {
    }

    public EUrl(long id, String url, String urlShort, boolean active, long user_id) {
        this.id = id;
        this.url = url;
        this.urlShort = urlShort;
        this.active = active;
        this.user_id = user_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlShort() {
        return urlShort;
    }

    public void setUrlShort(String urlShort) {
        this.urlShort = urlShort;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}
