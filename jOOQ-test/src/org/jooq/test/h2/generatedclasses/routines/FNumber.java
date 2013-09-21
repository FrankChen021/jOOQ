/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FNumber extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -2122229392;

	/**
	 * The parameter <code>PUBLIC.F_NUMBER.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>PUBLIC.F_NUMBER.P1</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P1 = createParameter("P1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public FNumber() {
		super("F_NUMBER", org.jooq.test.h2.generatedclasses.NonPublic.NON_PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P1);
	}

	/**
	 * Set the <code>P1</code> parameter IN value to the routine
	 */
	public void setP1(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.routines.FNumber.P1, value);
	}

	/**
	 * Set the <code>P1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP1(org.jooq.Field<java.lang.Integer> field) {
		setField(P1, field);
	}
}
