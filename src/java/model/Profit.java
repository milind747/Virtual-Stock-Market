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
@Table(name = "Profit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profit.findAll", query = "SELECT p FROM Profit p"),
    @NamedQuery(name = "Profit.findByProfitid", query = "SELECT p FROM Profit p WHERE p.profitid = :profitid"),
    @NamedQuery(name = "Profit.findByDate", query = "SELECT p FROM Profit p WHERE p.date = :date"),
    @NamedQuery(name = "Profit.findByTotamt", query = "SELECT p FROM Profit p WHERE p.totamt = :totamt")})
public class Profit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "profitid")
    private Integer profitid;
    @Column(name = "date")
    private String date;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totamt")
    private Double totamt;
    @JoinColumn(name = "Login_id", referencedColumnName = "Login_id")
    @ManyToOne
    private Login loginid;

    public Profit() {
    }

    public Profit(Integer profitid) {
        this.profitid = profitid;
    }

    public Integer getProfitid() {
        return profitid;
    }

    public void setProfitid(Integer profitid) {
        this.profitid = profitid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getTotamt() {
        return totamt;
    }

    public void setTotamt(Double totamt) {
        this.totamt = totamt;
    }

    public Login getLoginid() {
        return loginid;
    }

    public void setLoginid(Login loginid) {
        this.loginid = loginid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profitid != null ? profitid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profit)) {
            return false;
        }
        Profit other = (Profit) object;
        if ((this.profitid == null && other.profitid != null) || (this.profitid != null && !this.profitid.equals(other.profitid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Profit[ profitid=" + profitid + " ]";
    }
    
}
