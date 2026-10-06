package com.example;

import io.micronaut.serde.annotation.Serdeable;

/**
 * A serializable record with no static methods of its own, holding a
 * serializable record whose static factory returns a generated type.
 */
@Serdeable
public record SerdeableHolder(SerdeableRecordWithBuilderFactory item) {}
