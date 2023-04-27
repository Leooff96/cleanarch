package com.cleanarch.adapter.data.entities

import io.micronaut.serde.annotation.Serdeable
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.Embeddable
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table


@Serdeable
@Entity
@Table(name = "sales")
data class SalesEntity(
    @EmbeddedId
    val salesId: SalesId,
    val sales_date: LocalDateTime,
    val sales_quantity: Int,
    val sales_cost: BigDecimal,
)

@Embeddable
data class SalesId(val product_id: String, val retailer_name: String) : java.io.Serializable