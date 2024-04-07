package com.kv.dto;


import com.kv.annotation.Protected;
import lombok.Data;

import java.io.Serializable;

@Data
public class Dummy3 implements Serializable {

    @Protected
    private String value3;

}
