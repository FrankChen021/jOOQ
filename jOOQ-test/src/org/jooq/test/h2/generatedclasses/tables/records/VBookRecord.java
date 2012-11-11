/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VBookRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord> implements org.jooq.Record11<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[], java.lang.Integer, java.sql.Timestamp>, org.jooq.test.h2.generatedclasses.tables.interfaces.IVBook {

	private static final long serialVersionUID = 991195252;

	/**
	 * Setter for <code>PUBLIC.V_BOOK.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_BOOK.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.ID);
	}

	/**
	 * Setter for <code>PUBLIC.V_BOOK.AUTHOR_ID</code>. 
	 */
	@Override
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.AUTHOR_ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_BOOK.AUTHOR_ID</code>. 
	 */
	@Override
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.AUTHOR_ID);
	}

	/**
	 * Setter for <code>PUBLIC.V_BOOK.CO_AUTHOR_ID</code>. 
	 */
	@Override
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.CO_AUTHOR_ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_BOOK.CO_AUTHOR_ID</code>. 
	 */
	@Override
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.CO_AUTHOR_ID);
	}

	/**
	 * Setter for <code>PUBLIC.V_BOOK.DETAILS_ID</code>. 
	 */
	@Override
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.DETAILS_ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_BOOK.DETAILS_ID</code>. 
	 */
	@Override
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.DETAILS_ID);
	}

	/**
	 * Setter for <code>PUBLIC.V_BOOK.TITLE</code>. 
	 */
	@Override
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.TITLE, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_BOOK.TITLE</code>. 
	 */
	@Override
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.TITLE);
	}

	/**
	 * Setter for <code>PUBLIC.V_BOOK.PUBLISHED_IN</code>. 
	 */
	@Override
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.PUBLISHED_IN, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_BOOK.PUBLISHED_IN</code>. 
	 */
	@Override
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.PUBLISHED_IN);
	}

	/**
	 * Setter for <code>PUBLIC.V_BOOK.LANGUAGE_ID</code>. 
	 */
	@Override
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.LANGUAGE_ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_BOOK.LANGUAGE_ID</code>. 
	 */
	@Override
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.LANGUAGE_ID);
	}

	/**
	 * Setter for <code>PUBLIC.V_BOOK.CONTENT_TEXT</code>. 
	 */
	@Override
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.CONTENT_TEXT, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_BOOK.CONTENT_TEXT</code>. 
	 */
	@Override
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.CONTENT_TEXT);
	}

	/**
	 * Setter for <code>PUBLIC.V_BOOK.CONTENT_PDF</code>. 
	 */
	@Override
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.CONTENT_PDF, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_BOOK.CONTENT_PDF</code>. 
	 */
	@Override
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.CONTENT_PDF);
	}

	/**
	 * Setter for <code>PUBLIC.V_BOOK.REC_VERSION</code>. 
	 */
	@Override
	public void setRecVersion(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.REC_VERSION, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_BOOK.REC_VERSION</code>. 
	 */
	@Override
	public java.lang.Integer getRecVersion() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.REC_VERSION);
	}

	/**
	 * Setter for <code>PUBLIC.V_BOOK.REC_TIMESTAMP</code>. 
	 */
	@Override
	public void setRecTimestamp(java.sql.Timestamp value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.REC_TIMESTAMP, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_BOOK.REC_TIMESTAMP</code>. 
	 */
	@Override
	public java.sql.Timestamp getRecTimestamp() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.REC_TIMESTAMP);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[], java.lang.Integer, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8(), field9(), field10(), field11());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[], java.lang.Integer, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8(), value9(), value10(), value11());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.h2.generatedclasses.tables.VBook.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.h2.generatedclasses.tables.VBook.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.h2.generatedclasses.tables.VBook.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.h2.generatedclasses.tables.VBook.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.test.h2.generatedclasses.tables.VBook.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.jooq.test.h2.generatedclasses.tables.VBook.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.jooq.test.h2.generatedclasses.tables.VBook.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.test.h2.generatedclasses.tables.VBook.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field9() {
		return org.jooq.test.h2.generatedclasses.tables.VBook.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return org.jooq.test.h2.generatedclasses.tables.VBook.REC_VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field11() {
		return org.jooq.test.h2.generatedclasses.tables.VBook.REC_TIMESTAMP;
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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getRecVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value11() {
		return getRecTimestamp();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VBookRecord
	 */
	public VBookRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.VBook.V_BOOK);
	}
}
