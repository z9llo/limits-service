package com.zllo.microservices.limitsservice.controller;

import com.zllo.microservices.limitsservice.bean.Limits;
import com.zllo.microservices.limitsservice.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private Config config;

    @Autowired
    public LimitsController(Config config) {
        this.config = config;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(this.config.getMinimum(), this.config.getMaximum());
    }

}
