package com.example.demo.controllers;

import com.example.demo.models.personData;
import com.example.demo.services.m11Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class m11Controller {
    private final m11Service service;

    @Autowired
    public m11Controller(m11Service fTest){
        this.service = fTest;
    }

    @GetMapping("/test")
    public boolean checkNumber(@RequestParam int number) {
        return service.firstTest(number);
    }

    @PostMapping("/name")
    public String printName(@RequestBody personData infos){
        return service.printName(infos);
    }
    @PostMapping("/cpf")
    public boolean validateCpf(@RequestBody personData infos){
        return service.validateCpf(infos.getCpf());
    }
}