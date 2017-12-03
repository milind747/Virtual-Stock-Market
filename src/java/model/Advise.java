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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Owner
 */
@Entity
@Table(name = "Advise")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Advise.findAll", query = "SELECT a FROM Advise a"),
    @NamedQuery(name = "Advise.findByAid", query = "SELECT a FROM Advise a WHERE a.aid = :aid"),
    @NamedQuery(name = "Advise.findByStockname", query = "SELECT a FROM Advise a WHERE a.stockname = :stockname"),
    @NamedQuery(name = "Advise.findByUsername", query = "SELECT a FROM Advise a WHERE a.username = :username"),
    @NamedQuery(name = "Advise.findByAdvise", query = "SELECT a FROM Advise a WHERE a.advise = :advise"),
    @NamedQuery(name = "Advise.findByEmailid", query = "SELECT a FROM Advise a WHERE a.emailid = :emailid"),
    @NamedQuery(name = "Advise.findByAdvisedate", query = "SELECT a FROM Advise a WHERE a.advisedate = :advisedate")})
public class Advise implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "aid")
    private Integer aid;
    @Column(name = "stockname")
    private String stockname;
    @Column(name = "username")
    private String username;
    @Column(name = "advise")
    private String advise;
    @Column(name = "emailid")
    private String emailid;
    @Column(name = "advisedate")
    private String advisedate;

    public Advise() {
    }

    public Advise(Integer aid) {
        this.aid = aid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getStockname() {
        return stockname;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdvise() {
        return advise;
    }

    public void setAdvise(String advise) {
        this.advise = advise;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getAdvisedate() {
        return advisedate;
    }

    public void setAdvisedate(String advisedate) {
        this.advisedate = advisedate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aid != null ? aid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Advise)) {
            return false;
        }
        Advise other = (Advise) object;
        if ((this.aid == null && other.aid != null) || (this.aid != null && !this.aid.equals(other.aid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Advise[ aid=" + aid + " ]";
    }
    
}
