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
@Table(name = "1b8_keteranganperumahandanaset")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B8Keteranganperumahandanaset.findAll", query = "SELECT b FROM B8Keteranganperumahandanaset b"),
    @NamedQuery(name = "B8Keteranganperumahandanaset.findByKks", query = "SELECT b FROM B8Keteranganperumahandanaset b WHERE b.kks = :kks"),
    @NamedQuery(name = "B8Keteranganperumahandanaset.findByB8r4", query = "SELECT b FROM B8Keteranganperumahandanaset b WHERE b.b8r4 = :b8r4"),
    @NamedQuery(name = "B8Keteranganperumahandanaset.findByB8r10a", query = "SELECT b FROM B8Keteranganperumahandanaset b WHERE b.b8r10a = :b8r10a"),
    @NamedQuery(name = "B8Keteranganperumahandanaset.findByB8r10b", query = "SELECT b FROM B8Keteranganperumahandanaset b WHERE b.b8r10b = :b8r10b"),
    @NamedQuery(name = "B8Keteranganperumahandanaset.findByB8r10c", query = "SELECT b FROM B8Keteranganperumahandanaset b WHERE b.b8r10c = :b8r10c"),
    @NamedQuery(name = "B8Keteranganperumahandanaset.findByB8r10d", query = "SELECT b FROM B8Keteranganperumahandanaset b WHERE b.b8r10d = :b8r10d"),
    @NamedQuery(name = "B8Keteranganperumahandanaset.findByB8r10e", query = "SELECT b FROM B8Keteranganperumahandanaset b WHERE b.b8r10e = :b8r10e"),
    @NamedQuery(name = "B8Keteranganperumahandanaset.findByB8r10f", query = "SELECT b FROM B8Keteranganperumahandanaset b WHERE b.b8r10f = :b8r10f"),
    @NamedQuery(name = "B8Keteranganperumahandanaset.findByB8r10g", query = "SELECT b FROM B8Keteranganperumahandanaset b WHERE b.b8r10g = :b8r10g"),
    @NamedQuery(name = "B8Keteranganperumahandanaset.findByB8r10h", query = "SELECT b FROM B8Keteranganperumahandanaset b WHERE b.b8r10h = :b8r10h"),
    @NamedQuery(name = "B8Keteranganperumahandanaset.findByB8r10i", query = "SELECT b FROM B8Keteranganperumahandanaset b WHERE b.b8r10i = :b8r10i"),
    @NamedQuery(name = "B8Keteranganperumahandanaset.findByB8r10j", query = "SELECT b FROM B8Keteranganperumahandanaset b WHERE b.b8r10j = :b8r10j")})
