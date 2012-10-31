/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_71Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_71Record> implements org.jooq.Record2<java.lang.Integer, java.lang.Short>, org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IXTestCase_71 {

	private static final long serialVersionUID = 1501333620;

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_71.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_71.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.ID);
	}

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES PUBLIC.X_TEST_CASE_64_69 (ID)
	 * </pre></code>
	 */
	@Override
	public void setTestCase_64_69Id(java.lang.Short value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES PUBLIC.X_TEST_CASE_64_69 (ID)
	 * </pre></code>
	 */
	@Override
	public java.lang.Short getTestCase_64_69Id() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_64_69Record 
	 * XTestCase_64_69Record}
	 */
	public void setTestCase_64_69Id(org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_64_69Record value) {
		if (value == null) {
			setValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID, null);
		}
		else {
			setValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID, value.getValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID, Short.class));
		}
	}

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES PUBLIC.X_TEST_CASE_64_69 (ID)
	 * </pre></code>
	 */
	public org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_64_69Record fetchXTestCase_64_69() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID, Integer.class)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_71Record
	 */
	public XTestCase_71Record() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Short> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Short> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field2() {
		return org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value2() {
		return getTestCase_64_69Id();
	}
}
