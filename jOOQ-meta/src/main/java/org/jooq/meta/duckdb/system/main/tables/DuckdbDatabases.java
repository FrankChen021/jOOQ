/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.duckdb.system.main.tables;


import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.duckdb.system.main.Main;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class DuckdbDatabases extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>system.main.duckdb_databases</code>
     */
    public static final DuckdbDatabases DUCKDB_DATABASES = new DuckdbDatabases();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>system.main.duckdb_databases.database_name</code>.
     */
    public final TableField<Record, String> DATABASE_NAME = createField(DSL.name("database_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.main.duckdb_databases.database_oid</code>.
     */
    public final TableField<Record, Long> DATABASE_OID = createField(DSL.name("database_oid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>system.main.duckdb_databases.path</code>.
     */
    public final TableField<Record, String> PATH = createField(DSL.name("path"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.main.duckdb_databases.comment</code>.
     */
    public final TableField<Record, String> COMMENT = createField(DSL.name("comment"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.main.duckdb_databases.internal</code>.
     */
    public final TableField<Record, Boolean> INTERNAL = createField(DSL.name("internal"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>system.main.duckdb_databases.type</code>.
     */
    public final TableField<Record, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR, this, "");

    private DuckdbDatabases(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private DuckdbDatabases(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view(), where);
    }

    /**
     * Create an aliased <code>system.main.duckdb_databases</code> table
     * reference
     */
    public DuckdbDatabases(String alias) {
        this(DSL.name(alias), DUCKDB_DATABASES);
    }

    /**
     * Create an aliased <code>system.main.duckdb_databases</code> table
     * reference
     */
    public DuckdbDatabases(Name alias) {
        this(alias, DUCKDB_DATABASES);
    }

    /**
     * Create a <code>system.main.duckdb_databases</code> table reference
     */
    public DuckdbDatabases() {
        this(DSL.name("duckdb_databases"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Main.MAIN;
    }

    @Override
    public DuckdbDatabases as(String alias) {
        return new DuckdbDatabases(DSL.name(alias), this);
    }

    @Override
    public DuckdbDatabases as(Name alias) {
        return new DuckdbDatabases(alias, this);
    }

    @Override
    public DuckdbDatabases as(Table<?> alias) {
        return new DuckdbDatabases(alias.getQualifiedName(), this);
    }
}