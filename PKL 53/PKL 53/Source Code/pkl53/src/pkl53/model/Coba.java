/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rizki syazali
 */
@Entity
@Table(name = "coba")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coba.findAll", query = "SELECT c FROM Coba c"),
    @NamedQuery(name = "Coba.findByA", query = "SELECT c FROM Coba c WHERE c.a = :a")})
public class Coba implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "a")
    private String a;
    @JoinColumn(name = "b", referencedColumnName = "nim")
    @ManyToOne(optional = false)
    private Mahasiswa b;
    @JoinColumn(name = "a", referencedColumnName = "nim", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Mahasiswa mahasiswa;

    public Coba() {
    }

    public Coba(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Mahasiswa getB() {
        return b;
    }

    public void setB(Mahasiswa b) {
        this.b = b;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (a != null ? a.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coba)) {
            return false;
        }
        Coba other = (Coba) object;
        if ((this.a == null && other.a != null) || (this.a != null && !this.a.equals(other.a))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.Coba[ a=" + a + " ]";
    }
    
}
