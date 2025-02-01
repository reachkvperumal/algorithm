package com.kv.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.kv.dto.om.LangObject;

public class PolymorphicBehaviour {

    private static void option1() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.activateDefaultTyping(new CustomPolymorphicValidator() , ObjectMapper.DefaultTyping.NON_FINAL);
        LangObject object = new LangObject("KV Perumal");
        System.out.println(objectMapper.writeValueAsString(object));
    }

    public static void main(String[] args) throws Exception {
        option1();
    }
}
