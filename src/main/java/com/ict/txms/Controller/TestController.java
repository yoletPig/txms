package com.ict.txms.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yoleen
 * @date 2020/10/23 14:29
 */

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello21")
    public String hello21() {
        return "hello";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "hello2";
    }

    @GetMapping("/hello23")
    public String hello23() {
        return "hello2";
    }
}
