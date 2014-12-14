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
@Table(name = "opsi_b6r12a")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB6r12a.findAll", query = "SELECT o FROM OpsiB6r12a o"),
    @NamedQuery(name = "OpsiB6r12a.findByB6r12a", query = "SELECT o FROM OpsiB6r12a o WHERE o.b6r12a = :b6r12a"),
    @NamedQuery(name = "OpsiB6r12a.findByValue", query = "SELECT o FROM OpsiB6r12a o WHERE o.value = :value")})
public class OpsiB6r12a implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B6R12A")
    private String b6r12a;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b6r12a")
    private List<B6Keteranganumumpekerjaaninformalutama> b6KeteranganumumpekerjaaninformalutamaList;

    public OpsiB6r12a() {
    }

    public OpsiB6r12a(String b6r12a) {
        this.b6r12a = b6r12a;
    }

    public OpsiB6r12a(String b6r12a, String value) {
        this.b6r12a = b6r12a;
        this.value = value;
    }

    public String getB6r12a() {
        return b6r12a;
    }

    public void setB6r12a(String b6r12a) {
        this.b6r12a = b6r12a;
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
        hash += (b6r12a != null ? b6r12a.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB6r12a)) {
            return false;
        }
        OpsiB6r12a other = (OpsiB6r12a) object;
        if ((this.b6r12a == null && other.b6r12a != null) || (this.b6r12a != null && !this.b6r12a.equals(other.b6r12a))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB6r12a[ b6r12a=" + b6r12a + " ]";
    }
    
}
