package com.example.services

import com.example.entity.Roles
import com.example.repo.RoleRepository
import io.micronaut.context.annotation.Bean
import javax.inject.Inject

@Bean
class RolesService {
    @Inject
    lateinit var roleRepository: RoleRepository

    fun getAllRoles(): MutableIterable<Roles> {
        return roleRepository.findAll()
    }
}