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
import javax.persistence.Lob;
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
@Table(name = "3ket_kuesioner")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KetKuesioner.findAll", query = "SELECT k FROM KetKuesioner k"),
    @NamedQuery(name = "KetKuesioner.findByKks", query = "SELECT k FROM KetKuesioner k WHERE k.kks = :kks"),
    @NamedQuery(name = "KetKuesioner.findByB1r4", query = "SELECT k FROM KetKuesioner k WHERE k.b1r4 = :b1r4"),
    @NamedQuery(name = "KetKuesioner.findByB1r6", query = "SELECT k FROM KetKuesioner k WHERE k.b1r6 = :b1r6"),
    @NamedQuery(name = "KetKuesioner.findByB2r1", query = "SELECT k FROM KetKuesioner k WHERE k.b2r1 = :b2r1"),
    @NamedQuery(name = "KetKuesioner.findByB2r2", query = "SELECT k FROM KetKuesioner k WHERE k.b2r2 = :b2r2"),
    @NamedQuery(name = "KetKuesioner.findByB2r3", query = "SELECT k FROM KetKuesioner k WHERE k.b2r3 = :b2r3"),
    @NamedQuery(name = "KetKuesioner.findByB2r4", query = "SELECT k FROM KetKuesioner k WHERE k.b2r4 = :b2r4"),
    @NamedQuery(name = "KetKuesioner.findByB2r5", query = "SELECT k FROM KetKuesioner k WHERE k.b2r5 = :b2r5"),
    @NamedQuery(name = "KetKuesioner.findByB2r6", query = "SELECT k FROM KetKuesioner k WHERE k.b2r6 = :b2r6"),
    @NamedQuery(name = "KetKuesioner.findByB2r7", query = "SELECT k FROM KetKuesioner k WHERE k.b2r7 = :b2r7"),
    @NamedQuery(name = "KetKuesioner.findByB2r8", query = "SELECT k FROM KetKuesioner k WHERE k.b2r8 = :b2r8"),
    @NamedQuery(name = "KetKuesioner.findByTanggalPencacahan", query = "SELECT k FROM KetKuesioner k WHERE k.tanggalPencacahan = :tanggalPencacahan"),
    @NamedQuery(name = "KetKuesioner.findByTanggalPemeriksaan", query = "SELECT k FROM KetKuesioner k WHERE k.tanggalPemeriksaan = :tanggalPemeriksaan")})
