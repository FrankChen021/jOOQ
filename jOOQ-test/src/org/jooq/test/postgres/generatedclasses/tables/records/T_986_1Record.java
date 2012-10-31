/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_986_1", schema = "public")
public class T_986_1Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record> implements org.jooq.Record1<java.lang.Integer> {

	private static final long serialVersionUID = 661513262;

	/**
	 * The table column <code>public.t_986_1.ref</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_986_1__fk_986
	 * FOREIGN KEY (ref, ref)
	 * REFERENCES public.x_unused (id)
	 * </pre></code>
	 */
	public void setRef(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_986_1.T_986_1.REF, value);
	}

	/**
	 * The table column <code>public.t_986_1.ref</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_986_1__fk_986
	 * FOREIGN KEY (ref, ref)
	 * REFERENCES public.x_unused (id)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ref", precision = 32)
	public java.lang.Integer getRef() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_986_1.T_986_1.REF);
	}

	/**
	 * Create a detached T_986_1Record
	 */
	public T_986_1Record() {
		super(org.jooq.test.postgres.generatedclasses.tables.T_986_1.T_986_1);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.T_986_1.T_986_1.REF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getRef();
	}
}
