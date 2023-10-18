package com.aloide.urlshort.service;

import com.aloide.urlshort.helper.UrlShortConstructorHelper;
import com.aloide.urlshort.model.request.UrlGenerateRequest;
import com.aloide.urlshort.model.response.UrlGenerateResponse;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    public UrlGenerateResponse store(UrlGenerateRequest request){

        String _short = UrlShortConstructorHelper.getRandomUrl();

        UrlGenerateResponse result = new UrlGenerateResponse(request.getNm(), _short);

        return result;

    }

}
