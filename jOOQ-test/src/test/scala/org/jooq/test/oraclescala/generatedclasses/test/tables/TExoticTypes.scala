/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables


import java.io.Serializable
import java.lang.Class
import java.lang.Integer
import java.lang.Object
import java.lang.String
import java.util.Arrays
import java.util.List
import java.util.UUID

import org.jooq.Field
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl
import org.jooq.test.all.bindings.SerializedBinding
import org.jooq.test.oraclescala.generatedclasses.test.Keys
import org.jooq.test.oraclescala.generatedclasses.test.Test
import org.jooq.test.oraclescala.generatedclasses.test.tables.records.TExoticTypesRecord


object TExoticTypes {

	/**
	 * The reference instance of <code>TEST.T_EXOTIC_TYPES</code>
	 */
	val T_EXOTIC_TYPES = new TExoticTypes
}

/**
 * This class is generated by jOOQ.
 */
class TExoticTypes(alias : String, aliased : Table[TExoticTypesRecord], parameters : Array[ Field[_] ]) extends TableImpl[TExoticTypesRecord](alias, Test.TEST, aliased, parameters, "") {

	/**
	 * The class holding records for this type
	 */
	override def getRecordType : Class[TExoticTypesRecord] = {
		classOf[TExoticTypesRecord]
	}

	/**
	 * The column <code>TEST.T_EXOTIC_TYPES.ID</code>.
	 */
	val ID : TableField[TExoticTypesRecord, Integer] = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

	/**
	 * The column <code>TEST.T_EXOTIC_TYPES.UU</code>.
	 */
	val UU : TableField[TExoticTypesRecord, UUID] = createField("UU", org.jooq.impl.SQLDataType.UUID, "")

	/**
	 * The column <code>TEST.T_EXOTIC_TYPES.JAVA_IO_SERIALIZABLE</code>.
	 */
	val JAVA_IO_SERIALIZABLE : TableField[TExoticTypesRecord, Serializable] = createField("JAVA_IO_SERIALIZABLE", org.jooq.impl.SQLDataType.BLOB, "", new SerializedBinding())

	/**
	 * The column <code>TEST.T_EXOTIC_TYPES.PLAIN_SQL_CONVERTER_XML</code>.
	 */
	val PLAIN_SQL_CONVERTER_XML : TableField[TExoticTypesRecord, String] = createField("PLAIN_SQL_CONVERTER_XML", org.jooq.impl.SQLDataType.CLOB, "")

	/**
	 * The column <code>TEST.T_EXOTIC_TYPES.PLAIN_SQL_BINDING_XML</code>.
	 */
	val PLAIN_SQL_BINDING_XML : TableField[TExoticTypesRecord, String] = createField("PLAIN_SQL_BINDING_XML", org.jooq.impl.SQLDataType.CLOB, "")

	/**
	 * The column <code>TEST.T_EXOTIC_TYPES.ORACLE_XML_AS_IS</code>.
	 */
	val ORACLE_XML_AS_IS : TableField[TExoticTypesRecord, Object] = createField("ORACLE_XML_AS_IS", org.jooq.impl.DefaultDataType.getDefaultDataType("XMLTYPE"), "")

	/**
	 * The column <code>TEST.T_EXOTIC_TYPES.ORACLE_XML_AS_DOCUMENT</code>.
	 */
	val ORACLE_XML_AS_DOCUMENT : TableField[TExoticTypesRecord, Object] = createField("ORACLE_XML_AS_DOCUMENT", org.jooq.impl.DefaultDataType.getDefaultDataType("XMLTYPE"), "")

	/**
	 * Create a <code>TEST.T_EXOTIC_TYPES</code> table reference
	 */
	def this() = {
		this("T_EXOTIC_TYPES", null, null)
	}

	/**
	 * Create an aliased <code>TEST.T_EXOTIC_TYPES</code> table reference
	 */
	def this(alias : String) = {
		this(alias, org.jooq.test.oraclescala.generatedclasses.test.tables.TExoticTypes.T_EXOTIC_TYPES, null)
	}

	private def this(alias : String, aliased : Table[TExoticTypesRecord]) = {
		this(alias, aliased, null)
	}

	override def getPrimaryKey : UniqueKey[TExoticTypesRecord] = {
		Keys.PK_T_EXOTIC_TYPES
	}

	override def getKeys : List[ UniqueKey[TExoticTypesRecord] ] = {
		return Arrays.asList[ UniqueKey[TExoticTypesRecord] ](Keys.PK_T_EXOTIC_TYPES)
	}

	override def as(alias : String) : TExoticTypes = {
		new TExoticTypes(alias, this)
	}

	/**
	 * Rename this table
	 */
	def rename(name : String) : TExoticTypes = {
		new TExoticTypes(name, null)
	}
}
