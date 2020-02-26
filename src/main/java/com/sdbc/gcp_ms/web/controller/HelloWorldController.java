package com.sdbc.gcp_ms.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {

    public static final String HELLO_WORLD_ENDPOINT = "/hello-world";
    public static final String HELLO_WORLD_MSG= "Hello, World!";

    @GetMapping(HELLO_WORLD_ENDPOINT)
    public String index() {
        return HELLO_WORLD_MSG;
    }
}
