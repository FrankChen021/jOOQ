/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_71 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record> {

	private static final long serialVersionUID = 1084230352;

	/**
	 * The singleton instance of x_test_case_71
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.XTestCase_71 X_TEST_CASE_71 = new org.jooq.test.postgres.generatedclasses.tables.XTestCase_71();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record> __RECORD_TYPE = org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT x_test_case_71__fk_x_test_case_71
	 * FOREIGN KEY (test_case_64_69_id)
	 * REFERENCES public.x_test_case_64_69 (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record, java.lang.Short> TEST_CASE_64_69_ID = createField("test_case_64_69_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * No further instances allowed
	 */
	private XTestCase_71() {
		super("x_test_case_71", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * No further instances allowed
	 */
	private XTestCase_71(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record> getMainKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.pk_x_test_case_71;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record>>asList(org.jooq.test.postgres.generatedclasses.Keys.pk_x_test_case_71);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record, ?>>asList(org.jooq.test.postgres.generatedclasses.Keys.x_test_case_71__fk_x_test_case_71);
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.XTestCase_71 as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.XTestCase_71(alias);
	}
}
