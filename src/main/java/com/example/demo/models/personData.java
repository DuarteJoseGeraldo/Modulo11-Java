package com.example.demo.models;

import lombok.Builder;
import lombok.Data;

@Builder @Data
public class personData {
    private String name;
    private String cpf;

}