package com.example.demo.controllers;

import com.example.demo.models.dataTest;
import com.example.demo.services.firstTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class firstTestController {
    private final firstTestService fTest;

    @Autowired
    public firstTestController(firstTestService fTest){
        this.fTest = fTest;
    }

    @GetMapping("/test")
    public boolean checkNumber(@RequestParam int number) {
        return fTest.test(number);
    }

    @PostMapping("/printName")
    public String printName(@RequestBody dataTest infos){
        return fTest.printName(infos);
    }
}