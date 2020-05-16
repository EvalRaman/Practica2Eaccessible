/**
 * Accessibilitat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class Accessibilitat  implements java.io.Serializable {
    private int codiAccessibilitat;

    private int codiCaracteristica;

    private int codiLocal;

    private int valor;

    private java.lang.String verificat;

    public Accessibilitat() {
    }

    public Accessibilitat(
           int codiAccessibilitat,
           int codiCaracteristica,
           int codiLocal,
           int valor,
           java.lang.String verificat) {
           this.codiAccessibilitat = codiAccessibilitat;
           this.codiCaracteristica = codiCaracteristica;
           this.codiLocal = codiLocal;
           this.valor = valor;
           this.verificat = verificat;
    }


    /**
     * Gets the codiAccessibilitat value for this Accessibilitat.
     * 
     * @return codiAccessibilitat
     */
    public int getCodiAccessibilitat() {
        return codiAccessibilitat;
    }


    /**
     * Sets the codiAccessibilitat value for this Accessibilitat.
     * 
     * @param codiAccessibilitat
     */
    public void setCodiAccessibilitat(int codiAccessibilitat) {
        this.codiAccessibilitat = codiAccessibilitat;
    }


    /**
     * Gets the codiCaracteristica value for this Accessibilitat.
     * 
     * @return codiCaracteristica
     */
    public int getCodiCaracteristica() {
        return codiCaracteristica;
    }


    /**
     * Sets the codiCaracteristica value for this Accessibilitat.
     * 
     * @param codiCaracteristica
     */
    public void setCodiCaracteristica(int codiCaracteristica) {
        this.codiCaracteristica = codiCaracteristica;
    }


    /**
     * Gets the codiLocal value for this Accessibilitat.
     * 
     * @return codiLocal
     */
    public int getCodiLocal() {
        return codiLocal;
    }


    /**
     * Sets the codiLocal value for this Accessibilitat.
     * 
     * @param codiLocal
     */
    public void setCodiLocal(int codiLocal) {
        this.codiLocal = codiLocal;
    }


    /**
     * Gets the valor value for this Accessibilitat.
     * 
     * @return valor
     */
    public int getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this Accessibilitat.
     * 
     * @param valor
     */
    public void setValor(int valor) {
        this.valor = valor;
    }


    /**
     * Gets the verificat value for this Accessibilitat.
     * 
     * @return verificat
     */
    public java.lang.String getVerificat() {
        return verificat;
    }


    /**
     * Sets the verificat value for this Accessibilitat.
     * 
     * @param verificat
     */
    public void setVerificat(java.lang.String verificat) {
        this.verificat = verificat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Accessibilitat)) return false;
        Accessibilitat other = (Accessibilitat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codiAccessibilitat == other.getCodiAccessibilitat() &&
            this.codiCaracteristica == other.getCodiCaracteristica() &&
            this.codiLocal == other.getCodiLocal() &&
            this.valor == other.getValor() &&
            ((this.verificat==null && other.getVerificat()==null) || 
             (this.verificat!=null &&
              this.verificat.equals(other.getVerificat())));
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
        _hashCode += getCodiAccessibilitat();
        _hashCode += getCodiCaracteristica();
        _hashCode += getCodiLocal();
        _hashCode += getValor();
        if (getVerificat() != null) {
            _hashCode += getVerificat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Accessibilitat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice/", "accessibilitat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiAccessibilitat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiAccessibilitat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiCaracteristica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiCaracteristica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verificat"));
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
