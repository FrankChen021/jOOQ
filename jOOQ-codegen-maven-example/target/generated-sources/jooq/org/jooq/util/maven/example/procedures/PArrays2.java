/**
 * This class is generated by jOOQ
 */
package org.jooq.util.maven.example.procedures;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class PArrays2 extends org.jooq.impl.StoredProcedureImpl {

	private static final long serialVersionUID = 1386598466;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Long[]> IN_ARRAY = new org.jooq.impl.ParameterImpl<java.lang.Long[]>("in_array", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Long[]> OUT_ARRAY = new org.jooq.impl.ParameterImpl<java.lang.Long[]>("out_array", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

	/**
	 * Create a new procedure call instance
	 */
	public PArrays2() {
		super(org.jooq.SQLDialect.POSTGRES, "p_arrays", org.jooq.util.maven.example.Public.PUBLIC);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
		setOverloaded(true);
	}

	public void setInArray(java.lang.Long[] value) {
		setValue(IN_ARRAY, value);
	}

	public java.lang.Long[] getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
