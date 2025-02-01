package com.kv.serialization;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.kv.dto.om.Animal;
import com.kv.dto.Cat;
import com.kv.dto.Dog;

public class CustomPolymorphicValidator extends PolymorphicTypeValidator.Base {

    @Override
    public Validity validateBaseType(MapperConfig<?> config, JavaType baseType) {
        if (baseType.getRawClass() == Animal.class) {
            return Validity.ALLOWED;
        }
        return Validity.INDETERMINATE;
    }

    @Override
    public Validity validateSubClassName(MapperConfig<?> config, JavaType baseType, String subClassName) {
        if (subClassName.startsWith("com.kv")) {
            return Validity.ALLOWED;
        }
        return Validity.INDETERMINATE;
    }

    @Override
    public Validity validateSubType(MapperConfig<?> config, JavaType baseType, JavaType subType) {
        if (subType.getRawClass() == Dog.class || subType.getRawClass() == Cat.class) {
            return Validity.ALLOWED;
        }
        return Validity.DENIED;
    }
}
