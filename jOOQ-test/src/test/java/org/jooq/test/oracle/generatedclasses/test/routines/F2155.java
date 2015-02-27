/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;


import java.math.BigDecimal;
import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.all.converters.LocalDateConverter;
import org.jooq.test.oracle.generatedclasses.test.Test;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class F2155 extends AbstractRoutine<LocalDate> {

	private static final long serialVersionUID = 254584493;

	/**
	 * The parameter <code>TEST.F2155.RETURN_VALUE</code>.
	 */
	public static final Parameter<LocalDate> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DATE, false, new LocalDateConverter());

	/**
	 * The parameter <code>TEST.F2155.P1</code>.
	 */
	public static final Parameter<BigDecimal> P1 = createParameter("P1", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>TEST.F2155.P2</code>.
	 */
	public static final Parameter<LocalDate> P2 = createParameter("P2", org.jooq.impl.SQLDataType.DATE, false, new LocalDateConverter());

	/**
	 * The parameter <code>TEST.F2155.P3</code>.
	 */
	public static final Parameter<BigDecimal> P3 = createParameter("P3", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>TEST.F2155.P4</code>.
	 */
	public static final Parameter<LocalDate> P4 = createParameter("P4", org.jooq.impl.SQLDataType.DATE, false, new LocalDateConverter());

	/**
	 * Create a new routine call instance
	 */
	public F2155() {
		super("F2155", Test.TEST, org.jooq.impl.SQLDataType.DATE, new LocalDateConverter());

		setReturnParameter(RETURN_VALUE);
		addInParameter(P1);
		addInParameter(P2);
		addInParameter(P3);
		addInParameter(P4);
	}

	/**
	 * Set the <code>P1</code> parameter IN value to the routine
	 */
	public void setP1(Number value) {
		setNumber(P1, value);
	}

	/**
	 * Set the <code>P1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP1(Field<? extends Number> field) {
		setNumber(P1, field);
	}

	/**
	 * Set the <code>P2</code> parameter IN value to the routine
	 */
	public void setP2(LocalDate value) {
		setValue(P2, value);
	}

	/**
	 * Set the <code>P2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP2(Field<LocalDate> field) {
		setField(P2, field);
	}

	/**
	 * Set the <code>P3</code> parameter IN value to the routine
	 */
	public void setP3(Number value) {
		setNumber(P3, value);
	}

	/**
	 * Set the <code>P3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP3(Field<? extends Number> field) {
		setNumber(P3, field);
	}

	/**
	 * Set the <code>P4</code> parameter IN value to the routine
	 */
	public void setP4(LocalDate value) {
		setValue(P4, value);
	}

	/**
	 * Set the <code>P4</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP4(Field<LocalDate> field) {
		setField(P4, field);
	}
}
