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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "petugasentri")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Petugasentri.findAll", query = "SELECT p FROM Petugasentri p"),
    @NamedQuery(name = "Petugasentri.findByNo", query = "SELECT p FROM Petugasentri p WHERE p.no = :no"),
    @NamedQuery(name = "Petugasentri.findByKks", query = "SELECT p FROM Petugasentri p WHERE p.kks = :kks"),
    @NamedQuery(name = "Petugasentri.findByNim", query = "SELECT p FROM Petugasentri p WHERE p.nim = :nim"),
    @NamedQuery(name = "Petugasentri.findByWaktu", query = "SELECT p FROM Petugasentri p WHERE p.waktu = :waktu")})
public class Petugasentri implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "no")
    private Integer no;
    @Column(name = "kks")
    private String kks;
    @Column(name = "nim")
    private String nim;
    @Column(name = "waktu")
    private Integer waktu;

    public Petugasentri() {
    }

    public Petugasentri(Integer no) {
        this.no = no;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getKks() {
        return kks;
    }

    public void setKks(String kks) {
        this.kks = kks;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Integer getWaktu() {
        return waktu;
    }

    public void setWaktu(Integer waktu) {
        this.waktu = waktu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (no != null ? no.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Petugasentri)) {
            return false;
        }
        Petugasentri other = (Petugasentri) object;
        if ((this.no == null && other.no != null) || (this.no != null && !this.no.equals(other.no))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.Petugasentri[ no=" + no + " ]";
    }
    
}
