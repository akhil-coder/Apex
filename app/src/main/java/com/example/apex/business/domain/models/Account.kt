package com.example.apex.business.domain.models

import androidx.room.Entity

@Entity
data class Account(
    val pk: Int,
    val email: String,
    val username: String
)









