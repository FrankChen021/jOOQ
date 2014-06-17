/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK")
public interface T_BOOK_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * Setter for <code>T_BOOK.ID</code>. The book ID
	 */
	public void setID(java.lang.Integer value);

	/**
	 * Getter for <code>T_BOOK.ID</code>. The book ID
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * Setter for <code>T_BOOK.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	public void setAUTHOR_ID(java.lang.Integer value);

	/**
	 * Getter for <code>T_BOOK.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	public java.lang.Integer getAUTHOR_ID();

	/**
	 * Setter for <code>T_BOOK.CO_AUTHOR_ID</code>.
	 */
	public void setCO_AUTHOR_ID(java.lang.Integer value);

	/**
	 * Getter for <code>T_BOOK.CO_AUTHOR_ID</code>.
	 */
	@javax.persistence.Column(name = "CO_AUTHOR_ID", precision = 7)
	public java.lang.Integer getCO_AUTHOR_ID();

	/**
	 * Setter for <code>T_BOOK.DETAILS_ID</code>.
	 */
	public void setDETAILS_ID(java.lang.Integer value);

	/**
	 * Getter for <code>T_BOOK.DETAILS_ID</code>.
	 */
	@javax.persistence.Column(name = "DETAILS_ID", precision = 7)
	public java.lang.Integer getDETAILS_ID();

	/**
	 * Setter for <code>T_BOOK.TITLE</code>. The book's title
	 */
	public void setTITLE(java.lang.String value);

	/**
	 * Getter for <code>T_BOOK.TITLE</code>. The book's title
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	public java.lang.String getTITLE();

	/**
	 * Setter for <code>T_BOOK.PUBLISHED_IN</code>. The year the book was published in
	 */
	public void setPUBLISHED_IN(java.lang.Integer value);

	/**
	 * Getter for <code>T_BOOK.PUBLISHED_IN</code>. The year the book was published in
	 */
	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	public java.lang.Integer getPUBLISHED_IN();

	/**
	 * Setter for <code>T_BOOK.LANGUAGE_ID</code>. The language of the book
	 */
	public void setLANGUAGE_ID(java.lang.Integer value);

	/**
	 * Getter for <code>T_BOOK.LANGUAGE_ID</code>. The language of the book
	 */
	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	public java.lang.Integer getLANGUAGE_ID();

	/**
	 * Setter for <code>T_BOOK.CONTENT_TEXT</code>. Some textual content of the book
	 */
	public void setCONTENT_TEXT(java.lang.String value);

	/**
	 * Getter for <code>T_BOOK.CONTENT_TEXT</code>. Some textual content of the book
	 */
	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.String getCONTENT_TEXT();

	/**
	 * Setter for <code>T_BOOK.CONTENT_PDF</code>. Some binary content of the book
	 */
	public void setCONTENT_PDF(byte[] value);

	/**
	 * Getter for <code>T_BOOK.CONTENT_PDF</code>. Some binary content of the book
	 */
	@javax.persistence.Column(name = "CONTENT_PDF")
	public byte[] getCONTENT_PDF();

	/**
	 * Setter for <code>T_BOOK.REC_VERSION</code>.
	 */
	public void setREC_VERSION(java.math.BigDecimal value);

	/**
	 * Getter for <code>T_BOOK.REC_VERSION</code>.
	 */
	@javax.persistence.Column(name = "REC_VERSION", length = 22)
	public java.math.BigDecimal getREC_VERSION();

	/**
	 * Setter for <code>T_BOOK.REC_TIMESTAMP</code>.
	 */
	public void setREC_TIMESTAMP(java.sql.Timestamp value);

	/**
	 * Getter for <code>T_BOOK.REC_TIMESTAMP</code>.
	 */
	@javax.persistence.Column(name = "REC_TIMESTAMP", length = 11)
	public java.sql.Timestamp getREC_TIMESTAMP();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface T_BOOK_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOK_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface T_BOOK_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOK_INTERFACE> E into(E into);
}
