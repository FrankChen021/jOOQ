/**
 * This class is generated by jOOQ
 */
package org.jooq.util.maven.example.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class T_658_11 extends org.jooq.impl.UpdatableTableImpl<org.jooq.util.maven.example.tables.records.T_658_11Record> {

	private static final long serialVersionUID = 1017311504;

	/**
	 * The singleton instance of t_658_11
	 */
	public static final org.jooq.util.maven.example.tables.T_658_11 T_658_11 = new org.jooq.util.maven.example.tables.T_658_11();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.maven.example.tables.records.T_658_11Record> __RECORD_TYPE = org.jooq.util.maven.example.tables.records.T_658_11Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.maven.example.tables.records.T_658_11Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.util.maven.example.tables.records.T_658_11Record, java.lang.String> ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.maven.example.tables.records.T_658_11Record, java.lang.String>("id", org.jooq.impl.SQLDataType.CHAR, T_658_11);

	/**
	 * No further instances allowed
	 */
	private T_658_11() {
		super("t_658_11", org.jooq.util.maven.example.Public.PUBLIC);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.util.maven.example.tables.records.T_658_11Record> getMainKey() {
		return org.jooq.util.maven.example.Keys.pk_t_658_11;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.util.maven.example.tables.records.T_658_11Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.util.maven.example.tables.records.T_658_11Record>>asList(org.jooq.util.maven.example.Keys.pk_t_658_11);
	}
}
