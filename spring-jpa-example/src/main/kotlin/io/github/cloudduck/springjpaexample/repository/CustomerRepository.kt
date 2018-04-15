package io.github.cloudduck.springjpaexample.repository

import io.github.cloudduck.springjpaexample.model.Customer
import org.springframework.data.repository.CrudRepository

/**
 * Created by cloudduck on 1/28/2018.
 */
interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLastName(name: String): List<Customer>
}