/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.daos;


import java.sql.Date;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.test.oracle3.generatedclasses.tables.pojos.T_AUTHOR_POJO;
import org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE;


/**
 * An entity holding authors of books
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_AUTHOR extends DAOImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_AUTHOR, T_AUTHOR_POJO, Integer> implements Cloneable {

	/**
	 * Create a new T_AUTHOR without any configuration
	 */
	public T_AUTHOR() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR, T_AUTHOR_POJO.class);
	}

	/**
	 * Create a new T_AUTHOR with an attached configuration
	 */
	public T_AUTHOR(Configuration configuration) {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR, T_AUTHOR_POJO.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(T_AUTHOR_POJO object) {
		return object.getID();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public List<T_AUTHOR_POJO> fetchByID(Integer... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public T_AUTHOR_POJO fetchOneByID(Integer value) {
		return fetchOne(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR.ID, value);
	}

	/**
	 * Fetch records that have <code>FIRST_NAME IN (values)</code>
	 */
	public List<T_AUTHOR_POJO> fetchByFIRST_NAME(String... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR.FIRST_NAME, values);
	}

	/**
	 * Fetch records that have <code>LAST_NAME IN (values)</code>
	 */
	public List<T_AUTHOR_POJO> fetchByLAST_NAME(String... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR.LAST_NAME, values);
	}

	/**
	 * Fetch records that have <code>DATE_OF_BIRTH IN (values)</code>
	 */
	public List<T_AUTHOR_POJO> fetchByDATE_OF_BIRTH(Date... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR.DATE_OF_BIRTH, values);
	}

	/**
	 * Fetch records that have <code>YEAR_OF_BIRTH IN (values)</code>
	 */
	public List<T_AUTHOR_POJO> fetchByYEAR_OF_BIRTH(Integer... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR.YEAR_OF_BIRTH, values);
	}

	/**
	 * Fetch records that have <code>ADDRESS IN (values)</code>
	 */
	public List<T_AUTHOR_POJO> fetchByADDRESS(U_ADDRESS_TYPE... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_AUTHOR.T_AUTHOR.ADDRESS, values);
	}
}
