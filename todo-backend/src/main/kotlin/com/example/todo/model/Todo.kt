package com.example.model

import jakarta.persistence.*

@Entity
data class Todo(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var title: String,
    var completed: Boolean = false
)
