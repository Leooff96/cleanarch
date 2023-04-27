package com.cleanarch.adapter.data.entities

import io.micronaut.serde.annotation.Serdeable
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Embeddable
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

@Serdeable
@Entity
@Table(name = "purchases")
data class PurchasesEntity(
    @EmbeddedId
    val purchasesId: PurchasesId,
    val purchase_date: LocalDateTime,
    val purchase_cost: BigDecimal,
    val ingredient_name: String,
    val ingredient_quantity: Int
)

@Embeddable
data class PurchasesId(val company_name: String, val supplier_name: String): java.io.Serializable