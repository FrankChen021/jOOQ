/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_64_69Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_64_69Record> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer>, org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_64_69 {

	private static final long serialVersionUID = -1676481011;

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_64_69.ID</code>
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_64_69.ID</code>
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.ID);
	}

	/**
	 * Fetch a list of <code>PUBLIC.X_TEST_CASE_71</code> referencing this <code>PUBLIC.X_TEST_CASE_64_69</code>
	 */
	public org.jooq.Result<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_71Record> fetchXTestCase_71List() {
		return create()
			.selectFrom(org.jooq.test.h2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71)
			.where(org.jooq.test.h2.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID.equal(getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.ID, Short.class)))
			.fetch();
	}

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_64_69.UNUSED_ID</code>
	 */
	@Override
	public void setUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.UNUSED_ID, value);
	}

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_64_69.UNUSED_ID</code>
	 */
	@Override
	public java.lang.Integer getUnusedId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.UNUSED_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.h2.generatedclasses.tables.records.XUnusedRecord}
	 */
	public void setUnusedId(org.jooq.test.h2.generatedclasses.tables.records.XUnusedRecord value) {
		if (value == null) {
			setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.UNUSED_ID, null);
		}
		else {
			setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.UNUSED_ID, value.getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.ID));
		}
	}

	/**
	 * Fetch a <code>PUBLIC.X_UNUSED</code> referenced by this <code>PUBLIC.X_TEST_CASE_64_69</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.h2.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.h2.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.UNUSED_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
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
		return org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.UNUSED_ID;
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
		return getUnusedId();
	}
}
