/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_85Dao extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_85Record, org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_85, java.lang.Integer> {

	/**
	 * Create a new XTestCase_85Dao without any factory
	 */
	public XTestCase_85Dao() {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_85.class);
	}

	/**
	 * Create a new XTestCase_85Dao with an attached factory
	 */
	public XTestCase_85Dao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_85.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_85 object) {
		return object.getId();
	}
}
