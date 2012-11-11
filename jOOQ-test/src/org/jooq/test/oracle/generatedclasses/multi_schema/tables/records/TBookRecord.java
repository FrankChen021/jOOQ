/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK", schema = "MULTI_SCHEMA")
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord> implements org.jooq.Record9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> {

	private static final long serialVersionUID = 896167626;

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.ID, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.ID);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.AUTHOR_ID</code>. 
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.AUTHOR_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord}
	 */
	public void setAuthorId(org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord value) {
		if (value == null) {
			setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.AUTHOR_ID, null);
		}
		else {
			setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.AUTHOR_ID, value.getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.ID));
		}
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.AUTHOR_ID</code>. 
	 */
	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.AUTHOR_ID);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.CO_AUTHOR_ID</code>. 
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord}
	 */
	public void setCoAuthorId(org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord value) {
		if (value == null) {
			setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CO_AUTHOR_ID, null);
		}
		else {
			setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CO_AUTHOR_ID, value.getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.ID));
		}
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.CO_AUTHOR_ID</code>. 
	 */
	@javax.persistence.Column(name = "CO_AUTHOR_ID", precision = 7)
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.DETAILS_ID</code>. 
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.DETAILS_ID, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.DETAILS_ID</code>. 
	 */
	@javax.persistence.Column(name = "DETAILS_ID", precision = 7)
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.DETAILS_ID);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.TITLE</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.TITLE, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.TITLE</code>. 
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.TITLE);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.PUBLISHED_IN</code>. 
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.PUBLISHED_IN</code>. 
	 */
	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.PUBLISHED_IN);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.LANGUAGE_ID</code>. 
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle.generatedclasses.test.tables.records.TLanguageRecord}
	 */
	public void setLanguageId(org.jooq.test.oracle.generatedclasses.test.tables.records.TLanguageRecord value) {
		if (value == null) {
			setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.LANGUAGE_ID, null);
		}
		else {
			setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.LANGUAGE_ID, value.getValue(org.jooq.test.oracle.generatedclasses.test.tables.TLanguage.T_LANGUAGE.ID));
		}
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.LANGUAGE_ID</code>. 
	 */
	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.LANGUAGE_ID);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.CONTENT_TEXT</code>. 
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.CONTENT_TEXT</code>. 
	 */
	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CONTENT_TEXT);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.CONTENT_PDF</code>. 
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CONTENT_PDF, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.CONTENT_PDF</code>. 
	 */
	@javax.persistence.Column(name = "CONTENT_PDF")
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CONTENT_PDF);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a <code>MULTI_SCHEMA.T_AUTHOR</code> referenced by this <code>MULTI_SCHEMA.T_BOOK</code>
	 */
	public org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * Fetch a <code>MULTI_SCHEMA.T_AUTHOR</code> referenced by this <code>MULTI_SCHEMA.T_BOOK</code>
	 */
	public org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * Fetch a <code>TEST.T_LANGUAGE</code> referenced by this <code>MULTI_SCHEMA.T_BOOK</code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.records.TLanguageRecord fetchTLanguage() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TLanguage.T_LANGUAGE)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TLanguage.T_LANGUAGE.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.LANGUAGE_ID)))
			.fetchOne();
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8(), field9());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8(), value9());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field9() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CONTENT_PDF;
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
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCoAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getDetailsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getContentText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value9() {
		return getContentPdf();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK);
	}
}
