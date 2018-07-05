package com.ote.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/test")
@Slf4j
public class TestRestController {

    @GetMapping
    public boolean ping() {
        log.info("PING");
        return true;
    }
}
