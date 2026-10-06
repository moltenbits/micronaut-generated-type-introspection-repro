package com.example;

import io.micronaut.core.annotation.Introspected;

/**
 * Control: an introspected record, not serializable, holding a record whose
 * static factory returns a generated type.
 */
@Introspected
public record IntrospectedHolder(RecordWithBuilderFactory item) {}
