package com.springboot.demo.kotlin.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val repository: UserRepository) {

    @GetMapping("/users")
    fun findAll() = repository.findAll()

    @GetMapping("/users/{username}")
    fun findByUsername(@PathVariable username: String) = repository.findByUsername(username)
}