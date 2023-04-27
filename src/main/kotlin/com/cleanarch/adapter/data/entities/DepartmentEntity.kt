package com.cleanarch.adapter.data.entities

import io.micronaut.serde.annotation.Serdeable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Serdeable
@Entity
@Table(name = "department")
data class DepartmentEntity(
    @field:Id
    val department_id: String,
    val company_name: String
)
