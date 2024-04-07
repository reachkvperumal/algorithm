package com.kv.dto;

import com.kv.annotation.Protected;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dummy1 implements Serializable {

    @Protected
    private String test1;


    private Dummy2 test2;
}
