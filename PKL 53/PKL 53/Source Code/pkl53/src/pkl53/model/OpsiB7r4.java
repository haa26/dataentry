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
@Table(name = "opsi_b7r4")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB7r4.findAll", query = "SELECT o FROM OpsiB7r4 o"),
    @NamedQuery(name = "OpsiB7r4.findByB7r4", query = "SELECT o FROM OpsiB7r4 o WHERE o.b7r4 = :b7r4"),
    @NamedQuery(name = "OpsiB7r4.findByValue", query = "SELECT o FROM OpsiB7r4 o WHERE o.value = :value")})
public class OpsiB7r4 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B7R4")
    private String b7r4;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b7r4")
    private List<B7KepalaArt> b7KepalaArtList;

    public OpsiB7r4() {
    }

    public OpsiB7r4(String b7r4) {
        this.b7r4 = b7r4;
    }

    public OpsiB7r4(String b7r4, String value) {
        this.b7r4 = b7r4;
        this.value = value;
    }

    public String getB7r4() {
        return b7r4;
    }

    public void setB7r4(String b7r4) {
        this.b7r4 = b7r4;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlTransient
    public List<B7KepalaArt> getB7KepalaArtList() {
        return b7KepalaArtList;
    }

    public void setB7KepalaArtList(List<B7KepalaArt> b7KepalaArtList) {
        this.b7KepalaArtList = b7KepalaArtList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (b7r4 != null ? b7r4.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB7r4)) {
            return false;
        }
        OpsiB7r4 other = (OpsiB7r4) object;
        if ((this.b7r4 == null && other.b7r4 != null) || (this.b7r4 != null && !this.b7r4.equals(other.b7r4))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB7r4[ b7r4=" + b7r4 + " ]";
    }
    
}
