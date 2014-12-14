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
@Table(name = "opsi_b5r11")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB5r11.findAll", query = "SELECT o FROM OpsiB5r11 o"),
    @NamedQuery(name = "OpsiB5r11.findByB5R11", query = "SELECT o FROM OpsiB5r11 o WHERE o.b5R11 = :b5R11"),
    @NamedQuery(name = "OpsiB5r11.findByValue", query = "SELECT o FROM OpsiB5r11 o WHERE o.value = :value")})
public class OpsiB5r11 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "b5R11")
    private String b5R11;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b5r11")
    private List<B5Keteranganumumtenagakerjainformal> b5KeteranganumumtenagakerjainformalList;

    public OpsiB5r11() {
    }

    public OpsiB5r11(String b5R11) {
        this.b5R11 = b5R11;
    }

    public OpsiB5r11(String b5R11, String value) {
        this.b5R11 = b5R11;
        this.value = value;
    }

    public String getB5R11() {
        return b5R11;
    }

    public void setB5R11(String b5R11) {
        this.b5R11 = b5R11;
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
        hash += (b5R11 != null ? b5R11.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB5r11)) {
            return false;
        }
        OpsiB5r11 other = (OpsiB5r11) object;
        if ((this.b5R11 == null && other.b5R11 != null) || (this.b5R11 != null && !this.b5R11.equals(other.b5R11))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB5r11[ b5R11=" + b5R11 + " ]";
    }
    
}
