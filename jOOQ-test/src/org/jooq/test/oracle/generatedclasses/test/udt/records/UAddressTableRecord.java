/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UAddressTableRecord extends org.jooq.impl.ArrayRecordImpl<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> {

	private static final long serialVersionUID = -1895802770;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #UAddressTableRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public UAddressTableRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.oracle.generatedclasses.test.Test.TEST, "U_ADDRESS_TABLE", org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.U_ADDRESS_TYPE.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #UAddressTableRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public UAddressTableRecord(org.jooq.Configuration configuration, org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #UAddressTableRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public UAddressTableRecord(org.jooq.Configuration configuration, java.util.List<? extends org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>TEST.U_ADDRESS_TABLE</code> record
	 */
	public UAddressTableRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.Test.TEST, "U_ADDRESS_TABLE", org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.U_ADDRESS_TYPE.getDataType());
	}

	/**
	 * Create a new <code>TEST.U_ADDRESS_TABLE</code> record
	 */
	public UAddressTableRecord(org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>TEST.U_ADDRESS_TABLE</code> record
	 */
	public UAddressTableRecord(java.util.Collection<? extends org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> collection) {
		this();
		set(collection);
	}
}
