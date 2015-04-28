/**
 * This class is generated by jOOQ
 */
package org.jooq.test.redshift.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.redshift.generatedclasses.tables.TBook;
import org.jooq.test.redshift.generatedclasses.tables.interfaces.ITBook;


/**
 * An entity holding books
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookRecord extends UpdatableRecordImpl<TBookRecord> implements Record9<Integer, Integer, Integer, Integer, String, Integer, Integer, String, String>, ITBook {

	private static final long serialVersionUID = 210868388;

	/**
	 * Setter for <code>public.t_book.id</code>. The book ID
	 */
	public TBookRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book.id</code>. The book ID
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.t_book.author_id</code>. The author ID in entity 'author'
	 */
	public TBookRecord setAuthorId(Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book.author_id</code>. The author ID in entity 'author'
	 */
	@Override
	public Integer getAuthorId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.t_book.co_author_id</code>.
	 */
	public TBookRecord setCoAuthorId(Integer value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book.co_author_id</code>.
	 */
	@Override
	public Integer getCoAuthorId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.t_book.details_id</code>.
	 */
	public TBookRecord setDetailsId(Integer value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book.details_id</code>.
	 */
	@Override
	public Integer getDetailsId() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.t_book.title</code>. The book's title
	 */
	public TBookRecord setTitle(String value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book.title</code>. The book's title
	 */
	@Override
	public String getTitle() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>public.t_book.published_in</code>. The year the book was published in
	 */
	public TBookRecord setPublishedIn(Integer value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book.published_in</code>. The year the book was published in
	 */
	@Override
	public Integer getPublishedIn() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>public.t_book.language_id</code>. The language of the book
	 */
	public TBookRecord setLanguageId(Integer value) {
		setValue(6, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book.language_id</code>. The language of the book
	 */
	@Override
	public Integer getLanguageId() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>public.t_book.content_text</code>. Some textual content of the book
	 */
	public TBookRecord setContentText(String value) {
		setValue(7, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book.content_text</code>. Some textual content of the book
	 */
	@Override
	public String getContentText() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>public.t_book.content_pdf</code>.
	 */
	public TBookRecord setContentPdf(String value) {
		setValue(8, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book.content_pdf</code>.
	 */
	@Override
	public String getContentPdf() {
		return (String) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, Integer, Integer, Integer, String, Integer, Integer, String, String> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, Integer, Integer, Integer, String, Integer, Integer, String, String> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TBook.T_BOOK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return org.jooq.test.redshift.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return org.jooq.test.redshift.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return TBook.T_BOOK.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TBook.T_BOOK.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return TBook.T_BOOK.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return TBook.T_BOOK.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return TBook.T_BOOK.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return TBook.T_BOOK.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getCoAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getDetailsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getContentText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getContentPdf();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value2(Integer value) {
		setAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value3(Integer value) {
		setCoAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value4(Integer value) {
		setDetailsId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value5(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value6(Integer value) {
		setPublishedIn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value7(Integer value) {
		setLanguageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value8(String value) {
		setContentText(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value9(String value) {
		setContentPdf(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, Integer value6, Integer value7, String value8, String value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(TBook.T_BOOK);
	}

	/**
	 * Create a detached, initialised TBookRecord
	 */
	public TBookRecord(Integer id, Integer authorId, Integer coAuthorId, Integer detailsId, String title, Integer publishedIn, Integer languageId, String contentText, String contentPdf) {
		super(TBook.T_BOOK);

		setValue(0, id);
		setValue(1, authorId);
		setValue(2, coAuthorId);
		setValue(3, detailsId);
		setValue(4, title);
		setValue(5, publishedIn);
		setValue(6, languageId);
		setValue(7, contentText);
		setValue(8, contentPdf);
	}
}
