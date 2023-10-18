package com.aloide.urlshort.helper;

import com.aloide.urlshort.AppConfig;

import java.security.SecureRandom;

public class UrlShortConstructorHelper {

    public static String getRandomUrl(){

        var longitud = AppConfig.LenghtCode;

        String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteresPermitidos.length());
            char caracterAleatorio = caracteresPermitidos.charAt(indice);
            sb.append(caracterAleatorio);
        }

        return sb.toString();
    }

}
