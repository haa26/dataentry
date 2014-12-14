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
@Table(name = "opsi_b6r22a")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB6r22a.findAll", query = "SELECT o FROM OpsiB6r22a o"),
    @NamedQuery(name = "OpsiB6r22a.findByB6r22a", query = "SELECT o FROM OpsiB6r22a o WHERE o.b6r22a = :b6r22a"),
    @NamedQuery(name = "OpsiB6r22a.findByValue", query = "SELECT o FROM OpsiB6r22a o WHERE o.value = :value")})
public class OpsiB6r22a implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B6R22A")
    private String b6r22a;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b6r22a")
    private List<B6Keteranganumumpekerjaaninformalutama> b6KeteranganumumpekerjaaninformalutamaList;

    public OpsiB6r22a() {
    }

    public OpsiB6r22a(String b6r22a) {
        this.b6r22a = b6r22a;
    }

    public OpsiB6r22a(String b6r22a, String value) {
        this.b6r22a = b6r22a;
        this.value = value;
    }

    public String getB6r22a() {
        return b6r22a;
    }

    public void setB6r22a(String b6r22a) {
        this.b6r22a = b6r22a;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlTransient
    public List<B6Keteranganumumpekerjaaninformalutama> getB6KeteranganumumpekerjaaninformalutamaList() {
        return b6KeteranganumumpekerjaaninformalutamaList;
    }

    public void setB6KeteranganumumpekerjaaninformalutamaList(List<B6Keteranganumumpekerjaaninformalutama> b6KeteranganumumpekerjaaninformalutamaList) {
        this.b6KeteranganumumpekerjaaninformalutamaList = b6KeteranganumumpekerjaaninformalutamaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (b6r22a != null ? b6r22a.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB6r22a)) {
            return false;
        }
        OpsiB6r22a other = (OpsiB6r22a) object;
        if ((this.b6r22a == null && other.b6r22a != null) || (this.b6r22a != null && !this.b6r22a.equals(other.b6r22a))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB6r22a[ b6r22a=" + b6r22a + " ]";
    }
    
}
