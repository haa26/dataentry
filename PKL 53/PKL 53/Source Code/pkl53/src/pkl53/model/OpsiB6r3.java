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
@Table(name = "opsi_b6r3")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB6r3.findAll", query = "SELECT o FROM OpsiB6r3 o"),
    @NamedQuery(name = "OpsiB6r3.findByB6r3", query = "SELECT o FROM OpsiB6r3 o WHERE o.b6r3 = :b6r3"),
    @NamedQuery(name = "OpsiB6r3.findByValue", query = "SELECT o FROM OpsiB6r3 o WHERE o.value = :value")})
public class OpsiB6r3 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B6R3")
    private String b6r3;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b6r3")
    private List<B6Keteranganumumpekerjaaninformalutama> b6KeteranganumumpekerjaaninformalutamaList;

    public OpsiB6r3() {
    }

    public OpsiB6r3(String b6r3) {
        this.b6r3 = b6r3;
    }

    public OpsiB6r3(String b6r3, String value) {
        this.b6r3 = b6r3;
        this.value = value;
    }

    public String getB6r3() {
        return b6r3;
    }

    public void setB6r3(String b6r3) {
        this.b6r3 = b6r3;
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
        hash += (b6r3 != null ? b6r3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB6r3)) {
            return false;
        }
        OpsiB6r3 other = (OpsiB6r3) object;
        if ((this.b6r3 == null && other.b6r3 != null) || (this.b6r3 != null && !this.b6r3.equals(other.b6r3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB6r3[ b6r3=" + b6r3 + " ]";
    }
    
}
