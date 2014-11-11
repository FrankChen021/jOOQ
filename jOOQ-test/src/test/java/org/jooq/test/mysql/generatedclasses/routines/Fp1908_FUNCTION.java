/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Fp1908_FUNCTION extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -1895272486;

	/**
	 * The parameter <code>test.fp1908.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>test.fp1908.p1</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P1 = createParameter("p1", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * Create a new routine call instance
	 */
	public Fp1908_FUNCTION() {
		super("fp1908", org.jooq.test.mysql.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P1);
		setOverloaded(true);
	}

	/**
	 * Set the <code>p1</code> parameter IN value to the routine
	 */
	public void setP1(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.routines.Fp1908_FUNCTION.P1, value);
	}

	/**
	 * Set the <code>p1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP1(org.jooq.Field<java.lang.Integer> field) {
		setField(P1, field);
	}
}
