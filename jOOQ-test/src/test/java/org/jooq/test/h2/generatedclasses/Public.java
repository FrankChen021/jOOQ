/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1903418723;

	/**
	 * The singleton instance of <code>PUBLIC</code>
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super("PUBLIC");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final java.util.List<org.jooq.Sequence<?>> getSequences0() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			org.jooq.test.h2.generatedclasses.Sequences.S_AUTHOR_ID,
			org.jooq.test.h2.generatedclasses.Sequences.S_TRIGGERS_SEQUENCE);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.test.h2.generatedclasses.tables.T_3571.T_3571,
			org.jooq.test.h2.generatedclasses.tables.T_2327UkOnly.T_2327_UK_ONLY,
			org.jooq.test.h2.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK,
			org.jooq.test.h2.generatedclasses.tables.TIdentity.T_IDENTITY,
			org.jooq.test.h2.generatedclasses.tables.TDates.T_DATES,
			org.jooq.test.h2.generatedclasses.tables.TBooleans.T_BOOLEANS,
			org.jooq.test.h2.generatedclasses.tables.TUnsigned.T_UNSIGNED,
			org.jooq.test.h2.generatedclasses.tables.TTriggers.T_TRIGGERS,
			org.jooq.test.h2.generatedclasses.tables.TLanguage.T_LANGUAGE,
			org.jooq.test.h2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST,
			org.jooq.test.h2.generatedclasses.tables.T_785.T_785,
			org.jooq.test.h2.generatedclasses.tables.T_877.T_877,
			org.jooq.test.h2.generatedclasses.tables.T_2486.T_2486,
			org.jooq.test.h2.generatedclasses.tables.T_2698.T_2698,
			org.jooq.test.h2.generatedclasses.tables.T_2718.T_2718,
			org.jooq.test.h2.generatedclasses.tables.T_3488AbcXyzEee.T_3488_ABC_XYZ_EEE,
			org.jooq.test.h2.generatedclasses.tables.TAuthor.T_AUTHOR,
			org.jooq.test.h2.generatedclasses.tables.TBook.T_BOOK,
			org.jooq.test.h2.generatedclasses.tables.TBookStore.T_BOOK_STORE,
			org.jooq.test.h2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			org.jooq.test.h2.generatedclasses.tables.TArrays.T_ARRAYS,
			org.jooq.test.h2.generatedclasses.tables.XUnused.X_UNUSED,
			org.jooq.test.h2.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES,
			org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE,
			org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69,
			org.jooq.test.h2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71,
			org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85,
			org.jooq.test.h2.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025,
			org.jooq.test.h2.generatedclasses.tables.VLibrary.V_LIBRARY,
			org.jooq.test.h2.generatedclasses.tables.VAuthor.V_AUTHOR,
			org.jooq.test.h2.generatedclasses.tables.VBook.V_BOOK,
			org.jooq.test.h2.generatedclasses.tables.Ää.ÄÄ,
			org.jooq.test.h2.generatedclasses.tables.V_2603.V_2603,
			org.jooq.test.h2.generatedclasses.tables.V_3176.V_3176);
	}
}
