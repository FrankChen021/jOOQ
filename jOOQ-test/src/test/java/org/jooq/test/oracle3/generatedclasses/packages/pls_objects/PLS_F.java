/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages.pls_objects;


import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.oracle3.generatedclasses.DefaultSchema;
import org.jooq.test.oracle3.generatedclasses.packages.PLS_OBJECTS;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PLS_F extends AbstractRoutine<BigDecimal> implements Cloneable {

	private static final long serialVersionUID = -909256802;

	/**
	 * The parameter <code>PLS_OBJECTS.PLS_F.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>PLS_OBJECTS.PLS_F.I</code>.
	 */
	public static final Parameter<BigDecimal> I = createParameter("I", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>PLS_OBJECTS.PLS_F.V</code>.
	 */
	public static final Parameter<String> V = createParameter("V", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public PLS_F() {
		super("PLS_F", DefaultSchema.DEFAULT_SCHEMA, PLS_OBJECTS.PLS_OBJECTS, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(I);
		addInParameter(V);
	}

	/**
	 * Set the <code>I</code> parameter IN value to the routine
	 */
	public void setI(Number value) {
		setNumber(I, value);
	}

	/**
	 * Set the <code>I</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setI(Field<? extends Number> field) {
		setNumber(I, field);
	}

	/**
	 * Set the <code>V</code> parameter IN value to the routine
	 */
	public void setV(String value) {
		setValue(V, value);
	}

	/**
	 * Set the <code>V</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setV(Field<String> field) {
		setField(V, field);
	}
}
