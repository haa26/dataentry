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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "3ket_rt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KetRt.findAll", query = "SELECT k FROM KetRt k"),
    @NamedQuery(name = "KetRt.findByKksrt", query = "SELECT k FROM KetRt k WHERE k.kksrt = :kksrt"),
    @NamedQuery(name = "KetRt.findByB4r1", query = "SELECT k FROM KetRt k WHERE k.b4r1 = :b4r1"),
    @NamedQuery(name = "KetRt.findByB4r2", query = "SELECT k FROM KetRt k WHERE k.b4r2 = :b4r2"),
    @NamedQuery(name = "KetRt.findByB4r3", query = "SELECT k FROM KetRt k WHERE k.b4r3 = :b4r3"),
    @NamedQuery(name = "KetRt.findByB4r4", query = "SELECT k FROM KetRt k WHERE k.b4r4 = :b4r4"),
    @NamedQuery(name = "KetRt.findByB4r5", query = "SELECT k FROM KetRt k WHERE k.b4r5 = :b4r5"),
    @NamedQuery(name = "KetRt.findByB4r6", query = "SELECT k FROM KetRt k WHERE k.b4r6 = :b4r6"),
    @NamedQuery(name = "KetRt.findByB4r24", query = "SELECT k FROM KetRt k WHERE k.b4r24 = :b4r24"),
    @NamedQuery(name = "KetRt.findByB4r2526", query = "SELECT k FROM KetRt k WHERE k.b4r2526 = :b4r2526"),
    @NamedQuery(name = "KetRt.findByB4r30", query = "SELECT k FROM KetRt k WHERE k.b4r30 = :b4r30"),
    @NamedQuery(name = "KetRt.findByB4r31", query = "SELECT k FROM KetRt k WHERE k.b4r31 = :b4r31")})
public class KetRt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKSRT")
    private String kksrt;
    @Basic(optional = false)
    @Column(name = "B4R1")
    private String b4r1;
    @Basic(optional = false)
    @Column(name = "B4R2")
    private String b4r2;
    @Basic(optional = false)
    @Column(name = "B4R3")
    private String b4r3;
    @Basic(optional = false)
    @Column(name = "B4R4")
    private String b4r4;
    @Basic(optional = false)
    @Column(name = "B4R5")
    private String b4r5;
    @Basic(optional = false)
    @Column(name = "B4R6")
    private int b4r6;
    @Basic(optional = false)
    @Column(name = "B4R24")
    private int b4r24;
    @Basic(optional = false)
    @Column(name = "B4R2526")
    private String b4r2526;
    @Basic(optional = false)
    @Column(name = "B4R30")
    private int b4r30;
    @Basic(optional = false)
    @Column(name = "B4R31")
    private String b4r31;
    @JoinColumn(name = "KKS", referencedColumnName = "KKS")
    @ManyToOne(optional = false)
    private KetKuesioner kks;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kksrt")
    private List<KetRtanggota> ketRtanggotaList;
    @OneToMany(mappedBy = "b1r6")
    private List<B1Keterangantempat> b1KeterangantempatList;

    public KetRt() {
    }

    public KetRt(String kksrt) {
        this.kksrt = kksrt;
    }

    public KetRt(String kksrt, String b4r1, String b4r2, String b4r3, String b4r4, String b4r5, int b4r6, int b4r24, String b4r2526, int b4r30, String b4r31) {
        this.kksrt = kksrt;
        this.b4r1 = b4r1;
        this.b4r2 = b4r2;
        this.b4r3 = b4r3;
        this.b4r4 = b4r4;
        this.b4r5 = b4r5;
        this.b4r6 = b4r6;
        this.b4r24 = b4r24;
        this.b4r2526 = b4r2526;
        this.b4r30 = b4r30;
        this.b4r31 = b4r31;
    }

    public String getKksrt() {
        return kksrt;
    }

    public void setKksrt(String kksrt) {
        this.kksrt = kksrt;
    }

    public String getB4r1() {
        return b4r1;
    }

    public void setB4r1(String b4r1) {
        this.b4r1 = b4r1;
    }

    public String getB4r2() {
        return b4r2;
    }

    public void setB4r2(String b4r2) {
        this.b4r2 = b4r2;
    }

    public String getB4r3() {
        return b4r3;
    }

    public void setB4r3(String b4r3) {
        this.b4r3 = b4r3;
    }

    public String getB4r4() {
        return b4r4;
    }

    public void setB4r4(String b4r4) {
        this.b4r4 = b4r4;
    }

    public String getB4r5() {
        return b4r5;
    }

    public void setB4r5(String b4r5) {
        this.b4r5 = b4r5;
    }

    public int getB4r6() {
        return b4r6;
    }

    public void setB4r6(int b4r6) {
        this.b4r6 = b4r6;
    }

    public int getB4r24() {
        return b4r24;
    }

    public void setB4r24(int b4r24) {
        this.b4r24 = b4r24;
    }

    public String getB4r2526() {
        return b4r2526;
    }

    public void setB4r2526(String b4r2526) {
        this.b4r2526 = b4r2526;
    }

    public int getB4r30() {
        return b4r30;
    }

    public void setB4r30(int b4r30) {
        this.b4r30 = b4r30;
    }

    public String getB4r31() {
        return b4r31;
    }

    public void setB4r31(String b4r31) {
        this.b4r31 = b4r31;
    }

    public KetKuesioner getKks() {
        return kks;
    }

    public void setKks(KetKuesioner kks) {
        this.kks = kks;
    }

    @XmlTransient
    public List<KetRtanggota> getKetRtanggotaList() {
        return ketRtanggotaList;
    }

    public void setKetRtanggotaList(List<KetRtanggota> ketRtanggotaList) {
        this.ketRtanggotaList = ketRtanggotaList;
    }

    @XmlTransient
    public List<B1Keterangantempat> getB1KeterangantempatList() {
        return b1KeterangantempatList;
    }

    public void setB1KeterangantempatList(List<B1Keterangantempat> b1KeterangantempatList) {
        this.b1KeterangantempatList = b1KeterangantempatList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kksrt != null ? kksrt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KetRt)) {
            return false;
        }
        KetRt other = (KetRt) object;
        if ((this.kksrt == null && other.kksrt != null) || (this.kksrt != null && !this.kksrt.equals(other.kksrt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.KetRt[ kksrt=" + kksrt + " ]";
    }
    
}
