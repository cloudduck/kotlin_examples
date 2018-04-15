package io.github.cloudduck.springjpaexample.controller

import io.github.cloudduck.springjpaexample.repository.CustomerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * Created by cloudduck on 1/28/2018.
 */
@RestController
class CustomerController(val repository: CustomerRepository) {

    @GetMapping("/findAll")
    fun findAll() = repository.findAll()

    @GetMapping("/findByLastName/{name}")
    fun findByLastName(@PathVariable name: String)
            = repository.findByLastName(name)
}