package com.example;

import io.micronaut.core.annotation.Introspected;
import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * Control: the same record, using its generated builder only inside a method
 * body, so no signature names a type generated in the same compilation.
 */
@Introspected
@RecordBuilder
public record RecordWithRecordFactory(String name) {

    public static RecordWithRecordFactory named(String name) {
        return RecordWithRecordFactoryBuilder.builder().name(name).build();
    }
}
