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
@Table(name = "kortimpencacah")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kortimpencacah.findAll", query = "SELECT k FROM Kortimpencacah k"),
    @NamedQuery(name = "Kortimpencacah.findByNimPencacah", query = "SELECT k FROM Kortimpencacah k WHERE k.nimPencacah = :nimPencacah")})
public class Kortimpencacah implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nimPencacah")
    private String nimPencacah;
    @JoinColumn(name = "nimPencacah", referencedColumnName = "nim", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Mahasiswa mahasiswa;
    @JoinColumn(name = "nimKortim", referencedColumnName = "nim")
    @ManyToOne
    private Mahasiswa nimKortim;

    public Kortimpencacah() {
    }

    public Kortimpencacah(String nimPencacah) {
        this.nimPencacah = nimPencacah;
    }

    public String getNimPencacah() {
        return nimPencacah;
    }

    public void setNimPencacah(String nimPencacah) {
        this.nimPencacah = nimPencacah;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Mahasiswa getNimKortim() {
        return nimKortim;
    }

    public void setNimKortim(Mahasiswa nimKortim) {
        this.nimKortim = nimKortim;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nimPencacah != null ? nimPencacah.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kortimpencacah)) {
            return false;
        }
        Kortimpencacah other = (Kortimpencacah) object;
        if ((this.nimPencacah == null && other.nimPencacah != null) || (this.nimPencacah != null && !this.nimPencacah.equals(other.nimPencacah))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.Kortimpencacah[ nimPencacah=" + nimPencacah + " ]";
    }
    
}
