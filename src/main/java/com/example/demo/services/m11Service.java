package com.example.demo.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.example.demo.models.personData;

@Service
@Slf4j
public class m11Service {
    public boolean firstTest(int number) {
        return number >= 10;
    }

    public String printName (personData data){
        return data.getName();
    }


    public boolean validateCpf (String cpf){
        String rawCpf = cpf.replaceAll("[.\\-]", "");

        String verifierResult = "" + checkVerifier(rawCpf.substring(0,9), 0) + checkVerifier(rawCpf.substring(0,10), 0) ;

        return rawCpf.substring(9).equals(verifierResult);
    }

    private int checkVerifier (String cpf, int result){
        if(cpf.isEmpty()){
            return (result * 10) % 11;
        }else{
            int newResult = (Integer.parseInt(cpf.charAt(0) + "") * (cpf.length()+1)) + result;
            return checkVerifier(cpf.substring(1), newResult );
        }
    }
}