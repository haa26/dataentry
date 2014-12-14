/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl53.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "1b4_keteranganumumtenagakerja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B4Keteranganumumtenagakerja.findAll", query = "SELECT b FROM B4Keteranganumumtenagakerja b"),
    @NamedQuery(name = "B4Keteranganumumtenagakerja.findByKKSArtNup", query = "SELECT b FROM B4Keteranganumumtenagakerja b WHERE b.kKSArtNup = :kKSArtNup"),
    @NamedQuery(name = "B4Keteranganumumtenagakerja.findByB4r4", query = "SELECT b FROM B4Keteranganumumtenagakerja b WHERE b.b4r4 = :b4r4"),
    @NamedQuery(name = "B4Keteranganumumtenagakerja.findByB4r5", query = "SELECT b FROM B4Keteranganumumtenagakerja b WHERE b.b4r5 = :b4r5"),
    @NamedQuery(name = "B4Keteranganumumtenagakerja.findByB4r6", query = "SELECT b FROM B4Keteranganumumtenagakerja b WHERE b.b4r6 = :b4r6"),
    @NamedQuery(name = "B4Keteranganumumtenagakerja.findByB4r14", query = "SELECT b FROM B4Keteranganumumtenagakerja b WHERE b.b4r14 = :b4r14"),
    @NamedQuery(name = "B4Keteranganumumtenagakerja.findByB4r15", query = "SELECT b FROM B4Keteranganumumtenagakerja b WHERE b.b4r15 = :b4r15"),
    @NamedQuery(name = "B4Keteranganumumtenagakerja.findByB4r23", query = "SELECT b FROM B4Keteranganumumtenagakerja b WHERE b.b4r23 = :b4r23"),
    @NamedQuery(name = "B4Keteranganumumtenagakerja.findByB4r24", query = "SELECT b FROM B4Keteranganumumtenagakerja b WHERE b.b4r24 = :b4r24")})
