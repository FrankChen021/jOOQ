/**
 * This class is generated by jOOQ
 */
package org.jooq.test.redshift.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.redshift.generatedclasses.tables.T_2781;
import org.jooq.test.redshift.generatedclasses.tables.interfaces.IT_2781;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2781Record extends TableRecordImpl<T_2781Record> implements Record2<String, String>, IT_2781 {

	private static final long serialVersionUID = 1299268191;

	/**
	 * Setter for <code>public.t_2781.org</code>.
	 */
	public T_2781Record setOrg(String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_2781.org</code>.
	 */
	@Override
	public String getOrg() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.t_2781.jooq</code>.
	 */
	public T_2781Record setJooq(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_2781.jooq</code>.
	 */
	@Override
	public String getJooq() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return T_2781.T_2781.ORG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return T_2781.T_2781.JOOQ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getOrg();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getJooq();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2781Record value1(String value) {
		setOrg(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2781Record value2(String value) {
		setJooq(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2781Record values(String value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_2781Record
	 */
	public T_2781Record() {
		super(T_2781.T_2781);
	}

	/**
	 * Create a detached, initialised T_2781Record
	 */
	public T_2781Record(String org_, String jooq) {
		super(T_2781.T_2781);

		setValue(0, org_);
		setValue(1, jooq);
	}
}
