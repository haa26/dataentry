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
@Table(name = "opsi_b3r15j")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB3r15j.findAll", query = "SELECT o FROM OpsiB3r15j o"),
    @NamedQuery(name = "OpsiB3r15j.findByB3r15j", query = "SELECT o FROM OpsiB3r15j o WHERE o.b3r15j = :b3r15j"),
    @NamedQuery(name = "OpsiB3r15j.findByValue", query = "SELECT o FROM OpsiB3r15j o WHERE o.value = :value")})
public class OpsiB3r15j implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B3R15J")
    private String b3r15j;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r15j")
    private List<B3r15Pekerja> b3r15PekerjaList;

    public OpsiB3r15j() {
    }

    public OpsiB3r15j(String b3r15j) {
        this.b3r15j = b3r15j;
    }

    public OpsiB3r15j(String b3r15j, String value) {
        this.b3r15j = b3r15j;
        this.value = value;
    }

    public String getB3r15j() {
        return b3r15j;
    }

    public void setB3r15j(String b3r15j) {
        this.b3r15j = b3r15j;
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
        hash += (b3r15j != null ? b3r15j.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB3r15j)) {
            return false;
        }
        OpsiB3r15j other = (OpsiB3r15j) object;
        if ((this.b3r15j == null && other.b3r15j != null) || (this.b3r15j != null && !this.b3r15j.equals(other.b3r15j))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB3r15j[ b3r15j=" + b3r15j + " ]";
    }
    
}
