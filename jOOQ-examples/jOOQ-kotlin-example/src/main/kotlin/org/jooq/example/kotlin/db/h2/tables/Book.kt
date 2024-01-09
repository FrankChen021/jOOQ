/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.kotlin.db.h2.tables


import java.time.LocalDateTime

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.example.kotlin.db.h2.Public
import org.jooq.example.kotlin.db.h2.keys.FK_B2BS_B_ID
import org.jooq.example.kotlin.db.h2.keys.FK_T_BOOK_AUTHOR_ID
import org.jooq.example.kotlin.db.h2.keys.FK_T_BOOK_CO_AUTHOR_ID
import org.jooq.example.kotlin.db.h2.keys.PK_T_BOOK
import org.jooq.example.kotlin.db.h2.tables.Author.AuthorPath
import org.jooq.example.kotlin.db.h2.tables.BookStore.BookStorePath
import org.jooq.example.kotlin.db.h2.tables.BookToBookStore.BookToBookStorePath
import org.jooq.example.kotlin.db.h2.tables.records.BookRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Book(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, BookRecord>?,
    parentPath: InverseForeignKey<out Record, BookRecord>?,
    aliased: Table<BookRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<BookRecord>(
    alias,
    Public.PUBLIC,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>PUBLIC.BOOK</code>
         */
        val BOOK: Book = Book()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<BookRecord> = BookRecord::class.java

    /**
     * The column <code>PUBLIC.BOOK.ID</code>.
     */
    val ID: TableField<BookRecord, Int?> = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>PUBLIC.BOOK.AUTHOR_ID</code>.
     */
    val AUTHOR_ID: TableField<BookRecord, Int?> = createField(DSL.name("AUTHOR_ID"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>PUBLIC.BOOK.CO_AUTHOR_ID</code>.
     */
    val CO_AUTHOR_ID: TableField<BookRecord, Int?> = createField(DSL.name("CO_AUTHOR_ID"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>PUBLIC.BOOK.DETAILS_ID</code>.
     */
    val DETAILS_ID: TableField<BookRecord, Int?> = createField(DSL.name("DETAILS_ID"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>PUBLIC.BOOK.TITLE</code>.
     */
    val TITLE: TableField<BookRecord, String?> = createField(DSL.name("TITLE"), SQLDataType.VARCHAR(400).nullable(false), this, "")

    /**
     * The column <code>PUBLIC.BOOK.PUBLISHED_IN</code>.
     */
    val PUBLISHED_IN: TableField<BookRecord, Int?> = createField(DSL.name("PUBLISHED_IN"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>PUBLIC.BOOK.LANGUAGE_ID</code>.
     */
    val LANGUAGE_ID: TableField<BookRecord, Int?> = createField(DSL.name("LANGUAGE_ID"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>PUBLIC.BOOK.CONTENT_TEXT</code>.
     */
    val CONTENT_TEXT: TableField<BookRecord, String?> = createField(DSL.name("CONTENT_TEXT"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>PUBLIC.BOOK.CONTENT_PDF</code>.
     */
    val CONTENT_PDF: TableField<BookRecord, ByteArray?> = createField(DSL.name("CONTENT_PDF"), SQLDataType.BLOB, this, "")

    /**
     * The column <code>PUBLIC.BOOK.REC_VERSION</code>.
     */
    val REC_VERSION: TableField<BookRecord, Int?> = createField(DSL.name("REC_VERSION"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>PUBLIC.BOOK.REC_TIMESTAMP</code>.
     */
    val REC_TIMESTAMP: TableField<BookRecord, LocalDateTime?> = createField(DSL.name("REC_TIMESTAMP"), SQLDataType.LOCALDATETIME(6), this, "")

    private constructor(alias: Name, aliased: Table<BookRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<BookRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<BookRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>PUBLIC.BOOK</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>PUBLIC.BOOK</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>PUBLIC.BOOK</code> table reference
     */
    constructor(): this(DSL.name("BOOK"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, BookRecord>?, parentPath: InverseForeignKey<out Record, BookRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, BOOK, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class BookPath : Book, Path<BookRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, BookRecord>?, parentPath: InverseForeignKey<out Record, BookRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<BookRecord>): super(alias, aliased)
        override fun `as`(alias: String): BookPath = BookPath(DSL.name(alias), this)
        override fun `as`(alias: Name): BookPath = BookPath(alias, this)
        override fun `as`(alias: Table<*>): BookPath = BookPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<BookRecord, Int?> = super.getIdentity() as Identity<BookRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<BookRecord> = PK_T_BOOK
    override fun getReferences(): List<ForeignKey<BookRecord, *>> = listOf(FK_T_BOOK_AUTHOR_ID, FK_T_BOOK_CO_AUTHOR_ID)

    private lateinit var _fkTBookAuthorId: AuthorPath

    /**
     * Get the implicit join path to the <code>PUBLIC.AUTHOR</code> table, via
     * the <code>FK_T_BOOK_AUTHOR_ID</code> key.
     */
    fun fkTBookAuthorId(): AuthorPath {
        if (!this::_fkTBookAuthorId.isInitialized)
            _fkTBookAuthorId = AuthorPath(this, FK_T_BOOK_AUTHOR_ID, null)

        return _fkTBookAuthorId;
    }

    val fkTBookAuthorId: AuthorPath
        get(): AuthorPath = fkTBookAuthorId()

    private lateinit var _fkTBookCoAuthorId: AuthorPath

    /**
     * Get the implicit join path to the <code>PUBLIC.AUTHOR</code> table, via
     * the <code>FK_T_BOOK_CO_AUTHOR_ID</code> key.
     */
    fun fkTBookCoAuthorId(): AuthorPath {
        if (!this::_fkTBookCoAuthorId.isInitialized)
            _fkTBookCoAuthorId = AuthorPath(this, FK_T_BOOK_CO_AUTHOR_ID, null)

        return _fkTBookCoAuthorId;
    }

    val fkTBookCoAuthorId: AuthorPath
        get(): AuthorPath = fkTBookCoAuthorId()

    private lateinit var _bookToBookStore: BookToBookStorePath

    /**
     * Get the implicit to-many join path to the
     * <code>PUBLIC.BOOK_TO_BOOK_STORE</code> table
     */
    fun bookToBookStore(): BookToBookStorePath {
        if (!this::_bookToBookStore.isInitialized)
            _bookToBookStore = BookToBookStorePath(this, null, FK_B2BS_B_ID.inverseKey)

        return _bookToBookStore;
    }

    val bookToBookStore: BookToBookStorePath
        get(): BookToBookStorePath = bookToBookStore()

    /**
     * Get the implicit many-to-many join path to the
     * <code>PUBLIC.BOOK_STORE</code> table
     */
    val bookStore: BookStorePath
        get(): BookStorePath = bookToBookStore().bookStore()
    override fun `as`(alias: String): Book = Book(DSL.name(alias), this)
    override fun `as`(alias: Name): Book = Book(alias, this)
    override fun `as`(alias: Table<*>): Book = Book(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Book = Book(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Book = Book(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Book = Book(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Book = Book(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Book = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Book = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Book = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Book = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Book = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Book = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Book = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Book = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Book = where(DSL.notExists(select))
}
