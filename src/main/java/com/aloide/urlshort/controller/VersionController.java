package com.aloide.urlshort.controller;

import com.aloide.urlshort.service.VersionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    private final VersionService service;

    public VersionController() {
        this.service = new VersionService();
    }

    @GetMapping("/version")
    public String getVersion(){
        return service.get().toString();
    }

}
