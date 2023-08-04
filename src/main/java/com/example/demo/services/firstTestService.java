package com.example.demo.services;

import org.springframework.stereotype.Service;
import com.example.demo.models.dataTest;

@Service
public class firstTestService {
    public boolean test(int number) {
        return number >= 10;
    }

    public String printName (dataTest pessoa){
        return pessoa.getName();
    }
}
