package com.example.services

import com.example.entity.Roles
import com.example.repo.RoleRepository
import io.micronaut.context.annotation.Bean

@Bean
class RolesServices {
    fun getAllRoles(roleRepository: RoleRepository): MutableIterable<Roles> {
        return roleRepository.findAll()
    }
}