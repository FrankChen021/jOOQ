/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Count2 extends org.jooq.impl.AbstractRoutine<java.lang.Long> {

	private static final long serialVersionUID = 1606638259;

	/**
	 * The parameter <code>pg_catalog.count.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * Create a new routine call instance
	 */
	public Count2() {
		super("count", org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT);

		setReturnParameter(RETURN_VALUE);
		setOverloaded(true);
	}
}
