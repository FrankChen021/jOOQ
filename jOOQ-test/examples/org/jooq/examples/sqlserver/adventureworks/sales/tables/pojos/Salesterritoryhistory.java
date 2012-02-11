/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesTerritoryHistory", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"SalesPersonID", "StartDate", "TerritoryID"})
})
public class Salesterritoryhistory implements java.io.Serializable {

	private static final long serialVersionUID = -1081281188;

	private java.lang.Integer  salespersonid;
	private java.lang.Integer  territoryid;
	private java.sql.Timestamp startdate;
	private java.sql.Timestamp enddate;
	private java.lang.String   rowguid;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Column(name = "SalesPersonID")
	public java.lang.Integer getSalespersonid() {
		return this.salespersonid;
	}

	public void setSalespersonid(java.lang.Integer salespersonid) {
		this.salespersonid = salespersonid;
	}

	@javax.persistence.Column(name = "TerritoryID")
	public java.lang.Integer getTerritoryid() {
		return this.territoryid;
	}

	public void setTerritoryid(java.lang.Integer territoryid) {
		this.territoryid = territoryid;
	}

	@javax.persistence.Column(name = "StartDate")
	public java.sql.Timestamp getStartdate() {
		return this.startdate;
	}

	public void setStartdate(java.sql.Timestamp startdate) {
		this.startdate = startdate;
	}

	@javax.persistence.Column(name = "EndDate")
	public java.sql.Timestamp getEnddate() {
		return this.enddate;
	}

	public void setEnddate(java.sql.Timestamp enddate) {
		this.enddate = enddate;
	}

	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return this.rowguid;
	}

	public void setRowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}
