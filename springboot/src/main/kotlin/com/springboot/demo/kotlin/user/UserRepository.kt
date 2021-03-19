package com.springboot.demo.kotlin.user

import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long> {
    fun findByUsername(username: String): Iterable<User>
}