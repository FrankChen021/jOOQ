/**
 * This class is generated by jOOQ
 */
package org.jooq.test.redshift.generatedclasses.tables.pojos;


import java.sql.Date;

import org.jooq.test.redshift.generatedclasses.tables.interfaces.IVAuthor;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VAuthor implements IVAuthor {

	private static final long serialVersionUID = 516467475;

	private final Integer id;
	private final String  firstName;
	private final String  lastName;
	private final Date    dateOfBirth;
	private final Integer yearOfBirth;
	private final String  address;

	public VAuthor(VAuthor value) {
		this.id = value.id;
		this.firstName = value.firstName;
		this.lastName = value.lastName;
		this.dateOfBirth = value.dateOfBirth;
		this.yearOfBirth = value.yearOfBirth;
		this.address = value.address;
	}

	public VAuthor(
		Integer id,
		String  firstName,
		String  lastName,
		Date    dateOfBirth,
		Integer yearOfBirth,
		String  address
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	@Override
	public Integer getYearOfBirth() {
		return this.yearOfBirth;
	}

	@Override
	public String getAddress() {
		return this.address;
	}
}
