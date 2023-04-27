package com.cleanarch.adapter.data.repository

import com.cleanarch.adapter.data.entities.CompanyEntity
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface CompanyRepository: CrudRepository<CompanyEntity, String> {
}