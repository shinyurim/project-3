package com.zerobase.fastlms.util;

import javax.servlet.http.HttpServletRequest;

public class RequestUtils {

    public static String getUserAgent(HttpServletRequest request) {
        return request.getHeader("User-Agent").toString();
    }

    public static String getClientIP(HttpServletRequest request) {

        String ip = request.getHeader("X-FORWARDED-FOR");

        if (ip == null || ip.length() == 0) { // 프록시 서버인경우
            ip = request.getHeader("Proxy-Client-IP");
        }

        if (ip == null || ip.length() == 0) { // 웹로직서버인경우
            ip = request.getHeader("WL-Proxy-Client-IP");
        }

        if (ip == null || ip.length() == 0) {
            ip = request.getRemoteAddr();
        }

        return ip;
    }
}
