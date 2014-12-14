/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rizki syazali
 */
@Entity
@Table(name = "opsi_b3r26")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB3r26.findAll", query = "SELECT o FROM OpsiB3r26 o"),
    @NamedQuery(name = "OpsiB3r26.findByB3r26", query = "SELECT o FROM OpsiB3r26 o WHERE o.b3r26 = :b3r26"),
    @NamedQuery(name = "OpsiB3r26.findByValue", query = "SELECT o FROM OpsiB3r26 o WHERE o.value = :value")})
public class OpsiB3r26 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B3R26")
    private String b3r26;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;
    @OneToMany(mappedBy = "b3r26")
    private List<B3Rinciusaha> b3RinciusahaList;

    public OpsiB3r26() {
    }

    public OpsiB3r26(String b3r26) {
        this.b3r26 = b3r26;
    }

    public OpsiB3r26(String b3r26, String value) {
        this.b3r26 = b3r26;
        this.value = value;
    }

    public String getB3r26() {
        return b3r26;
    }

    public void setB3r26(String b3r26) {
        this.b3r26 = b3r26;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList() {
        return b3RinciusahaList;
    }

    public void setB3RinciusahaList(List<B3Rinciusaha> b3RinciusahaList) {
        this.b3RinciusahaList = b3RinciusahaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (b3r26 != null ? b3r26.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB3r26)) {
            return false;
        }
        OpsiB3r26 other = (OpsiB3r26) object;
        if ((this.b3r26 == null && other.b3r26 != null) || (this.b3r26 != null && !this.b3r26.equals(other.b3r26))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB3r26[ b3r26=" + b3r26 + " ]";
    }
    
}
