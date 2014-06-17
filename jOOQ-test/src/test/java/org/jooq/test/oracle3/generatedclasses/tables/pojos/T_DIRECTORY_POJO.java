/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_DIRECTORY")
public class T_DIRECTORY_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_DIRECTORY_INTERFACE {

	private static final long serialVersionUID = 1130212526;

	private java.lang.Integer ID;
	private java.lang.Integer PARENT_ID;
	private java.lang.Integer IS_DIRECTORY;
	private java.lang.String  name;

	public T_DIRECTORY_POJO() {}

	public T_DIRECTORY_POJO(
		java.lang.Integer ID,
		java.lang.Integer PARENT_ID,
		java.lang.Integer IS_DIRECTORY,
		java.lang.String  name
	) {
		this.ID = ID;
		this.PARENT_ID = PARENT_ID;
		this.IS_DIRECTORY = IS_DIRECTORY;
		this.name = name;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "PARENT_ID", precision = 7)
	@Override
	public java.lang.Integer getPARENT_ID() {
		return this.PARENT_ID;
	}

	@Override
	public void setPARENT_ID(java.lang.Integer PARENT_ID) {
		this.PARENT_ID = PARENT_ID;
	}

	@javax.persistence.Column(name = "IS_DIRECTORY", precision = 7)
	@Override
	public java.lang.Integer getIS_DIRECTORY() {
		return this.IS_DIRECTORY;
	}

	@Override
	public void setIS_DIRECTORY(java.lang.Integer IS_DIRECTORY) {
		this.IS_DIRECTORY = IS_DIRECTORY;
	}

	@javax.persistence.Column(name = "name", length = 50)
	@Override
	public java.lang.String getname() {
		return this.name;
	}

	@Override
	public void setname(java.lang.String name) {
		this.name = name;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_DIRECTORY_INTERFACE from) {
		setID(from.getID());
		setPARENT_ID(from.getPARENT_ID());
		setIS_DIRECTORY(from.getIS_DIRECTORY());
		setname(from.getname());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_DIRECTORY_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}
