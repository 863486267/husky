package com.zzx.husky.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Mr.John on 2019/4/6 10:29.
 **/

@RestController
@Slf4j
public class HuskyController {
    @GetMapping("/husky")
    public void husky(HttpServletResponse response){

        log.info("哈士奇来了！");

        try {
            response.sendRedirect("404.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
