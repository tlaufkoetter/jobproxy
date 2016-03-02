//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.01 at 12:26:28 PM CET 
//


package de.unibi.cebitec.bibiserv.jobproxy.data.chronos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="command" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arguments">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="shell" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="epsilon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="executor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="executorFlags">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="retries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="owner">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="async" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="successCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastSuccess" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastError" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="cpus" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="mem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="disk" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="disabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="uris">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="schedule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scheduleTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parents">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="runAsUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="container">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="forcePullImage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="network" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="volumes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="volume" type="{}Tvolume" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dataJob" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="environmentVariables">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="var">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="constraints">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="constraint">
 *                     &lt;simpleType>
 *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "jobconfig")
public class Jobconfig {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String command;
    @XmlList
    @XmlElement(required = true)
    protected List<String> arguments;
    protected boolean shell;
    @XmlElement(required = true)
    protected String epsilon;
    @XmlElement(required = true)
    protected String executor;
    @XmlList
    @XmlElement(required = true)
    protected List<String> executorFlags;
    protected int retries;
    @XmlList
    @XmlElement(required = true)
    protected List<String> owner;
    @XmlElement(required = true)
    protected String ownerName;
    protected boolean async;
    protected int successCount;
    protected int errorCount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSuccess;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastError;
    protected double cpus;
    protected int mem;
    protected long disk;
    protected boolean disabled;
    @XmlList
    @XmlElement(required = true)
    protected List<String> uris;
    @XmlElement(required = true)
    protected String schedule;
    @XmlElement(required = true)
    protected String scheduleTimeZone;
    @XmlList
    @XmlElement(required = true)
    protected List<String> parents;
    @XmlElement(required = true)
    protected String runAsUser;
    @XmlElement(required = true)
    protected Jobconfig.Container container;
    protected boolean dataJob;
    @XmlElement(required = true)
    protected Jobconfig.EnvironmentVariables environmentVariables;
    @XmlElement(required = true)
    protected Jobconfig.Constraints constraints;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the arguments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arguments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArguments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArguments() {
        if (arguments == null) {
            arguments = new ArrayList<String>();
        }
        return this.arguments;
    }

    /**
     * Gets the value of the shell property.
     * 
     */
    public boolean isShell() {
        return shell;
    }

    /**
     * Sets the value of the shell property.
     * 
     */
    public void setShell(boolean value) {
        this.shell = value;
    }

    /**
     * Gets the value of the epsilon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpsilon() {
        return epsilon;
    }

    /**
     * Sets the value of the epsilon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpsilon(String value) {
        this.epsilon = value;
    }

    /**
     * Gets the value of the executor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutor() {
        return executor;
    }

    /**
     * Sets the value of the executor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutor(String value) {
        this.executor = value;
    }

    /**
     * Gets the value of the executorFlags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executorFlags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutorFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExecutorFlags() {
        if (executorFlags == null) {
            executorFlags = new ArrayList<String>();
        }
        return this.executorFlags;
    }

    /**
     * Gets the value of the retries property.
     * 
     */
    public int getRetries() {
        return retries;
    }

