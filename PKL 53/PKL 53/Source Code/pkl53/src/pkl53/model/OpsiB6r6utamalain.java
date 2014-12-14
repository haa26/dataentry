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
@Table(name = "opsi_b6r6utamalain")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB6r6utamalain.findAll", query = "SELECT o FROM OpsiB6r6utamalain o"),
    @NamedQuery(name = "OpsiB6r6utamalain.findByB6R6utamalain", query = "SELECT o FROM OpsiB6r6utamalain o WHERE o.b6R6utamalain = :b6R6utamalain"),
    @NamedQuery(name = "OpsiB6r6utamalain.findByValue", query = "SELECT o FROM OpsiB6r6utamalain o WHERE o.value = :value")})
public class OpsiB6r6utamalain implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B6R6utamalain")
    private Integer b6R6utamalain;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(mappedBy = "b6R6lain")
    private List<B6Keteranganumumpekerjaaninformalutama> b6KeteranganumumpekerjaaninformalutamaList;
    @OneToMany(mappedBy = "b6R6utama")
    private List<B6Keteranganumumpekerjaaninformalutama> b6KeteranganumumpekerjaaninformalutamaList1;

    public OpsiB6r6utamalain() {
    }

    public OpsiB6r6utamalain(Integer b6R6utamalain) {
        this.b6R6utamalain = b6R6utamalain;
    }

    public OpsiB6r6utamalain(Integer b6R6utamalain, String value) {
        this.b6R6utamalain = b6R6utamalain;
        this.value = value;
    }

    public Integer getB6R6utamalain() {
        return b6R6utamalain;
    }

    public void setB6R6utamalain(Integer b6R6utamalain) {
        this.b6R6utamalain = b6R6utamalain;
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

    @XmlTransient
    public List<B6Keteranganumumpekerjaaninformalutama> getB6KeteranganumumpekerjaaninformalutamaList1() {
        return b6KeteranganumumpekerjaaninformalutamaList1;
    }

    public void setB6KeteranganumumpekerjaaninformalutamaList1(List<B6Keteranganumumpekerjaaninformalutama> b6KeteranganumumpekerjaaninformalutamaList1) {
        this.b6KeteranganumumpekerjaaninformalutamaList1 = b6KeteranganumumpekerjaaninformalutamaList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (b6R6utamalain != null ? b6R6utamalain.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB6r6utamalain)) {
            return false;
        }
        OpsiB6r6utamalain other = (OpsiB6r6utamalain) object;
        if ((this.b6R6utamalain == null && other.b6R6utamalain != null) || (this.b6R6utamalain != null && !this.b6R6utamalain.equals(other.b6R6utamalain))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB6r6utamalain[ b6R6utamalain=" + b6R6utamalain + " ]";
    }
    
}
