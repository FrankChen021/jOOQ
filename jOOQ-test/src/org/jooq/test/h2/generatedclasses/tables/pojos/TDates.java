package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDates implements org.jooq.test.h2.generatedclasses.tables.interfaces.ITDates {

	private static final long serialVersionUID = -1473830966;

	private java.lang.Integer  id;
	private java.sql.Date      d;
	private java.sql.Time      t;
	private java.sql.Timestamp ts;
	private java.lang.Integer  dInt;
	private java.lang.Long     tsBigint;

	public TDates() {}

	public TDates(
		java.lang.Integer  id,
		java.sql.Date      d,
		java.sql.Time      t,
		java.sql.Timestamp ts,
		java.lang.Integer  dInt,
		java.lang.Long     tsBigint
	) {
		this.id = id;
		this.d = d;
		this.t = t;
		this.ts = ts;
		this.dInt = dInt;
		this.tsBigint = tsBigint;
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
	public java.sql.Date getD() {
		return this.d;
	}

	@Override
	public void setD(java.sql.Date d) {
		this.d = d;
	}

	@Override
	public java.sql.Time getT() {
		return this.t;
	}

	@Override
	public void setT(java.sql.Time t) {
		this.t = t;
	}

	@Override
	public java.sql.Timestamp getTs() {
		return this.ts;
	}

	@Override
	public void setTs(java.sql.Timestamp ts) {
		this.ts = ts;
	}

	@Override
	public java.lang.Integer getDInt() {
		return this.dInt;
	}

	@Override
	public void setDInt(java.lang.Integer dInt) {
		this.dInt = dInt;
	}

	@Override
	public java.lang.Long getTsBigint() {
		return this.tsBigint;
	}

	@Override
	public void setTsBigint(java.lang.Long tsBigint) {
		this.tsBigint = tsBigint;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.ITDates from) {
		setId(from.getId());
		setD(from.getD());
		setT(from.getT());
		setTs(from.getTs());
		setDInt(from.getDInt());
		setTsBigint(from.getTsBigint());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.ITDates> E into(E into) {
		into.from(this);
		return into;
	}

	// Here, a toString() method could be generated
}
