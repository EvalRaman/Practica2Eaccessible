/**
 * CaracteristicaTipoLocal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class CaracteristicaTipoLocal  implements java.io.Serializable {
    private int codicaracteristica;

    private int codicaracteristicatipolocal;

    private int coditipolocal;

    public CaracteristicaTipoLocal() {
    }

    public CaracteristicaTipoLocal(
           int codicaracteristica,
           int codicaracteristicatipolocal,
           int coditipolocal) {
           this.codicaracteristica = codicaracteristica;
           this.codicaracteristicatipolocal = codicaracteristicatipolocal;
           this.coditipolocal = coditipolocal;
    }


    /**
     * Gets the codicaracteristica value for this CaracteristicaTipoLocal.
     * 
     * @return codicaracteristica
     */
    public int getCodicaracteristica() {
        return codicaracteristica;
    }


    /**
     * Sets the codicaracteristica value for this CaracteristicaTipoLocal.
     * 
     * @param codicaracteristica
     */
    public void setCodicaracteristica(int codicaracteristica) {
        this.codicaracteristica = codicaracteristica;
    }


    /**
     * Gets the codicaracteristicatipolocal value for this CaracteristicaTipoLocal.
     * 
     * @return codicaracteristicatipolocal
     */
    public int getCodicaracteristicatipolocal() {
        return codicaracteristicatipolocal;
    }


    /**
     * Sets the codicaracteristicatipolocal value for this CaracteristicaTipoLocal.
     * 
     * @param codicaracteristicatipolocal
     */
    public void setCodicaracteristicatipolocal(int codicaracteristicatipolocal) {
        this.codicaracteristicatipolocal = codicaracteristicatipolocal;
    }


    /**
     * Gets the coditipolocal value for this CaracteristicaTipoLocal.
     * 
     * @return coditipolocal
     */
    public int getCoditipolocal() {
        return coditipolocal;
    }


    /**
     * Sets the coditipolocal value for this CaracteristicaTipoLocal.
     * 
     * @param coditipolocal
     */
    public void setCoditipolocal(int coditipolocal) {
        this.coditipolocal = coditipolocal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaracteristicaTipoLocal)) return false;
        CaracteristicaTipoLocal other = (CaracteristicaTipoLocal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codicaracteristica == other.getCodicaracteristica() &&
            this.codicaracteristicatipolocal == other.getCodicaracteristicatipolocal() &&
            this.coditipolocal == other.getCoditipolocal();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCodicaracteristica();
        _hashCode += getCodicaracteristicatipolocal();
        _hashCode += getCoditipolocal();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaracteristicaTipoLocal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice/", "caracteristicaTipoLocal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codicaracteristica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codicaracteristica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codicaracteristicatipolocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codicaracteristicatipolocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coditipolocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coditipolocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
