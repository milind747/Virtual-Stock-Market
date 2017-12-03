/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Owner
 */
@Entity
@Table(name = "Watchlist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Watchlist.findAll", query = "SELECT w FROM Watchlist w"),
    @NamedQuery(name = "Watchlist.findByWlistid", query = "SELECT w FROM Watchlist w WHERE w.wlistid = :wlistid")})
public class Watchlist implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "wlistid")
    private Integer wlistid;
    @JoinColumn(name = "Login_id", referencedColumnName = "Login_id")
    @ManyToOne
    private Login loginid;
    @JoinColumn(name = "sid", referencedColumnName = "sid")
    @ManyToOne
    private SharedetailNew sid;

    public Watchlist() {
    }

    public Watchlist(Integer wlistid) {
        this.wlistid = wlistid;
    }

    public Integer getWlistid() {
        return wlistid;
    }

    public void setWlistid(Integer wlistid) {
        this.wlistid = wlistid;
    }

    public Login getLoginid() {
        return loginid;
    }

    public void setLoginid(Login loginid) {
        this.loginid = loginid;
    }

    public SharedetailNew getSid() {
        return sid;
    }

    public void setSid(SharedetailNew sid) {
        this.sid = sid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wlistid != null ? wlistid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Watchlist)) {
            return false;
        }
        Watchlist other = (Watchlist) object;
        if ((this.wlistid == null && other.wlistid != null) || (this.wlistid != null && !this.wlistid.equals(other.wlistid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Watchlist[ wlistid=" + wlistid + " ]";
    }
    
}
