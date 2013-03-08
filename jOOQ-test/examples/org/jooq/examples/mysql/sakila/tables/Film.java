/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class Film extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> {

	private static final long serialVersionUID = 111928938;

	/**
	 * The singleton instance of <code>sakila.film</code>
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Film FILM = new org.jooq.examples.mysql.sakila.tables.Film();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.FilmRecord.class;
	}

	/**
	 * The column <code>sakila.film.film_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.Short> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>sakila.film.title</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sakila.film.description</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>sakila.film.release_year</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.sql.Date> RELEASE_YEAR = createField("release_year", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>sakila.film.language_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.Byte> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>sakila.film.original_language_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.Byte> ORIGINAL_LANGUAGE_ID = createField("original_language_id", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>sakila.film.rental_duration</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.Byte> RENTAL_DURATION = createField("rental_duration", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>sakila.film.rental_rate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.math.BigDecimal> RENTAL_RATE = createField("rental_rate", org.jooq.impl.SQLDataType.DECIMAL.precision(4, 2), this);

	/**
	 * The column <code>sakila.film.length</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.Short> LENGTH = createField("length", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>sakila.film.replacement_cost</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.math.BigDecimal> REPLACEMENT_COST = createField("replacement_cost", org.jooq.impl.SQLDataType.DECIMAL.precision(5, 2), this);

	/**
	 * The column <code>sakila.film.rating</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, org.jooq.examples.mysql.sakila.enums.FilmRating> RATING = createField("rating", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.examples.mysql.sakila.enums.FilmRating.class), this);

	/**
	 * The column <code>sakila.film.special_features</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.String> SPECIAL_FEATURES = createField("special_features", org.jooq.impl.SQLDataType.VARCHAR.length(54), this);

	/**
	 * The column <code>sakila.film.last_update</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>sakila.film</code> table reference
	 */
	public Film() {
		super("film", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.film</code> table reference
	 */
	public Film(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.Film.FILM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.Short> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_FILM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> getPrimaryKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_FILM_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_FILM_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.FK_FILM_LANGUAGE, org.jooq.examples.mysql.sakila.Keys.FK_FILM_LANGUAGE_ORIGINAL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.tables.Film as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.Film(alias);
	}
}
