package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XUnused implements org.jooq.test.h2.generatedclasses.tables.interfaces.IXUnused {

	private static final long serialVersionUID = -2014198006;

	private java.lang.Integer    id;
	private java.lang.String     name;
	private java.math.BigInteger bigInteger;
	private java.lang.Integer    idRef;
	private java.lang.String     nameRef;
	private java.lang.Integer    class_;
	private java.lang.Integer    fields;
	private java.lang.Integer    table;
	private java.lang.Integer    configuration;
	private java.lang.Integer    uDT;
	private java.lang.Integer    metaData;
	private java.lang.Integer    values;
	private java.lang.Integer    type0;
	private java.lang.Integer    primaryKey;
	private java.lang.Integer    primarykey;
	private java.math.BigDecimal field_737;

	public XUnused() {}

	public XUnused(
		java.lang.Integer    id,
		java.lang.String     name,
		java.math.BigInteger bigInteger,
		java.lang.Integer    idRef,
		java.lang.String     nameRef,
		java.lang.Integer    class_,
		java.lang.Integer    fields,
		java.lang.Integer    table,
		java.lang.Integer    configuration,
		java.lang.Integer    uDT,
		java.lang.Integer    metaData,
		java.lang.Integer    values,
		java.lang.Integer    type0,
		java.lang.Integer    primaryKey,
		java.lang.Integer    primarykey,
		java.math.BigDecimal field_737
	) {
		this.id = id;
		this.name = name;
		this.bigInteger = bigInteger;
		this.idRef = idRef;
		this.nameRef = nameRef;
		this.class_ = class_;
		this.fields = fields;
		this.table = table;
		this.configuration = configuration;
		this.uDT = uDT;
		this.metaData = metaData;
		this.values = values;
		this.type0 = type0;
		this.primaryKey = primaryKey;
		this.primarykey = primarykey;
		this.field_737 = field_737;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@Override
	public java.lang.String getName() {
		return this.name;
	}

	@Override
	public void setName(java.lang.String name) {
		this.name = name;
	}

	@Override
	public java.math.BigInteger getBigInteger() {
		return this.bigInteger;
	}

	@Override
	public void setBigInteger(java.math.BigInteger bigInteger) {
		this.bigInteger = bigInteger;
	}

	@Override
	public java.lang.Integer getIdRef() {
		return this.idRef;
	}

	@Override
	public void setIdRef(java.lang.Integer idRef) {
		this.idRef = idRef;
	}

	@Override
	public java.lang.String getNameRef() {
		return this.nameRef;
	}

	@Override
	public void setNameRef(java.lang.String nameRef) {
		this.nameRef = nameRef;
	}

	@Override
	public java.lang.Integer getClass_() {
		return this.class_;
	}

	@Override
	public void setClass_(java.lang.Integer class_) {
		this.class_ = class_;
	}

	@Override
	public java.lang.Integer getFields() {
		return this.fields;
	}

	@Override
	public void setFields(java.lang.Integer fields) {
		this.fields = fields;
	}

	@Override
	public java.lang.Integer getTable_() {
		return this.table;
	}

	@Override
	public void setTable_(java.lang.Integer table) {
		this.table = table;
	}

	@Override
	public java.lang.Integer getConfiguration() {
		return this.configuration;
	}

	@Override
	public void setConfiguration(java.lang.Integer configuration) {
		this.configuration = configuration;
	}

	@Override
	public java.lang.Integer getUDT() {
		return this.uDT;
	}

	@Override
	public void setUDT(java.lang.Integer uDT) {
		this.uDT = uDT;
	}

	@Override
	public java.lang.Integer getMetaData() {
		return this.metaData;
	}

	@Override
	public void setMetaData(java.lang.Integer metaData) {
		this.metaData = metaData;
	}

	@Override
	public java.lang.Integer getValues_() {
		return this.values;
	}

	@Override
	public void setValues_(java.lang.Integer values) {
		this.values = values;
	}

	@Override
	public java.lang.Integer getType0() {
		return this.type0;
	}

	@Override
	public void setType0(java.lang.Integer type0) {
		this.type0 = type0;
	}

	@Override
	public java.lang.Integer getPrimaryKey_() {
		return this.primaryKey;
	}

	@Override
	public void setPrimaryKey_(java.lang.Integer primaryKey) {
		this.primaryKey = primaryKey;
	}

	@Override
	public java.lang.Integer getPrimarykey() {
		return this.primarykey;
	}

	@Override
	public void setPrimarykey(java.lang.Integer primarykey) {
		this.primarykey = primarykey;
	}

	@Override
	public java.math.BigDecimal getField_737() {
		return this.field_737;
	}

	@Override
	public void setField_737(java.math.BigDecimal field_737) {
		this.field_737 = field_737;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IXUnused from) {
		setId(from.getId());
		setName(from.getName());
		setBigInteger(from.getBigInteger());
		setIdRef(from.getIdRef());
		setNameRef(from.getNameRef());
		setClass_(from.getClass_());
		setFields(from.getFields());
		setTable_(from.getTable_());
		setConfiguration(from.getConfiguration());
		setUDT(from.getUDT());
		setMetaData(from.getMetaData());
		setValues_(from.getValues_());
		setType0(from.getType0());
		setPrimaryKey_(from.getPrimaryKey_());
		setPrimarykey(from.getPrimarykey());
		setField_737(from.getField_737());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IXUnused> E into(E into) {
		into.from(this);
		return into;
	}

	// Here, a toString() method could be generated
}
