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
@Table(name = "opsi_b1r4")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB1r4.findAll", query = "SELECT o FROM OpsiB1r4 o"),
    @NamedQuery(name = "OpsiB1r4.findByB1r4", query = "SELECT o FROM OpsiB1r4 o WHERE o.b1r4 = :b1r4"),
    @NamedQuery(name = "OpsiB1r4.findByValue", query = "SELECT o FROM OpsiB1r4 o WHERE o.value = :value")})
public class OpsiB1r4 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B1R4")
    private String b1r4;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;

    public OpsiB1r4() {
    }

    public OpsiB1r4(String b1r4) {
        this.b1r4 = b1r4;
    }

    public OpsiB1r4(String b1r4, String value) {
        this.b1r4 = b1r4;
        this.value = value;
    }

    public String getB1r4() {
        return b1r4;
    }

    public void setB1r4(String b1r4) {
        this.b1r4 = b1r4;
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
        hash += (b1r4 != null ? b1r4.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB1r4)) {
            return false;
        }
        OpsiB1r4 other = (OpsiB1r4) object;
        if ((this.b1r4 == null && other.b1r4 != null) || (this.b1r4 != null && !this.b1r4.equals(other.b1r4))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB1r4[ b1r4=" + b1r4 + " ]";
    }
    
}
