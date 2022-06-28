package com.example.entity

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import org.jetbrains.annotations.NotNull

@MappedEntity(value = "roles")
data class Roles(
    @field:Id
    @NotNull
    var id: Int,
    var name: String
)