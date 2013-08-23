/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.TExoticTypesRecord> implements org.jooq.Record2<java.lang.Integer, java.util.UUID>, org.jooq.test.h2.generatedclasses.tables.interfaces.ITExoticTypes {

	private static final long serialVersionUID = -359543066;

	/**
	 * Setter for <code>PUBLIC.T_EXOTIC_TYPES.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_EXOTIC_TYPES.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.T_EXOTIC_TYPES.UU</code>. 
	 */
	@Override
	public void setUu(java.util.UUID value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_EXOTIC_TYPES.UU</code>. 
	 */
	@Override
	public java.util.UUID getUu() {
		return (java.util.UUID) getValue(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.util.UUID> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.util.UUID> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.h2.generatedclasses.tables.TExoticTypes.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.UUID> field2() {
		return org.jooq.test.h2.generatedclasses.tables.TExoticTypes.UU;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.UUID value2() {
		return getUu();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.ITExoticTypes from) {
		setId(from.getId());
		setUu(from.getUu());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.ITExoticTypes> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TExoticTypesRecord
	 */
	public TExoticTypesRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES);
	}

	/**
	 * Create a detached, initialised TExoticTypesRecord
	 */
	public TExoticTypesRecord(java.lang.Integer id, java.util.UUID uu) {
		super(org.jooq.test.h2.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES);

		setValue(0, id);
		setValue(1, uu);
	}
}
