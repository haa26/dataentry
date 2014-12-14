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
import javax.persistence.OneToOne;
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
@Table(name = "1b1_keterangantempat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B1Keterangantempat.findAll", query = "SELECT b FROM B1Keterangantempat b"),
    @NamedQuery(name = "B1Keterangantempat.findByKks", query = "SELECT b FROM B1Keterangantempat b WHERE b.kks = :kks"),
    @NamedQuery(name = "B1Keterangantempat.findByB1r4", query = "SELECT b FROM B1Keterangantempat b WHERE b.b1r4 = :b1r4"),
    @NamedQuery(name = "B1Keterangantempat.findByB1r5b", query = "SELECT b FROM B1Keterangantempat b WHERE b.b1r5b = :b1r5b"),
    @NamedQuery(name = "B1Keterangantempat.findByB1r7", query = "SELECT b FROM B1Keterangantempat b WHERE b.b1r7 = :b1r7"),
    @NamedQuery(name = "B1Keterangantempat.findByB1r8", query = "SELECT b FROM B1Keterangantempat b WHERE b.b1r8 = :b1r8"),
    @NamedQuery(name = "B1Keterangantempat.findByTanggalPencacahan", query = "SELECT b FROM B1Keterangantempat b WHERE b.tanggalPencacahan = :tanggalPencacahan"),
    @NamedQuery(name = "B1Keterangantempat.findByTanggalPemeriksaanKP", query = "SELECT b FROM B1Keterangantempat b WHERE b.tanggalPemeriksaanKP = :tanggalPemeriksaanKP")})
public class B1Keterangantempat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKS")
    private String kks;
    @Column(name = "B1R4")
    private String b1r4;
    @Column(name = "B1R5B")
    private String b1r5b;
    @Column(name = "B1R7")
    private String b1r7;
    @Column(name = "B1R8")
    private String b1r8;
    @Column(name = "tanggalPencacahan")
    @Temporal(TemporalType.DATE)
    private Date tanggalPencacahan;
    @Column(name = "tanggalPemeriksaanKP")
    @Temporal(TemporalType.DATE)
    private Date tanggalPemeriksaanKP;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "b1Keterangantempat")
    private B8Keteranganperumahandanaset b8Keteranganperumahandanaset;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kks")
    private List<B4Art> b4ArtList;
    @JoinColumn(name = "B1R6", referencedColumnName = "KKSRT")
    @ManyToOne
    private KetRt b1r6;
    @JoinColumn(name = "B1R2", referencedColumnName = "kecamatan_id")
    @ManyToOne
    private Kecamatan b1r2;
    @JoinColumn(name = "B1R3", referencedColumnName = "kelurahan_id")
    @ManyToOne
    private Kelurahan b1r3;
    @JoinColumn(name = "B1R1", referencedColumnName = "kodeKabupaten")
    @OneToOne(optional = false)
    private Kabupatenkota b1r1;
    @JoinColumn(name = "B1R5A", referencedColumnName = "nobs_id")
    @ManyToOne
    private NoBs b1r5a;
    @JoinColumn(name = "nimPencacah", referencedColumnName = "nim")
    @ManyToOne
    private Mahasiswa nimPencacah;

    public B1Keterangantempat() {
    }

    public B1Keterangantempat(String kks) {
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

    public Date getTanggalPemeriksaanKP() {
        return tanggalPemeriksaanKP;
    }

    public void setTanggalPemeriksaanKP(Date tanggalPemeriksaanKP) {
        this.tanggalPemeriksaanKP = tanggalPemeriksaanKP;
    }

    public B8Keteranganperumahandanaset getB8Keteranganperumahandanaset() {
        return b8Keteranganperumahandanaset;
    }

    public void setB8Keteranganperumahandanaset(B8Keteranganperumahandanaset b8Keteranganperumahandanaset) {
        this.b8Keteranganperumahandanaset = b8Keteranganperumahandanaset;
    }

    @XmlTransient
    public List<B4Art> getB4ArtList() {
        return b4ArtList;
    }

    public void setB4ArtList(List<B4Art> b4ArtList) {
        this.b4ArtList = b4ArtList;
    }

    public KetRt getB1r6() {
        return b1r6;
    }

    public void setB1r6(KetRt b1r6) {
        this.b1r6 = b1r6;
    }

    public Kecamatan getB1r2() {
        return b1r2;
    }

    public void setB1r2(Kecamatan b1r2) {
        this.b1r2 = b1r2;
    }

    public Kelurahan getB1r3() {
        return b1r3;
    }

    public void setB1r3(Kelurahan b1r3) {
        this.b1r3 = b1r3;
    }

    public Kabupatenkota getB1r1() {
        return b1r1;
    }

    public void setB1r1(Kabupatenkota b1r1) {
        this.b1r1 = b1r1;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kks != null ? kks.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B1Keterangantempat)) {
            return false;
        }
        B1Keterangantempat other = (B1Keterangantempat) object;
        if ((this.kks == null && other.kks != null) || (this.kks != null && !this.kks.equals(other.kks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.B1Keterangantempat[ kks=" + kks + " ]";
    }
    
}
