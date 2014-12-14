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
@Table(name = "opsi_b5r9")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB5r9.findAll", query = "SELECT o FROM OpsiB5r9 o"),
    @NamedQuery(name = "OpsiB5r9.findByB5R9", query = "SELECT o FROM OpsiB5r9 o WHERE o.b5R9 = :b5R9"),
    @NamedQuery(name = "OpsiB5r9.findByValue", query = "SELECT o FROM OpsiB5r9 o WHERE o.value = :value")})
public class OpsiB5r9 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "b5R9")
    private String b5R9;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b5r9")
    private List<B5Keteranganumumtenagakerjainformal> b5KeteranganumumtenagakerjainformalList;

    public OpsiB5r9() {
    }

    public OpsiB5r9(String b5R9) {
        this.b5R9 = b5R9;
    }

    public OpsiB5r9(String b5R9, String value) {
        this.b5R9 = b5R9;
        this.value = value;
    }

    public String getB5R9() {
        return b5R9;
    }

    public void setB5R9(String b5R9) {
        this.b5R9 = b5R9;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlTransient
    public List<B5Keteranganumumtenagakerjainformal> getB5KeteranganumumtenagakerjainformalList() {
        return b5KeteranganumumtenagakerjainformalList;
    }

    public void setB5KeteranganumumtenagakerjainformalList(List<B5Keteranganumumtenagakerjainformal> b5KeteranganumumtenagakerjainformalList) {
        this.b5KeteranganumumtenagakerjainformalList = b5KeteranganumumtenagakerjainformalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (b5R9 != null ? b5R9.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB5r9)) {
            return false;
        }
        OpsiB5r9 other = (OpsiB5r9) object;
        if ((this.b5R9 == null && other.b5R9 != null) || (this.b5R9 != null && !this.b5R9.equals(other.b5R9))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB5r9[ b5R9=" + b5R9 + " ]";
    }
    
}
