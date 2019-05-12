
package org.jkiss.dbeaver.ext.mssql.model.plan.schemas.sql2014sp2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Server" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Database" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Schema" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Table" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Index" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Filtered" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TableReferenceId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="IndexKind" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}IndexKindType" />
 *       &lt;attribute name="CloneAccessScope" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}CloneAccessScopeType" />
 *       &lt;attribute name="Storage" type="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}StorageType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectType", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan")
public class ObjectType_sql2014sp2 {

    @XmlAttribute(name = "Server")
    protected String server;
    @XmlAttribute(name = "Database")
    protected String database;
    @XmlAttribute(name = "Schema")
    protected String schema;
    @XmlAttribute(name = "Table")
    protected String table;
    @XmlAttribute(name = "Index")
    protected String index;
    @XmlAttribute(name = "Filtered")
    protected Boolean filtered;
    @XmlAttribute(name = "Alias")
    protected String alias;
    @XmlAttribute(name = "TableReferenceId")
    protected Integer tableReferenceId;
    @XmlAttribute(name = "IndexKind")
    protected IndexKindType_sql2014sp2 indexKind;
    @XmlAttribute(name = "CloneAccessScope")
    protected CloneAccessScopeType_sql2014sp2 cloneAccessScope;
    @XmlAttribute(name = "Storage")
    protected StorageType_sql2014sp2 storage;

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServer(String value) {
        this.server = value;
    }

    /**
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabase() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabase(String value) {
        this.database = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the filtered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFiltered() {
        return filtered;
    }

    /**
     * Sets the value of the filtered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFiltered(Boolean value) {
        this.filtered = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the tableReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTableReferenceId() {
        return tableReferenceId;
    }

    /**
     * Sets the value of the tableReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTableReferenceId(Integer value) {
        this.tableReferenceId = value;
    }

    /**
     * Gets the value of the indexKind property.
     * 
     * @return
     *     possible object is
     *     {@link IndexKindType_sql2014sp2 }
     *     
     */
    public IndexKindType_sql2014sp2 getIndexKind() {
        return indexKind;
    }

    /**
     * Sets the value of the indexKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexKindType_sql2014sp2 }
     *     
     */
    public void setIndexKind(IndexKindType_sql2014sp2 value) {
        this.indexKind = value;
    }

    /**
     * Gets the value of the cloneAccessScope property.
     * 
     * @return
     *     possible object is
     *     {@link CloneAccessScopeType_sql2014sp2 }
     *     
     */
    public CloneAccessScopeType_sql2014sp2 getCloneAccessScope() {
        return cloneAccessScope;
    }

    /**
     * Sets the value of the cloneAccessScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloneAccessScopeType_sql2014sp2 }
     *     
     */
    public void setCloneAccessScope(CloneAccessScopeType_sql2014sp2 value) {
        this.cloneAccessScope = value;
    }

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link StorageType_sql2014sp2 }
     *     
     */
    public StorageType_sql2014sp2 getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageType_sql2014sp2 }
     *     
     */
    public void setStorage(StorageType_sql2014sp2 value) {
        this.storage = value;
    }

}
