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
@Table(name = "sharedetail_new")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SharedetailNew.findAll", query = "SELECT s FROM SharedetailNew s"),
    @NamedQuery(name = "SharedetailNew.findBySid", query = "SELECT s FROM SharedetailNew s WHERE s.sid = :sid"),
    @NamedQuery(name = "SharedetailNew.findBySymbol", query = "SELECT s FROM SharedetailNew s WHERE s.symbol = :symbol"),
    @NamedQuery(name = "SharedetailNew.findByName", query = "SELECT s FROM SharedetailNew s WHERE s.name = :name"),
    @NamedQuery(name = "SharedetailNew.findByPrice", query = "SELECT s FROM SharedetailNew s WHERE s.price = :price"),
    @NamedQuery(name = "SharedetailNew.findByPreviousopen", query = "SELECT s FROM SharedetailNew s WHERE s.previousopen = :previousopen"),
    @NamedQuery(name = "SharedetailNew.findByPreviousclose", query = "SELECT s FROM SharedetailNew s WHERE s.previousclose = :previousclose"),
    @NamedQuery(name = "SharedetailNew.findByLow", query = "SELECT s FROM SharedetailNew s WHERE s.low = :low"),
    @NamedQuery(name = "SharedetailNew.findByHigh", query = "SELECT s FROM SharedetailNew s WHERE s.high = :high"),
    @NamedQuery(name = "SharedetailNew.findByChange1", query = "SELECT s FROM SharedetailNew s WHERE s.change1 = :change1"),
    @NamedQuery(name = "SharedetailNew.findByChangeinpercentage", query = "SELECT s FROM SharedetailNew s WHERE s.changeinpercentage = :changeinpercentage")})
public class SharedetailNew implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "sid")
    private Integer sid;
    @Basic(optional = false)
    @Column(name = "symbol")
    private String symbol;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "price")
    private double price;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "previousopen")
    private Double previousopen;
    @Basic(optional = false)
    @Column(name = "previousclose")
    private double previousclose;
    @Basic(optional = false)
    @Column(name = "low")
    private double low;
    @Basic(optional = false)
    @Column(name = "high")
    private double high;
    @Basic(optional = false)
    @Column(name = "change1")
    private double change1;
    @Basic(optional = false)
    @Column(name = "changeinpercentage")
    private double changeinpercentage;
    @OneToMany(mappedBy = "sid")
    private Collection<Soldstock> soldstockCollection;
    @OneToMany(mappedBy = "sid")
    private Collection<Boughtstock> boughtstockCollection;
    @OneToMany(mappedBy = "sid")
    private Collection<Watchlist> watchlistCollection;

    public SharedetailNew() {
    }

    public SharedetailNew(Integer sid) {
        this.sid = sid;
    }

    public SharedetailNew(Integer sid, String symbol, String name, double price, double previousclose, double low, double high, double change1, double changeinpercentage) {
        this.sid = sid;
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.previousclose = previousclose;
        this.low = low;
        this.high = high;
        this.change1 = change1;
        this.changeinpercentage = changeinpercentage;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Double getPreviousopen() {
        return previousopen;
    }

    public void setPreviousopen(Double previousopen) {
        this.previousopen = previousopen;
    }

    public double getPreviousclose() {
        return previousclose;
    }

    public void setPreviousclose(double previousclose) {
        this.previousclose = previousclose;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getChange1() {
        return change1;
    }

    public void setChange1(double change1) {
        this.change1 = change1;
    }

    public double getChangeinpercentage() {
        return changeinpercentage;
    }

    public void setChangeinpercentage(double changeinpercentage) {
        this.changeinpercentage = changeinpercentage;
    }

    @XmlTransient
    public Collection<Soldstock> getSoldstockCollection() {
        return soldstockCollection;
    }

    public void setSoldstockCollection(Collection<Soldstock> soldstockCollection) {
        this.soldstockCollection = soldstockCollection;
    }

    @XmlTransient
    public Collection<Boughtstock> getBoughtstockCollection() {
        return boughtstockCollection;
    }

    public void setBoughtstockCollection(Collection<Boughtstock> boughtstockCollection) {
        this.boughtstockCollection = boughtstockCollection;
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
        hash += (sid != null ? sid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SharedetailNew)) {
            return false;
        }
        SharedetailNew other = (SharedetailNew) object;
        if ((this.sid == null && other.sid != null) || (this.sid != null && !this.sid.equals(other.sid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.SharedetailNew[ sid=" + sid + " ]";
    }
    
}
