/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class Iiconstraints extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1937760754;

	/**
	 * The singleton instance of $ingres.iiconstraints
	 */
	public static final org.jooq.util.ingres.ingres.tables.Iiconstraints IICONSTRAINTS = new org.jooq.util.ingres.ingres.tables.Iiconstraints();

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
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMA_NAME = createField("schema_name", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_TYPE = createField("constraint_type", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> TEXT_SEQUENCE = createField("text_sequence", org.jooq.impl.SQLDataType.BIGINT, IICONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TEXT_SEGMENT = createField("text_segment", org.jooq.impl.SQLDataType.VARCHAR, IICONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SYSTEM_USE = createField("system_use", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private Iiconstraints() {
		super("iiconstraints", org.jooq.util.ingres.ingres.$ingres.$INGRES);
	}
}
