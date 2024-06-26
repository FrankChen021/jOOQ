/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.flyway.ddl.db.h2;


import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.flyway.ddl.db.h2.tables.Author;
import org.jooq.example.flyway.ddl.db.h2.tables.Book;
import org.jooq.example.flyway.ddl.db.h2.tables.records.AuthorRecord;
import org.jooq.example.flyway.ddl.db.h2.tables.records.BookRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * FLYWAY_TEST.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> PK_T_AUTHOR = Internal.createUniqueKey(Author.AUTHOR, DSL.name("PK_T_AUTHOR"), new TableField[] { Author.AUTHOR.ID }, true);
    public static final UniqueKey<BookRecord> PK_T_BOOK = Internal.createUniqueKey(Book.BOOK, DSL.name("PK_T_BOOK"), new TableField[] { Book.BOOK.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_AUTHOR_ID = Internal.createForeignKey(Book.BOOK, DSL.name("FK_T_BOOK_AUTHOR_ID"), new TableField[] { Book.BOOK.AUTHOR_ID }, Keys.PK_T_AUTHOR, new TableField[] { Author.AUTHOR.ID }, true);
}
