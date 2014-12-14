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
@Table(name = "opsi_b5r5")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB5r5.findAll", query = "SELECT o FROM OpsiB5r5 o"),
    @NamedQuery(name = "OpsiB5r5.findByB5r5", query = "SELECT o FROM OpsiB5r5 o WHERE o.b5r5 = :b5r5"),
    @NamedQuery(name = "OpsiB5r5.findByValue", query = "SELECT o FROM OpsiB5r5 o WHERE o.value = :value")})
public class OpsiB5r5 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B5R5")
    private String b5r5;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;
    @OneToMany(mappedBy = "b5r5")
    private List<B5Keteranganumumtenagakerjainformal> b5KeteranganumumtenagakerjainformalList;

    public OpsiB5r5() {
    }

    public OpsiB5r5(String b5r5) {
        this.b5r5 = b5r5;
    }

    public OpsiB5r5(String b5r5, String value) {
        this.b5r5 = b5r5;
        this.value = value;
    }

    public String getB5r5() {
        return b5r5;
    }

    public void setB5r5(String b5r5) {
        this.b5r5 = b5r5;
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
        hash += (b5r5 != null ? b5r5.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB5r5)) {
            return false;
        }
        OpsiB5r5 other = (OpsiB5r5) object;
        if ((this.b5r5 == null && other.b5r5 != null) || (this.b5r5 != null && !this.b5r5.equals(other.b5r5))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB5r5[ b5r5=" + b5r5 + " ]";
    }
    
}
