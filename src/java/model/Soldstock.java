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
@Table(name = "Soldstock")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Soldstock.findAll", query = "SELECT s FROM Soldstock s"),
    @NamedQuery(name = "Soldstock.findBySellid", query = "SELECT s FROM Soldstock s WHERE s.sellid = :sellid"),
    @NamedQuery(name = "Soldstock.findByQty", query = "SELECT s FROM Soldstock s WHERE s.qty = :qty"),
    @NamedQuery(name = "Soldstock.findByTotalamt", query = "SELECT s FROM Soldstock s WHERE s.totalamt = :totalamt"),
    @NamedQuery(name = "Soldstock.findBySelldate", query = "SELECT s FROM Soldstock s WHERE s.selldate = :selldate"),
    @NamedQuery(name = "Soldstock.findByOneprice", query = "SELECT s FROM Soldstock s WHERE s.oneprice = :oneprice")})
public class Soldstock implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "sellid")
    private Integer sellid;
    @Column(name = "qty")
    private String qty;
    @Column(name = "totalamt")
    private String totalamt;
    @Column(name = "selldate")
    private String selldate;
    @Column(name = "oneprice")
    private String oneprice;
    @JoinColumn(name = "Login_id", referencedColumnName = "Login_id")
    @ManyToOne
    private Login loginid;
    @JoinColumn(name = "sid", referencedColumnName = "sid")
    @ManyToOne
    private SharedetailNew sid;

    public Soldstock() {
    }

    public Soldstock(Integer sellid) {
        this.sellid = sellid;
    }

    public Integer getSellid() {
        return sellid;
    }

    public void setSellid(Integer sellid) {
        this.sellid = sellid;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getTotalamt() {
        return totalamt;
    }

    public void setTotalamt(String totalamt) {
        this.totalamt = totalamt;
    }

    public String getSelldate() {
        return selldate;
    }

    public void setSelldate(String selldate) {
        this.selldate = selldate;
    }

    public String getOneprice() {
        return oneprice;
    }

    public void setOneprice(String oneprice) {
        this.oneprice = oneprice;
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
        hash += (sellid != null ? sellid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Soldstock)) {
            return false;
        }
        Soldstock other = (Soldstock) object;
        if ((this.sellid == null && other.sellid != null) || (this.sellid != null && !this.sellid.equals(other.sellid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Soldstock[ sellid=" + sellid + " ]";
    }
    
}