public class B8Keteranganperumahandanaset implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KKS")
    private String kks;
    @Column(name = "B8R4")
    private Integer b8r4;
    @Column(name = "B8R10A")
    private String b8r10a;
    @Column(name = "B8R10B")
    private String b8r10b;
    @Column(name = "B8R10C")
    private String b8r10c;
    @Column(name = "B8R10D")
    private String b8r10d;
    @Column(name = "B8R10E")
    private String b8r10e;
    @Column(name = "B8R10F")
    private String b8r10f;
    @Column(name = "B8R10G")
    private String b8r10g;
    @Column(name = "B8R10H")
    private String b8r10h;
    @Column(name = "B8R10I")
    private String b8r10i;
    @Column(name = "B8R10J")
    private String b8r10j;
    @JoinColumn(name = "B8R7A", referencedColumnName = "b8R7A")
    @ManyToOne
    private OpsiB8r7a b8r7a;
    @JoinColumn(name = "KKS", referencedColumnName = "KKS", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private B1Keterangantempat b1Keterangantempat;
    @JoinColumn(name = "B8R8", referencedColumnName = "b8R8")
    @ManyToOne
    private OpsiB8r8 b8r8;
    @JoinColumn(name = "B8R1", referencedColumnName = "B8R1")
    @ManyToOne
    private OpsiB8r1 b8r1;
    @JoinColumn(name = "B8R3", referencedColumnName = "b8R3")
    @ManyToOne
    private OpsiB8r3 b8r3;
    @JoinColumn(name = "B8R9", referencedColumnName = "b8R9")
    @ManyToOne
    private OpsiB8r9 b8r9;
    @JoinColumn(name = "B8R2", referencedColumnName = "B8R2")
    @ManyToOne
    private OpsiB8r2 b8r2;
    @JoinColumn(name = "B8R5A", referencedColumnName = "b8R5A")
    @ManyToOne
    private OpsiB8r5a b8r5a;
    @JoinColumn(name = "B8R5B", referencedColumnName = "b8R5B")
    @ManyToOne
    private OpsiB8r5b b8r5b;
    @JoinColumn(name = "B8R6", referencedColumnName = "b8R6")
    @ManyToOne
    private OpsiB8r6 b8r6;
    @JoinColumn(name = "B8R7B", referencedColumnName = "b8R7B")
    @ManyToOne
    private OpsiB8r7b b8r7b;

    public B8Keteranganperumahandanaset() {
    }

    public B8Keteranganperumahandanaset(String kks) {
        this.kks = kks;
    }

    public String getKks() {
        return kks;
    }

    public void setKks(String kks) {
        this.kks = kks;
    }

    public Integer getB8r4() {
        return b8r4;
    }

    public void setB8r4(Integer b8r4) {
        this.b8r4 = b8r4;
    }

    public String getB8r10a() {
        return b8r10a;
    }

    public void setB8r10a(String b8r10a) {
        this.b8r10a = b8r10a;
    }

    public String getB8r10b() {
        return b8r10b;
    }

    public void setB8r10b(String b8r10b) {
        this.b8r10b = b8r10b;
    }

    public String getB8r10c() {
        return b8r10c;
    }

    public void setB8r10c(String b8r10c) {
        this.b8r10c = b8r10c;
    }

    public String getB8r10d() {
        return b8r10d;
    }

    public void setB8r10d(String b8r10d) {
        this.b8r10d = b8r10d;
    }

    public String getB8r10e() {
        return b8r10e;
    }

    public void setB8r10e(String b8r10e) {
        this.b8r10e = b8r10e;
    }

    public String getB8r10f() {
        return b8r10f;
    }

    public void setB8r10f(String b8r10f) {
        this.b8r10f = b8r10f;
    }

    public String getB8r10g() {
        return b8r10g;
    }

    public void setB8r10g(String b8r10g) {
        this.b8r10g = b8r10g;
    }

    public String getB8r10h() {
        return b8r10h;
    }

    public void setB8r10h(String b8r10h) {
        this.b8r10h = b8r10h;
    }

    public String getB8r10i() {
        return b8r10i;
    }

    public void setB8r10i(String b8r10i) {
        this.b8r10i = b8r10i;
    }

    public String getB8r10j() {
        return b8r10j;
    }

    public void setB8r10j(String b8r10j) {
        this.b8r10j = b8r10j;
    }

    public OpsiB8r7a getB8r7a() {
        return b8r7a;
    }

    public void setB8r7a(OpsiB8r7a b8r7a) {
        this.b8r7a = b8r7a;
    }

    public B1Keterangantempat getB1Keterangantempat() {
        return b1Keterangantempat;
    }

    public void setB1Keterangantempat(B1Keterangantempat b1Keterangantempat) {
        this.b1Keterangantempat = b1Keterangantempat;
    }

    public OpsiB8r8 getB8r8() {
        return b8r8;
    }

    public void setB8r8(OpsiB8r8 b8r8) {
        this.b8r8 = b8r8;
    }

    public OpsiB8r1 getB8r1() {
        return b8r1;
    }

    public void setB8r1(OpsiB8r1 b8r1) {
        this.b8r1 = b8r1;
    }

    public OpsiB8r3 getB8r3() {
        return b8r3;
    }

    public void setB8r3(OpsiB8r3 b8r3) {
        this.b8r3 = b8r3;
    }

    public OpsiB8r9 getB8r9() {
        return b8r9;
    }

    public void setB8r9(OpsiB8r9 b8r9) {
        this.b8r9 = b8r9;
    }

    public OpsiB8r2 getB8r2() {
        return b8r2;
    }

    public void setB8r2(OpsiB8r2 b8r2) {
        this.b8r2 = b8r2;
    }

    public OpsiB8r5a getB8r5a() {
        return b8r5a;
    }

    public void setB8r5a(OpsiB8r5a b8r5a) {
        this.b8r5a = b8r5a;
    }

    public OpsiB8r5b getB8r5b() {
        return b8r5b;
    }

    public void setB8r5b(OpsiB8r5b b8r5b) {
        this.b8r5b = b8r5b;
    }

    public OpsiB8r6 getB8r6() {
        return b8r6;
    }

    public void setB8r6(OpsiB8r6 b8r6) {
        this.b8r6 = b8r6;
    }

    public OpsiB8r7b getB8r7b() {
        return b8r7b;
    }

    public void setB8r7b(OpsiB8r7b b8r7b) {
        this.b8r7b = b8r7b;
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
        if (!(object instanceof B8Keteranganperumahandanaset)) {
            return false;
        }
        B8Keteranganperumahandanaset other = (B8Keteranganperumahandanaset) object;
        if ((this.kks == null && other.kks != null) || (this.kks != null && !this.kks.equals(other.kks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.B8Keteranganperumahandanaset[ kks=" + kks + " ]";
    }
    
}
