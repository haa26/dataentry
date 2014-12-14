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
@Table(name = "opsi_b5r13")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB5r13.findAll", query = "SELECT o FROM OpsiB5r13 o"),
    @NamedQuery(name = "OpsiB5r13.findByB5R13", query = "SELECT o FROM OpsiB5r13 o WHERE o.b5R13 = :b5R13"),
    @NamedQuery(name = "OpsiB5r13.findByValue", query = "SELECT o FROM OpsiB5r13 o WHERE o.value = :value")})
public class OpsiB5r13 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "b5R13")
    private String b5R13;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b5r13")
    private List<B5Keteranganumumtenagakerjainformal> b5KeteranganumumtenagakerjainformalList;

    public OpsiB5r13() {
    }

    public OpsiB5r13(String b5R13) {
        this.b5R13 = b5R13;
    }

    public OpsiB5r13(String b5R13, String value) {
        this.b5R13 = b5R13;
        this.value = value;
    }

    public String getB5R13() {
        return b5R13;
    }

    public void setB5R13(String b5R13) {
        this.b5R13 = b5R13;
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
        hash += (b5R13 != null ? b5R13.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB5r13)) {
            return false;
        }
        OpsiB5r13 other = (OpsiB5r13) object;
        if ((this.b5R13 == null && other.b5R13 != null) || (this.b5R13 != null && !this.b5R13.equals(other.b5R13))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB5r13[ b5R13=" + b5R13 + " ]";
    }
    
}
