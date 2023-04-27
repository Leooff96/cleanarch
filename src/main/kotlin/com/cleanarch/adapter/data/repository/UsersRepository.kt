package com.cleanarch.adapter.data.repository

import com.cleanarch.adapter.data.entities.UsersEntity
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import java.util.Optional
import java.util.UUID


@Repository
interface UsersRepository : CrudRepository<UsersEntity, String> {
}