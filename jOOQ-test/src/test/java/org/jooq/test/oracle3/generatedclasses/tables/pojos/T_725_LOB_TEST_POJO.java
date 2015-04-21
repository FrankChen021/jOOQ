/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_725_LOB_TEST_INTERFACE;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "T_725_LOB_TEST")
public class T_725_LOB_TEST_POJO extends ThreadDeath implements Cloneable, T_725_LOB_TEST_INTERFACE {

	private static final long serialVersionUID = -1995152444;

	private Integer ID;
	private byte[]  LOB;
	private String  USER_JAVA_SQL_CLOB;
	private byte[]  USER_JAVA_SQL_BLOB;
	private String  JOOQ_JAVA_SQL_CLOB;
	private byte[]  JOOQ_JAVA_SQL_BLOB;

	public T_725_LOB_TEST_POJO() {}

	public T_725_LOB_TEST_POJO(T_725_LOB_TEST_POJO value) {
		this.ID = value.ID;
		this.LOB = value.LOB;
		this.USER_JAVA_SQL_CLOB = value.USER_JAVA_SQL_CLOB;
		this.USER_JAVA_SQL_BLOB = value.USER_JAVA_SQL_BLOB;
		this.JOOQ_JAVA_SQL_CLOB = value.JOOQ_JAVA_SQL_CLOB;
		this.JOOQ_JAVA_SQL_BLOB = value.JOOQ_JAVA_SQL_BLOB;
	}

	public T_725_LOB_TEST_POJO(
		Integer ID,
		byte[]  LOB,
		String  USER_JAVA_SQL_CLOB,
		byte[]  USER_JAVA_SQL_BLOB,
		String  JOOQ_JAVA_SQL_CLOB,
		byte[]  JOOQ_JAVA_SQL_BLOB
	) {
		this.ID = ID;
		this.LOB = LOB;
		this.USER_JAVA_SQL_CLOB = USER_JAVA_SQL_CLOB;
		this.USER_JAVA_SQL_BLOB = USER_JAVA_SQL_BLOB;
		this.JOOQ_JAVA_SQL_CLOB = JOOQ_JAVA_SQL_CLOB;
		this.JOOQ_JAVA_SQL_BLOB = JOOQ_JAVA_SQL_BLOB;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(Integer ID) {
		this.ID = ID;
	}

	@Column(name = "LOB")
	@Override
	public byte[] getLOB() {
		return this.LOB;
	}

	@Override
	public void setLOB(byte[] LOB) {
		this.LOB = LOB;
	}

	@Column(name = "USER_JAVA_SQL_CLOB")
	@Override
	public String getUSER_JAVA_SQL_CLOB() {
		return this.USER_JAVA_SQL_CLOB;
	}

	@Override
	public void setUSER_JAVA_SQL_CLOB(String USER_JAVA_SQL_CLOB) {
		this.USER_JAVA_SQL_CLOB = USER_JAVA_SQL_CLOB;
	}

	@Column(name = "USER_JAVA_SQL_BLOB")
	@Override
	public byte[] getUSER_JAVA_SQL_BLOB() {
		return this.USER_JAVA_SQL_BLOB;
	}

	@Override
	public void setUSER_JAVA_SQL_BLOB(byte[] USER_JAVA_SQL_BLOB) {
		this.USER_JAVA_SQL_BLOB = USER_JAVA_SQL_BLOB;
	}

	@Column(name = "JOOQ_JAVA_SQL_CLOB")
	@Override
	public String getJOOQ_JAVA_SQL_CLOB() {
		return this.JOOQ_JAVA_SQL_CLOB;
	}

	@Override
	public void setJOOQ_JAVA_SQL_CLOB(String JOOQ_JAVA_SQL_CLOB) {
		this.JOOQ_JAVA_SQL_CLOB = JOOQ_JAVA_SQL_CLOB;
	}

	@Column(name = "JOOQ_JAVA_SQL_BLOB")
	@Override
	public byte[] getJOOQ_JAVA_SQL_BLOB() {
		return this.JOOQ_JAVA_SQL_BLOB;
	}

	@Override
	public void setJOOQ_JAVA_SQL_BLOB(byte[] JOOQ_JAVA_SQL_BLOB) {
		this.JOOQ_JAVA_SQL_BLOB = JOOQ_JAVA_SQL_BLOB;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(T_725_LOB_TEST_INTERFACE from) {
		setID(from.getID());
		setLOB(from.getLOB());
		setUSER_JAVA_SQL_CLOB(from.getUSER_JAVA_SQL_CLOB());
		setUSER_JAVA_SQL_BLOB(from.getUSER_JAVA_SQL_BLOB());
		setJOOQ_JAVA_SQL_CLOB(from.getJOOQ_JAVA_SQL_CLOB());
		setJOOQ_JAVA_SQL_BLOB(from.getJOOQ_JAVA_SQL_BLOB());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends T_725_LOB_TEST_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}
