/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables


import java.lang.Class
import java.lang.String

import org.jooq.Field
import org.jooq.Table
import org.jooq.TableField
import org.jooq.impl.TableImpl
import org.jooq.test.oraclescala.generatedclasses.multi_schema.udt.records.NumberObjectRecord
import org.jooq.test.oraclescala.generatedclasses.multi_schema.udt.records.NumberTableRecord
import org.jooq.test.oraclescala.generatedclasses.test.Test
import org.jooq.test.oraclescala.generatedclasses.test.tables.records.T_3711Record


object T_3711 {

	/**
	 * The reference instance of <code>TEST.T_3711</code>
	 */
	val T_3711 = new T_3711
}

/**
 * This class is generated by jOOQ.
 */
class T_3711(alias : String, aliased : Table[T_3711Record], parameters : Array[ Field[_] ]) extends TableImpl[T_3711Record](alias, Test.TEST, aliased, parameters, "") {

	/**
	 * The class holding records for this type
	 */
	override def getRecordType : Class[T_3711Record] = {
		classOf[T_3711Record]
	}

	/**
	 * The column <code>TEST.T_3711.V1</code>.
	 */
	val V1 : TableField[T_3711Record, NumberTableRecord] = createField("V1", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(classOf[org.jooq.test.oraclescala.generatedclasses.multi_schema.udt.records.NumberTableRecord]), "")

	/**
	 * The column <code>TEST.T_3711.V2</code>.
	 */
	val V2 : TableField[T_3711Record, NumberObjectRecord] = createField("V2", org.jooq.test.oraclescala.generatedclasses.multi_schema.udt.NumberObject.NUMBER_OBJECT.getDataType(), "")

	/**
	 * The column <code>TEST.T_3711.V3</code>.
	 */
	val V3 : TableField[T_3711Record, NumberTableRecord] = createField("V3", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(classOf[org.jooq.test.oraclescala.generatedclasses.multi_schema.udt.records.NumberTableRecord]), "")

	/**
	 * The column <code>TEST.T_3711.V4</code>.
	 */
	val V4 : TableField[T_3711Record, NumberObjectRecord] = createField("V4", org.jooq.test.oraclescala.generatedclasses.multi_schema.udt.NumberObject.NUMBER_OBJECT.getDataType(), "")

	/**
	 * The column <code>TEST.T_3711.V7</code>.
	 */
	val V7 : TableField[T_3711Record, NumberTableRecord] = createField("V7", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(classOf[org.jooq.test.oraclescala.generatedclasses.multi_schema.udt.records.NumberTableRecord]), "")

	/**
	 * The column <code>TEST.T_3711.V8</code>.
	 */
	val V8 : TableField[T_3711Record, NumberObjectRecord] = createField("V8", org.jooq.test.oraclescala.generatedclasses.multi_schema.udt.NumberObject.NUMBER_OBJECT.getDataType(), "")

	/**
	 * Create a <code>TEST.T_3711</code> table reference
	 */
	def this() = {
		this("T_3711", null, null)
	}

	/**
	 * Create an aliased <code>TEST.T_3711</code> table reference
	 */
	def this(alias : String) = {
		this(alias, org.jooq.test.oraclescala.generatedclasses.test.tables.T_3711.T_3711, null)
	}

	private def this(alias : String, aliased : Table[T_3711Record]) = {
		this(alias, aliased, null)
	}

	override def as(alias : String) : T_3711 = {
		new T_3711(alias, this)
	}

	/**
	 * Rename this table
	 */
	def rename(name : String) : T_3711 = {
		new T_3711(name, null)
	}
}
