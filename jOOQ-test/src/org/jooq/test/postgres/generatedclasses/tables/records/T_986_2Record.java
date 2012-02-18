/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_986_2", schema = "public")
public class T_986_2Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_986_2Record> {

	private static final long serialVersionUID = -722678348;

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_986_2__fk_986
	 * FOREIGN KEY (ref, ref)
	 * REFERENCES public.x_unused (id)
	 * </pre></code>
	 */
	public void setRef(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_986_2.T_986_2.REF, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_986_2__fk_986
	 * FOREIGN KEY (ref, ref)
	 * REFERENCES public.x_unused (id)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ref")
	public java.lang.Integer getRef() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_986_2.T_986_2.REF);
	}

	/**
	 * Create a detached T_986_2Record
	 */
	public T_986_2Record() {
		super(org.jooq.test.postgres.generatedclasses.tables.T_986_2.T_986_2);
	}
}
