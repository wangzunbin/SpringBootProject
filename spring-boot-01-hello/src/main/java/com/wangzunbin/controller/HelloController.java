package com.wangzunbin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:HelloController  <br/>
 * Funtion: ${TODD} <br/>
 *
 * @author WangZunBin <br/>
 * @version 0.4 2019/1/5 17:20   <br/>
 */

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String sayHello(){
        return "say hello .....";
    }
}
