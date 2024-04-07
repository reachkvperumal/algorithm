package com.kv.dto;


import com.kv.annotation.Protected;
import lombok.Data;

import java.io.Serializable;
@Data
public class FilePreference implements Serializable {

    @Protected
    private String conType;

    @Protected
    private Dummy1 dummy1;

}
