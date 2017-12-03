/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Owner
 */
@Entity
@Table(name = "Login")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Login.findAll", query = "SELECT l FROM Login l"),
    @NamedQuery(name = "Login.findByLoginid", query = "SELECT l FROM Login l WHERE l.loginid = :loginid"),
    @NamedQuery(name = "Login.findByUsername", query = "SELECT l FROM Login l WHERE l.username = :username"),
    @NamedQuery(name = "Login.findByPassword", query = "SELECT l FROM Login l WHERE l.password = :password"),
    @NamedQuery(name = "Login.findByRole", query = "SELECT l FROM Login l WHERE l.role = :role")})
public class Login implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "Login_id")
    private Integer loginid;
    @Column(name = "Username")
    private String username;
    @Column(name = "Password")
    private String password;
    @Column(name = "Role")
    private String role;
    @OneToMany(mappedBy = "loginid")
    private Collection<Soldstock> soldstockCollection;
    @OneToMany(mappedBy = "loginid")
    private Collection<Payment> paymentCollection;
    @OneToMany(mappedBy = "loginid")
    private Collection<Boughtstock> boughtstockCollection;
    @OneToMany(mappedBy = "loginid")
    private Collection<Profit> profitCollection;
    @OneToMany(mappedBy = "loginid")
    private Collection<Registration> registrationCollection;
    @OneToMany(mappedBy = "loginid")
    private Collection<Watchlist> watchlistCollection;

    public Login() {
    }

    public Login(Integer loginid) {
        this.loginid = loginid;
    }

    public Integer getLoginid() {
        return loginid;
    }

    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @XmlTransient
    public Collection<Soldstock> getSoldstockCollection() {
        return soldstockCollection;
    }

    public void setSoldstockCollection(Collection<Soldstock> soldstockCollection) {
        this.soldstockCollection = soldstockCollection;
    }

    @XmlTransient
    public Collection<Payment> getPaymentCollection() {
        return paymentCollection;
    }

    public void setPaymentCollection(Collection<Payment> paymentCollection) {
        this.paymentCollection = paymentCollection;
    }

    @XmlTransient
    public Collection<Boughtstock> getBoughtstockCollection() {
        return boughtstockCollection;
    }

    public void setBoughtstockCollection(Collection<Boughtstock> boughtstockCollection) {
        this.boughtstockCollection = boughtstockCollection;
    }

    @XmlTransient
    public Collection<Profit> getProfitCollection() {
        return profitCollection;
    }

    public void setProfitCollection(Collection<Profit> profitCollection) {
        this.profitCollection = profitCollection;
    }

    @XmlTransient
    public Collection<Registration> getRegistrationCollection() {
        return registrationCollection;
    }

    public void setRegistrationCollection(Collection<Registration> registrationCollection) {
        this.registrationCollection = registrationCollection;
    }

    @XmlTransient
    public Collection<Watchlist> getWatchlistCollection() {
        return watchlistCollection;
    }

    public void setWatchlistCollection(Collection<Watchlist> watchlistCollection) {
        this.watchlistCollection = watchlistCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loginid != null ? loginid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login)) {
            return false;
        }
        Login other = (Login) object;
        if ((this.loginid == null && other.loginid != null) || (this.loginid != null && !this.loginid.equals(other.loginid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Login[ loginid=" + loginid + " ]";
    }
    
}
