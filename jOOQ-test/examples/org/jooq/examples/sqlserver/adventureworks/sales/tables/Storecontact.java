/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class Storecontact extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord> {

	private static final long serialVersionUID = 1181555549;

	/**
	 * The singleton instance of StoreContact
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact STORECONTACT = new org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.StoreContact.CustomerID]
	 * REFERENCES Store [Sales.Store.CustomerID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord, java.lang.Integer> CUSTOMERID = createField("CustomerID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.StoreContact.ContactID]
	 * REFERENCES Contact [Person.Contact.ContactID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord, java.lang.Integer> CONTACTID = createField("ContactID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.StoreContact.ContactTypeID]
	 * REFERENCES ContactType [Person.ContactType.ContactTypeID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord, java.lang.Integer> CONTACTTYPEID = createField("ContactTypeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord, java.lang.String> ROWGUID = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Storecontact() {
		super("StoreContact", org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES);
	}

	/**
	 * No further instances allowed
	 */
	private Storecontact(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES, org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact.STORECONTACT);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_StoreContact_CustomerID_ContactID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_StoreContact_CustomerID_ContactID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_StoreContact_Store_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_StoreContact_Contact_ContactID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_StoreContact_ContactType_ContactTypeID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact(alias);
	}
}
