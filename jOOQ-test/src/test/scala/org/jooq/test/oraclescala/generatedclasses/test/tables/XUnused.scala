/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables


import java.lang.Class
import java.lang.Integer
import java.lang.String
import java.math.BigDecimal
import java.math.BigInteger
import java.util.Arrays
import java.util.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl
import org.jooq.test.oraclescala.generatedclasses.test.Keys
import org.jooq.test.oraclescala.generatedclasses.test.Test
import org.jooq.test.oraclescala.generatedclasses.test.tables.records.XUnusedRecord


object XUnused {

	/**
	 * The reference instance of <code>TEST.X_UNUSED</code>
	 */
	val X_UNUSED = new XUnused
}

/**
 * An unused table in the same schema.
 * 
 * "Its comments contain special characters"
 */
class XUnused(alias : String, aliased : Table[XUnusedRecord], parameters : Array[ Field[_] ]) extends TableImpl[XUnusedRecord](alias, Test.TEST, aliased, parameters, "An unused table in the same schema.\n\n\"Its comments contain special characters\"") {

	/**
	 * The class holding records for this type
	 */
	override def getRecordType : Class[XUnusedRecord] = {
		classOf[XUnusedRecord]
	}

	/**
	 * The column <code>TEST.X_UNUSED.ID</code>. An unused column of an unused table in the same schema.

"Its comments contain special characters"
	 */
	val ID : TableField[XUnusedRecord, Integer] = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "An unused column of an unused table in the same schema.\n\n\"Its comments contain special characters\"")

	/**
	 * The column <code>TEST.X_UNUSED.NAME</code>.
	 */
	val NAME : TableField[XUnusedRecord, String] = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), "")

	/**
	 * The column <code>TEST.X_UNUSED.BIG_INTEGER</code>.
	 */
	val BIG_INTEGER : TableField[XUnusedRecord, BigInteger] = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38), "")

	/**
	 * The column <code>TEST.X_UNUSED.ID_REF</code>.
	 */
	val ID_REF : TableField[XUnusedRecord, Integer] = createField("ID_REF", org.jooq.impl.SQLDataType.INTEGER, "")

	/**
	 * The column <code>TEST.X_UNUSED.CLASS</code>.
	 */
	val CLASS : TableField[XUnusedRecord, Integer] = createField("CLASS", org.jooq.impl.SQLDataType.INTEGER, "")

	/**
	 * The column <code>TEST.X_UNUSED.FIELDS</code>.
	 */
	val FIELDS : TableField[XUnusedRecord, Integer] = createField("FIELDS", org.jooq.impl.SQLDataType.INTEGER, "")

	/**
	 * The column <code>TEST.X_UNUSED.CONFIGURATION</code>.
	 */
	val CONFIGURATION : TableField[XUnusedRecord, Integer] = createField("CONFIGURATION", org.jooq.impl.SQLDataType.INTEGER, "")

	/**
	 * The column <code>TEST.X_UNUSED.U_D_T</code>.
	 */
	val U_D_T : TableField[XUnusedRecord, Integer] = createField("U_D_T", org.jooq.impl.SQLDataType.INTEGER, "")

	/**
	 * The column <code>TEST.X_UNUSED.META_DATA</code>.
	 */
	val META_DATA : TableField[XUnusedRecord, Integer] = createField("META_DATA", org.jooq.impl.SQLDataType.INTEGER, "")

	/**
	 * The column <code>TEST.X_UNUSED.TYPE0</code>.
	 */
	val TYPE0 : TableField[XUnusedRecord, Integer] = createField("TYPE0", org.jooq.impl.SQLDataType.INTEGER, "")

	/**
	 * The column <code>TEST.X_UNUSED.PRIMARY_KEY</code>.
	 */
	val PRIMARY_KEY : TableField[XUnusedRecord, Integer] = createField("PRIMARY_KEY", org.jooq.impl.SQLDataType.INTEGER, "")

	/**
	 * The column <code>TEST.X_UNUSED.PRIMARYKEY</code>.
	 */
	val PRIMARYKEY : TableField[XUnusedRecord, Integer] = createField("PRIMARYKEY", org.jooq.impl.SQLDataType.INTEGER, "")

	/**
	 * The column <code>TEST.X_UNUSED.NAME_REF</code>.
	 */
	val NAME_REF : TableField[XUnusedRecord, String] = createField("NAME_REF", org.jooq.impl.SQLDataType.VARCHAR.length(10), "")

	/**
	 * The column <code>TEST.X_UNUSED.FIELD 737</code>.
	 */
	val FIELD_737 : TableField[XUnusedRecord, BigDecimal] = createField("FIELD 737", org.jooq.impl.SQLDataType.NUMERIC.precision(25, 2), "")

	/**
	 * The column <code>TEST.X_UNUSED.MS_UNUSED_ID_REF</code>.
	 */
	val MS_UNUSED_ID_REF : TableField[XUnusedRecord, Integer] = createField("MS_UNUSED_ID_REF", org.jooq.impl.SQLDataType.INTEGER, "")

	/**
	 * The column <code>TEST.X_UNUSED.MS_UNUSED_NAME_REF</code>.
	 */
	val MS_UNUSED_NAME_REF : TableField[XUnusedRecord, String] = createField("MS_UNUSED_NAME_REF", org.jooq.impl.SQLDataType.VARCHAR.length(10), "")

	/**
	 * Create a <code>TEST.X_UNUSED</code> table reference
	 */
	def this() = {
		this("X_UNUSED", null, null)
	}

	/**
	 * Create an aliased <code>TEST.X_UNUSED</code> table reference
	 */
	def this(alias : String) = {
		this(alias, org.jooq.test.oraclescala.generatedclasses.test.tables.XUnused.X_UNUSED, null)
	}

	private def this(alias : String, aliased : Table[XUnusedRecord]) = {
		this(alias, aliased, null)
	}

	override def getPrimaryKey : UniqueKey[XUnusedRecord] = {
		Keys.PK_X_UNUSED
	}

	override def getKeys : List[ UniqueKey[XUnusedRecord] ] = {
		return Arrays.asList[ UniqueKey[XUnusedRecord] ](Keys.PK_X_UNUSED, Keys.UK_X_UNUSED_ID)
	}

	override def getReferences : List[ ForeignKey[XUnusedRecord, _] ] = {
		return Arrays.asList[ ForeignKey[XUnusedRecord, _] ](Keys.FK_X_UNUSED_SELF)
	}

	override def as(alias : String) : XUnused = {
		new XUnused(alias, this)
	}

	/**
	 * Rename this table
	 */
	def rename(name : String) : XUnused = {
		new XUnused(name, null)
	}
}
