package com.mango.exception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 凌风的MI
 */
@RestController
public class HelloController {

    /**
     * 动态 > 静态
     * 精确 > 模糊
     * @return
     */
    @GetMapping("/hello")
    public String hello(){
        int i = 1/0;
        return "hello";
    }
}
