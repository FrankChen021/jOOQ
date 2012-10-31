/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "VendorAddress", schema = "Purchasing", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"VendorID", "AddressID"})
})
public class VendorAddress extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorAddress> implements org.jooq.Record4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp> {

	private static final long serialVersionUID = -506478593;

	/**
	 * The table column <code>Purchasing.VendorAddress.VendorID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_VendorAddress_Vendor_VendorID
	 * FOREIGN KEY (VendorID)
	 * REFERENCES Purchasing.Vendor (VendorID)
	 * </pre></code>
	 */
	public void setVendorID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress.VendorAddress.VendorID, value);
	}

	/**
	 * The table column <code>Purchasing.VendorAddress.VendorID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_VendorAddress_Vendor_VendorID
	 * FOREIGN KEY (VendorID)
	 * REFERENCES Purchasing.Vendor (VendorID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "VendorID", nullable = false, precision = 10)
	public java.lang.Integer getVendorID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress.VendorAddress.VendorID);
	}

	/**
	 * The table column <code>Purchasing.VendorAddress.AddressID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_VendorAddress_Address_AddressID
	 * FOREIGN KEY (AddressID)
	 * REFERENCES Person.Address (AddressID)
	 * </pre></code>
	 */
	public void setAddressID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress.VendorAddress.AddressID, value);
	}

	/**
	 * The table column <code>Purchasing.VendorAddress.AddressID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_VendorAddress_Address_AddressID
	 * FOREIGN KEY (AddressID)
	 * REFERENCES Person.Address (AddressID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "AddressID", nullable = false, precision = 10)
	public java.lang.Integer getAddressID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress.VendorAddress.AddressID);
	}

	/**
	 * The table column <code>Purchasing.VendorAddress.AddressTypeID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_VendorAddress_AddressType_AddressTypeID
	 * FOREIGN KEY (AddressTypeID)
	 * REFERENCES Person.AddressType (AddressTypeID)
	 * </pre></code>
	 */
	public void setAddressTypeID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress.VendorAddress.AddressTypeID, value);
	}

	/**
	 * The table column <code>Purchasing.VendorAddress.AddressTypeID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_VendorAddress_AddressType_AddressTypeID
	 * FOREIGN KEY (AddressTypeID)
	 * REFERENCES Person.AddressType (AddressTypeID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "AddressTypeID", nullable = false, precision = 10)
	public java.lang.Integer getAddressTypeID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress.VendorAddress.AddressTypeID);
	}

	/**
	 * The table column <code>Purchasing.VendorAddress.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress.VendorAddress.ModifiedDate, value);
	}

	/**
	 * The table column <code>Purchasing.VendorAddress.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress.VendorAddress.ModifiedDate);
	}

	/**
	 * Create a detached VendorAddress
	 */
	public VendorAddress() {
		super(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress.VendorAddress);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress.VendorAddress.VendorID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress.VendorAddress.AddressID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress.VendorAddress.AddressTypeID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress.VendorAddress.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getVendorID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getAddressID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getAddressTypeID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getModifiedDate();
	}
}
