package com.kv.dto;


import com.kv.annotation.Protected;
import lombok.Data;

@Data
public class Secure {

    @Protected
    private String test;
}
