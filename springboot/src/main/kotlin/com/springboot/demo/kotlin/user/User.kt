package com.springboot.demo.kotlin.user

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User(
    val username: String,
    val password: String,
    @Id @GeneratedValue
    val id: Long = -1
)