/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.daos;


import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.test.oracle3.generatedclasses.tables.pojos.T_725_LOB_TEST_POJO;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_725_LOB_TEST extends DAOImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_725_LOB_TEST, T_725_LOB_TEST_POJO, Integer> implements Cloneable {

	/**
	 * Create a new T_725_LOB_TEST without any configuration
	 */
	public T_725_LOB_TEST() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST, T_725_LOB_TEST_POJO.class);
	}

	/**
	 * Create a new T_725_LOB_TEST with an attached configuration
	 */
	public T_725_LOB_TEST(Configuration configuration) {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST, T_725_LOB_TEST_POJO.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(T_725_LOB_TEST_POJO object) {
		return object.getID();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public List<T_725_LOB_TEST_POJO> fetchByID(Integer... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public T_725_LOB_TEST_POJO fetchOneByID(Integer value) {
		return fetchOne(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST.ID, value);
	}

	/**
	 * Fetch records that have <code>LOB IN (values)</code>
	 */
	public List<T_725_LOB_TEST_POJO> fetchByLOB(byte[]... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST.LOB, values);
	}

	/**
	 * Fetch records that have <code>USER_JAVA_SQL_CLOB IN (values)</code>
	 */
	public List<T_725_LOB_TEST_POJO> fetchByUSER_JAVA_SQL_CLOB(String... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST.USER_JAVA_SQL_CLOB, values);
	}

	/**
	 * Fetch records that have <code>USER_JAVA_SQL_BLOB IN (values)</code>
	 */
	public List<T_725_LOB_TEST_POJO> fetchByUSER_JAVA_SQL_BLOB(byte[]... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST.USER_JAVA_SQL_BLOB, values);
	}

	/**
	 * Fetch records that have <code>JOOQ_JAVA_SQL_CLOB IN (values)</code>
	 */
	public List<T_725_LOB_TEST_POJO> fetchByJOOQ_JAVA_SQL_CLOB(String... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST.JOOQ_JAVA_SQL_CLOB, values);
	}

	/**
	 * Fetch records that have <code>JOOQ_JAVA_SQL_BLOB IN (values)</code>
	 */
	public List<T_725_LOB_TEST_POJO> fetchByJOOQ_JAVA_SQL_BLOB(byte[]... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST.JOOQ_JAVA_SQL_BLOB, values);
	}
}
