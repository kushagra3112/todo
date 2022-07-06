package com.example.entity

sealed class ResponseModel<T>(
    val data: T?,
    val error: String?
) {

    class Success<T>(data: T) : ResponseModel<T>( data, null)

    class Error<T>(message: String?, error: String? = null) : ResponseModel<T>(null, error)
}