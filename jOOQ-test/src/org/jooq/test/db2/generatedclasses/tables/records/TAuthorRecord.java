/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TAuthorRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 272455763;

	/**
	 * The table column <code>LUKAS.T_AUTHOR.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.TAuthor.ID, value);
	}

	/**
	 * The table column <code>LUKAS.T_AUTHOR.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.TAuthor.ID);
	}

	/**
	 * The table column <code>LUKAS.T_AUTHOR.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord> fetchTBookListByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.db2.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.db2.generatedclasses.tables.TBook.AUTHOR_ID.equal(getValue(org.jooq.test.db2.generatedclasses.tables.TAuthor.ID)))
			.fetch();
	}

	/**
	 * The table column <code>LUKAS.T_AUTHOR.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord> fetchTBookListByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.db2.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.db2.generatedclasses.tables.TBook.CO_AUTHOR_ID.equal(getValue(org.jooq.test.db2.generatedclasses.tables.TAuthor.ID)))
			.fetch();
	}

	/**
	 * The table column <code>LUKAS.T_AUTHOR.FIRST_NAME</code>
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.TAuthor.FIRST_NAME, value);
	}

	/**
	 * The table column <code>LUKAS.T_AUTHOR.FIRST_NAME</code>
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.TAuthor.FIRST_NAME);
	}

	/**
	 * The table column <code>LUKAS.T_AUTHOR.LAST_NAME</code>
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.TAuthor.LAST_NAME, value);
	}

	/**
	 * The table column <code>LUKAS.T_AUTHOR.LAST_NAME</code>
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.TAuthor.LAST_NAME);
	}

	/**
	 * The table column <code>LUKAS.T_AUTHOR.DATE_OF_BIRTH</code>
	 */
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.TAuthor.DATE_OF_BIRTH, value);
	}

	/**
	 * The table column <code>LUKAS.T_AUTHOR.DATE_OF_BIRTH</code>
	 */
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.TAuthor.DATE_OF_BIRTH);
	}

	/**
	 * The table column <code>LUKAS.T_AUTHOR.YEAR_OF_BIRTH</code>
	 */
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.TAuthor.YEAR_OF_BIRTH, value);
	}

	/**
	 * The table column <code>LUKAS.T_AUTHOR.YEAR_OF_BIRTH</code>
	 */
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.TAuthor.YEAR_OF_BIRTH);
	}

	/**
	 * The table column <code>LUKAS.T_AUTHOR.ADDRESS</code>
	 */
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.TAuthor.ADDRESS, value);
	}

	/**
	 * The table column <code>LUKAS.T_AUTHOR.ADDRESS</code>
	 */
	public java.lang.String getAddress() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.TAuthor.ADDRESS);
	}

	/**
	 * Create a detached TAuthorRecord
	 */
	public TAuthorRecord() {
		super(org.jooq.test.db2.generatedclasses.tables.TAuthor.T_AUTHOR);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.db2.generatedclasses.tables.TAuthor.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.db2.generatedclasses.tables.TAuthor.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.db2.generatedclasses.tables.TAuthor.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field4() {
		return org.jooq.test.db2.generatedclasses.tables.TAuthor.DATE_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.db2.generatedclasses.tables.TAuthor.YEAR_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.test.db2.generatedclasses.tables.TAuthor.ADDRESS;
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
	public java.lang.String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value4() {
		return getDateOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getYearOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getAddress();
	}
}
