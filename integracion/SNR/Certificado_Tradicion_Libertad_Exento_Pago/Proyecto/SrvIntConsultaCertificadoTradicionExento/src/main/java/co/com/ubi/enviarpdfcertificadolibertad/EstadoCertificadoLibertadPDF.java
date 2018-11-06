
package co.com.ubi.enviarpdfcertificadolibertad;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for estadoCertificadoLibertadPDF.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="estadoCertificadoLibertadPDF">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "estadoCertificadoLibertadPDF")
@XmlEnum
public enum EstadoCertificadoLibertadPDF {

    OK,
    ERROR;

    public String value() {
        return name();
    }

    public static EstadoCertificadoLibertadPDF fromValue(String v) {
        return valueOf(v);
    }

}
