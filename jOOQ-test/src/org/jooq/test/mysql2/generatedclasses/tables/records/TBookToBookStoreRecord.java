/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_book_to_book_store", schema = "test2", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"book_store_name", "book_id"})
})
public class TBookToBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord> implements org.jooq.Record3<java.lang.String, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -1309073612;

	/**
	 * The book store name
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_b2bs_bs_name
	 * FOREIGN KEY (book_store_name)
	 * REFERENCES test2.t_book_store (name)
	 * </pre></code>
	 */
	public void setBookStoreName(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, value);
	}

	/**
	 * The book store name
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_b2bs_bs_name
	 * FOREIGN KEY (book_store_name)
	 * REFERENCES test2.t_book_store (name)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "book_store_name", nullable = false, length = 400)
	public java.lang.String getBookStoreName() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.mysql2.generatedclasses.tables.records.TBookStoreRecord 
	 * TBookStoreRecord}
	 */
	public void setBookStoreName(org.jooq.test.mysql2.generatedclasses.tables.records.TBookStoreRecord value) {
		if (value == null) {
			setValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, null);
		}
		else {
			setValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, value.getValue(org.jooq.test.mysql2.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME));
		}
	}

	/**
	 * The book store name
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_b2bs_bs_name
	 * FOREIGN KEY (book_store_name)
	 * REFERENCES test2.t_book_store (name)
	 * </pre></code>
	 */
	public org.jooq.test.mysql2.generatedclasses.tables.records.TBookStoreRecord fetchTBookStore() {
		return create()
			.selectFrom(org.jooq.test.mysql2.generatedclasses.tables.TBookStore.T_BOOK_STORE)
			.where(org.jooq.test.mysql2.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME.equal(getValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME)))
			.fetchOne();
	}

	/**
	 * The book ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_b2bs_b_id
	 * FOREIGN KEY (book_id)
	 * REFERENCES test2.t_book (ID)
	 * </pre></code>
	 */
	public void setBookId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID, value);
	}

	/**
	 * The book ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_b2bs_b_id
	 * FOREIGN KEY (book_id)
	 * REFERENCES test2.t_book (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "book_id", nullable = false, precision = 10)
	public java.lang.Integer getBookId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord 
	 * TBookRecord}
	 */
	public void setBookId(org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord value) {
		if (value == null) {
			setValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID, null);
		}
		else {
			setValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID, value.getValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.ID));
		}
	}

	/**
	 * The book ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_b2bs_b_id
	 * FOREIGN KEY (book_id)
	 * REFERENCES test2.t_book (ID)
	 * </pre></code>
	 */
	public org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord fetchTBook() {
		return create()
			.selectFrom(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.ID.equal(getValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID)))
			.fetchOne();
	}

	/**
	 * The number of books on stock
	 */
	public void setStock(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK, value);
	}

	/**
	 * The number of books on stock
	 */
	@javax.persistence.Column(name = "stock", precision = 10)
	public java.lang.Integer getStock() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK);
	}

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
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
		return org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getBookStoreName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getBookId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getStock();
	}
}
