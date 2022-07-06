package com.example.repo

import com.example.entity.Todo
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository

@JdbcRepository(dialect = Dialect.MYSQL)
interface TodoRepo : CrudRepository<Todo, Long> {

}