package com.cleanarch.adapter.data.entities

import io.micronaut.serde.annotation.Serdeable
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Serdeable
@Entity
@Table(name = "employee")
data class EmployeeEntity(
    @field:Id
    val employee_id: String,
    val employee_name: String,
    val street: String,
    val city: String,
    val sex: String,
    val bdate: LocalDate
)
