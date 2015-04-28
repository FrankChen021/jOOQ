/**
 * This class is generated by jOOQ
 */
package org.jooq.test.redshift.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.redshift.generatedclasses.tables.TInheritance_1;
import org.jooq.test.redshift.generatedclasses.tables.interfaces.ITInheritance_1;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInheritance_1Record extends TableRecordImpl<TInheritance_1Record> implements Record1<String>, ITInheritance_1 {

	private static final long serialVersionUID = 955740588;

	/**
	 * Setter for <code>public.t_inheritance_1.text_1</code>.
	 */
	public TInheritance_1Record setText_1(String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_inheritance_1.text_1</code>.
	 */
	@Override
	public String getText_1() {
		return (String) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<String> fieldsRow() {
		return (Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<String> valuesRow() {
		return (Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return TInheritance_1.T_INHERITANCE_1.TEXT_1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getText_1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInheritance_1Record value1(String value) {
		setText_1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInheritance_1Record values(String value1) {
		value1(value1);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TInheritance_1Record
	 */
	public TInheritance_1Record() {
		super(TInheritance_1.T_INHERITANCE_1);
	}

	/**
	 * Create a detached, initialised TInheritance_1Record
	 */
	public TInheritance_1Record(String text_1) {
		super(TInheritance_1.T_INHERITANCE_1);

		setValue(0, text_1);
	}
}