public class B4Keteranganumumtenagakerja implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKSArtNup")
    private String kKSArtNup;
    @Column(name = "B4R4")
    private String b4r4;
    @Column(name = "B4R5")
    private String b4r5;
    @Column(name = "B4R6")
    private String b4r6;
    @Column(name = "B4R14")
    private String b4r14;
    @Column(name = "B4R15")
    private String b4r15;
    @Column(name = "B4R23")
    private String b4r23;
    @Column(name = "B4R24")
    private String b4r24;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "b4Keteranganumumtenagakerja")
    private B5Keteranganumumtenagakerjainformal b5Keteranganumumtenagakerjainformal;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "b4Keteranganumumtenagakerja")
    private B6Keteranganumumpekerjaaninformalutama b6Keteranganumumpekerjaaninformalutama;
    @JoinColumn(name = "B4R7", referencedColumnName = "B4R7")
    @ManyToOne
    private OpsiB4r7 b4r7;
    @JoinColumn(name = "KKSArt", referencedColumnName = "KKSArt")
    @ManyToOne(optional = false)
    private B4Art kKSArt;
    @JoinColumn(name = "B4R17", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaTidakTidaktau b4r17;
    @JoinColumn(name = "B4R19", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaDalamprosesTidakTidaktahu b4r19;
    @JoinColumn(name = "B4R11", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaTidakTidaktau b4r11;
    @JoinColumn(name = "B4R12", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaTidakTidaktau b4r12;
    @JoinColumn(name = "B4R20", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaDalamprosesTidakTidaktahu b4r20;
    @JoinColumn(name = "B4R21", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaDalamprosesTidakTidaktahu b4r21;
    @JoinColumn(name = "B4R22", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaDalamprosesTidakTidaktahu b4r22;
    @JoinColumn(name = "B4R8", referencedColumnName = "B4R8")
    @ManyToOne
    private OpsiB4r8 b4r8;
    @JoinColumn(name = "B4R10", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaTidakTidaktau b4r10;
    @JoinColumn(name = "B4R18", referencedColumnName = "B4R18")
    @ManyToOne
    private OpsiB4r18 b4r18;
    @JoinColumn(name = "B4R13", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaTidakTidaktau b4r13;
    @JoinColumn(name = "B4R16", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaTidak b4r16;
    @JoinColumn(name = "B4R9", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaTidakTidaktau b4r9;

    public B4Keteranganumumtenagakerja() {
    }

    public B4Keteranganumumtenagakerja(String kKSArtNup) {
        this.kKSArtNup = kKSArtNup;
    }

    public String getKKSArtNup() {
        return kKSArtNup;
    }

    public void setKKSArtNup(String kKSArtNup) {
        this.kKSArtNup = kKSArtNup;
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

    public String getB4r6() {
        return b4r6;
    }

    public void setB4r6(String b4r6) {
        this.b4r6 = b4r6;
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

    public String getB4r23() {
        return b4r23;
    }

    public void setB4r23(String b4r23) {
        this.b4r23 = b4r23;
    }

    public String getB4r24() {
        return b4r24;
    }

    public void setB4r24(String b4r24) {
        this.b4r24 = b4r24;
    }

    public B5Keteranganumumtenagakerjainformal getB5Keteranganumumtenagakerjainformal() {
        return b5Keteranganumumtenagakerjainformal;
    }

    public void setB5Keteranganumumtenagakerjainformal(B5Keteranganumumtenagakerjainformal b5Keteranganumumtenagakerjainformal) {
        this.b5Keteranganumumtenagakerjainformal = b5Keteranganumumtenagakerjainformal;
    }

    public B6Keteranganumumpekerjaaninformalutama getB6Keteranganumumpekerjaaninformalutama() {
        return b6Keteranganumumpekerjaaninformalutama;
    }

    public void setB6Keteranganumumpekerjaaninformalutama(B6Keteranganumumpekerjaaninformalutama b6Keteranganumumpekerjaaninformalutama) {
        this.b6Keteranganumumpekerjaaninformalutama = b6Keteranganumumpekerjaaninformalutama;
    }

    public OpsiB4r7 getB4r7() {
        return b4r7;
    }

    public void setB4r7(OpsiB4r7 b4r7) {
        this.b4r7 = b4r7;
    }

    public B4Art getKKSArt() {
        return kKSArt;
    }

    public void setKKSArt(B4Art kKSArt) {
        this.kKSArt = kKSArt;
    }

    public OpsiYaTidakTidaktau getB4r17() {
        return b4r17;
    }

    public void setB4r17(OpsiYaTidakTidaktau b4r17) {
        this.b4r17 = b4r17;
    }

    public OpsiYaDalamprosesTidakTidaktahu getB4r19() {
        return b4r19;
    }

    public void setB4r19(OpsiYaDalamprosesTidakTidaktahu b4r19) {
        this.b4r19 = b4r19;
    }

    public OpsiYaTidakTidaktau getB4r11() {
        return b4r11;
    }

    public void setB4r11(OpsiYaTidakTidaktau b4r11) {
        this.b4r11 = b4r11;
    }

    public OpsiYaTidakTidaktau getB4r12() {
        return b4r12;
    }

    public void setB4r12(OpsiYaTidakTidaktau b4r12) {
        this.b4r12 = b4r12;
    }

    public OpsiYaDalamprosesTidakTidaktahu getB4r20() {
        return b4r20;
    }

    public void setB4r20(OpsiYaDalamprosesTidakTidaktahu b4r20) {
        this.b4r20 = b4r20;
    }

    public OpsiYaDalamprosesTidakTidaktahu getB4r21() {
        return b4r21;
    }

    public void setB4r21(OpsiYaDalamprosesTidakTidaktahu b4r21) {
        this.b4r21 = b4r21;
    }

    public OpsiYaDalamprosesTidakTidaktahu getB4r22() {
        return b4r22;
    }

    public void setB4r22(OpsiYaDalamprosesTidakTidaktahu b4r22) {
        this.b4r22 = b4r22;
    }

    public OpsiB4r8 getB4r8() {
        return b4r8;
    }

    public void setB4r8(OpsiB4r8 b4r8) {
        this.b4r8 = b4r8;
    }

    public OpsiYaTidakTidaktau getB4r10() {
        return b4r10;
    }

    public void setB4r10(OpsiYaTidakTidaktau b4r10) {
        this.b4r10 = b4r10;
    }

    public OpsiB4r18 getB4r18() {
        return b4r18;
    }

    public void setB4r18(OpsiB4r18 b4r18) {
        this.b4r18 = b4r18;
    }

    public OpsiYaTidakTidaktau getB4r13() {
        return b4r13;
    }

    public void setB4r13(OpsiYaTidakTidaktau b4r13) {
        this.b4r13 = b4r13;
    }

    public OpsiYaTidak getB4r16() {
        return b4r16;
    }

    public void setB4r16(OpsiYaTidak b4r16) {
        this.b4r16 = b4r16;
    }

    public OpsiYaTidakTidaktau getB4r9() {
        return b4r9;
    }

    public void setB4r9(OpsiYaTidakTidaktau b4r9) {
        this.b4r9 = b4r9;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kKSArtNup != null ? kKSArtNup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B4Keteranganumumtenagakerja)) {
            return false;
        }
        B4Keteranganumumtenagakerja other = (B4Keteranganumumtenagakerja) object;
        if ((this.kKSArtNup == null && other.kKSArtNup != null) || (this.kKSArtNup != null && !this.kKSArtNup.equals(other.kKSArtNup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.B4Keteranganumumtenagakerja[ kKSArtNup=" + kKSArtNup + " ]";
    }
    
}
