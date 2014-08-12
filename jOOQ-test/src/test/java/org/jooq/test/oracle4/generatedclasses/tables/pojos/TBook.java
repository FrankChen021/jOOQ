/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle4.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK", schema = "TEST")
public class TBook implements java.io.Serializable {

	private static final long serialVersionUID = -2023862248;

	private java.lang.Integer id;
	private java.lang.Integer authorId;

	public TBook() {}

	public TBook(
		java.lang.Integer id,
		java.lang.Integer authorId
	) {
		this.id = id;
		this.authorId = authorId;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(java.lang.Integer authorId) {
		this.authorId = authorId;
	}
}
