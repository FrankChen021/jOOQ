/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "StateProvince", schema = "Person")
public class StateprovinceRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateprovinceRecord> {

	private static final long serialVersionUID = -1569670222;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setStateprovinceid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.STATEPROVINCEID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "StateProvinceID", unique = true)
	public java.lang.Integer getStateprovinceid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.STATEPROVINCEID);
	}

	/**
	 * An uncommented item
	 */
	public void setStateprovincecode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.STATEPROVINCECODE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "StateProvinceCode")
	public java.lang.String getStateprovincecode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.STATEPROVINCECODE);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StateProvince_CountryRegion_CountryRegionCode
	 * FOREIGN KEY (CountryRegionCode)
	 * REFERENCES Person.CountryRegion (CountryRegionCode)
	 * </pre></code>
	 */
	public void setCountryregioncode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.COUNTRYREGIONCODE, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StateProvince_CountryRegion_CountryRegionCode
	 * FOREIGN KEY (CountryRegionCode)
	 * REFERENCES Person.CountryRegion (CountryRegionCode)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "CountryRegionCode")
	public java.lang.String getCountryregioncode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.COUNTRYREGIONCODE);
	}

	/**
	 * An uncommented item
	 */
	public void setIsonlystateprovinceflag(java.lang.Boolean value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.ISONLYSTATEPROVINCEFLAG, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "IsOnlyStateProvinceFlag")
	public java.lang.Boolean getIsonlystateprovinceflag() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.ISONLYSTATEPROVINCEFLAG);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.NAME);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StateProvince_SalesTerritory_TerritoryID
	 * FOREIGN KEY (TerritoryID)
	 * REFERENCES Sales.SalesTerritory (TerritoryID)
	 * </pre></code>
	 */
	public void setTerritoryid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.TERRITORYID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StateProvince_SalesTerritory_TerritoryID
	 * FOREIGN KEY (TerritoryID)
	 * REFERENCES Sales.SalesTerritory (TerritoryID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "TerritoryID")
	public java.lang.Integer getTerritoryid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.TERRITORYID);
	}

	/**
	 * An uncommented item
	 */
	public void setRowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.ROWGUID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.ROWGUID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.MODIFIEDDATE);
	}

	/**
	 * Create a detached StateprovinceRecord
	 */
	public StateprovinceRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE);
	}
}
