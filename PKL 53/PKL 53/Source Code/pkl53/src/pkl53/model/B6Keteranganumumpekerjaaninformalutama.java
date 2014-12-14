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
@Table(name = "1b6_keteranganumumpekerjaaninformalutama")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findAll", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByKKSArtNup", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.kKSArtNup = :kKSArtNup"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r1", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r1 = :b6r1"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r2", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r2 = :b6r2"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6R3Lainnya", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6R3Lainnya = :b6R3Lainnya"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r4a", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r4a = :b6r4a"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r4b", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r4b = :b6r4b"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r5a", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r5a = :b6r5a"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r5b", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r5b = :b6r5b"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6R6lainnya", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6R6lainnya = :b6R6lainnya"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r7a", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r7a = :b6r7a"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r7b", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r7b = :b6r7b"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r8a", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r8a = :b6r8a"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6R8BSen", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6R8BSen = :b6R8BSen"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6R8BSel", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6R8BSel = :b6R8BSel"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6R8BRab", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6R8BRab = :b6R8BRab"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6R8BKam", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6R8BKam = :b6R8BKam"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6R8BJum", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6R8BJum = :b6R8BJum"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6R8BSab", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6R8BSab = :b6R8BSab"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6R8BMing", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6R8BMing = :b6R8BMing"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6R8BJumlah", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6R8BJumlah = :b6R8BJumlah"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r9a", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r9a = :b6r9a"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r9b", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r9b = :b6r9b"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r10", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r10 = :b6r10"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r11", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r11 = :b6r11"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r12b", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r12b = :b6r12b"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r13", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r13 = :b6r13"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r14", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r14 = :b6r14"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6R17lainnya", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6R17lainnya = :b6R17lainnya"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r15a", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r15a = :b6r15a"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r15b", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r15b = :b6r15b"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r19", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r19 = :b6r19"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r20a", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r20a = :b6r20a"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r20b", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r20b = :b6r20b"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r21a", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r21a = :b6r21a"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r21b", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r21b = :b6r21b"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r21c", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r21c = :b6r21c"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6r22b", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6r22b = :b6r22b"),
    @NamedQuery(name = "B6Keteranganumumpekerjaaninformalutama.findByB6R22Blainnya", query = "SELECT b FROM B6Keteranganumumpekerjaaninformalutama b WHERE b.b6R22Blainnya = :b6R22Blainnya")})
