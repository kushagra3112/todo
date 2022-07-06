package com.example.entity

import io.micronaut.data.annotation.*
import io.micronaut.data.annotation.event.PreUpdate
import org.jetbrains.annotations.NotNull
import java.sql.Timestamp

@MappedEntity(value = "todos")
data class Todo(
    @field:Id
    @NotNull
    val id: Int = 0,
    val userId: Int,
    val title: String,
    val description: String,
    val dueDate: Timestamp?,
    val done: Int,
    @NotNull
    @DateCreated
    val createdAt: Timestamp,
    @DateUpdated
    var updatedAt: Timestamp?,
    val deletedAt: Timestamp?
) {
    @PreUpdate
    fun updateTime() {
        updatedAt = Timestamp(System.currentTimeMillis())
    }
}