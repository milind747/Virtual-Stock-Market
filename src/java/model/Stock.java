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
@Table(name = "Stock")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stock.findAll", query = "SELECT s FROM Stock s"),
    @NamedQuery(name = "Stock.findByStockid", query = "SELECT s FROM Stock s WHERE s.stockid = :stockid"),
    @NamedQuery(name = "Stock.findByStockname", query = "SELECT s FROM Stock s WHERE s.stockname = :stockname"),
    @NamedQuery(name = "Stock.findByOpenrate", query = "SELECT s FROM Stock s WHERE s.openrate = :openrate"),
    @NamedQuery(name = "Stock.findByCloserate", query = "SELECT s FROM Stock s WHERE s.closerate = :closerate"),
    @NamedQuery(name = "Stock.findByHighrate", query = "SELECT s FROM Stock s WHERE s.highrate = :highrate"),
    @NamedQuery(name = "Stock.findByLowrate", query = "SELECT s FROM Stock s WHERE s.lowrate = :lowrate"),
    @NamedQuery(name = "Stock.findByCurrentpr", query = "SELECT s FROM Stock s WHERE s.currentpr = :currentpr")})
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "stockid")
    private Integer stockid;
    @Column(name = "stockname")
    private String stockname;
    @Column(name = "openrate")
    private String openrate;
    @Column(name = "closerate")
    private String closerate;
    @Column(name = "highrate")
    private String highrate;
    @Column(name = "lowrate")
    private String lowrate;
    @Column(name = "currentpr")
    private String currentpr;

    public Stock() {
    }

    public Stock(Integer stockid) {
        this.stockid = stockid;
    }

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public String getStockname() {
        return stockname;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname;
    }

    public String getOpenrate() {
        return openrate;
    }

    public void setOpenrate(String openrate) {
        this.openrate = openrate;
    }

    public String getCloserate() {
        return closerate;
    }

    public void setCloserate(String closerate) {
        this.closerate = closerate;
    }

    public String getHighrate() {
        return highrate;
    }

    public void setHighrate(String highrate) {
        this.highrate = highrate;
    }

    public String getLowrate() {
        return lowrate;
    }

    public void setLowrate(String lowrate) {
        this.lowrate = lowrate;
    }

    public String getCurrentpr() {
        return currentpr;
    }

    public void setCurrentpr(String currentpr) {
        this.currentpr = currentpr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stockid != null ? stockid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.stockid == null && other.stockid != null) || (this.stockid != null && !this.stockid.equals(other.stockid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Stock[ stockid=" + stockid + " ]";
    }
    
}
