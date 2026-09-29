package com.example;

import io.micronaut.core.annotation.Introspected;
import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * A record whose static factory returns {@code RecordWithBuilderFactoryBuilder},
 * a type RecordBuilder's annotation processor generates in the same compilation.
 */
@Introspected
@RecordBuilder
public record RecordWithBuilderFactory(String name) {

    public static RecordWithBuilderFactoryBuilder named(String name) {
        return RecordWithBuilderFactoryBuilder.builder().name(name);
    }
}
