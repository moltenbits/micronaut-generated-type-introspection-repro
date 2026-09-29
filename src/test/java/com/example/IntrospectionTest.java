package com.example;

import io.micronaut.core.beans.BeanIntrospection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntrospectionTest {

    @Test
    void recordWhoseStaticMethodReturnsAGeneratedTypeIsIntrospected() {
        BeanIntrospection<RecordWithBuilderFactory> introspection =
            BeanIntrospection.getIntrospection(RecordWithBuilderFactory.class);

        assertEquals("widget", introspection.instantiate("widget").name());
    }

    @Test
    void recordThatUsesItsGeneratedTypeOnlyInAMethodBodyIsIntrospected() {
        BeanIntrospection<RecordWithRecordFactory> introspection =
            BeanIntrospection.getIntrospection(RecordWithRecordFactory.class);

        assertEquals("widget", introspection.instantiate("widget").name());
    }
}
