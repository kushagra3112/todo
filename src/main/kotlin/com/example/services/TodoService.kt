package com.example.services

import com.example.entity.Todo
import com.example.repo.TodoRepo
import io.micronaut.context.annotation.Bean
import javax.inject.Inject

@Bean
class TodoService {
    @Inject
    lateinit var todoRepository: TodoRepo

    fun getAllRoles(): MutableIterable<Todo> {
        return todoRepository.findAll()
    }
}