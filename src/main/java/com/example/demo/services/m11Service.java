package com.example.demo.services;

import org.springframework.stereotype.Service;
import com.example.demo.models.personData;

@Service
public class m11Service {
    public boolean firstTest(int number) {
        return number >= 10;
    }

    public String printName (personData data){
        return data.getName();
    }
    public boolean validateCpf (String cpf){
        String rawCpf = cpf.replaceAll("[.\\-]", "");

        String verifierResult = "" + firstVerifier(rawCpf, 10, 0) + secondVerifier(rawCpf, 11, 0);
        return rawCpf.substring(9).equals(verifierResult);
    }

    private int firstVerifier (String cpf, int weight, int result){
        if(cpf.length() == 2){
            return (result * 10) % 11;
        }else{
            int newResult = (Integer.parseInt(cpf.charAt(0) + "") * weight) + result;
            return firstVerifier(cpf.substring(1), weight-1, newResult );
        }
    }

    private int secondVerifier (String cpf, int weight, int result){
        if(cpf.length() == 1){
            return (result * 10) % 11;
        }else{
            int newResult = (Integer.parseInt(cpf.charAt(0) + "") * weight) + result;
            return secondVerifier(cpf.substring(1), weight-1, newResult );
        }
    }

}
