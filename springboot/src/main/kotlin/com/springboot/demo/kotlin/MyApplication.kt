package com.springboot.demo.kotlin

import com.springboot.demo.kotlin.user.User
import com.springboot.demo.kotlin.user.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class MyApplication {

    private val log = LoggerFactory.getLogger(MyApplication::class.java)

    @Bean
    fun init(repository: UserRepository) = CommandLineRunner {
        repository.save(User("张一", "111"))
        repository.save(User("张二", "222"))
        repository.save(User("张三", "333"))

        log.info("Get users with findAll():")
        log.info("-------------------------")
        repository.findAll().forEach { log.info(it.toString()) }
        log.info("")

        // find user by ID
        val user = repository.findById(1L)
        user.ifPresent {
            log.info("Get user with findById(1L):")
            log.info("---------------------------")
            log.info(it.toString())
            log.info("")
        }
    }
}

fun main(args: Array<String>) {
    runApplication<MyApplication>(*args)
}