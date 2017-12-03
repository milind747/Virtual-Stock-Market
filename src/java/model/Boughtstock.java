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
@Table(name = "Boughtstock")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Boughtstock.findAll", query = "SELECT b FROM Boughtstock b"),
    @NamedQuery(name = "Boughtstock.findByBuyid", query = "SELECT b FROM Boughtstock b WHERE b.buyid = :buyid"),
    @NamedQuery(name = "Boughtstock.findByQty", query = "SELECT b FROM Boughtstock b WHERE b.qty = :qty"),
    @NamedQuery(name = "Boughtstock.findByTotalamt", query = "SELECT b FROM Boughtstock b WHERE b.totalamt = :totalamt"),
    @NamedQuery(name = "Boughtstock.findByBuydate", query = "SELECT b FROM Boughtstock b WHERE b.buydate = :buydate"),
    @NamedQuery(name = "Boughtstock.findByOneprice", query = "SELECT b FROM Boughtstock b WHERE b.oneprice = :oneprice"),
    @NamedQuery(name = "Boughtstock.findByCurrentprice", query = "SELECT b FROM Boughtstock b WHERE b.currentprice = :currentprice")})
public class Boughtstock implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "buyid")
    private Integer buyid;
    @Column(name = "qty")
    private String qty;
    @Column(name = "totalamt")
    private String totalamt;
    @Column(name = "buydate")
    private String buydate;
    @Column(name = "oneprice")
    private String oneprice;
    @Column(name = "currentprice")
    private String currentprice;
    @JoinColumn(name = "Login_id", referencedColumnName = "Login_id")
    @ManyToOne
    private Login loginid;
    @JoinColumn(name = "sid", referencedColumnName = "sid")
    @ManyToOne
    private SharedetailNew sid;

    public Boughtstock() {
    }

    public Boughtstock(Integer buyid) {
        this.buyid = buyid;
    }

    public Integer getBuyid() {
        return buyid;
    }

    public void setBuyid(Integer buyid) {
        this.buyid = buyid;
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

    public String getBuydate() {
        return buydate;
    }

    public void setBuydate(String buydate) {
        this.buydate = buydate;
    }

    public String getOneprice() {
        return oneprice;
    }

    public void setOneprice(String oneprice) {
        this.oneprice = oneprice;
    }

    public String getCurrentprice() {
        return currentprice;
    }

    public void setCurrentprice(String currentprice) {
        this.currentprice = currentprice;
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
        hash += (buyid != null ? buyid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Boughtstock)) {
            return false;
        }
        Boughtstock other = (Boughtstock) object;
        if ((this.buyid == null && other.buyid != null) || (this.buyid != null && !this.buyid.equals(other.buyid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Boughtstock[ buyid=" + buyid + " ]";
    }
    
}
