/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class T_959 extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.T_959Record> {

	private static final long serialVersionUID = -1647588255;

	/**
	 * The singleton instance of <code>test2.t_959</code>
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.T_959 T_959 = new org.jooq.test.mysql2.generatedclasses.tables.T_959();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.T_959Record> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.T_959Record.class;
	}

	/**
	 * The column <code>test2.t_959.java_keywords</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_959Record, org.jooq.test.mysql2.generatedclasses.enums.T_959JavaKeywords> JAVA_KEYWORDS = createField("java_keywords", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql2.generatedclasses.enums.T_959JavaKeywords.class), this);

	/**
	 * The column <code>test2.t_959.special_characters</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_959Record, org.jooq.test.mysql2.generatedclasses.enums.T_959SpecialCharacters> SPECIAL_CHARACTERS = createField("special_characters", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql2.generatedclasses.enums.T_959SpecialCharacters.class), this);

	/**
	 * Create a <code>test2.t_959</code> table reference
	 */
	public T_959() {
		super("t_959", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * Create an aliased <code>test2.t_959</code> table reference
	 */
	public T_959(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.T_959.T_959);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.T_959 as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.T_959(alias);
	}
}
