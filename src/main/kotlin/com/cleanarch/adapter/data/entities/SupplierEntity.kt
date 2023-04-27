package com.cleanarch.adapter.data.entities

import io.micronaut.serde.annotation.Serdeable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Serdeable
@Entity
@Table(name = "supplier")
data class SupplierEntity(
    @field:Id
    val supplier_name: String,
    val supplier_city: String
)