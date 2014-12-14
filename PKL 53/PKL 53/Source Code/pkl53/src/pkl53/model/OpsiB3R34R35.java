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
@Table(name = "opsi_b3_r34_r35")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB3R34R35.findAll", query = "SELECT o FROM OpsiB3R34R35 o"),
    @NamedQuery(name = "OpsiB3R34R35.findByKode", query = "SELECT o FROM OpsiB3R34R35 o WHERE o.kode = :kode"),
    @NamedQuery(name = "OpsiB3R34R35.findByValue", query = "SELECT o FROM OpsiB3R34R35 o WHERE o.value = :value")})
public class OpsiB3R34R35 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode")
    private String kode;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r34")
    private List<B3Rinciusaha> b3RinciusahaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r35")
    private List<B3Rinciusaha> b3RinciusahaList1;

    public OpsiB3R34R35() {
    }

    public OpsiB3R34R35(String kode) {
        this.kode = kode;
    }

    public OpsiB3R34R35(String kode, String value) {
        this.kode = kode;
        this.value = value;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
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

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList1() {
        return b3RinciusahaList1;
    }

    public void setB3RinciusahaList1(List<B3Rinciusaha> b3RinciusahaList1) {
        this.b3RinciusahaList1 = b3RinciusahaList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kode != null ? kode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB3R34R35)) {
            return false;
        }
        OpsiB3R34R35 other = (OpsiB3R34R35) object;
        if ((this.kode == null && other.kode != null) || (this.kode != null && !this.kode.equals(other.kode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB3R34R35[ kode=" + kode + " ]";
    }
    
}
