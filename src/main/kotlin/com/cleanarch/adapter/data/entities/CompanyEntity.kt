package com.cleanarch.adapter.data.entities

import io.micronaut.serde.annotation.Serdeable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Serdeable
@Entity
@Table(name = "company")
data class CompanyEntity(
    @field:Id
    val company_name: String,
    val city: String
)
