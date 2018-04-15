package io.github.cloudduck.springjpaexample

import io.github.cloudduck.springjpaexample.model.Customer
import io.github.cloudduck.springjpaexample.repository.CustomerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringJpaExampleApplication {

    @Bean
    fun init(repository: CustomerRepository) = CommandLineRunner {
        repository.save(Customer("Jack", "Bauer"))
        repository.save(Customer("Chloe", "O'Brian"))
        repository.save(Customer("Kim", "Bauer"))
        repository.save(Customer("David", "Palmer"))
        repository.save(Customer("Michelle", "Dessler"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringJpaExampleApplication::class.java, *args)
}
