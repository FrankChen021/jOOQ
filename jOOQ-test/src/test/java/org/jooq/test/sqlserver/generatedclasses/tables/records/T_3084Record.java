/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables.records;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.sqlserver.generatedclasses.tables.T_3084;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "t_3084", schema = "dbo")
public class T_3084Record extends UpdatableRecordImpl<T_3084Record> implements Record2<Integer, Integer> {

	private static final long serialVersionUID = 2027765833;

	/**
	 * Setter for <code>dbo.t_3084.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dbo.t_3084.ID</code>.
	 */
	@Id
	@Column(name = "ID", unique = true, precision = 10)
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>dbo.t_3084.data</code>.
	 */
	public void setData(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dbo.t_3084.data</code>.
	 */
	@Column(name = "data", precision = 10)
	public Integer getData() {
		return (Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return T_3084.T_3084.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return T_3084.T_3084.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3084Record value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3084Record value2(Integer value) {
		setData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3084Record values(Integer value1, Integer value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_3084Record
	 */
	public T_3084Record() {
		super(T_3084.T_3084);
	}

	/**
	 * Create a detached, initialised T_3084Record
	 */
	public T_3084Record(Integer id, Integer data) {
		super(T_3084.T_3084);

		setValue(0, id);
		setValue(1, data);
	}
}
