/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "opsi_jeniskelamin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiJeniskelamin.findAll", query = "SELECT o FROM OpsiJeniskelamin o"),
    @NamedQuery(name = "OpsiJeniskelamin.findByKodeJenisKelamin", query = "SELECT o FROM OpsiJeniskelamin o WHERE o.kodeJenisKelamin = :kodeJenisKelamin"),
    @NamedQuery(name = "OpsiJeniskelamin.findByJenisKelamin", query = "SELECT o FROM OpsiJeniskelamin o WHERE o.jenisKelamin = :jenisKelamin")})
public class OpsiJeniskelamin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kodeJenisKelamin")
    private String kodeJenisKelamin;
    @Basic(optional = false)
    @Column(name = "jenisKelamin")
    private String jenisKelamin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4r10")
    private List<KetRtanggota> ketRtanggotaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r15c")
    private List<B3r15Pekerja> b3r15PekerjaList;

    public OpsiJeniskelamin() {
    }

    public OpsiJeniskelamin(String kodeJenisKelamin) {
        this.kodeJenisKelamin = kodeJenisKelamin;
    }

    public OpsiJeniskelamin(String kodeJenisKelamin, String jenisKelamin) {
        this.kodeJenisKelamin = kodeJenisKelamin;
        this.jenisKelamin = jenisKelamin;
    }

    public String getKodeJenisKelamin() {
        return kodeJenisKelamin;
    }

    public void setKodeJenisKelamin(String kodeJenisKelamin) {
        this.kodeJenisKelamin = kodeJenisKelamin;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @XmlTransient
    public List<KetRtanggota> getKetRtanggotaList() {
        return ketRtanggotaList;
    }

    public void setKetRtanggotaList(List<KetRtanggota> ketRtanggotaList) {
        this.ketRtanggotaList = ketRtanggotaList;
    }

    @XmlTransient
    public List<B3r15Pekerja> getB3r15PekerjaList() {
        return b3r15PekerjaList;
    }

    public void setB3r15PekerjaList(List<B3r15Pekerja> b3r15PekerjaList) {
        this.b3r15PekerjaList = b3r15PekerjaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeJenisKelamin != null ? kodeJenisKelamin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiJeniskelamin)) {
            return false;
        }
        OpsiJeniskelamin other = (OpsiJeniskelamin) object;
        if ((this.kodeJenisKelamin == null && other.kodeJenisKelamin != null) || (this.kodeJenisKelamin != null && !this.kodeJenisKelamin.equals(other.kodeJenisKelamin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiJeniskelamin[ kodeJenisKelamin=" + kodeJenisKelamin + " ]";
    }
    
}
