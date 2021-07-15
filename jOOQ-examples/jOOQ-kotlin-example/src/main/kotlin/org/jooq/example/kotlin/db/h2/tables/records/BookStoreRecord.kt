/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.kotlin.db.h2.tables.records


import org.jooq.Field
import org.jooq.Record1
import org.jooq.Row1
import org.jooq.example.kotlin.db.h2.tables.BookStore
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class BookStoreRecord() : UpdatableRecordImpl<BookStoreRecord>(BookStore.BOOK_STORE), Record1<String?> {

    var name: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row1<String?> = super.fieldsRow() as Row1<String?>
    override fun valuesRow(): Row1<String?> = super.valuesRow() as Row1<String?>
    override fun field1(): Field<String?> = BookStore.BOOK_STORE.NAME
    override fun component1(): String? = name
    override fun value1(): String? = name

    override fun value1(value: String?): BookStoreRecord {
        this.name = value
        return this
    }

    override fun values(value1: String?): BookStoreRecord {
        this.value1(value1)
        return this
    }

    /**
     * Create a detached, initialised BookStoreRecord
     */
    constructor(name: String? = null): this() {
        this.name = name
    }

    /**
     * Create a detached, initialised BookStoreRecord
     */
    constructor(value: org.jooq.example.kotlin.db.h2.tables.pojos.BookStore?): this() {
        if (value != null) {
            this.name = value.name
        }
    }
}
