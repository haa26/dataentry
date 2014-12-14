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
@Table(name = "opsi_b3r13b")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiB3r13b.findAll", query = "SELECT o FROM OpsiB3r13b o"),
    @NamedQuery(name = "OpsiB3r13b.findByB3r13b", query = "SELECT o FROM OpsiB3r13b o WHERE o.b3r13b = :b3r13b"),
    @NamedQuery(name = "OpsiB3r13b.findByValue", query = "SELECT o FROM OpsiB3r13b o WHERE o.value = :value")})
public class OpsiB3r13b implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "B3R13B")
    private String b3r13b;
    @Basic(optional = false)
    @Column(name = "Value")
    private String value;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3R13Bmei13")
    private List<B3Rinciusaha> b3RinciusahaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3R13Bjul13")
    private List<B3Rinciusaha> b3RinciusahaList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3R13Bapr13")
    private List<B3Rinciusaha> b3RinciusahaList2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3R13Bokt13")
    private List<B3Rinciusaha> b3RinciusahaList3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3R13Bnov13")
    private List<B3Rinciusaha> b3RinciusahaList4;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3R13Bagt13")
    private List<B3Rinciusaha> b3RinciusahaList5;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3R13Bsep13")
    private List<B3Rinciusaha> b3RinciusahaList6;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3R13Bdes13")
    private List<B3Rinciusaha> b3RinciusahaList7;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3R13Bjan14")
    private List<B3Rinciusaha> b3RinciusahaList8;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3R13Bfeb14")
    private List<B3Rinciusaha> b3RinciusahaList9;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3R13Bjun13")
    private List<B3Rinciusaha> b3RinciusahaList10;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3R13Bmar14")
    private List<B3Rinciusaha> b3RinciusahaList11;

    public OpsiB3r13b() {
    }

    public OpsiB3r13b(String b3r13b) {
        this.b3r13b = b3r13b;
    }

    public OpsiB3r13b(String b3r13b, String value) {
        this.b3r13b = b3r13b;
        this.value = value;
    }

    public String getB3r13b() {
        return b3r13b;
    }

    public void setB3r13b(String b3r13b) {
        this.b3r13b = b3r13b;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList() {
        return b3RinciusahaList;
    }

    public void setB3RinciusahaList(List<B3Rinciusaha> b3RinciusahaList) {
        this.b3RinciusahaList = b3RinciusahaList;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList1() {
        return b3RinciusahaList1;
    }

    public void setB3RinciusahaList1(List<B3Rinciusaha> b3RinciusahaList1) {
        this.b3RinciusahaList1 = b3RinciusahaList1;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList2() {
        return b3RinciusahaList2;
    }

    public void setB3RinciusahaList2(List<B3Rinciusaha> b3RinciusahaList2) {
        this.b3RinciusahaList2 = b3RinciusahaList2;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList3() {
        return b3RinciusahaList3;
    }

    public void setB3RinciusahaList3(List<B3Rinciusaha> b3RinciusahaList3) {
        this.b3RinciusahaList3 = b3RinciusahaList3;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList4() {
        return b3RinciusahaList4;
    }

    public void setB3RinciusahaList4(List<B3Rinciusaha> b3RinciusahaList4) {
        this.b3RinciusahaList4 = b3RinciusahaList4;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList5() {
        return b3RinciusahaList5;
    }

    public void setB3RinciusahaList5(List<B3Rinciusaha> b3RinciusahaList5) {
        this.b3RinciusahaList5 = b3RinciusahaList5;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList6() {
        return b3RinciusahaList6;
    }

    public void setB3RinciusahaList6(List<B3Rinciusaha> b3RinciusahaList6) {
        this.b3RinciusahaList6 = b3RinciusahaList6;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList7() {
        return b3RinciusahaList7;
    }

    public void setB3RinciusahaList7(List<B3Rinciusaha> b3RinciusahaList7) {
        this.b3RinciusahaList7 = b3RinciusahaList7;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList8() {
        return b3RinciusahaList8;
    }

    public void setB3RinciusahaList8(List<B3Rinciusaha> b3RinciusahaList8) {
        this.b3RinciusahaList8 = b3RinciusahaList8;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList9() {
        return b3RinciusahaList9;
    }

    public void setB3RinciusahaList9(List<B3Rinciusaha> b3RinciusahaList9) {
        this.b3RinciusahaList9 = b3RinciusahaList9;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList10() {
        return b3RinciusahaList10;
    }

    public void setB3RinciusahaList10(List<B3Rinciusaha> b3RinciusahaList10) {
        this.b3RinciusahaList10 = b3RinciusahaList10;
    }

    @XmlTransient
    public List<B3Rinciusaha> getB3RinciusahaList11() {
        return b3RinciusahaList11;
    }

    public void setB3RinciusahaList11(List<B3Rinciusaha> b3RinciusahaList11) {
        this.b3RinciusahaList11 = b3RinciusahaList11;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (b3r13b != null ? b3r13b.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsiB3r13b)) {
            return false;
        }
        OpsiB3r13b other = (OpsiB3r13b) object;
        if ((this.b3r13b == null && other.b3r13b != null) || (this.b3r13b != null && !this.b3r13b.equals(other.b3r13b))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.OpsiB3r13b[ b3r13b=" + b3r13b + " ]";
    }
    
}
