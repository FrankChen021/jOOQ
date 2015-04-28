/**
 * This class is generated by jOOQ
 */
package org.jooq.test.redshift.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.redshift.generatedclasses.tables.TLanguage;
import org.jooq.test.redshift.generatedclasses.tables.interfaces.ITLanguage;


/**
 * An entity holding language master data
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLanguageRecord extends UpdatableRecordImpl<TLanguageRecord> implements Record4<String, String, String, Integer>, ITLanguage {

	private static final long serialVersionUID = -2037615539;

	/**
	 * Setter for <code>public.t_language.cd</code>. The language ISO code
	 */
	public TLanguageRecord setCd(String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_language.cd</code>. The language ISO code
	 */
	@Override
	public String getCd() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.t_language.description</code>. The language description
	 */
	public TLanguageRecord setDescription(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_language.description</code>. The language description
	 */
	@Override
	public String getDescription() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.t_language.description_english</code>.
	 */
	public TLanguageRecord setDescriptionEnglish(String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_language.description_english</code>.
	 */
	@Override
	public String getDescriptionEnglish() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.t_language.id</code>. The language ID
	 */
	public TLanguageRecord setId(Integer value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_language.id</code>. The language ID
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, String, Integer> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, String, Integer> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return TLanguage.T_LANGUAGE.CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TLanguage.T_LANGUAGE.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return TLanguage.T_LANGUAGE.DESCRIPTION_ENGLISH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return TLanguage.T_LANGUAGE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getDescriptionEnglish();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TLanguageRecord value1(String value) {
		setCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TLanguageRecord value2(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TLanguageRecord value3(String value) {
		setDescriptionEnglish(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TLanguageRecord value4(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TLanguageRecord values(String value1, String value2, String value3, Integer value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TLanguageRecord
	 */
	public TLanguageRecord() {
		super(TLanguage.T_LANGUAGE);
	}

	/**
	 * Create a detached, initialised TLanguageRecord
	 */
	public TLanguageRecord(String cd, String description, String descriptionEnglish, Integer id) {
		super(TLanguage.T_LANGUAGE);

		setValue(0, cd);
		setValue(1, description);
		setValue(2, descriptionEnglish);
		setValue(3, id);
	}
}
