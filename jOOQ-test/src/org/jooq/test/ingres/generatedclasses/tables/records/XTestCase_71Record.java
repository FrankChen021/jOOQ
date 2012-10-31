/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_71Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_71Record> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -998385380;

	/**
	 * The table column <code>test.x_test_case_71.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.ID, value);
	}

	/**
	 * The table column <code>test.x_test_case_71.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.ID);
	}

	/**
	 * The table column <code>test.x_test_case_71.test_case_64_69_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_test_case_71
	 * FOREIGN KEY (test_case_64_69_id)
	 * REFERENCES test.x_test_case_64_69 (id)
	 * </pre></code>
	 */
	public void setTestCase_64_69Id(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * The table column <code>test.x_test_case_71.test_case_64_69_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_test_case_71
	 * FOREIGN KEY (test_case_64_69_id)
	 * REFERENCES test.x_test_case_64_69 (id)
	 * </pre></code>
	 */
	public java.lang.Integer getTestCase_64_69Id() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_64_69Record 
	 * XTestCase_64_69Record}
	 */
	public void setTestCase_64_69Id(org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_64_69Record value) {
		if (value == null) {
			setValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID, null);
		}
		else {
			setValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID, value.getValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_64_69.ID));
		}
	}

	/**
	 * The table column <code>test.x_test_case_71.test_case_64_69_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_test_case_71
	 * FOREIGN KEY (test_case_64_69_id)
	 * REFERENCES test.x_test_case_64_69 (id)
	 * </pre></code>
	 */
	public org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_64_69Record fetchXTestCase_64_69() {
		return create()
			.selectFrom(org.jooq.test.ingres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.ingres.generatedclasses.tables.XTestCase_64_69.ID.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_71Record
	 */
	public XTestCase_71Record() {
		super(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID;
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
	public java.lang.Integer value2() {
		return getTestCase_64_69Id();
	}
}
