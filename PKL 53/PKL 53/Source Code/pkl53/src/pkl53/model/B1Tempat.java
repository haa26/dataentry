/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rizki syazali
 */
@Entity
@Table(name = "2b1_tempat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B1Tempat.findAll", query = "SELECT b FROM B1Tempat b"),
    @NamedQuery(name = "B1Tempat.findByKks", query = "SELECT b FROM B1Tempat b WHERE b.kks = :kks"),
    @NamedQuery(name = "B1Tempat.findByB1r4", query = "SELECT b FROM B1Tempat b WHERE b.b1r4 = :b1r4"),
    @NamedQuery(name = "B1Tempat.findByB1r5b", query = "SELECT b FROM B1Tempat b WHERE b.b1r5b = :b1r5b"),
    @NamedQuery(name = "B1Tempat.findByB1r6", query = "SELECT b FROM B1Tempat b WHERE b.b1r6 = :b1r6"),
    @NamedQuery(name = "B1Tempat.findByB1r7", query = "SELECT b FROM B1Tempat b WHERE b.b1r7 = :b1r7"),
    @NamedQuery(name = "B1Tempat.findByB1r8", query = "SELECT b FROM B1Tempat b WHERE b.b1r8 = :b1r8"),
    @NamedQuery(name = "B1Tempat.findByTanggalPencacahan", query = "SELECT b FROM B1Tempat b WHERE b.tanggalPencacahan = :tanggalPencacahan"),
    @NamedQuery(name = "B1Tempat.findByTanggalPemeriksaanKU", query = "SELECT b FROM B1Tempat b WHERE b.tanggalPemeriksaanKU = :tanggalPemeriksaanKU")})
public class B1Tempat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKS")
    private String kks;
    @Column(name = "B1R4")
    private String b1r4;
    @Column(name = "B1R5B")
    private String b1r5b;
    @Column(name = "B1R6")
    private String b1r6;
    @Column(name = "B1R7")
    private String b1r7;
    @Column(name = "B1R8")
    private String b1r8;
    @Column(name = "tanggalPencacahan")
    @Temporal(TemporalType.DATE)
    private Date tanggalPencacahan;
    @Column(name = "tanggalPemeriksaanKU")
    @Temporal(TemporalType.DATE)
    private Date tanggalPemeriksaanKU;
    @JoinColumn(name = "B1R1", referencedColumnName = "kodeKabupaten")
    @ManyToOne(optional = false)
    private Kabupatenkota b1r1;
    @JoinColumn(name = "B1R3", referencedColumnName = "kelurahan_id")
    @ManyToOne
    private Kelurahan b1r3;
    @JoinColumn(name = "B1R2", referencedColumnName = "kecamatan_id")
    @ManyToOne
    private Kecamatan b1r2;
    @JoinColumn(name = "B1R5A", referencedColumnName = "nobs_id")
    @ManyToOne
    private NoBs b1r5a;
    @JoinColumn(name = "nimPencacah", referencedColumnName = "nim")
    @ManyToOne
    private Mahasiswa nimPencacah;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kks")
    private List<B2Art> b2ArtList;

    public B1Tempat() {
    }

    public B1Tempat(String kks) {
        this.kks = kks;
    }

    public String getKks() {
        return kks;
    }

    public void setKks(String kks) {
        this.kks = kks;
    }

    public String getB1r4() {
        return b1r4;
    }

    public void setB1r4(String b1r4) {
        this.b1r4 = b1r4;
    }

    public String getB1r5b() {
        return b1r5b;
    }

    public void setB1r5b(String b1r5b) {
        this.b1r5b = b1r5b;
    }

    public String getB1r6() {
        return b1r6;
    }

    public void setB1r6(String b1r6) {
        this.b1r6 = b1r6;
    }

    public String getB1r7() {
        return b1r7;
    }

    public void setB1r7(String b1r7) {
        this.b1r7 = b1r7;
    }

    public String getB1r8() {
        return b1r8;
    }

    public void setB1r8(String b1r8) {
        this.b1r8 = b1r8;
    }

    public Date getTanggalPencacahan() {
        return tanggalPencacahan;
    }

    public void setTanggalPencacahan(Date tanggalPencacahan) {
        this.tanggalPencacahan = tanggalPencacahan;
    }

    public Date getTanggalPemeriksaanKU() {
        return tanggalPemeriksaanKU;
    }

    public void setTanggalPemeriksaanKU(Date tanggalPemeriksaanKU) {
        this.tanggalPemeriksaanKU = tanggalPemeriksaanKU;
    }

    public Kabupatenkota getB1r1() {
        return b1r1;
    }

    public void setB1r1(Kabupatenkota b1r1) {
        this.b1r1 = b1r1;
    }

    public Kelurahan getB1r3() {
        return b1r3;
    }

    public void setB1r3(Kelurahan b1r3) {
        this.b1r3 = b1r3;
    }

    public Kecamatan getB1r2() {
        return b1r2;
    }

    public void setB1r2(Kecamatan b1r2) {
        this.b1r2 = b1r2;
    }

    public NoBs getB1r5a() {
        return b1r5a;
    }

    public void setB1r5a(NoBs b1r5a) {
        this.b1r5a = b1r5a;
    }

    public Mahasiswa getNimPencacah() {
        return nimPencacah;
    }

    public void setNimPencacah(Mahasiswa nimPencacah) {
        this.nimPencacah = nimPencacah;
    }

    @XmlTransient
    public List<B2Art> getB2ArtList() {
        return b2ArtList;
    }

    public void setB2ArtList(List<B2Art> b2ArtList) {
        this.b2ArtList = b2ArtList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kks != null ? kks.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B1Tempat)) {
            return false;
        }
        B1Tempat other = (B1Tempat) object;
        if ((this.kks == null && other.kks != null) || (this.kks != null && !this.kks.equals(other.kks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.B1Tempat[ kks=" + kks + " ]";
    }
    
}
