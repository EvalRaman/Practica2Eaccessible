/**
 * Caracteristica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class Caracteristica  implements java.io.Serializable {
    private int codiCaracteristica;

    private int codiNivell;

    private java.lang.String nomCaracteristicaCA;

    private java.lang.String nomCaracteristicaEN;

    private java.lang.String nomCaracteristicaES;

    private int tipo;

    public Caracteristica() {
    }

    public Caracteristica(
           int codiCaracteristica,
           int codiNivell,
           java.lang.String nomCaracteristicaCA,
           java.lang.String nomCaracteristicaEN,
           java.lang.String nomCaracteristicaES,
           int tipo) {
           this.codiCaracteristica = codiCaracteristica;
           this.codiNivell = codiNivell;
           this.nomCaracteristicaCA = nomCaracteristicaCA;
           this.nomCaracteristicaEN = nomCaracteristicaEN;
           this.nomCaracteristicaES = nomCaracteristicaES;
           this.tipo = tipo;
    }


    /**
     * Gets the codiCaracteristica value for this Caracteristica.
     * 
     * @return codiCaracteristica
     */
    public int getCodiCaracteristica() {
        return codiCaracteristica;
    }


    /**
     * Sets the codiCaracteristica value for this Caracteristica.
     * 
     * @param codiCaracteristica
     */
    public void setCodiCaracteristica(int codiCaracteristica) {
        this.codiCaracteristica = codiCaracteristica;
    }


    /**
     * Gets the codiNivell value for this Caracteristica.
     * 
     * @return codiNivell
     */
    public int getCodiNivell() {
        return codiNivell;
    }


    /**
     * Sets the codiNivell value for this Caracteristica.
     * 
     * @param codiNivell
     */
    public void setCodiNivell(int codiNivell) {
        this.codiNivell = codiNivell;
    }


    /**
     * Gets the nomCaracteristicaCA value for this Caracteristica.
     * 
     * @return nomCaracteristicaCA
     */
    public java.lang.String getNomCaracteristicaCA() {
        return nomCaracteristicaCA;
    }


    /**
     * Sets the nomCaracteristicaCA value for this Caracteristica.
     * 
     * @param nomCaracteristicaCA
     */
    public void setNomCaracteristicaCA(java.lang.String nomCaracteristicaCA) {
        this.nomCaracteristicaCA = nomCaracteristicaCA;
    }


    /**
     * Gets the nomCaracteristicaEN value for this Caracteristica.
     * 
     * @return nomCaracteristicaEN
     */
    public java.lang.String getNomCaracteristicaEN() {
        return nomCaracteristicaEN;
    }


    /**
     * Sets the nomCaracteristicaEN value for this Caracteristica.
     * 
     * @param nomCaracteristicaEN
     */
    public void setNomCaracteristicaEN(java.lang.String nomCaracteristicaEN) {
        this.nomCaracteristicaEN = nomCaracteristicaEN;
    }


    /**
     * Gets the nomCaracteristicaES value for this Caracteristica.
     * 
     * @return nomCaracteristicaES
     */
    public java.lang.String getNomCaracteristicaES() {
        return nomCaracteristicaES;
    }


    /**
     * Sets the nomCaracteristicaES value for this Caracteristica.
     * 
     * @param nomCaracteristicaES
     */
    public void setNomCaracteristicaES(java.lang.String nomCaracteristicaES) {
        this.nomCaracteristicaES = nomCaracteristicaES;
    }


    /**
     * Gets the tipo value for this Caracteristica.
     * 
     * @return tipo
     */
    public int getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Caracteristica.
     * 
     * @param tipo
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Caracteristica)) return false;
        Caracteristica other = (Caracteristica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codiCaracteristica == other.getCodiCaracteristica() &&
            this.codiNivell == other.getCodiNivell() &&
            ((this.nomCaracteristicaCA==null && other.getNomCaracteristicaCA()==null) || 
             (this.nomCaracteristicaCA!=null &&
              this.nomCaracteristicaCA.equals(other.getNomCaracteristicaCA()))) &&
            ((this.nomCaracteristicaEN==null && other.getNomCaracteristicaEN()==null) || 
             (this.nomCaracteristicaEN!=null &&
              this.nomCaracteristicaEN.equals(other.getNomCaracteristicaEN()))) &&
            ((this.nomCaracteristicaES==null && other.getNomCaracteristicaES()==null) || 
             (this.nomCaracteristicaES!=null &&
              this.nomCaracteristicaES.equals(other.getNomCaracteristicaES()))) &&
            this.tipo == other.getTipo();
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
        _hashCode += getCodiCaracteristica();
        _hashCode += getCodiNivell();
        if (getNomCaracteristicaCA() != null) {
            _hashCode += getNomCaracteristicaCA().hashCode();
        }
        if (getNomCaracteristicaEN() != null) {
            _hashCode += getNomCaracteristicaEN().hashCode();
        }
        if (getNomCaracteristicaES() != null) {
            _hashCode += getNomCaracteristicaES().hashCode();
        }
        _hashCode += getTipo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Caracteristica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice/", "caracteristica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiCaracteristica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiCaracteristica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiNivell");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiNivell"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomCaracteristicaCA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomCaracteristicaCA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomCaracteristicaEN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomCaracteristicaEN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomCaracteristicaES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomCaracteristicaES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
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
