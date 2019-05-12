
package org.jkiss.dbeaver.ext.mssql.model.plan.schemas.sql2008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubqueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubqueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScalarOperator" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}ScalarType" minOccurs="0"/>
 *         &lt;element name="RelOp" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}RelOpType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Operation" use="required" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}SubqueryOperationType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubqueryType", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan", propOrder = {
    "scalarOperator",
    "relOp"
})
public class SubqueryType_sql2008 {

    @XmlElement(name = "ScalarOperator", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan")
    protected ScalarType_sql2008 scalarOperator;
    @XmlElement(name = "RelOp", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan", required = true)
    protected RelOpType_sql2008 relOp;
    @XmlAttribute(name = "Operation", required = true)
    protected SubqueryOperationType_sql2008 operation;

    /**
     * Gets the value of the scalarOperator property.
     * 
     * @return
     *     possible object is
     *     {@link ScalarType_sql2008 }
     *     
     */
    public ScalarType_sql2008 getScalarOperator() {
        return scalarOperator;
    }

    /**
     * Sets the value of the scalarOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScalarType_sql2008 }
     *     
     */
    public void setScalarOperator(ScalarType_sql2008 value) {
        this.scalarOperator = value;
    }

    /**
     * Gets the value of the relOp property.
     * 
     * @return
     *     possible object is
     *     {@link RelOpType_sql2008 }
     *     
     */
    public RelOpType_sql2008 getRelOp() {
        return relOp;
    }

    /**
     * Sets the value of the relOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelOpType_sql2008 }
     *     
     */
    public void setRelOp(RelOpType_sql2008 value) {
        this.relOp = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link SubqueryOperationType_sql2008 }
     *     
     */
    public SubqueryOperationType_sql2008 getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubqueryOperationType_sql2008 }
     *     
     */
    public void setOperation(SubqueryOperationType_sql2008 value) {
        this.operation = value;
    }

}
