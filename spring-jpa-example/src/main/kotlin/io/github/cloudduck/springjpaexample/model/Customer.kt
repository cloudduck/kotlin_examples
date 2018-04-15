package io.github.cloudduck.springjpaexample.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by cloudduck on 1/28/2018.
 */
@Entity
class Customer(
        var firstName: String = "",
        var lastName: String = "",
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0
)