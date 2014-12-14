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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rizki syazali
 */
@Entity
@Table(name = "3ket_rtanggota")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KetRtanggota.findAll", query = "SELECT k FROM KetRtanggota k"),
    @NamedQuery(name = "KetRtanggota.findByKKSArt", query = "SELECT k FROM KetRtanggota k WHERE k.kKSArt = :kKSArt"),
    @NamedQuery(name = "KetRtanggota.findByB4r7", query = "SELECT k FROM KetRtanggota k WHERE k.b4r7 = :b4r7"),
    @NamedQuery(name = "KetRtanggota.findByB4r8", query = "SELECT k FROM KetRtanggota k WHERE k.b4r8 = :b4r8"),
    @NamedQuery(name = "KetRtanggota.findByB4r11", query = "SELECT k FROM KetRtanggota k WHERE k.b4r11 = :b4r11"),
    @NamedQuery(name = "KetRtanggota.findByB4r12", query = "SELECT k FROM KetRtanggota k WHERE k.b4r12 = :b4r12"),
    @NamedQuery(name = "KetRtanggota.findByB4r13", query = "SELECT k FROM KetRtanggota k WHERE k.b4r13 = :b4r13"),
    @NamedQuery(name = "KetRtanggota.findByB4r14", query = "SELECT k FROM KetRtanggota k WHERE k.b4r14 = :b4r14"),
    @NamedQuery(name = "KetRtanggota.findByB4r15", query = "SELECT k FROM KetRtanggota k WHERE k.b4r15 = :b4r15"),
    @NamedQuery(name = "KetRtanggota.findByB4r17", query = "SELECT k FROM KetRtanggota k WHERE k.b4r17 = :b4r17")})
public class KetRtanggota implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKSArt")
    private String kKSArt;
    @Basic(optional = false)
    @Column(name = "B4R7")
    private int b4r7;
    @Basic(optional = false)
    @Column(name = "B4R8")
    private String b4r8;
    @Basic(optional = false)
    @Column(name = "B4R11")
    private int b4r11;
    @Column(name = "B4R12")
    private String b4r12;
    @Column(name = "B4R13")
    private String b4r13;
    @Column(name = "B4R14")
    private String b4r14;
    @Column(name = "B4R15")
    private String b4r15;
    @Column(name = "B4R17")
    private String b4r17;
    @JoinColumn(name = "KKSRT", referencedColumnName = "KKSRT")
    @ManyToOne(optional = false)
    private KetRt kksrt;
    @JoinColumn(name = "B4R9", referencedColumnName = "B4R3")
    @ManyToOne(optional = false)
    private OpsiB4r3 b4r9;
    @JoinColumn(name = "B4R10", referencedColumnName = "kodeJenisKelamin")
    @ManyToOne(optional = false)
    private OpsiJeniskelamin b4r10;
    @JoinColumn(name = "B4R16", referencedColumnName = "B4R16")
    @ManyToOne
    private OpsiListingB4r16 b4r16;
    @JoinColumn(name = "B4R18", referencedColumnName = "B4R7")
    @ManyToOne
    private OpsiB4r7 b4r18;
    @JoinColumn(name = "B4R19", referencedColumnName = "B4R8")
    @ManyToOne
    private OpsiB4r8 b4r19;

    public KetRtanggota() {
    }

    public KetRtanggota(String kKSArt) {
        this.kKSArt = kKSArt;
    }

    public KetRtanggota(String kKSArt, int b4r7, String b4r8, int b4r11) {
        this.kKSArt = kKSArt;
        this.b4r7 = b4r7;
        this.b4r8 = b4r8;
        this.b4r11 = b4r11;
    }

    public String getKKSArt() {
        return kKSArt;
    }

    public void setKKSArt(String kKSArt) {
        this.kKSArt = kKSArt;
    }

    public int getB4r7() {
        return b4r7;
    }

    public void setB4r7(int b4r7) {
        this.b4r7 = b4r7;
    }

    public String getB4r8() {
        return b4r8;
    }

    public void setB4r8(String b4r8) {
        this.b4r8 = b4r8;
    }

    public int getB4r11() {
        return b4r11;
    }

    public void setB4r11(int b4r11) {
        this.b4r11 = b4r11;
    }

    public String getB4r12() {
        return b4r12;
    }

    public void setB4r12(String b4r12) {
        this.b4r12 = b4r12;
    }

    public String getB4r13() {
        return b4r13;
    }

    public void setB4r13(String b4r13) {
        this.b4r13 = b4r13;
    }

    public String getB4r14() {
        return b4r14;
    }

    public void setB4r14(String b4r14) {
        this.b4r14 = b4r14;
    }

    public String getB4r15() {
        return b4r15;
    }

    public void setB4r15(String b4r15) {
        this.b4r15 = b4r15;
    }

    public String getB4r17() {
        return b4r17;
    }

    public void setB4r17(String b4r17) {
        this.b4r17 = b4r17;
    }

    public KetRt getKksrt() {
        return kksrt;
    }

    public void setKksrt(KetRt kksrt) {
        this.kksrt = kksrt;
    }

    public OpsiB4r3 getB4r9() {
        return b4r9;
    }

    public void setB4r9(OpsiB4r3 b4r9) {
        this.b4r9 = b4r9;
    }

    public OpsiJeniskelamin getB4r10() {
        return b4r10;
    }

    public void setB4r10(OpsiJeniskelamin b4r10) {
        this.b4r10 = b4r10;
    }

    public OpsiListingB4r16 getB4r16() {
        return b4r16;
    }

    public void setB4r16(OpsiListingB4r16 b4r16) {
        this.b4r16 = b4r16;
    }

    public OpsiB4r7 getB4r18() {
        return b4r18;
    }

    public void setB4r18(OpsiB4r7 b4r18) {
        this.b4r18 = b4r18;
    }

    public OpsiB4r8 getB4r19() {
        return b4r19;
    }

    public void setB4r19(OpsiB4r8 b4r19) {
        this.b4r19 = b4r19;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kKSArt != null ? kKSArt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KetRtanggota)) {
            return false;
        }
        KetRtanggota other = (KetRtanggota) object;
        if ((this.kKSArt == null && other.kKSArt != null) || (this.kKSArt != null && !this.kKSArt.equals(other.kKSArt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.KetRtanggota[ kKSArt=" + kKSArt + " ]";
    }
    
}
