/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
public class VAuthor implements java.io.Serializable {

	private static final long serialVersionUID = 753819077;

	private java.lang.Integer id;
	private java.lang.String  firstName;
	private java.lang.String  lastName;
	private java.sql.Date     dateOfBirth;
	private java.lang.Integer yearOfBirth;
	private java.lang.String  address;

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getLastName() {
		return this.lastName;
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	public java.sql.Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(java.sql.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public java.lang.Integer getYearOfBirth() {
		return this.yearOfBirth;
	}

	public void setYearOfBirth(java.lang.Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}
}