public class KetKuesioner implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKS")
    private String kks;
    @Basic(optional = false)
    @Column(name = "B1R4")
    private String b1r4;
    @Basic(optional = false)
    @Column(name = "B1R6")
    private String b1r6;
    @Basic(optional = false)
    @Column(name = "B2R1")
    private int b2r1;
    @Basic(optional = false)
    @Column(name = "B2R2")
    private int b2r2;
    @Basic(optional = false)
    @Column(name = "B2R3")
    private int b2r3;
    @Basic(optional = false)
    @Column(name = "B2R4")
    private int b2r4;
    @Basic(optional = false)
    @Column(name = "B2R5")
    private int b2r5;
    @Basic(optional = false)
    @Column(name = "B2R6")
    private int b2r6;
    @Basic(optional = false)
    @Column(name = "B2R7")
    private int b2r7;
    @Basic(optional = false)
    @Column(name = "B2R8")
    private int b2r8;
    @Basic(optional = false)
    @Column(name = "tanggalPencacahan")
    @Temporal(TemporalType.DATE)
    private Date tanggalPencacahan;
    @Basic(optional = false)
    @Column(name = "tanggalPemeriksaan")
    @Temporal(TemporalType.DATE)
    private Date tanggalPemeriksaan;
    @Basic(optional = false)
    @Lob
    @Column(name = "catatan")
    private String catatan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kks")
    private List<KetRt> ketRtList;
    @JoinColumn(name = "nimPencacah", referencedColumnName = "nim")
    @ManyToOne(optional = false)
    private Mahasiswa nimPencacah;
    @JoinColumn(name = "B1R1", referencedColumnName = "kodeKabupaten")
    @ManyToOne(optional = false)
    private Kabupatenkota b1r1;
    @JoinColumn(name = "B1R2", referencedColumnName = "kecamatan_id")
    @ManyToOne(optional = false)
    private Kecamatan b1r2;
    @JoinColumn(name = "B1R3", referencedColumnName = "kelurahan_id")
    @ManyToOne(optional = false)
    private Kelurahan b1r3;
    @JoinColumn(name = "B1R5", referencedColumnName = "nobs_id")
    @ManyToOne(optional = false)
    private NoBs b1r5;

    public KetKuesioner() {
    }

    public KetKuesioner(String kks) {
        this.kks = kks;
    }

    public KetKuesioner(String kks, String b1r4, String b1r6, int b2r1, int b2r2, int b2r3, int b2r4, int b2r5, int b2r6, int b2r7, int b2r8, Date tanggalPencacahan, Date tanggalPemeriksaan, String catatan) {
        this.kks = kks;
        this.b1r4 = b1r4;
        this.b1r6 = b1r6;
        this.b2r1 = b2r1;
        this.b2r2 = b2r2;
        this.b2r3 = b2r3;
        this.b2r4 = b2r4;
        this.b2r5 = b2r5;
        this.b2r6 = b2r6;
        this.b2r7 = b2r7;
        this.b2r8 = b2r8;
        this.tanggalPencacahan = tanggalPencacahan;
        this.tanggalPemeriksaan = tanggalPemeriksaan;
        this.catatan = catatan;
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

    public String getB1r6() {
        return b1r6;
    }

    public void setB1r6(String b1r6) {
        this.b1r6 = b1r6;
    }

    public int getB2r1() {
        return b2r1;
    }

    public void setB2r1(int b2r1) {
        this.b2r1 = b2r1;
    }

    public int getB2r2() {
        return b2r2;
    }

    public void setB2r2(int b2r2) {
        this.b2r2 = b2r2;
    }

    public int getB2r3() {
        return b2r3;
    }

    public void setB2r3(int b2r3) {
        this.b2r3 = b2r3;
    }

    public int getB2r4() {
        return b2r4;
    }

    public void setB2r4(int b2r4) {
        this.b2r4 = b2r4;
    }

    public int getB2r5() {
        return b2r5;
    }

    public void setB2r5(int b2r5) {
        this.b2r5 = b2r5;
    }

    public int getB2r6() {
        return b2r6;
    }

    public void setB2r6(int b2r6) {
        this.b2r6 = b2r6;
    }

    public int getB2r7() {
        return b2r7;
    }

    public void setB2r7(int b2r7) {
        this.b2r7 = b2r7;
    }

    public int getB2r8() {
        return b2r8;
    }

    public void setB2r8(int b2r8) {
        this.b2r8 = b2r8;
    }

    public Date getTanggalPencacahan() {
        return tanggalPencacahan;
    }

    public void setTanggalPencacahan(Date tanggalPencacahan) {
        this.tanggalPencacahan = tanggalPencacahan;
    }

    public Date getTanggalPemeriksaan() {
        return tanggalPemeriksaan;
    }

    public void setTanggalPemeriksaan(Date tanggalPemeriksaan) {
        this.tanggalPemeriksaan = tanggalPemeriksaan;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    @XmlTransient
    public List<KetRt> getKetRtList() {
        return ketRtList;
    }

    public void setKetRtList(List<KetRt> ketRtList) {
        this.ketRtList = ketRtList;
    }

    public Mahasiswa getNimPencacah() {
        return nimPencacah;
    }

    public void setNimPencacah(Mahasiswa nimPencacah) {
        this.nimPencacah = nimPencacah;
    }

    public Kabupatenkota getB1r1() {
        return b1r1;
    }

    public void setB1r1(Kabupatenkota b1r1) {
        this.b1r1 = b1r1;
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

    public NoBs getB1r5() {
        return b1r5;
    }

    public void setB1r5(NoBs b1r5) {
        this.b1r5 = b1r5;
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
        if (!(object instanceof KetKuesioner)) {
            return false;
        }
        KetKuesioner other = (KetKuesioner) object;
        if ((this.kks == null && other.kks != null) || (this.kks != null && !this.kks.equals(other.kks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.KetKuesioner[ kks=" + kks + " ]";
    }
    
}
