/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

/**
 * This class is generated by jOOQ.
 *
 * Description of named collection types accessible to the user
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class AllCollTypes extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -2014095779;

	/**
	 * The singleton instance of SYS.ALL_COLL_TYPES
	 */
	public static final org.jooq.util.oracle.sys.tables.AllCollTypes ALL_COLL_TYPES = new org.jooq.util.oracle.sys.tables.AllCollTypes();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * Owner of the type
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name of the type
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Collection type
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLL_TYPE = createField("COLL_TYPE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Size of the FIXED ARRAY type or maximum size of the VARYING ARRAY type
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> UPPER_BOUND = createField("UPPER_BOUND", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Type modifier of the element
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ELEM_TYPE_MOD = createField("ELEM_TYPE_MOD", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Owner of the type of the element
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ELEM_TYPE_OWNER = createField("ELEM_TYPE_OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name of the type of the element
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ELEM_TYPE_NAME = createField("ELEM_TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Length of the CHAR element or maximum length of the VARCHAR
or VARCHAR2 element
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> LENGTH = createField("LENGTH", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Decimal precision of the NUMBER or DECIMAL element or
binary precision of the FLOAT element
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> PRECISION = createField("PRECISION", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Scale of the NUMBER or DECIMAL element
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> SCALE = createField("SCALE", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Character set name of the element
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Storage optimization specification for VARRAY of numeric elements
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ELEM_STORAGE = createField("ELEM_STORAGE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Is null information stored with each VARRAY element?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NULLS_STORED = createField("NULLS_STORED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * C if the width was specified in characters, B if in bytes
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHAR_USED = createField("CHAR_USED", org.jooq.impl.SQLDataType.VARCHAR, this);

	public AllCollTypes() {
		super("ALL_COLL_TYPES", org.jooq.util.oracle.sys.Sys.SYS);
	}

	public AllCollTypes(java.lang.String alias) {
		super(alias, org.jooq.util.oracle.sys.Sys.SYS, org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES);
	}

	@Override
	public org.jooq.util.oracle.sys.tables.AllCollTypes as(java.lang.String alias) {
		return new org.jooq.util.oracle.sys.tables.AllCollTypes(alias);
	}
}
