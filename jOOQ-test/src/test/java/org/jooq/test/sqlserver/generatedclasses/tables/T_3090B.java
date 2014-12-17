/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_3090B extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090BRecord> {

	private static final long serialVersionUID = 74502319;

	/**
	 * The reference instance of <code>dbo.t_3090_b</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.T_3090B T_3090_B = new org.jooq.test.sqlserver.generatedclasses.tables.T_3090B();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090BRecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090BRecord.class;
	}

	/**
	 * The column <code>dbo.t_3090_b.id1</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090BRecord, java.lang.Integer> ID1 = createField("id1", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>dbo.t_3090_b.id2</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090BRecord, java.lang.Integer> ID2 = createField("id2", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>dbo.t_3090_b.data</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090BRecord, java.lang.Integer> DATA = createField("data", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>dbo.t_3090_b</code> table reference
	 */
	public T_3090B() {
		this("t_3090_b", null);
	}

	/**
	 * Create an aliased <code>dbo.t_3090_b</code> table reference
	 */
	public T_3090B(java.lang.String alias) {
		this(alias, org.jooq.test.sqlserver.generatedclasses.tables.T_3090B.T_3090_B);
	}

	private T_3090B(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090BRecord> aliased) {
		this(alias, aliased, null);
	}

	private T_3090B(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090BRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090BRecord> getPrimaryKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.UK_T_3090_B;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090BRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090BRecord>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.UK_T_3090_B);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.T_3090B as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.T_3090B(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.T_3090B rename(java.lang.String name) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.T_3090B(name, null);
	}
}
