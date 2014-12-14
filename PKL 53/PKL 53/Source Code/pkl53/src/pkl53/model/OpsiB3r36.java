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
@Table(name = "opsi_b3r36")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB3r36.findAll", query = "SELECT o FROM OpsiB3r36 o"),
    @NamedQuery(name = "OpsiB3r36.findByB3r36", query = "SELECT o FROM OpsiB3r36 o WHERE o.b3r36 = :b3r36"),
    @NamedQuery(name = "OpsiB3r36.findByValue", query = "SELECT o FROM OpsiB3r36 o WHERE o.value = :value")})
public class OpsiB3r36 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B3R36")
    private String b3r36;
    @Column(name = "Value")
    private String value;
    @OneToMany(mappedBy = "b3r36")
    private List<B3Rinciusaha> b3RinciusahaList;

    public OpsiB3r36() {
    }

    public OpsiB3r36(String b3r36) {
        this.b3r36 = b3r36;
    }

    public String getB3r36() {
        return b3r36;
    }

    public void setB3r36(String b3r36) {
        this.b3r36 = b3r36;
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
        hash += (b3r36 != null ? b3r36.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB3r36)) {
            return false;
        }
        OpsiB3r36 other = (OpsiB3r36) object;
        if ((this.b3r36 == null && other.b3r36 != null) || (this.b3r36 != null && !this.b3r36.equals(other.b3r36))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB3r36[ b3r36=" + b3r36 + " ]";
    }
    
}
