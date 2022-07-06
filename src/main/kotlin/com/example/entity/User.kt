package com.example.entity

import io.micronaut.data.annotation.*
import io.micronaut.data.annotation.event.PreUpdate
import org.jetbrains.annotations.NotNull
import java.sql.Timestamp

@MappedEntity(value = "users")
data class User(
    @field:Id
    @NotNull
    val id: Int,
    val firstName: String,
    val lastName: String,
    val username: String,
    val password: String,
    val email: String,
    val mobile: Int,
    val roleId: Int,
    @DateCreated
    val created_at: Timestamp,
    val updated_at: Timestamp,
    val deleted_at: Timestamp
)