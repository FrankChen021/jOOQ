/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_986_1Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.db2.generatedclasses.tables.records.T_986_1Record> implements org.jooq.Record1<java.lang.Integer> {

	private static final long serialVersionUID = 2047632175;

	/**
	 * The table column <code>LUKAS.T_986_1.REF</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT T_986_1__FK_986
	 * FOREIGN KEY (REF)
	 * REFERENCES LUKAS.X_UNUSED (ID)
	 * </pre></code>
	 */
	public void setRef(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.T_986_1.REF, value);
	}

	/**
	 * The table column <code>LUKAS.T_986_1.REF</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT T_986_1__FK_986
	 * FOREIGN KEY (REF)
	 * REFERENCES LUKAS.X_UNUSED (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getRef() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.T_986_1.REF);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord 
	 * XUnusedRecord}
	 */
	public void setRef(org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord value) {
		if (value == null) {
			setValue(org.jooq.test.db2.generatedclasses.tables.T_986_1.REF, null);
		}
		else {
			setValue(org.jooq.test.db2.generatedclasses.tables.T_986_1.REF, value.getValue(org.jooq.test.db2.generatedclasses.tables.XUnused.ID));
		}
	}

	/**
	 * The table column <code>LUKAS.T_986_1.REF</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT T_986_1__FK_986
	 * FOREIGN KEY (REF)
	 * REFERENCES LUKAS.X_UNUSED (ID)
	 * </pre></code>
	 */
	public org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.db2.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.db2.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.db2.generatedclasses.tables.T_986_1.REF)))
			.fetchOne();
	}

	/**
	 * Create a detached T_986_1Record
	 */
	public T_986_1Record() {
		super(org.jooq.test.db2.generatedclasses.tables.T_986_1.T_986_1);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.db2.generatedclasses.tables.T_986_1.REF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getRef();
	}
}
