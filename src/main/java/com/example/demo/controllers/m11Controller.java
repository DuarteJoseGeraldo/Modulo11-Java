package com.example.demo.controllers;

import com.example.demo.models.personData;
import com.example.demo.services.m11Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class m11Controller {
    private final m11Service serviceTest;

    @Autowired
    public m11Controller(m11Service fTest){
        this.serviceTest = fTest;
    }

    @GetMapping("/test")
    public boolean checkNumber(@RequestParam int number) {
        return serviceTest.firstTest(number);
    }

    @PostMapping("/name")
    public String printName(@RequestBody personData infos){
        return serviceTest.printName(infos);
    }
    @PostMapping("/cpf")
    public boolean validateCpf(@RequestBody personData infos){
        return serviceTest.validateCpf(infos.getCpf());
    }
}