public class B6Keteranganumumpekerjaaninformalutama implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKSArtNup")
    private String kKSArtNup;
    @Column(name = "B6R1")
    private String b6r1;
    @Column(name = "B6R2")
    private String b6r2;
    @Column(name = "B6R3_Lainnya")
    private String b6R3Lainnya;
    @Column(name = "B6R4A")
    private Integer b6r4a;
    @Column(name = "B6R4B")
    private Integer b6r4b;
    @Column(name = "B6R5A")
    private Integer b6r5a;
    @Column(name = "B6R5B")
    private Integer b6r5b;
    @Column(name = "B6R6_lainnya")
    private String b6R6lainnya;
    @Column(name = "B6R7A")
    private Integer b6r7a;
    @Column(name = "B6R7B")
    private Integer b6r7b;
    @Column(name = "B6R8A")
    private Integer b6r8a;
    @Column(name = "B6R8BSen")
    private Integer b6R8BSen;
    @Column(name = "B6R8BSel")
    private Integer b6R8BSel;
    @Column(name = "B6R8BRab")
    private Integer b6R8BRab;
    @Column(name = "B6R8BKam")
    private Integer b6R8BKam;
    @Column(name = "B6R8BJum")
    private Integer b6R8BJum;
    @Column(name = "B6R8BSab")
    private Integer b6R8BSab;
    @Column(name = "B6R8BMing")
    private Integer b6R8BMing;
    @Column(name = "B6R8BJumlah")
    private Integer b6R8BJumlah;
    @Column(name = "B6R9A")
    private String b6r9a;
    @Column(name = "B6R9B")
    private String b6r9b;
    @Column(name = "B6R10")
    private String b6r10;
    @Column(name = "B6R11")
    private String b6r11;
    @Column(name = "B6R12B")
    private String b6r12b;
    @Column(name = "B6R13")
    private String b6r13;
    @Column(name = "B6R14")
    private String b6r14;
    @Column(name = "B6R17_lainnya")
    private String b6R17lainnya;
    @Column(name = "B6R15A")
    private Integer b6r15a;
    @Column(name = "B6R15B")
    private Integer b6r15b;
    @Column(name = "B6R19")
    private String b6r19;
    @Column(name = "B6R20A")
    private Integer b6r20a;
    @Column(name = "B6R20B")
    private Integer b6r20b;
    @Column(name = "B6R21A")
    private String b6r21a;
    @Column(name = "B6R21B")
    private String b6r21b;
    @Column(name = "B6R21C")
    private String b6r21c;
    @Column(name = "B6R22B")
    private String b6r22b;
    @Column(name = "B6R22B_lainnya")
    private String b6R22Blainnya;
    @JoinColumn(name = "B6R6_lain", referencedColumnName = "B6R6utamalain")
    @ManyToOne
    private OpsiB6r6utamalain b6R6lain;
    @JoinColumn(name = "B6R16", referencedColumnName = "B6R16")
    @ManyToOne
    private OpsiB6r16 b6r16;
    @JoinColumn(name = "B6R17", referencedColumnName = "B6R17")
    @ManyToOne
    private OpsiB6r17 b6r17;
    @JoinColumn(name = "KKSArtNup", referencedColumnName = "KKSArtNup", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private B4Keteranganumumtenagakerja b4Keteranganumumtenagakerja;
    @JoinColumn(name = "B6R6_utama", referencedColumnName = "B6R6utamalain")
    @ManyToOne
    private OpsiB6r6utamalain b6R6utama;
    @JoinColumn(name = "B6R3", referencedColumnName = "B6R3")
    @ManyToOne
    private OpsiB6r3 b6r3;
    @JoinColumn(name = "B6R12A", referencedColumnName = "B6R12A")
    @ManyToOne
    private OpsiB6r12a b6r12a;
    @JoinColumn(name = "B6R18", referencedColumnName = "B6R18")
    @ManyToOne
    private OpsiB6r18 b6r18;
    @JoinColumn(name = "B6R22A", referencedColumnName = "B6R22A")
    @ManyToOne
    private OpsiB6r22a b6r22a;

    public B6Keteranganumumpekerjaaninformalutama() {
    }

    public B6Keteranganumumpekerjaaninformalutama(String kKSArtNup) {
        this.kKSArtNup = kKSArtNup;
    }

    public String getKKSArtNup() {
        return kKSArtNup;
    }

    public void setKKSArtNup(String kKSArtNup) {
        this.kKSArtNup = kKSArtNup;
    }

    public String getB6r1() {
        return b6r1;
    }

    public void setB6r1(String b6r1) {
        this.b6r1 = b6r1;
    }

    public String getB6r2() {
        return b6r2;
    }

    public void setB6r2(String b6r2) {
        this.b6r2 = b6r2;
    }

    public String getB6R3Lainnya() {
        return b6R3Lainnya;
    }

    public void setB6R3Lainnya(String b6R3Lainnya) {
        this.b6R3Lainnya = b6R3Lainnya;
    }

    public Integer getB6r4a() {
        return b6r4a;
    }

    public void setB6r4a(Integer b6r4a) {
        this.b6r4a = b6r4a;
    }

    public Integer getB6r4b() {
        return b6r4b;
    }

    public void setB6r4b(Integer b6r4b) {
        this.b6r4b = b6r4b;
    }

    public Integer getB6r5a() {
        return b6r5a;
    }

    public void setB6r5a(Integer b6r5a) {
        this.b6r5a = b6r5a;
    }

    public Integer getB6r5b() {
        return b6r5b;
    }

    public void setB6r5b(Integer b6r5b) {
        this.b6r5b = b6r5b;
    }

    public String getB6R6lainnya() {
        return b6R6lainnya;
    }

    public void setB6R6lainnya(String b6R6lainnya) {
        this.b6R6lainnya = b6R6lainnya;
    }

    public Integer getB6r7a() {
        return b6r7a;
    }

    public void setB6r7a(Integer b6r7a) {
        this.b6r7a = b6r7a;
    }

    public Integer getB6r7b() {
        return b6r7b;
    }

    public void setB6r7b(Integer b6r7b) {
        this.b6r7b = b6r7b;
    }

    public Integer getB6r8a() {
        return b6r8a;
    }

    public void setB6r8a(Integer b6r8a) {
        this.b6r8a = b6r8a;
    }

    public Integer getB6R8BSen() {
        return b6R8BSen;
    }

    public void setB6R8BSen(Integer b6R8BSen) {
        this.b6R8BSen = b6R8BSen;
    }

    public Integer getB6R8BSel() {
        return b6R8BSel;
    }

    public void setB6R8BSel(Integer b6R8BSel) {
        this.b6R8BSel = b6R8BSel;
    }

    public Integer getB6R8BRab() {
        return b6R8BRab;
    }

    public void setB6R8BRab(Integer b6R8BRab) {
        this.b6R8BRab = b6R8BRab;
    }

    public Integer getB6R8BKam() {
        return b6R8BKam;
    }

    public void setB6R8BKam(Integer b6R8BKam) {
        this.b6R8BKam = b6R8BKam;
    }

    public Integer getB6R8BJum() {
        return b6R8BJum;
    }

    public void setB6R8BJum(Integer b6R8BJum) {
        this.b6R8BJum = b6R8BJum;
    }

    public Integer getB6R8BSab() {
        return b6R8BSab;
    }

    public void setB6R8BSab(Integer b6R8BSab) {
        this.b6R8BSab = b6R8BSab;
    }

    public Integer getB6R8BMing() {
        return b6R8BMing;
    }

    public void setB6R8BMing(Integer b6R8BMing) {
        this.b6R8BMing = b6R8BMing;
    }

    public Integer getB6R8BJumlah() {
        return b6R8BJumlah;
    }

    public void setB6R8BJumlah(Integer b6R8BJumlah) {
        this.b6R8BJumlah = b6R8BJumlah;
    }

    public String getB6r9a() {
        return b6r9a;
    }

    public void setB6r9a(String b6r9a) {
        this.b6r9a = b6r9a;
    }

    public String getB6r9b() {
        return b6r9b;
    }

    public void setB6r9b(String b6r9b) {
        this.b6r9b = b6r9b;
    }

    public String getB6r10() {
        return b6r10;
    }

    public void setB6r10(String b6r10) {
        this.b6r10 = b6r10;
    }

    public String getB6r11() {
        return b6r11;
    }

    public void setB6r11(String b6r11) {
        this.b6r11 = b6r11;
    }

    public String getB6r12b() {
        return b6r12b;
    }

    public void setB6r12b(String b6r12b) {
        this.b6r12b = b6r12b;
    }

    public String getB6r13() {
        return b6r13;
    }

    public void setB6r13(String b6r13) {
        this.b6r13 = b6r13;
    }

    public String getB6r14() {
        return b6r14;
    }

    public void setB6r14(String b6r14) {
        this.b6r14 = b6r14;
    }

    public String getB6R17lainnya() {
        return b6R17lainnya;
    }

    public void setB6R17lainnya(String b6R17lainnya) {
        this.b6R17lainnya = b6R17lainnya;
    }

    public Integer getB6r15a() {
        return b6r15a;
    }

    public void setB6r15a(Integer b6r15a) {
        this.b6r15a = b6r15a;
    }

    public Integer getB6r15b() {
        return b6r15b;
    }

    public void setB6r15b(Integer b6r15b) {
        this.b6r15b = b6r15b;
    }

    public String getB6r19() {
        return b6r19;
    }

    public void setB6r19(String b6r19) {
        this.b6r19 = b6r19;
    }

    public Integer getB6r20a() {
        return b6r20a;
    }

    public void setB6r20a(Integer b6r20a) {
        this.b6r20a = b6r20a;
    }

    public Integer getB6r20b() {
        return b6r20b;
    }

    public void setB6r20b(Integer b6r20b) {
        this.b6r20b = b6r20b;
    }

    public String getB6r21a() {
        return b6r21a;
    }

    public void setB6r21a(String b6r21a) {
        this.b6r21a = b6r21a;
    }

    public String getB6r21b() {
        return b6r21b;
    }

    public void setB6r21b(String b6r21b) {
        this.b6r21b = b6r21b;
    }

    public String getB6r21c() {
        return b6r21c;
    }

    public void setB6r21c(String b6r21c) {
        this.b6r21c = b6r21c;
    }

    public String getB6r22b() {
        return b6r22b;
    }

    public void setB6r22b(String b6r22b) {
        this.b6r22b = b6r22b;
    }

    public String getB6R22Blainnya() {
        return b6R22Blainnya;
    }

    public void setB6R22Blainnya(String b6R22Blainnya) {
        this.b6R22Blainnya = b6R22Blainnya;
    }

    public OpsiB6r6utamalain getB6R6lain() {
        return b6R6lain;
    }

    public void setB6R6lain(OpsiB6r6utamalain b6R6lain) {
        this.b6R6lain = b6R6lain;
    }

    public OpsiB6r16 getB6r16() {
        return b6r16;
    }

    public void setB6r16(OpsiB6r16 b6r16) {
        this.b6r16 = b6r16;
    }

    public OpsiB6r17 getB6r17() {
        return b6r17;
    }

    public void setB6r17(OpsiB6r17 b6r17) {
        this.b6r17 = b6r17;
    }

    public B4Keteranganumumtenagakerja getB4Keteranganumumtenagakerja() {
        return b4Keteranganumumtenagakerja;
    }

    public void setB4Keteranganumumtenagakerja(B4Keteranganumumtenagakerja b4Keteranganumumtenagakerja) {
        this.b4Keteranganumumtenagakerja = b4Keteranganumumtenagakerja;
    }

    public OpsiB6r6utamalain getB6R6utama() {
        return b6R6utama;
    }

    public void setB6R6utama(OpsiB6r6utamalain b6R6utama) {
        this.b6R6utama = b6R6utama;
    }

    public OpsiB6r3 getB6r3() {
        return b6r3;
    }

    public void setB6r3(OpsiB6r3 b6r3) {
        this.b6r3 = b6r3;
    }

    public OpsiB6r12a getB6r12a() {
        return b6r12a;
    }

    public void setB6r12a(OpsiB6r12a b6r12a) {
        this.b6r12a = b6r12a;
    }

    public OpsiB6r18 getB6r18() {
        return b6r18;
    }

    public void setB6r18(OpsiB6r18 b6r18) {
        this.b6r18 = b6r18;
    }

    public OpsiB6r22a getB6r22a() {
        return b6r22a;
    }

    public void setB6r22a(OpsiB6r22a b6r22a) {
        this.b6r22a = b6r22a;
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
        if (!(object instanceof B6Keteranganumumpekerjaaninformalutama)) {
            return false;
        }
        B6Keteranganumumpekerjaaninformalutama other = (B6Keteranganumumpekerjaaninformalutama) object;
        if ((this.kKSArtNup == null && other.kKSArtNup != null) || (this.kKSArtNup != null && !this.kKSArtNup.equals(other.kKSArtNup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.B6Keteranganumumpekerjaaninformalutama[ kKSArtNup=" + kKSArtNup + " ]";
    }
    
}
