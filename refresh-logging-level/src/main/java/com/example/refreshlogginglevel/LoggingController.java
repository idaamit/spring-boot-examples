package com.example.refreshlogginglevel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    @Autowired
    SampleService sampleService;

    @GetMapping
    public String hello(){
        return sampleService.sayHellow();
    }

    // https://www.baeldung.com/spring-boot-changing-log-level-at-runtime
    // changing log level by rest controller
}
