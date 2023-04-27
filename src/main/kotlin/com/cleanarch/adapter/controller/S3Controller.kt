package com.cleanarch.adapter.controller

import com.cleanarch.adapter.data.entities.UsersEntity
import com.cleanarch.adapter.data.repository.UsersRepository
import com.cleanarch.core.logger.LoggerClass
import io.micronaut.http.HttpHeaders
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import java.util.UUID


@Controller("s3")
class S3Controller( private val usersRepository: UsersRepository) {

    @Get
    fun get(headers: HttpHeaders): String {
        usersRepository.save(UsersEntity(
            username = "Leonardo",
            email = "leo@gmail.com",
            password = "1230"
        ))
        return ""
    }

    companion object : LoggerClass()
}