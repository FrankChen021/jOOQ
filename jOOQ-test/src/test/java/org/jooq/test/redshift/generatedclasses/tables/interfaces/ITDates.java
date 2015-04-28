/**
 * This class is generated by jOOQ
 */
package org.jooq.test.redshift.generatedclasses.tables.interfaces;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITDates extends Serializable {

	/**
	 * Getter for <code>public.t_dates.id</code>.
	 */
	public Integer getId();

	/**
	 * Getter for <code>public.t_dates.d</code>.
	 */
	public Date getD();

	/**
	 * Getter for <code>public.t_dates.t</code>.
	 */
	public Timestamp getT();

	/**
	 * Getter for <code>public.t_dates.ts</code>.
	 */
	public Timestamp getTs();

	/**
	 * Getter for <code>public.t_dates.d_int</code>.
	 */
	public Integer getDInt();

	/**
	 * Getter for <code>public.t_dates.ts_bigint</code>.
	 */
	public Long getTsBigint();
}
