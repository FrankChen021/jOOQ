/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_LANGUAGE")
public class T_LANGUAGE extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE> implements java.lang.Cloneable, org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_LANGUAGE_INTERFACE {

	private static final long serialVersionUID = 1920290859;

	/**
	 * Setter for <code>T_LANGUAGE.CD</code>. The language ISO code
	 */
	@Override
	public void setCD(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>T_LANGUAGE.CD</code>. The language ISO code
	 */
	@javax.persistence.Column(name = "CD", nullable = false, length = 2)
	@Override
	public java.lang.String getCD() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>T_LANGUAGE.DESCRIPTION</code>. The language description
	 */
	@Override
	public void setDESCRIPTION(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>T_LANGUAGE.DESCRIPTION</code>. The language description
	 */
	@javax.persistence.Column(name = "DESCRIPTION", length = 50)
	@Override
	public java.lang.String getDESCRIPTION() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>T_LANGUAGE.DESCRIPTION_ENGLISH</code>.
	 */
	@Override
	public void setDESCRIPTION_ENGLISH(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>T_LANGUAGE.DESCRIPTION_ENGLISH</code>.
	 */
	@javax.persistence.Column(name = "DESCRIPTION_ENGLISH", length = 50)
	@Override
	public java.lang.String getDESCRIPTION_ENGLISH() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>T_LANGUAGE.ID</code>. The language ID
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>T_LANGUAGE.ID</code>. The language ID
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return (java.lang.Integer) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.DESCRIPTION_ENGLISH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getCD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getDESCRIPTION();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDESCRIPTION_ENGLISH();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_LANGUAGE value1(java.lang.String value) {
		setCD(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_LANGUAGE value2(java.lang.String value) {
		setDESCRIPTION(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_LANGUAGE value3(java.lang.String value) {
		setDESCRIPTION_ENGLISH(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_LANGUAGE value4(java.lang.Integer value) {
		setID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_LANGUAGE values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.Integer value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_LANGUAGE_INTERFACE from) {
		setCD(from.getCD());
		setDESCRIPTION(from.getDESCRIPTION());
		setDESCRIPTION_ENGLISH(from.getDESCRIPTION_ENGLISH());
		setID(from.getID());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_LANGUAGE_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_LANGUAGE
	 */
	public T_LANGUAGE() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE);
	}

	/**
	 * Create a detached, initialised T_LANGUAGE
	 */
	public T_LANGUAGE(java.lang.String CD, java.lang.String DESCRIPTION, java.lang.String DESCRIPTION_ENGLISH, java.lang.Integer ID) {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE);

		setValue(0, CD);
		setValue(1, DESCRIPTION);
		setValue(2, DESCRIPTION_ENGLISH);
		setValue(3, ID);
	}
}
