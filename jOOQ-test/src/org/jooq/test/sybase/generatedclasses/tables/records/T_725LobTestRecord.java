/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_725LobTestRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord> implements org.jooq.Record2<java.lang.Integer, byte[]> {

	private static final long serialVersionUID = -869168895;

	/**
	 * The table column <code>DBA.t_725_lob_test.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID, value);
	}

	/**
	 * The table column <code>DBA.t_725_lob_test.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID);
	}

	/**
	 * The table column <code>DBA.t_725_lob_test.LOB</code>
	 */
	public void setLob(byte[] value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.LOB, value);
	}

	/**
	 * The table column <code>DBA.t_725_lob_test.LOB</code>
	 */
	public byte[] getLob() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.LOB);
	}

	/**
	 * Create a detached T_725LobTestRecord
	 */
	public T_725LobTestRecord() {
		super(org.jooq.test.sybase.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, byte[]> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, byte[]> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.sybase.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field2() {
		return org.jooq.test.sybase.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.LOB;
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
	public byte[] value2() {
		return getLob();
	}
}
