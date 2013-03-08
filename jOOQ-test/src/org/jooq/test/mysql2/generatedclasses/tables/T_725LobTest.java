/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class T_725LobTest extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = -1448171046;

	/**
	 * The singleton instance of <code>test2.t_725_lob_test</code>
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord.class;
	}

	/**
	 * The column <code>test2.t_725_lob_test.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>test2.t_725_lob_test.LOB</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * Create a <code>test2.t_725_lob_test</code> table reference
	 */
	public T_725LobTest() {
		super("t_725_lob_test", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * Create an aliased <code>test2.t_725_lob_test</code> table reference
	 */
	public T_725LobTest(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord> getPrimaryKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_725_LOB_TEST_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_725_LOB_TEST_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest(alias);
	}
}
