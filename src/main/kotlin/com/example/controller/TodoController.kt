package com.example.controller

import com.example.services.TodoService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/todo")
class TodoController {

    private var todoServices: TodoService = TodoService()

    @Get(value = "/all", produces = [MediaType.APPLICATION_JSON])
    fun getAllTodos() : String {
        return try {
            todoServices.getAllRoles().toString()
        }
        catch (e : Exception){
            e.toString()
        }
    }
}