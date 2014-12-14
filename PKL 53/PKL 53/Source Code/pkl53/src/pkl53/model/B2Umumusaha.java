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
@Table(name = "2b2_umumusaha")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B2Umumusaha.findAll", query = "SELECT b FROM B2Umumusaha b"),
    @NamedQuery(name = "B2Umumusaha.findByKKSArtNup", query = "SELECT b FROM B2Umumusaha b WHERE b.kKSArtNup = :kKSArtNup"),
    @NamedQuery(name = "B2Umumusaha.findByB2r4", query = "SELECT b FROM B2Umumusaha b WHERE b.b2r4 = :b2r4"),
    @NamedQuery(name = "B2Umumusaha.findByB2r5", query = "SELECT b FROM B2Umumusaha b WHERE b.b2r5 = :b2r5"),
    @NamedQuery(name = "B2Umumusaha.findByB2r6", query = "SELECT b FROM B2Umumusaha b WHERE b.b2r6 = :b2r6"),
    @NamedQuery(name = "B2Umumusaha.findByB2r7", query = "SELECT b FROM B2Umumusaha b WHERE b.b2r7 = :b2r7"),
    @NamedQuery(name = "B2Umumusaha.findByB2r8", query = "SELECT b FROM B2Umumusaha b WHERE b.b2r8 = :b2r8"),
    @NamedQuery(name = "B2Umumusaha.findByB2r10", query = "SELECT b FROM B2Umumusaha b WHERE b.b2r10 = :b2r10"),
    @NamedQuery(name = "B2Umumusaha.findByB2r15", query = "SELECT b FROM B2Umumusaha b WHERE b.b2r15 = :b2r15"),
    @NamedQuery(name = "B2Umumusaha.findByB2r16", query = "SELECT b FROM B2Umumusaha b WHERE b.b2r16 = :b2r16")})
public class B2Umumusaha implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKSArtNup")
    private String kKSArtNup;
    @Column(name = "B2R4")
    private Integer b2r4;
    @Column(name = "B2R5")
    private String b2r5;
    @Column(name = "B2R6")
    private String b2r6;
    @Column(name = "B2R7")
    private String b2r7;
    @Column(name = "B2R8")
    private String b2r8;
    @Column(name = "B2R10")
    private Integer b2r10;
    @Column(name = "B2R15")
    private Integer b2r15;
    @Column(name = "B2R16")
    private Integer b2r16;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "b2Umumusaha")
    private B3Rinciusaha b3Rinciusaha;
    @JoinColumn(name = "KKSArt", referencedColumnName = "KKSArt")
    @ManyToOne(optional = false)
    private B2Art kKSArt;
    @JoinColumn(name = "B2R9", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaTidakTidaktau b2r9;
    @JoinColumn(name = "B2R11", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaDalamprosesTidakTidaktahu b2r11;
    @JoinColumn(name = "B2R12", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaDalamprosesTidakTidaktahu b2r12;
    @JoinColumn(name = "B2R13", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaDalamprosesTidakTidaktahu b2r13;
    @JoinColumn(name = "B2R14", referencedColumnName = "kode")
    @ManyToOne
    private OpsiYaDalamprosesTidakTidaktahu b2r14;

    public B2Umumusaha() {
    }

    public B2Umumusaha(String kKSArtNup) {
        this.kKSArtNup = kKSArtNup;
    }

    public String getKKSArtNup() {
        return kKSArtNup;
    }

    public void setKKSArtNup(String kKSArtNup) {
        this.kKSArtNup = kKSArtNup;
    }

    public Integer getB2r4() {
        return b2r4;
    }

    public void setB2r4(Integer b2r4) {
        this.b2r4 = b2r4;
    }

    public String getB2r5() {
        return b2r5;
    }

    public void setB2r5(String b2r5) {
        this.b2r5 = b2r5;
    }

    public String getB2r6() {
        return b2r6;
    }

    public void setB2r6(String b2r6) {
        this.b2r6 = b2r6;
    }

    public String getB2r7() {
        return b2r7;
    }

    public void setB2r7(String b2r7) {
        this.b2r7 = b2r7;
    }

    public String getB2r8() {
        return b2r8;
    }

    public void setB2r8(String b2r8) {
        this.b2r8 = b2r8;
    }

    public Integer getB2r10() {
        return b2r10;
    }

    public void setB2r10(Integer b2r10) {
        this.b2r10 = b2r10;
    }

    public Integer getB2r15() {
        return b2r15;
    }

    public void setB2r15(Integer b2r15) {
        this.b2r15 = b2r15;
    }

    public Integer getB2r16() {
        return b2r16;
    }

    public void setB2r16(Integer b2r16) {
        this.b2r16 = b2r16;
    }

    public B3Rinciusaha getB3Rinciusaha() {
        return b3Rinciusaha;
    }

    public void setB3Rinciusaha(B3Rinciusaha b3Rinciusaha) {
        this.b3Rinciusaha = b3Rinciusaha;
    }

    public B2Art getKKSArt() {
        return kKSArt;
    }

    public void setKKSArt(B2Art kKSArt) {
        this.kKSArt = kKSArt;
    }

    public OpsiYaTidakTidaktau getB2r9() {
        return b2r9;
    }

    public void setB2r9(OpsiYaTidakTidaktau b2r9) {
        this.b2r9 = b2r9;
    }

    public OpsiYaDalamprosesTidakTidaktahu getB2r11() {
        return b2r11;
    }

    public void setB2r11(OpsiYaDalamprosesTidakTidaktahu b2r11) {
        this.b2r11 = b2r11;
    }

    public OpsiYaDalamprosesTidakTidaktahu getB2r12() {
        return b2r12;
    }

    public void setB2r12(OpsiYaDalamprosesTidakTidaktahu b2r12) {
        this.b2r12 = b2r12;
    }

    public OpsiYaDalamprosesTidakTidaktahu getB2r13() {
        return b2r13;
    }

    public void setB2r13(OpsiYaDalamprosesTidakTidaktahu b2r13) {
        this.b2r13 = b2r13;
    }

    public OpsiYaDalamprosesTidakTidaktahu getB2r14() {
        return b2r14;
    }

    public void setB2r14(OpsiYaDalamprosesTidakTidaktahu b2r14) {
        this.b2r14 = b2r14;
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
        if (!(object instanceof B2Umumusaha)) {
            return false;
        }
        B2Umumusaha other = (B2Umumusaha) object;
        if ((this.kKSArtNup == null && other.kKSArtNup != null) || (this.kKSArtNup != null && !this.kKSArtNup.equals(other.kKSArtNup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.B2Umumusaha[ kKSArtNup=" + kKSArtNup + " ]";
    }
    
}
