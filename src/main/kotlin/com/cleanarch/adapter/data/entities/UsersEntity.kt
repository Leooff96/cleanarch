package com.cleanarch.adapter.data.entities

import io.micronaut.data.annotation.AutoPopulated
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.serde.annotation.Serdeable
import java.util.UUID
import javax.persistence.*

@Serdeable
@Entity
@Table(name = "users")
data class UsersEntity(
    @field:Id
    @AutoPopulated
    val id: String = UUID.randomUUID().toString(),
    val username: String,
    val email: String,
    val password: String
)
