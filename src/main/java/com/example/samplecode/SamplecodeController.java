package com.example.samplecode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SamplecodeController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Welcome to Azure Web App in Production site";
    }

}
