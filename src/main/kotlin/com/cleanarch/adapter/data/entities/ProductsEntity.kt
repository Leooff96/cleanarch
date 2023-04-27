package com.cleanarch.adapter.data.entities

import javax.persistence.Id

data class ProductsEntity(
    @field:Id
    val product_id: String,
    val product_name: String
)
