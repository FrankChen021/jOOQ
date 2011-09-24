/**
 * This class is generated by jOOQ
 */
package org.jooq.util.maven.example.procedures;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class PArrays3 extends org.jooq.impl.StoredProcedureImpl {

	private static final long serialVersionUID = -769034862;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String[]> IN_ARRAY = new org.jooq.impl.ParameterImpl<java.lang.String[]>("in_array", org.jooq.impl.SQLDataType.CLOB.getArrayDataType());

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String[]> OUT_ARRAY = new org.jooq.impl.ParameterImpl<java.lang.String[]>("out_array", org.jooq.impl.SQLDataType.CLOB.getArrayDataType());

	/**
	 * Create a new procedure call instance
	 */
	public PArrays3() {
		super(org.jooq.SQLDialect.POSTGRES, "p_arrays", org.jooq.util.maven.example.Public.PUBLIC);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
		setOverloaded(true);
	}

	public void setInArray(java.lang.String[] value) {
		setValue(IN_ARRAY, value);
	}

	public java.lang.String[] getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
