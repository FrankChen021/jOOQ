/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_2025Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_2025Record> implements org.jooq.Record2<java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -1087603247;

	/**
	 * Setter for <code>test.x_test_case_2025.ref_id</code>. 
	 */
	public void setRefId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>test.x_test_case_2025.ref_id</code>. 
	 */
	public java.lang.Integer getRefId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>test.x_test_case_2025.ref_name</code>. 
	 */
	public void setRefName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>test.x_test_case_2025.ref_name</code>. 
	 */
	public java.lang.String getRefName() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.ingres.generatedclasses.tables.XTestCase_2025.REF_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.ingres.generatedclasses.tables.XTestCase_2025.REF_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getRefId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getRefName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_2025Record
	 */
	public XTestCase_2025Record() {
		super(org.jooq.test.ingres.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025);
	}

	/**
	 * Create a detached, initialised XTestCase_2025Record
	 */
	public XTestCase_2025Record(java.lang.Integer refId, java.lang.String refName) {
		super(org.jooq.test.ingres.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025);

		setValue(0, refId);
		setValue(1, refName);
	}
}
