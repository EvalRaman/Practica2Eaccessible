/**
 * Local.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class Local  implements java.io.Serializable {
    private int codiCarrer;

    private int codiLocal;

    private int codiTipoLocal;

    private java.lang.String nomCarrer;

    private java.lang.String nomLocal;

    private java.lang.String nomVia;

    private int numero;

    private java.lang.String observacions;

    private java.lang.String verificat;

    public Local() {
    }

    public Local(
           int codiCarrer,
           int codiLocal,
           int codiTipoLocal,
           java.lang.String nomCarrer,
           java.lang.String nomLocal,
           java.lang.String nomVia,
           int numero,
           java.lang.String observacions,
           java.lang.String verificat) {
           this.codiCarrer = codiCarrer;
           this.codiLocal = codiLocal;
           this.codiTipoLocal = codiTipoLocal;
           this.nomCarrer = nomCarrer;
           this.nomLocal = nomLocal;
           this.nomVia = nomVia;
           this.numero = numero;
           this.observacions = observacions;
           this.verificat = verificat;
    }


    /**
     * Gets the codiCarrer value for this Local.
     * 
     * @return codiCarrer
     */
    public int getCodiCarrer() {
        return codiCarrer;
    }


    /**
     * Sets the codiCarrer value for this Local.
     * 
     * @param codiCarrer
     */
    public void setCodiCarrer(int codiCarrer) {
        this.codiCarrer = codiCarrer;
    }


    /**
     * Gets the codiLocal value for this Local.
     * 
     * @return codiLocal
     */
    public int getCodiLocal() {
        return codiLocal;
    }


    /**
     * Sets the codiLocal value for this Local.
     * 
     * @param codiLocal
     */
    public void setCodiLocal(int codiLocal) {
        this.codiLocal = codiLocal;
    }


    /**
     * Gets the codiTipoLocal value for this Local.
     * 
     * @return codiTipoLocal
     */
    public int getCodiTipoLocal() {
        return codiTipoLocal;
    }


    /**
     * Sets the codiTipoLocal value for this Local.
     * 
     * @param codiTipoLocal
     */
    public void setCodiTipoLocal(int codiTipoLocal) {
        this.codiTipoLocal = codiTipoLocal;
    }


    /**
     * Gets the nomCarrer value for this Local.
     * 
     * @return nomCarrer
     */
    public java.lang.String getNomCarrer() {
        return nomCarrer;
    }


    /**
     * Sets the nomCarrer value for this Local.
     * 
     * @param nomCarrer
     */
    public void setNomCarrer(java.lang.String nomCarrer) {
        this.nomCarrer = nomCarrer;
    }


    /**
     * Gets the nomLocal value for this Local.
     * 
     * @return nomLocal
     */
    public java.lang.String getNomLocal() {
        return nomLocal;
    }


    /**
     * Sets the nomLocal value for this Local.
     * 
     * @param nomLocal
     */
    public void setNomLocal(java.lang.String nomLocal) {
        this.nomLocal = nomLocal;
    }


    /**
     * Gets the nomVia value for this Local.
     * 
     * @return nomVia
     */
    public java.lang.String getNomVia() {
        return nomVia;
    }


    /**
     * Sets the nomVia value for this Local.
     * 
     * @param nomVia
     */
    public void setNomVia(java.lang.String nomVia) {
        this.nomVia = nomVia;
    }


    /**
     * Gets the numero value for this Local.
     * 
     * @return numero
     */
    public int getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Local.
     * 
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }


    /**
     * Gets the observacions value for this Local.
     * 
     * @return observacions
     */
    public java.lang.String getObservacions() {
        return observacions;
    }


    /**
     * Sets the observacions value for this Local.
     * 
     * @param observacions
     */
    public void setObservacions(java.lang.String observacions) {
        this.observacions = observacions;
    }


    /**
     * Gets the verificat value for this Local.
     * 
     * @return verificat
     */
    public java.lang.String getVerificat() {
        return verificat;
    }


    /**
     * Sets the verificat value for this Local.
     * 
     * @param verificat
     */
    public void setVerificat(java.lang.String verificat) {
        this.verificat = verificat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Local)) return false;
        Local other = (Local) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codiCarrer == other.getCodiCarrer() &&
            this.codiLocal == other.getCodiLocal() &&
            this.codiTipoLocal == other.getCodiTipoLocal() &&
            ((this.nomCarrer==null && other.getNomCarrer()==null) || 
             (this.nomCarrer!=null &&
              this.nomCarrer.equals(other.getNomCarrer()))) &&
            ((this.nomLocal==null && other.getNomLocal()==null) || 
             (this.nomLocal!=null &&
              this.nomLocal.equals(other.getNomLocal()))) &&
            ((this.nomVia==null && other.getNomVia()==null) || 
             (this.nomVia!=null &&
              this.nomVia.equals(other.getNomVia()))) &&
            this.numero == other.getNumero() &&
            ((this.observacions==null && other.getObservacions()==null) || 
             (this.observacions!=null &&
              this.observacions.equals(other.getObservacions()))) &&
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
        _hashCode += getCodiCarrer();
        _hashCode += getCodiLocal();
        _hashCode += getCodiTipoLocal();
        if (getNomCarrer() != null) {
            _hashCode += getNomCarrer().hashCode();
        }
        if (getNomLocal() != null) {
            _hashCode += getNomLocal().hashCode();
        }
        if (getNomVia() != null) {
            _hashCode += getNomVia().hashCode();
        }
        _hashCode += getNumero();
        if (getObservacions() != null) {
            _hashCode += getObservacions().hashCode();
        }
        if (getVerificat() != null) {
            _hashCode += getVerificat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Local.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice/", "local"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiCarrer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiCarrer"));
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
        elemField.setFieldName("codiTipoLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiTipoLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomCarrer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomCarrer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomVia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomVia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observacions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
