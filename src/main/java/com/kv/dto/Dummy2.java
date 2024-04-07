package com.kv.dto;

import com.kv.annotation.Protected;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dummy2 implements Serializable{

    @Protected
    private String value2;

    private Dummy3 test3;
}
