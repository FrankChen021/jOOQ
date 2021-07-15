/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.kotlin.db.h2.tables.records


import java.time.LocalDate

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record6
import org.jooq.Row6
import org.jooq.example.kotlin.db.h2.tables.Author
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class AuthorRecord() : UpdatableRecordImpl<AuthorRecord>(Author.AUTHOR), Record6<Int?, String?, String?, LocalDate?, Int?, String?> {

    var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    var firstName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var lastName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    var dateOfBirth: LocalDate?
        set(value): Unit = set(3, value)
        get(): LocalDate? = get(3) as LocalDate?

    var yearOfBirth: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    var address: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row6<Int?, String?, String?, LocalDate?, Int?, String?> = super.fieldsRow() as Row6<Int?, String?, String?, LocalDate?, Int?, String?>
    override fun valuesRow(): Row6<Int?, String?, String?, LocalDate?, Int?, String?> = super.valuesRow() as Row6<Int?, String?, String?, LocalDate?, Int?, String?>
    override fun field1(): Field<Int?> = Author.AUTHOR.ID
    override fun field2(): Field<String?> = Author.AUTHOR.FIRST_NAME
    override fun field3(): Field<String?> = Author.AUTHOR.LAST_NAME
    override fun field4(): Field<LocalDate?> = Author.AUTHOR.DATE_OF_BIRTH
    override fun field5(): Field<Int?> = Author.AUTHOR.YEAR_OF_BIRTH
    override fun field6(): Field<String?> = Author.AUTHOR.ADDRESS
    override fun component1(): Int? = id
    override fun component2(): String? = firstName
    override fun component3(): String? = lastName
    override fun component4(): LocalDate? = dateOfBirth
    override fun component5(): Int? = yearOfBirth
    override fun component6(): String? = address
    override fun value1(): Int? = id
    override fun value2(): String? = firstName
    override fun value3(): String? = lastName
    override fun value4(): LocalDate? = dateOfBirth
    override fun value5(): Int? = yearOfBirth
    override fun value6(): String? = address

    override fun value1(value: Int?): AuthorRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): AuthorRecord {
        this.firstName = value
        return this
    }

    override fun value3(value: String?): AuthorRecord {
        this.lastName = value
        return this
    }

    override fun value4(value: LocalDate?): AuthorRecord {
        this.dateOfBirth = value
        return this
    }

    override fun value5(value: Int?): AuthorRecord {
        this.yearOfBirth = value
        return this
    }

    override fun value6(value: String?): AuthorRecord {
        this.address = value
        return this
    }

    override fun values(value1: Int?, value2: String?, value3: String?, value4: LocalDate?, value5: Int?, value6: String?): AuthorRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        return this
    }

    /**
     * Create a detached, initialised AuthorRecord
     */
    constructor(id: Int? = null, firstName: String? = null, lastName: String? = null, dateOfBirth: LocalDate? = null, yearOfBirth: Int? = null, address: String? = null): this() {
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
        this.dateOfBirth = dateOfBirth
        this.yearOfBirth = yearOfBirth
        this.address = address
    }

    /**
     * Create a detached, initialised AuthorRecord
     */
    constructor(value: org.jooq.example.kotlin.db.h2.tables.pojos.Author?): this() {
        if (value != null) {
            this.id = value.id
            this.firstName = value.firstName
            this.lastName = value.lastName
            this.dateOfBirth = value.dateOfBirth
            this.yearOfBirth = value.yearOfBirth
            this.address = value.address
        }
    }
}
