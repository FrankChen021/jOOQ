
package org.jooq.meta.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jooq.util.jaxb.tools.StringAdapter;
import org.jooq.util.jaxb.tools.XMLAppendable;
import org.jooq.util.jaxb.tools.XMLBuilder;


/**
 * Definitions of custom naming strategies (declarative or programmatic) to define how generated Java objects should be named.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Strategy", propOrder = {

})
@SuppressWarnings({
    "all"
})
public class Strategy implements Serializable, XMLAppendable
{

    private final static long serialVersionUID = 32001L;
    @XmlElement(defaultValue = "org.jooq.codegen.DefaultGeneratorStrategy")
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String name = "org.jooq.codegen.DefaultGeneratorStrategy";
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String java;
    protected Matchers matchers;

    /**
     * The class used to provide a naming strategy for generated source code. You may override this with your custom naming strategy. This cannot be combined with a matcher configuration.
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * The class used to provide a naming strategy for generated source code. You may override this with your custom naming strategy. This cannot be combined with a matcher configuration.
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * A self-contained, inline implementation of {@link org.jooq.codegen.GeneratorStrategy} that will be compiled and class-loaded on the fly by the code generator.
     * 
     */
    public String getJava() {
        return java;
    }

    /**
     * A self-contained, inline implementation of {@link org.jooq.codegen.GeneratorStrategy} that will be compiled and class-loaded on the fly by the code generator.
     * 
     */
    public void setJava(String value) {
        this.java = value;
    }

    /**
     * The matcher strategy configuration used when applying an XML-based strategy. This cannot be combined with a named strategy configuration.
     * 
     */
    public Matchers getMatchers() {
        return matchers;
    }

    /**
     * The matcher strategy configuration used when applying an XML-based strategy. This cannot be combined with a named strategy configuration.
     * 
     */
    public void setMatchers(Matchers value) {
        this.matchers = value;
    }

    /**
     * The class used to provide a naming strategy for generated source code. You may override this with your custom naming strategy. This cannot be combined with a matcher configuration.
     * 
     */
    public Strategy withName(String value) {
        setName(value);
        return this;
    }

    /**
     * A self-contained, inline implementation of {@link org.jooq.codegen.GeneratorStrategy} that will be compiled and class-loaded on the fly by the code generator.
     * 
     */
    public Strategy withJava(String value) {
        setJava(value);
        return this;
    }

    /**
     * The matcher strategy configuration used when applying an XML-based strategy. This cannot be combined with a named strategy configuration.
     * 
     */
    public Strategy withMatchers(Matchers value) {
        setMatchers(value);
        return this;
    }

    @Override
    public final void appendTo(XMLBuilder builder) {
        builder.append("name", name);
        builder.append("java", java);
        builder.append("matchers", matchers);
    }

    @Override
    public String toString() {
        XMLBuilder builder = XMLBuilder.nonFormatting();
        appendTo(builder);
        return builder.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass()!= that.getClass()) {
            return false;
        }
        Strategy other = ((Strategy) that);
        if (name == null) {
            if (other.name!= null) {
                return false;
            }
        } else {
            if (!name.equals(other.name)) {
                return false;
            }
        }
        if (java == null) {
            if (other.java!= null) {
                return false;
            }
        } else {
            if (!java.equals(other.java)) {
                return false;
            }
        }
        if (matchers == null) {
            if (other.matchers!= null) {
                return false;
            }
        } else {
            if (!matchers.equals(other.matchers)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = ((prime*result)+((name == null)? 0 :name.hashCode()));
        result = ((prime*result)+((java == null)? 0 :java.hashCode()));
        result = ((prime*result)+((matchers == null)? 0 :matchers.hashCode()));
        return result;
    }

}
