/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rizki syazali
 */
@Entity
@Table(name = "opsi_b3r19")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB3r19.findAll", query = "SELECT o FROM OpsiB3r19 o"),
    @NamedQuery(name = "OpsiB3r19.findByB3r19", query = "SELECT o FROM OpsiB3r19 o WHERE o.b3r19 = :b3r19"),
    @NamedQuery(name = "OpsiB3r19.findByValue", query = "SELECT o FROM OpsiB3r19 o WHERE o.value = :value")})
public class OpsiB3r19 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B3R19")
    private String b3r19;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;

    public OpsiB3r19() {
    }

    public OpsiB3r19(String b3r19) {
        this.b3r19 = b3r19;
    }

    public OpsiB3r19(String b3r19, String value) {
        this.b3r19 = b3r19;
        this.value = value;
    }

    public String getB3r19() {
        return b3r19;
    }

    public void setB3r19(String b3r19) {
        this.b3r19 = b3r19;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (b3r19 != null ? b3r19.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB3r19)) {
            return false;
        }
        OpsiB3r19 other = (OpsiB3r19) object;
        if ((this.b3r19 == null && other.b3r19 != null) || (this.b3r19 != null && !this.b3r19.equals(other.b3r19))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB3r19[ b3r19=" + b3r19 + " ]";
    }
    
}
