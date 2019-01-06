package com.wangzunbin.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:InitController  <br/>
 * Funtion: ${TODD} <br/>
 *
 * @author WangZunBin <br/>
 * @version 0.4 2019/1/6 18:01   <br/>
 */

@Controller
public class InitController {


    @ResponseBody
    @RequestMapping("/info")
    public String init() {
        return "hello init...";
    }
}
