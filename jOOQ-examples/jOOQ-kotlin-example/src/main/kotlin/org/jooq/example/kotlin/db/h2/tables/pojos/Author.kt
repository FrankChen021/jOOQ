/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.kotlin.db.h2.tables.pojos


import java.io.Serializable
import java.time.LocalDate


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Author(
    var id: Int? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var dateOfBirth: LocalDate? = null,
    var yearOfBirth: Int? = null,
    var address: String? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("Author (")

        sb.append(id)
        sb.append(", ").append(firstName)
        sb.append(", ").append(lastName)
        sb.append(", ").append(dateOfBirth)
        sb.append(", ").append(yearOfBirth)
        sb.append(", ").append(address)

        sb.append(")")
        return sb.toString()
    }
}
