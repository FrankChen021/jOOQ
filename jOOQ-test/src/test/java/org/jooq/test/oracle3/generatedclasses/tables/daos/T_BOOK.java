/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.daos;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.test.oracle3.generatedclasses.tables.pojos.T_BOOK_POJO;


/**
 * An entity holding books
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_BOOK extends DAOImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, T_BOOK_POJO, Integer> implements Cloneable {

	/**
	 * Create a new T_BOOK without any configuration
	 */
	public T_BOOK() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK, T_BOOK_POJO.class);
	}

	/**
	 * Create a new T_BOOK with an attached configuration
	 */
	public T_BOOK(Configuration configuration) {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK, T_BOOK_POJO.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(T_BOOK_POJO object) {
		return object.getID();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public List<T_BOOK_POJO> fetchByID(Integer... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public T_BOOK_POJO fetchOneByID(Integer value) {
		return fetchOne(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.ID, value);
	}

	/**
	 * Fetch records that have <code>AUTHOR_ID IN (values)</code>
	 */
	public List<T_BOOK_POJO> fetchByAUTHOR_ID(Integer... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.AUTHOR_ID, values);
	}

	/**
	 * Fetch records that have <code>CO_AUTHOR_ID IN (values)</code>
	 */
	public List<T_BOOK_POJO> fetchByCO_AUTHOR_ID(Integer... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.CO_AUTHOR_ID, values);
	}

	/**
	 * Fetch records that have <code>DETAILS_ID IN (values)</code>
	 */
	public List<T_BOOK_POJO> fetchByDETAILS_ID(Integer... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.DETAILS_ID, values);
	}

	/**
	 * Fetch records that have <code>TITLE IN (values)</code>
	 */
	public List<T_BOOK_POJO> fetchByTITLE(String... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.TITLE, values);
	}

	/**
	 * Fetch records that have <code>PUBLISHED_IN IN (values)</code>
	 */
	public List<T_BOOK_POJO> fetchByPUBLISHED_IN(Integer... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.PUBLISHED_IN, values);
	}

	/**
	 * Fetch records that have <code>LANGUAGE_ID IN (values)</code>
	 */
	public List<T_BOOK_POJO> fetchByLANGUAGE_ID(Integer... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.LANGUAGE_ID, values);
	}

	/**
	 * Fetch records that have <code>CONTENT_TEXT IN (values)</code>
	 */
	public List<T_BOOK_POJO> fetchByCONTENT_TEXT(String... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.CONTENT_TEXT, values);
	}

	/**
	 * Fetch records that have <code>CONTENT_PDF IN (values)</code>
	 */
	public List<T_BOOK_POJO> fetchByCONTENT_PDF(byte[]... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.CONTENT_PDF, values);
	}

	/**
	 * Fetch records that have <code>REC_VERSION IN (values)</code>
	 */
	public List<T_BOOK_POJO> fetchByREC_VERSION(BigDecimal... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.REC_VERSION, values);
	}

	/**
	 * Fetch records that have <code>REC_TIMESTAMP IN (values)</code>
	 */
	public List<T_BOOK_POJO> fetchByREC_TIMESTAMP(Timestamp... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.REC_TIMESTAMP, values);
	}
}
