package com.example.controller

import com.example.services.UserService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Get

class UserController {

    private var userServices: UserService = UserService()

    @Get(value = "/all", produces = [MediaType.APPLICATION_JSON])
    fun getAllUsers() : String {
        return try {
            userServices.getAllRoles().toString()
        }
        catch (e : Exception){
            e.toString()
        }
    }
}