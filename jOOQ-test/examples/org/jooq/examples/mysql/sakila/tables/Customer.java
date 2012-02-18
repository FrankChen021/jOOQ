/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
public class Customer extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> {

	private static final long serialVersionUID = 741996350;

	/**
	 * The singleton instance of customer
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Customer CUSTOMER = new org.jooq.examples.mysql.sakila.tables.Customer();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.CustomerRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.Short> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_customer_store
	 * FOREIGN KEY (store_id)
	 * REFERENCES sakila.store (store_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.Byte> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_customer_address
	 * FOREIGN KEY (address_id)
	 * REFERENCES sakila.address (address_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.Short> ADDRESS_ID = createField("address_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.Byte> ACTIVE = createField("active", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.sql.Timestamp> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Customer() {
		super("customer", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * No further instances allowed
	 */
	private Customer(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.Short> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_customer;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_customer_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_customer_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.fk_customer_store, org.jooq.examples.mysql.sakila.Keys.fk_customer_address);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.Customer as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.Customer(alias);
	}
}
