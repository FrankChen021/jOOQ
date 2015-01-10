/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;


import org.jooq.test.h2.generatedclasses.tables.interfaces.ITPerformance;


/**
 * This is a POJO for table T_PERFORMANCE.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPerformance implements ITPerformance {

	private static final long serialVersionUID = 1286867936;

	private Integer id;
	private Integer valueInt;
	private String  valueString;

	public TPerformance() {}

	public TPerformance(TPerformance value) {
		this.id = value.id;
		this.valueInt = value.valueInt;
		this.valueString = value.valueString;
	}

	public TPerformance(
		Integer id,
		Integer valueInt,
		String  valueString
	) {
		this.id = id;
		this.valueInt = valueInt;
		this.valueString = valueString;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public TPerformance setId(Integer id) {
		this.id = id;
		return this;
	}

	@Override
	public Integer getValueInt() {
		return this.valueInt;
	}

	@Override
	public TPerformance setValueInt(Integer valueInt) {
		this.valueInt = valueInt;
		return this;
	}

	@Override
	public String getValueString() {
		return this.valueString;
	}

	@Override
	public TPerformance setValueString(String valueString) {
		this.valueString = valueString;
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITPerformance from) {
		setId(from.getId());
		setValueInt(from.getValueInt());
		setValueString(from.getValueString());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITPerformance> E into(E into) {
		into.from(this);
		return into;
	}

	// Here, a toString() method could be generated
}
