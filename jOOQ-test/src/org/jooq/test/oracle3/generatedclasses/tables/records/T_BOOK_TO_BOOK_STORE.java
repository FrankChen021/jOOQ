/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_TO_BOOK_STORE", schema = "TEST", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"BOOK_STORE_NAME", "BOOK_ID"})
})
public class T_BOOK_TO_BOOK_STORE extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE> implements java.lang.Cloneable, org.jooq.Record3<java.lang.String, java.lang.Integer, java.lang.Integer>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOK_TO_BOOK_STORE_INTERFACE {

	private static final long serialVersionUID = 1028421179;

	/**
	 * The book store name
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_BS_NAME
	 * FOREIGN KEY (BOOK_STORE_NAME)
	 * REFERENCES TEST.T_BOOK_STORE (NAME)
	 * </pre></code>
	 */
	@Override
	public void setBOOK_STORE_NAME(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, value);
	}

	/**
	 * The book store name
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_BS_NAME
	 * FOREIGN KEY (BOOK_STORE_NAME)
	 * REFERENCES TEST.T_BOOK_STORE (NAME)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "BOOK_STORE_NAME", nullable = false, length = 400)
	@Override
	public java.lang.String getBOOK_STORE_NAME() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE 
	 * T_BOOK_STORE}
	 */
	public void setBOOK_STORE_NAME(org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE value) {
		if (value == null) {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, null);
		}
		else {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, value.getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE.T_BOOK_STORE.NAME));
		}
	}

	/**
	 * The book store name
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_BS_NAME
	 * FOREIGN KEY (BOOK_STORE_NAME)
	 * REFERENCES TEST.T_BOOK_STORE (NAME)
	 * </pre></code>
	 */
	public org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE fetchT_BOOK_STORE() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE.T_BOOK_STORE)
			.where(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE.T_BOOK_STORE.NAME.equal(getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME)))
			.fetchOne();
	}

	/**
	 * The book ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_B_ID
	 * FOREIGN KEY (BOOK_ID)
	 * REFERENCES TEST.T_BOOK (ID)
	 * </pre></code>
	 */
	@Override
	public void setBOOK_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_ID, value);
	}

	/**
	 * The book ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_B_ID
	 * FOREIGN KEY (BOOK_ID)
	 * REFERENCES TEST.T_BOOK (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "BOOK_ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getBOOK_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK 
	 * T_BOOK}
	 */
	public void setBOOK_ID(org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK value) {
		if (value == null) {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_ID, null);
		}
		else {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_ID, value.getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.ID));
		}
	}

	/**
	 * The book ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_B_ID
	 * FOREIGN KEY (BOOK_ID)
	 * REFERENCES TEST.T_BOOK (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK fetchT_BOOK() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK)
			.where(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.ID.equal(getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_ID)))
			.fetchOne();
	}

	/**
	 * The number of books on stock
	 */
	@Override
	public void setSTOCK(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.STOCK, value);
	}

	/**
	 * The number of books on stock
	 */
	@javax.persistence.Column(name = "STOCK", precision = 7)
	@Override
	public java.lang.Integer getSTOCK() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.STOCK);
	}

	/**
	 * Create a detached T_BOOK_TO_BOOK_STORE
	 */
	public T_BOOK_TO_BOOK_STORE() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.STOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getBOOK_STORE_NAME();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getBOOK_ID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getSTOCK();
	}
}
