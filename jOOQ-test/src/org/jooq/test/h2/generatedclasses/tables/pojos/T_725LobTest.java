package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_725LobTest implements org.jooq.test.h2.generatedclasses.tables.interfaces.IT_725LobTest {

	private static final long serialVersionUID = -1099030022;

	private java.lang.Integer id;
	private byte[]            lob;

	public T_725LobTest() {}

	public T_725LobTest(
		java.lang.Integer id,
		byte[]            lob
	) {
		this.id = id;
		this.lob = lob;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@Override
	public byte[] getLob() {
		return this.lob;
	}

	@Override
	public void setLob(byte[] lob) {
		this.lob = lob;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IT_725LobTest from) {
		setId(from.getId());
		setLob(from.getLob());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IT_725LobTest> E into(E into) {
		into.from(this);
		return into;
	}

	// Here, a toString() method could be generated
}
