/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_725_LOB_TEST")
public class T_725_LOB_TEST extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_725_LOB_TEST> implements java.lang.Cloneable, org.jooq.Record2<java.lang.Integer, byte[]>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_725_LOB_TEST_INTERFACE {

	private static final long serialVersionUID = -2048756709;

	/**
	 * Setter for <code>T_725_LOB_TEST.ID</code>.
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>T_725_LOB_TEST.ID</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>T_725_LOB_TEST.LOB</code>.
	 */
	@Override
	public void setLOB(byte[] value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>T_725_LOB_TEST.LOB</code>.
	 */
	@javax.persistence.Column(name = "LOB")
	@Override
	public byte[] getLOB() {
		return (byte[]) getValue(1);
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
	public org.jooq.Row2<java.lang.Integer, byte[]> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, byte[]> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST.LOB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value2() {
		return getLOB();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_725_LOB_TEST value1(java.lang.Integer value) {
		setID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_725_LOB_TEST value2(byte[] value) {
		setLOB(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_725_LOB_TEST values(java.lang.Integer value1, byte[] value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_725_LOB_TEST_INTERFACE from) {
		setID(from.getID());
		setLOB(from.getLOB());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_725_LOB_TEST_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_725_LOB_TEST
	 */
	public T_725_LOB_TEST() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST);
	}

	/**
	 * Create a detached, initialised T_725_LOB_TEST
	 */
	public T_725_LOB_TEST(java.lang.Integer ID, byte[] LOB) {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST);

		setValue(0, ID);
		setValue(1, LOB);
	}
}
