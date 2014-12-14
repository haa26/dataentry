/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "opsi_b3r15e")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB3r15e.findAll", query = "SELECT o FROM OpsiB3r15e o"),
    @NamedQuery(name = "OpsiB3r15e.findByB3r15e", query = "SELECT o FROM OpsiB3r15e o WHERE o.b3r15e = :b3r15e"),
    @NamedQuery(name = "OpsiB3r15e.findByValue", query = "SELECT o FROM OpsiB3r15e o WHERE o.value = :value")})
public class OpsiB3r15e implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B3R15E")
    private String b3r15e;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r15e")
    private List<B3r15Pekerja> b3r15PekerjaList;

    public OpsiB3r15e() {
    }

    public OpsiB3r15e(String b3r15e) {
        this.b3r15e = b3r15e;
    }

    public OpsiB3r15e(String b3r15e, String value) {
        this.b3r15e = b3r15e;
        this.value = value;
    }

    public String getB3r15e() {
        return b3r15e;
    }

    public void setB3r15e(String b3r15e) {
        this.b3r15e = b3r15e;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlTransient
    public List<B3r15Pekerja> getB3r15PekerjaList() {
        return b3r15PekerjaList;
    }

    public void setB3r15PekerjaList(List<B3r15Pekerja> b3r15PekerjaList) {
        this.b3r15PekerjaList = b3r15PekerjaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (b3r15e != null ? b3r15e.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB3r15e)) {
            return false;
        }
        OpsiB3r15e other = (OpsiB3r15e) object;
        if ((this.b3r15e == null && other.b3r15e != null) || (this.b3r15e != null && !this.b3r15e.equals(other.b3r15e))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB3r15e[ b3r15e=" + b3r15e + " ]";
    }
    
}
