package com.example.controller

import com.example.repo.RoleRepository
import com.example.services.RolesServices
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/roles")
class RolesController(private val roleRepository: RoleRepository) {

    private var rolesServices: RolesServices = RolesServices()

    @Get(value = "/all", produces = [MediaType.APPLICATION_JSON])
    fun getAllRoles() : String {
        return try {
            rolesServices.getAllRoles(roleRepository).toString()
        }
        catch (e : Exception){
            e.toString()
        }
    }
}