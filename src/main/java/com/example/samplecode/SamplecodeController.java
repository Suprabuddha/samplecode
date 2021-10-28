package com.example.samplecode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SamplecodeController {

    Logger logger = LoggerFactory.getLogger(SamplecodeController.class);
    @GetMapping("/hello")
    public String sayHello(){

        logger.trace("Inside Controller");
        return "Welcome to Azure Web App in the Production site version 2.0";
    }

}
