package com.example.repo

import com.example.entity.Roles
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.Version
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository

@JdbcRepository(dialect = Dialect.MYSQL)
interface RoleRepository : CrudRepository<Roles, Long> {

}