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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rizki syazali
 */
@Entity
@Table(name = "opsi_rincian_lap_usaha")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiRincianLapUsaha.findAll", query = "SELECT o FROM OpsiRincianLapUsaha o"),
    @NamedQuery(name = "OpsiRincianLapUsaha.findByKode", query = "SELECT o FROM OpsiRincianLapUsaha o WHERE o.kode = :kode"),
    @NamedQuery(name = "OpsiRincianLapUsaha.findByValue", query = "SELECT o FROM OpsiRincianLapUsaha o WHERE o.value = :value")})
public class OpsiRincianLapUsaha implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode")
    private String kode;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;

    public OpsiRincianLapUsaha() {
    }

    public OpsiRincianLapUsaha(String kode) {
        this.kode = kode;
    }

    public OpsiRincianLapUsaha(String kode, String value) {
        this.kode = kode;
        this.value = value;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kode != null ? kode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiRincianLapUsaha)) {
            return false;
        }
        OpsiRincianLapUsaha other = (OpsiRincianLapUsaha) object;
        if ((this.kode == null && other.kode != null) || (this.kode != null && !this.kode.equals(other.kode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiRincianLapUsaha[ kode=" + kode + " ]";
    }
    
}
