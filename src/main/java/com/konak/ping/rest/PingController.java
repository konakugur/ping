package com.konak.ping.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "app")
public class PingController {

    @GetMapping(value = "ping")
    public String ping() {
        return "pong";
    }

    @GetMapping(value = "echo")
    public String echo(@RequestParam(value = "key", required = false) String key) {
        return "Echoing back : " + key;
    }

}
