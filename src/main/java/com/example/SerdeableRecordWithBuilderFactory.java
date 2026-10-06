package com.example;

import io.micronaut.serde.annotation.Serdeable;
import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * A serializable record whose static factory returns
 * {@code SerdeableRecordWithBuilderFactoryBuilder}, a type RecordBuilder's
 * annotation processor generates in the same compilation.
 */
@Serdeable
@RecordBuilder
public record SerdeableRecordWithBuilderFactory(String name) {

    public static SerdeableRecordWithBuilderFactoryBuilder named(String name) {
        return SerdeableRecordWithBuilderFactoryBuilder.builder().name(name);
    }
}
