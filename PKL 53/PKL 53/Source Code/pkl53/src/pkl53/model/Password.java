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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rizki
 */
@Entity
@Table(name = "password")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Password.findAll", query = "SELECT p FROM Password p"),
    @NamedQuery(name = "Password.findByNimPengentri", query = "SELECT p FROM Password p WHERE p.nimPengentri = :nimPengentri"),
    @NamedQuery(name = "Password.findByPassword", query = "SELECT p FROM Password p WHERE p.password = :password")})
public class Password implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nimPengentri")
    private String nimPengentri;
    @Column(name = "password")
    private String password;

    public Password() {
    }

    public Password(String nimPengentri) {
        this.nimPengentri = nimPengentri;
    }

    public String getNimPengentri() {
        return nimPengentri;
    }

    public void setNimPengentri(String nimPengentri) {
        this.nimPengentri = nimPengentri;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nimPengentri != null ? nimPengentri.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Password)) {
            return false;
        }
        Password other = (Password) object;
        if ((this.nimPengentri == null && other.nimPengentri != null) || (this.nimPengentri != null && !this.nimPengentri.equals(other.nimPengentri))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkl53.model.Password[ nimPengentri=" + nimPengentri + " ]";
    }
    
}
