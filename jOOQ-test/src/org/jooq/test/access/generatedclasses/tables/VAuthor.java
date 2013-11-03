/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.access.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -824112765;

	/**
	 * The singleton instance of <code>v_author</code>
	 */
	public static final org.jooq.test.access.generatedclasses.tables.VAuthor V_AUTHOR = new org.jooq.test.access.generatedclasses.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.access.generatedclasses.tables.records.VAuthorRecord> getRecordType() {
		return org.jooq.test.access.generatedclasses.tables.records.VAuthorRecord.class;
	}

	/**
	 * The column <code>v_author.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>v_author.first_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>v_author.last_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>v_author.date_of_birth</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.VAuthorRecord, java.sql.Timestamp> DATE_OF_BIRTH = createField("date_of_birth", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>v_author.year_of_birth</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("year_of_birth", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>v_author.address</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.VAuthorRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(200), this);

	/**
	 * Create a <code>v_author</code> table reference
	 */
	public VAuthor() {
		super("v_author", org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>v_author</code> table reference
	 */
	public VAuthor(java.lang.String alias) {
		super(alias, org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.access.generatedclasses.tables.VAuthor.V_AUTHOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.access.generatedclasses.tables.VAuthor as(java.lang.String alias) {
		return new org.jooq.test.access.generatedclasses.tables.VAuthor(alias);
	}
}
