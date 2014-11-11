/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PResults extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1363423743;

	/**
	 * The parameter <code>test.p_results.p_result_sets</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_RESULT_SETS = createParameter("p_result_sets", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * Create a new routine call instance
	 */
	public PResults() {
		super("p_results", org.jooq.test.mysql.generatedclasses.Test.TEST);

		addInParameter(P_RESULT_SETS);
	}

	/**
	 * Set the <code>p_result_sets</code> parameter IN value to the routine
	 */
	public void setPResultSets(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.routines.PResults.P_RESULT_SETS, value);
	}
}
