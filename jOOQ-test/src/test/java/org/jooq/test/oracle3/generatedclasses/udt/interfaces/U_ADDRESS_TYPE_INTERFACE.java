/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface U_ADDRESS_TYPE_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * Setter for <code>U_ADDRESS_TYPE.STREET</code>.
	 */
	public void setSTREET(org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_STREET_TYPE_INTERFACE value);

	/**
	 * Getter for <code>U_ADDRESS_TYPE.STREET</code>.
	 */
	public org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_STREET_TYPE_INTERFACE getSTREET();

	/**
	 * Setter for <code>U_ADDRESS_TYPE.ZIP</code>.
	 */
	public void setZIP(java.lang.String value);

	/**
	 * Getter for <code>U_ADDRESS_TYPE.ZIP</code>.
	 */
	public java.lang.String getZIP();

	/**
	 * Setter for <code>U_ADDRESS_TYPE.CITY</code>.
	 */
	public void setCITY(java.lang.String value);

	/**
	 * Getter for <code>U_ADDRESS_TYPE.CITY</code>.
	 */
	public java.lang.String getCITY();

	/**
	 * Setter for <code>U_ADDRESS_TYPE.COUNTRY</code>.
	 */
	public void setCOUNTRY(java.lang.String value);

	/**
	 * Getter for <code>U_ADDRESS_TYPE.COUNTRY</code>.
	 */
	public java.lang.String getCOUNTRY();

	/**
	 * Setter for <code>U_ADDRESS_TYPE.SINCE</code>.
	 */
	public void setSINCE(java.sql.Date value);

	/**
	 * Getter for <code>U_ADDRESS_TYPE.SINCE</code>.
	 */
	public java.sql.Date getSINCE();

	/**
	 * Setter for <code>U_ADDRESS_TYPE.CODE</code>.
	 */
	public void setCODE(java.lang.Integer value);

	/**
	 * Getter for <code>U_ADDRESS_TYPE.CODE</code>.
	 */
	public java.lang.Integer getCODE();

	/**
	 * Setter for <code>U_ADDRESS_TYPE.F_1323</code>.
	 */
	public void setF_1323(byte[] value);

	/**
	 * Getter for <code>U_ADDRESS_TYPE.F_1323</code>.
	 */
	public byte[] getF_1323();

	/**
	 * Setter for <code>U_ADDRESS_TYPE.F_1326</code>.
	 */
	public void setF_1326(java.lang.String value);

	/**
	 * Getter for <code>U_ADDRESS_TYPE.F_1326</code>.
	 */
	public java.lang.String getF_1326();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface U_ADDRESS_TYPE_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_ADDRESS_TYPE_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface U_ADDRESS_TYPE_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_ADDRESS_TYPE_INTERFACE> E into(E into);
}
