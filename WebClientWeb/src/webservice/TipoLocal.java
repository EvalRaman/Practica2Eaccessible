/**
 * TipoLocal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class TipoLocal  implements java.io.Serializable {
    private int codiTipoLocal;

    private java.lang.String nomTipoLocalCA;

    private java.lang.String nomTipoLocalEN;

    private java.lang.String nomTipoLocalES;

    public TipoLocal() {
    }

    public TipoLocal(
           int codiTipoLocal,
           java.lang.String nomTipoLocalCA,
           java.lang.String nomTipoLocalEN,
           java.lang.String nomTipoLocalES) {
           this.codiTipoLocal = codiTipoLocal;
           this.nomTipoLocalCA = nomTipoLocalCA;
           this.nomTipoLocalEN = nomTipoLocalEN;
           this.nomTipoLocalES = nomTipoLocalES;
    }


    /**
     * Gets the codiTipoLocal value for this TipoLocal.
     * 
     * @return codiTipoLocal
     */
    public int getCodiTipoLocal() {
        return codiTipoLocal;
    }


    /**
     * Sets the codiTipoLocal value for this TipoLocal.
     * 
     * @param codiTipoLocal
     */
    public void setCodiTipoLocal(int codiTipoLocal) {
        this.codiTipoLocal = codiTipoLocal;
    }


    /**
     * Gets the nomTipoLocalCA value for this TipoLocal.
     * 
     * @return nomTipoLocalCA
     */
    public java.lang.String getNomTipoLocalCA() {
        return nomTipoLocalCA;
    }


    /**
     * Sets the nomTipoLocalCA value for this TipoLocal.
     * 
     * @param nomTipoLocalCA
     */
    public void setNomTipoLocalCA(java.lang.String nomTipoLocalCA) {
        this.nomTipoLocalCA = nomTipoLocalCA;
    }


    /**
     * Gets the nomTipoLocalEN value for this TipoLocal.
     * 
     * @return nomTipoLocalEN
     */
    public java.lang.String getNomTipoLocalEN() {
        return nomTipoLocalEN;
    }


    /**
     * Sets the nomTipoLocalEN value for this TipoLocal.
     * 
     * @param nomTipoLocalEN
     */
    public void setNomTipoLocalEN(java.lang.String nomTipoLocalEN) {
        this.nomTipoLocalEN = nomTipoLocalEN;
    }


    /**
     * Gets the nomTipoLocalES value for this TipoLocal.
     * 
     * @return nomTipoLocalES
     */
    public java.lang.String getNomTipoLocalES() {
        return nomTipoLocalES;
    }


    /**
     * Sets the nomTipoLocalES value for this TipoLocal.
     * 
     * @param nomTipoLocalES
     */
    public void setNomTipoLocalES(java.lang.String nomTipoLocalES) {
        this.nomTipoLocalES = nomTipoLocalES;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TipoLocal)) return false;
        TipoLocal other = (TipoLocal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codiTipoLocal == other.getCodiTipoLocal() &&
            ((this.nomTipoLocalCA==null && other.getNomTipoLocalCA()==null) || 
             (this.nomTipoLocalCA!=null &&
              this.nomTipoLocalCA.equals(other.getNomTipoLocalCA()))) &&
            ((this.nomTipoLocalEN==null && other.getNomTipoLocalEN()==null) || 
             (this.nomTipoLocalEN!=null &&
              this.nomTipoLocalEN.equals(other.getNomTipoLocalEN()))) &&
            ((this.nomTipoLocalES==null && other.getNomTipoLocalES()==null) || 
             (this.nomTipoLocalES!=null &&
              this.nomTipoLocalES.equals(other.getNomTipoLocalES())));
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
        _hashCode += getCodiTipoLocal();
        if (getNomTipoLocalCA() != null) {
            _hashCode += getNomTipoLocalCA().hashCode();
        }
        if (getNomTipoLocalEN() != null) {
            _hashCode += getNomTipoLocalEN().hashCode();
        }
        if (getNomTipoLocalES() != null) {
            _hashCode += getNomTipoLocalES().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoLocal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice/", "tipoLocal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiTipoLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiTipoLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomTipoLocalCA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomTipoLocalCA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomTipoLocalEN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomTipoLocalEN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomTipoLocalES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomTipoLocalES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
