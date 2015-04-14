/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables.pojos


import java.io.Serializable
import java.lang.Integer
import java.lang.Object
import java.lang.String
import java.util.UUID

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull


/**
 * This class is generated by jOOQ.
 */
@Entity
@Table(name = "T_EXOTIC_TYPES", schema = "TEST")
class TExoticTypes(
	  private var id : Integer     
	, private var uu : UUID        
	, private var javaIoSerializable : Serializable
	, private var plainSqlConverterXml : String      
	, private var plainSqlBindingXml : String      
	, private var oracleXmlAsIs : Object      
	, private var oracleXmlAsDocument : Object      
) extends Serializable {

	def this() = {
		this(null, null, null, null, null, null, null)
	}

	def this (value : TExoticTypes) = {
		this(
			  value.id
			, value.uu
			, value.javaIoSerializable
			, value.plainSqlConverterXml
			, value.plainSqlBindingXml
			, value.oracleXmlAsIs
			, value.oracleXmlAsDocument
		)
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	@NotNull
	def getId : Integer = {
		this.id
	}

	def setId(id : Integer) : Unit = {
		this.id = id
	}

	@Column(name = "UU")
	def getUu : UUID = {
		this.uu
	}

	def setUu(uu : UUID) : Unit = {
		this.uu = uu
	}

	@Column(name = "JAVA_IO_SERIALIZABLE")
	def getJavaIoSerializable : Serializable = {
		this.javaIoSerializable
	}

	def setJavaIoSerializable(javaIoSerializable : Serializable) : Unit = {
		this.javaIoSerializable = javaIoSerializable
	}

	@Column(name = "PLAIN_SQL_CONVERTER_XML")
	def getPlainSqlConverterXml : String = {
		this.plainSqlConverterXml
	}

	def setPlainSqlConverterXml(plainSqlConverterXml : String) : Unit = {
		this.plainSqlConverterXml = plainSqlConverterXml
	}

	@Column(name = "PLAIN_SQL_BINDING_XML")
	def getPlainSqlBindingXml : String = {
		this.plainSqlBindingXml
	}

	def setPlainSqlBindingXml(plainSqlBindingXml : String) : Unit = {
		this.plainSqlBindingXml = plainSqlBindingXml
	}

	@Column(name = "ORACLE_XML_AS_IS")
	def getOracleXmlAsIs : Object = {
		this.oracleXmlAsIs
	}

	def setOracleXmlAsIs(oracleXmlAsIs : Object) : Unit = {
		this.oracleXmlAsIs = oracleXmlAsIs
	}

	@Column(name = "ORACLE_XML_AS_DOCUMENT")
	def getOracleXmlAsDocument : Object = {
		this.oracleXmlAsDocument
	}

	def setOracleXmlAsDocument(oracleXmlAsDocument : Object) : Unit = {
		this.oracleXmlAsDocument = oracleXmlAsDocument
	}

	override def equals(obj : Any) : scala.Boolean = {
		if (this == obj)
			return true
		if (obj == null)
			return false
		if (getClass() != obj.getClass())
			return false
		val other = obj.asInstanceOf[TExoticTypes]
		if (id == null) {
			if (other.id != null)
				return false
		}
		else if (!id.equals(other.id))
			return false
		if (uu == null) {
			if (other.uu != null)
				return false
		}
		else if (!uu.equals(other.uu))
			return false
		if (javaIoSerializable == null) {
			if (other.javaIoSerializable != null)
				return false
		}
		else if (!javaIoSerializable.equals(other.javaIoSerializable))
			return false
		if (plainSqlConverterXml == null) {
			if (other.plainSqlConverterXml != null)
				return false
		}
		else if (!plainSqlConverterXml.equals(other.plainSqlConverterXml))
			return false
		if (plainSqlBindingXml == null) {
			if (other.plainSqlBindingXml != null)
				return false
		}
		else if (!plainSqlBindingXml.equals(other.plainSqlBindingXml))
			return false
		if (oracleXmlAsIs == null) {
			if (other.oracleXmlAsIs != null)
				return false
		}
		else if (!oracleXmlAsIs.equals(other.oracleXmlAsIs))
			return false
		if (oracleXmlAsDocument == null) {
			if (other.oracleXmlAsDocument != null)
				return false
		}
		else if (!oracleXmlAsDocument.equals(other.oracleXmlAsDocument))
			return false
		return true
	}

	override def hashCode : Int = {
		val prime = 31
		var result = 1
		result = prime * result + (if (id == null) 0 else id.hashCode())
		result = prime * result + (if (uu == null) 0 else uu.hashCode())
		result = prime * result + (if (javaIoSerializable == null) 0 else javaIoSerializable.hashCode())
		result = prime * result + (if (plainSqlConverterXml == null) 0 else plainSqlConverterXml.hashCode())
		result = prime * result + (if (plainSqlBindingXml == null) 0 else plainSqlBindingXml.hashCode())
		result = prime * result + (if (oracleXmlAsIs == null) 0 else oracleXmlAsIs.hashCode())
		result = prime * result + (if (oracleXmlAsDocument == null) 0 else oracleXmlAsDocument.hashCode())
		return result
	}
}
