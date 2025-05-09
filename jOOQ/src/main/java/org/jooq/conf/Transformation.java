
package org.jooq.conf;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transformation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Transformation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEVER"/&gt;
 *     &lt;enumeration value="WHEN_NEEDED"/&gt;
 *     &lt;enumeration value="ALWAYS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Transformation")
@XmlEnum
public enum Transformation {


    /**
     * Never apply the transformation
     * 
     */
    NEVER,

    /**
     * Apply the transformation when needed by a dialect
     * 
     */
    WHEN_NEEDED,

    /**
     * Always apply the transformation
     * 
     */
    ALWAYS;

    public String value() {
        return name();
    }

    public static Transformation fromValue(String v) {
        return valueOf(v);
    }

}
