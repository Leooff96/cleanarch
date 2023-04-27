package com.cleanarch.adapter.data.entities

import io.micronaut.serde.annotation.Serdeable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Serdeable
@Entity
@Table(name = "retailer")
data class RetailerEntity(

    @field:Id
    val retailer_name: String,
    val retailer_city: String
)
