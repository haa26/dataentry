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
@Table(name = "opsi_b3r22d")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB3r22d.findAll", query = "SELECT o FROM OpsiB3r22d o"),
    @NamedQuery(name = "OpsiB3r22d.findByB3r22d", query = "SELECT o FROM OpsiB3r22d o WHERE o.b3r22d = :b3r22d"),
    @NamedQuery(name = "OpsiB3r22d.findByValue", query = "SELECT o FROM OpsiB3r22d o WHERE o.value = :value")})
public class OpsiB3r22d implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B3R22D")
    private String b3r22d;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;
    @OneToMany(mappedBy = "b3r22d")
    private List<B3Rinciusaha> b3RinciusahaList;

    public OpsiB3r22d() {
    }

    public OpsiB3r22d(String b3r22d) {
        this.b3r22d = b3r22d;
    }

    public OpsiB3r22d(String b3r22d, String value) {
        this.b3r22d = b3r22d;
        this.value = value;
    }

    public String getB3r22d() {
        return b3r22d;
    }

    public void setB3r22d(String b3r22d) {
        this.b3r22d = b3r22d;
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
        hash += (b3r22d != null ? b3r22d.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB3r22d)) {
            return false;
        }
        OpsiB3r22d other = (OpsiB3r22d) object;
        if ((this.b3r22d == null && other.b3r22d != null) || (this.b3r22d != null && !this.b3r22d.equals(other.b3r22d))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB3r22d[ b3r22d=" + b3r22d + " ]";
    }
    
}
