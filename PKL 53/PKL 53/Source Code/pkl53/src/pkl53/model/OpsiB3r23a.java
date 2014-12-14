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
@Table(name = "opsi_b3r23a")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB3r23a.findAll", query = "SELECT o FROM OpsiB3r23a o"),
    @NamedQuery(name = "OpsiB3r23a.findByB3r23a", query = "SELECT o FROM OpsiB3r23a o WHERE o.b3r23a = :b3r23a"),
    @NamedQuery(name = "OpsiB3r23a.findByValue", query = "SELECT o FROM OpsiB3r23a o WHERE o.value = :value")})
public class OpsiB3r23a implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B3R23A")
    private String b3r23a;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;
    @OneToMany(mappedBy = "b3r23a")
    private List<B3Rinciusaha> b3RinciusahaList;

    public OpsiB3r23a() {
    }

    public OpsiB3r23a(String b3r23a) {
        this.b3r23a = b3r23a;
    }

    public OpsiB3r23a(String b3r23a, String value) {
        this.b3r23a = b3r23a;
        this.value = value;
    }

    public String getB3r23a() {
        return b3r23a;
    }

    public void setB3r23a(String b3r23a) {
        this.b3r23a = b3r23a;
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
        hash += (b3r23a != null ? b3r23a.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB3r23a)) {
            return false;
        }
        OpsiB3r23a other = (OpsiB3r23a) object;
        if ((this.b3r23a == null && other.b3r23a != null) || (this.b3r23a != null && !this.b3r23a.equals(other.b3r23a))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB3r23a[ b3r23a=" + b3r23a + " ]";
    }
    
}
