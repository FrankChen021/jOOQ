/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UNested_1 implements java.io.Serializable {

	private static final long serialVersionUID = 1554964870;

	private java.lang.Integer                                                         id;
	private org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberTableRecord nested;

	public UNested_1() {}

	public UNested_1(
		java.lang.Integer                                                         id,
		org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberTableRecord nested
	) {
		this.id = id;
		this.nested = nested;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberTableRecord getNested() {
		return this.nested;
	}

	public void setNested(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberTableRecord nested) {
		this.nested = nested;
	}
}
