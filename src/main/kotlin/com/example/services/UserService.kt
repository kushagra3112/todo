package com.example.services

import com.example.entity.User
import com.example.repo.UserRepo
import io.micronaut.context.annotation.Bean
import javax.inject.Inject

@Bean
class UserService {
    @Inject
    lateinit var userRepository: UserRepo

    fun getAllRoles(): MutableIterable<User> {
        return userRepository.findAll()
    }
}