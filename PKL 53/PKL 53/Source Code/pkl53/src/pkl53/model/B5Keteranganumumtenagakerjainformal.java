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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rizki syazali
 */
@Entity
@Table(name = "1b5_keteranganumumtenagakerjainformal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findAll", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByKKSArtNup", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.kKSArtNup = :kKSArtNup"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r1a", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r1a = :b5r1a"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r1b", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r1b = :b5r1b"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r3", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r3 = :b5r3"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r4", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r4 = :b5r4"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r2", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r2 = :b5r2"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r6a", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r6a = :b5r6a"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r6b", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r6b = :b5r6b"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r7a", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r7a = :b5r7a"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r7b", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r7b = :b5r7b"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r8", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r8 = :b5r8"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r10", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r10 = :b5r10"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r12", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r12 = :b5r12"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r14a", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r14a = :b5r14a"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r14b", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r14b = :b5r14b"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r15", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r15 = :b5r15"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r16", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r16 = :b5r16"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r17a", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r17a = :b5r17a"),
    @NamedQuery(name = "B5Keteranganumumtenagakerjainformal.findByB5r17b", query = "SELECT b FROM B5Keteranganumumtenagakerjainformal b WHERE b.b5r17b = :b5r17b")})
public class B5Keteranganumumtenagakerjainformal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKSArtNup")
    private String kKSArtNup;
    @Column(name = "B5R1A")
    private String b5r1a;
    @Column(name = "B5R1B")
    private Integer b5r1b;
    @Column(name = "B5R3")
    private String b5r3;
    @Column(name = "B5R4")
    private Integer b5r4;
    @Column(name = "B5R2")
    private String b5r2;
    @Column(name = "B5R6A")
    private String b5r6a;
    @Column(name = "B5R6B")
    private String b5r6b;
    @Column(name = "B5R7A")
    private String b5r7a;
    @Column(name = "B5R7B")
    private String b5r7b;
    @Column(name = "B5R8")
    private String b5r8;
    @Column(name = "B5R10")
    private String b5r10;
    @Column(name = "B5R12")
    private String b5r12;
    @Column(name = "B5R14A")
    private String b5r14a;
    @Column(name = "B5R14B")
    private String b5r14b;
    @Column(name = "B5R15")
    private String b5r15;
    @Column(name = "B5R16")
    private String b5r16;
    @Column(name = "B5R17A")
    private String b5r17a;
    @Column(name = "B5R17B")
    private String b5r17b;
    @JoinColumn(name = "KKSArtNup", referencedColumnName = "KKSArtNup", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private B4Keteranganumumtenagakerja b4Keteranganumumtenagakerja;
    @JoinColumn(name = "B5R9", referencedColumnName = "b5R9")
    @ManyToOne
    private OpsiB5r9 b5r9;
    @JoinColumn(name = "B5R11", referencedColumnName = "b5R11")
    @ManyToOne
    private OpsiB5r11 b5r11;
    @JoinColumn(name = "B5R13", referencedColumnName = "b5R13")
    @ManyToOne
    private OpsiB5r13 b5r13;
    @JoinColumn(name = "B5R5", referencedColumnName = "B5R5")
    @ManyToOne
    private OpsiB5r5 b5r5;

    public B5Keteranganumumtenagakerjainformal() {
    }

    public B5Keteranganumumtenagakerjainformal(String kKSArtNup) {
        this.kKSArtNup = kKSArtNup;
    }

    public String getKKSArtNup() {
        return kKSArtNup;
    }

    public void setKKSArtNup(String kKSArtNup) {
        this.kKSArtNup = kKSArtNup;
    }

    public String getB5r1a() {
        return b5r1a;
    }

    public void setB5r1a(String b5r1a) {
        this.b5r1a = b5r1a;
    }

    public Integer getB5r1b() {
        return b5r1b;
    }

    public void setB5r1b(Integer b5r1b) {
        this.b5r1b = b5r1b;
    }

    public String getB5r3() {
        return b5r3;
    }

    public void setB5r3(String b5r3) {
        this.b5r3 = b5r3;
    }

    public Integer getB5r4() {
        return b5r4;
    }

    public void setB5r4(Integer b5r4) {
        this.b5r4 = b5r4;
    }

    public String getB5r2() {
        return b5r2;
    }

    public void setB5r2(String b5r2) {
        this.b5r2 = b5r2;
    }

    public String getB5r6a() {
        return b5r6a;
    }

    public void setB5r6a(String b5r6a) {
        this.b5r6a = b5r6a;
    }

    public String getB5r6b() {
        return b5r6b;
    }

    public void setB5r6b(String b5r6b) {
        this.b5r6b = b5r6b;
    }

    public String getB5r7a() {
        return b5r7a;
    }

    public void setB5r7a(String b5r7a) {
        this.b5r7a = b5r7a;
    }

    public String getB5r7b() {
        return b5r7b;
    }

    public void setB5r7b(String b5r7b) {
        this.b5r7b = b5r7b;
    }

    public String getB5r8() {
        return b5r8;
    }

    public void setB5r8(String b5r8) {
        this.b5r8 = b5r8;
    }

    public String getB5r10() {
        return b5r10;
    }

    public void setB5r10(String b5r10) {
        this.b5r10 = b5r10;
    }

    public String getB5r12() {
        return b5r12;
    }

    public void setB5r12(String b5r12) {
        this.b5r12 = b5r12;
    }

    public String getB5r14a() {
        return b5r14a;
    }

    public void setB5r14a(String b5r14a) {
        this.b5r14a = b5r14a;
    }

    public String getB5r14b() {
        return b5r14b;
    }

    public void setB5r14b(String b5r14b) {
        this.b5r14b = b5r14b;
    }

    public String getB5r15() {
        return b5r15;
    }

    public void setB5r15(String b5r15) {
        this.b5r15 = b5r15;
    }

    public String getB5r16() {
        return b5r16;
    }

    public void setB5r16(String b5r16) {
        this.b5r16 = b5r16;
    }

    public String getB5r17a() {
        return b5r17a;
    }

    public void setB5r17a(String b5r17a) {
        this.b5r17a = b5r17a;
    }

    public String getB5r17b() {
        return b5r17b;
    }

    public void setB5r17b(String b5r17b) {
        this.b5r17b = b5r17b;
    }

    public B4Keteranganumumtenagakerja getB4Keteranganumumtenagakerja() {
        return b4Keteranganumumtenagakerja;
    }

    public void setB4Keteranganumumtenagakerja(B4Keteranganumumtenagakerja b4Keteranganumumtenagakerja) {
        this.b4Keteranganumumtenagakerja = b4Keteranganumumtenagakerja;
    }

    public OpsiB5r9 getB5r9() {
        return b5r9;
    }

    public void setB5r9(OpsiB5r9 b5r9) {
        this.b5r9 = b5r9;
    }

    public OpsiB5r11 getB5r11() {
        return b5r11;
    }

    public void setB5r11(OpsiB5r11 b5r11) {
        this.b5r11 = b5r11;
    }

    public OpsiB5r13 getB5r13() {
        return b5r13;
    }

    public void setB5r13(OpsiB5r13 b5r13) {
        this.b5r13 = b5r13;
    }

    public OpsiB5r5 getB5r5() {
        return b5r5;
    }

    public void setB5r5(OpsiB5r5 b5r5) {
        this.b5r5 = b5r5;
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
        if (!(object instanceof B5Keteranganumumtenagakerjainformal)) {
            return false;
        }
        B5Keteranganumumtenagakerjainformal other = (B5Keteranganumumtenagakerjainformal) object;
        if ((this.kKSArtNup == null && other.kKSArtNup != null) || (this.kKSArtNup != null && !this.kKSArtNup.equals(other.kKSArtNup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.B5Keteranganumumtenagakerjainformal[ kKSArtNup=" + kKSArtNup + " ]";
    }
    
}
