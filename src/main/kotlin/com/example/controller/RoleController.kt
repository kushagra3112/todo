package com.example.controller

import com.example.entity.ResponseModel
import com.example.entity.Roles
import com.example.services.RolesService
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/roles")
class RolesController() {

    private var rolesServices: RolesService = RolesService()

    @Get(value = "/all", produces = [MediaType.APPLICATION_JSON])
    fun getAllRoles() : HttpResponse<ResponseModel<MutableIterable<Roles>>> {
        return try {
           HttpResponse.ok(ResponseModel.Success(rolesServices.getAllRoles()))
        }
        catch (e : Exception){
            HttpResponse.ok(
                ResponseModel.Error(e.toString(), null)
            )
        }
    }
}