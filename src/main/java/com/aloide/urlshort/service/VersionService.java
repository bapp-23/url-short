package com.aloide.urlshort.service;

import org.springframework.stereotype.Service;

@Service
public class VersionService {

    public Object get() {
        return "v1.0";
    }
}
