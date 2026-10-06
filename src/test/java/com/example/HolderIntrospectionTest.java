package com.example;

import io.micronaut.core.beans.BeanIntrospection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HolderIntrospectionTest {

    @Test
    void serdeableRecordHoldingARecordWhoseStaticMethodReturnsAGeneratedTypeIsIntrospected() {
        BeanIntrospection<SerdeableHolder> introspection =
            BeanIntrospection.getIntrospection(SerdeableHolder.class);

        assertEquals("widget",
            introspection.instantiate(new SerdeableRecordWithBuilderFactory("widget")).item().name());
    }

    @Test
    void introspectedRecordHoldingARecordWhoseStaticMethodReturnsAGeneratedTypeIsIntrospected() {
        BeanIntrospection<IntrospectedHolder> introspection =
            BeanIntrospection.getIntrospection(IntrospectedHolder.class);

        assertEquals("widget",
            introspection.instantiate(new RecordWithBuilderFactory("widget")).item().name());
    }
}
