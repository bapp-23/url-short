package com.aloide.urlshort.controller;

import com.aloide.urlshort.model.request.UrlGenerateRequest;
import com.aloide.urlshort.model.response.UrlGenerateResponse;
import com.aloide.urlshort.service.UrlService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {

    private  final UrlService service;


    public UrlController(UrlService service) {
        this.service = service;
    }

    @PostMapping("/generate")
    public UrlGenerateResponse postGenerate(@RequestBody UrlGenerateRequest request){

        var result = service.store(request);

        return result;

    }

}
