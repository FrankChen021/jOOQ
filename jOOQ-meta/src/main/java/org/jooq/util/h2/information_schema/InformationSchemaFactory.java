/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class InformationSchemaFactory extends org.jooq.util.h2.H2Factory {

	private static final long serialVersionUID = -340832465;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public InformationSchemaFactory(java.sql.Connection connection) {
		super(connection);
	}

	/**
	 * Create a factory with a connection and some settings
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param settings The settings to apply to objects created from this factory
	 */
	public InformationSchemaFactory(java.sql.Connection connection, org.jooq.conf.Settings settings) {
		super(connection, settings);
	}
}