    /**
     * Sets the value of the retries property.
     * 
     */
    public void setRetries(int value) {
        this.retries = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the owner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOwner() {
        if (owner == null) {
            owner = new ArrayList<String>();
        }
        return this.owner;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the async property.
     * 
     */
    public boolean isAsync() {
        return async;
    }

    /**
     * Sets the value of the async property.
     * 
     */
    public void setAsync(boolean value) {
        this.async = value;
    }

    /**
     * Gets the value of the successCount property.
     * 
     */
    public int getSuccessCount() {
        return successCount;
    }

    /**
     * Sets the value of the successCount property.
     * 
     */
    public void setSuccessCount(int value) {
        this.successCount = value;
    }

    /**
     * Gets the value of the errorCount property.
     * 
     */
    public int getErrorCount() {
        return errorCount;
    }

    /**
     * Sets the value of the errorCount property.
     * 
     */
    public void setErrorCount(int value) {
        this.errorCount = value;
    }

    /**
     * Gets the value of the lastSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSuccess() {
        return lastSuccess;
    }

    /**
     * Sets the value of the lastSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSuccess(XMLGregorianCalendar value) {
        this.lastSuccess = value;
    }

    /**
     * Gets the value of the lastError property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastError() {
        return lastError;
    }

    /**
     * Sets the value of the lastError property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastError(XMLGregorianCalendar value) {
        this.lastError = value;
    }

    /**
     * Gets the value of the cpus property.
     * 
     */
    public double getCpus() {
        return cpus;
    }

    /**
     * Sets the value of the cpus property.
     * 
     */
    public void setCpus(double value) {
        this.cpus = value;
    }

    /**
     * Gets the value of the mem property.
     * 
     */
    public int getMem() {
        return mem;
    }

    /**
     * Sets the value of the mem property.
     * 
     */
    public void setMem(int value) {
        this.mem = value;
    }

    /**
     * Gets the value of the disk property.
     * 
     */
    public long getDisk() {
        return disk;
    }

    /**
     * Sets the value of the disk property.
     * 
     */
    public void setDisk(long value) {
        this.disk = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     */
    public boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     */
    public void setDisabled(boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the uris property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uris property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUris().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUris() {
        if (uris == null) {
            uris = new ArrayList<String>();
        }
        return this.uris;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedule(String value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the scheduleTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleTimeZone() {
        return scheduleTimeZone;
    }

    /**
     * Sets the value of the scheduleTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleTimeZone(String value) {
        this.scheduleTimeZone = value;
    }

    /**
     * Gets the value of the parents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParents() {
        if (parents == null) {
            parents = new ArrayList<String>();
        }
        return this.parents;
    }

    /**
     * Gets the value of the runAsUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunAsUser() {
        return runAsUser;
    }

    /**
     * Sets the value of the runAsUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunAsUser(String value) {
        this.runAsUser = value;
    }

    /**
     * Gets the value of the container property.
     * 
     * @return
     *     possible object is
     *     {@link Jobconfig.Container }
     *     
     */
    public Jobconfig.Container getContainer() {
        return container;
    }

    /**
     * Sets the value of the container property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jobconfig.Container }
     *     
     */
    public void setContainer(Jobconfig.Container value) {
        this.container = value;
    }

    /**
     * Gets the value of the dataJob property.
     * 
     */
    public boolean isDataJob() {
        return dataJob;
    }

    /**
     * Sets the value of the dataJob property.
     * 
     */
    public void setDataJob(boolean value) {
        this.dataJob = value;
    }

    /**
     * Gets the value of the environmentVariables property.
     * 
     * @return
     *     possible object is
     *     {@link Jobconfig.EnvironmentVariables }
     *     
     */
    public Jobconfig.EnvironmentVariables getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * Sets the value of the environmentVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jobconfig.EnvironmentVariables }
     *     
     */
    public void setEnvironmentVariables(Jobconfig.EnvironmentVariables value) {
        this.environmentVariables = value;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * @return
     *     possible object is
     *     {@link Jobconfig.Constraints }
     *     
     */
    public Jobconfig.Constraints getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jobconfig.Constraints }
     *     
     */
    public void setConstraints(Jobconfig.Constraints value) {
        this.constraints = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="constraint">
     *           &lt;simpleType>
     *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "constraint"
    })
    public static class Constraints {

        @XmlList
        @XmlElement(required = true)
        protected List<String> constraint;

        /**
         * Gets the value of the constraint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the constraint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConstraint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getConstraint() {
            if (constraint == null) {
                constraint = new ArrayList<String>();
            }
            return this.constraint;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="forcePullImage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="network" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="volumes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="volume" type="{}Tvolume" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Container {

        @XmlElement(required = true)
        protected String type;
        @XmlElement(required = true)
        protected String image;
        protected Boolean forcePullImage;
        protected String network;
        protected Jobconfig.Container.Volumes volumes;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the image property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImage() {
            return image;
        }

        /**
         * Sets the value of the image property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImage(String value) {
            this.image = value;
        }

        /**
         * Gets the value of the forcePullImage property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isForcePullImage() {
            return forcePullImage;
        }

        /**
         * Sets the value of the forcePullImage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setForcePullImage(Boolean value) {
            this.forcePullImage = value;
        }

        /**
         * Gets the value of the network property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetwork() {
            return network;
        }

        /**
         * Sets the value of the network property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetwork(String value) {
            this.network = value;
        }

        /**
         * Gets the value of the volumes property.
         * 
         * @return
         *     possible object is
         *     {@link Jobconfig.Container.Volumes }
         *     
         */
        public Jobconfig.Container.Volumes getVolumes() {
            return volumes;
        }

        /**
         * Sets the value of the volumes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Jobconfig.Container.Volumes }
         *     
         */
        public void setVolumes(Jobconfig.Container.Volumes value) {
            this.volumes = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="volume" type="{}Tvolume" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "volume"
        })
        public static class Volumes {

            protected List<Tvolume> volume;

            /**
             * Gets the value of the volume property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the volume property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVolume().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Tvolume }
             * 
             * 
             */
            public List<Tvolume> getVolume() {
                if (volume == null) {
                    volume = new ArrayList<Tvolume>();
                }
                return this.volume;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="var">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "var"
    })
    public static class EnvironmentVariables {

        @XmlElement(required = true)
        protected Jobconfig.EnvironmentVariables.Var var;

        /**
         * Gets the value of the var property.
         * 
         * @return
         *     possible object is
         *     {@link Jobconfig.EnvironmentVariables.Var }
         *     
         */
        public Jobconfig.EnvironmentVariables.Var getVar() {
            return var;
        }

        /**
         * Sets the value of the var property.
         * 
         * @param value
         *     allowed object is
         *     {@link Jobconfig.EnvironmentVariables.Var }
         *     
         */
        public void setVar(Jobconfig.EnvironmentVariables.Var value) {
            this.var = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Var {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String value;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}