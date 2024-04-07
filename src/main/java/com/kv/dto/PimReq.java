package com.kv.dto;

import com.kv.annotation.Protected;

import java.io.Serializable;

public class PimReq implements Serializable {

    private FilePreference filePreference;

    @Protected
    private Secure secure;

}
