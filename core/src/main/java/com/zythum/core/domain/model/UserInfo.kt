package com.zythum.core.domain.model

data class UserInfo(
    val name: String,
    val lastName: String,
    val age: Int,
    val weight: Float,
    val height: Int,
    val city: String,
    val state: String,
    val zipCode: Long,
)
