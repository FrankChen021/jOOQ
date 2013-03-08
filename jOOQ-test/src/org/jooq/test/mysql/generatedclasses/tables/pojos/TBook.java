/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TBook implements java.io.Serializable {

	private static final long serialVersionUID = -1812465880;

	private final java.lang.Integer                                      id;
	private final java.lang.Integer                                      authorId;
	private final java.lang.Integer                                      coAuthorId;
	private final java.lang.Integer                                      detailsId;
	private final java.lang.String                                       title;
	private final java.lang.Integer                                      publishedIn;
	private final java.lang.Integer                                      languageId;
	private final java.lang.String                                       contentText;
	private final byte[]                                                 contentPdf;
	private final org.jooq.test.mysql.generatedclasses.enums.TBookStatus status;

	public TBook(
		java.lang.Integer                                      id,
		java.lang.Integer                                      authorId,
		java.lang.Integer                                      coAuthorId,
		java.lang.Integer                                      detailsId,
		java.lang.String                                       title,
		java.lang.Integer                                      publishedIn,
		java.lang.Integer                                      languageId,
		java.lang.String                                       contentText,
		byte[]                                                 contentPdf,
		org.jooq.test.mysql.generatedclasses.enums.TBookStatus status
	) {
		this.id = id;
		this.authorId = authorId;
		this.coAuthorId = coAuthorId;
		this.detailsId = detailsId;
		this.title = title;
		this.publishedIn = publishedIn;
		this.languageId = languageId;
		this.contentText = contentText;
		this.contentPdf = contentPdf;
		this.status = status;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public java.lang.Integer getAuthorId() {
		return this.authorId;
	}

	public java.lang.Integer getCoAuthorId() {
		return this.coAuthorId;
	}

	public java.lang.Integer getDetailsId() {
		return this.detailsId;
	}

	public java.lang.String getTitle() {
		return this.title;
	}

	public java.lang.Integer getPublishedIn() {
		return this.publishedIn;
	}

	public java.lang.Integer getLanguageId() {
		return this.languageId;
	}

	public java.lang.String getContentText() {
		return this.contentText;
	}

	public byte[] getContentPdf() {
		return this.contentPdf;
	}

	public org.jooq.test.mysql.generatedclasses.enums.TBookStatus getStatus() {
		return this.status;
	}
}
