package com.zerobase.fastlms.main.controller;


import com.zerobase.fastlms.admin.dto.BannerDto;
import com.zerobase.fastlms.admin.service.BannerService;
import com.zerobase.fastlms.util.RequestUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class MainController {

    private final BannerService bannerService;

    @RequestMapping("/")
    String index(Model model) {

        List<BannerDto> banners = bannerService.frontList();
        model.addAttribute("banners", banners);

        return "index";
    }

    @RequestMapping("/error/denied")
    String errorDenied() {

        return "error/denied";
    }

    public String index(HttpServletRequest request) throws UnknownHostException {


        String userAgent = Inet4Address.getLocalHost().getHostAddress();
        String clientIp = RequestUtils.getClientIP(request);

        log.info(userAgent);
        log.info(clientIp);

        return "index";
    }
}
