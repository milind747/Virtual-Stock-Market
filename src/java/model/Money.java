/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "Money")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Money.findAll", query = "SELECT m FROM Money m"),
    @NamedQuery(name = "Money.findByMid", query = "SELECT m FROM Money m WHERE m.mid = :mid"),
    @NamedQuery(name = "Money.findByRealmoney", query = "SELECT m FROM Money m WHERE m.realmoney = :realmoney"),
    @NamedQuery(name = "Money.findByVirtualmoney", query = "SELECT m FROM Money m WHERE m.virtualmoney = :virtualmoney")})
public class Money implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "mid")
    private Integer mid;
    @Column(name = "realmoney")
    private String realmoney;
    @Column(name = "virtualmoney")
    private String virtualmoney;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mid")
    private Collection<Payment> paymentCollection;

    public Money() {
    }

    public Money(Integer mid) {
        this.mid = mid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getRealmoney() {
        return realmoney;
    }

    public void setRealmoney(String realmoney) {
        this.realmoney = realmoney;
    }

    public String getVirtualmoney() {
        return virtualmoney;
    }

    public void setVirtualmoney(String virtualmoney) {
        this.virtualmoney = virtualmoney;
    }

    @XmlTransient
    public Collection<Payment> getPaymentCollection() {
        return paymentCollection;
    }

    public void setPaymentCollection(Collection<Payment> paymentCollection) {
        this.paymentCollection = paymentCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mid != null ? mid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Money)) {
            return false;
        }
        Money other = (Money) object;
        if ((this.mid == null && other.mid != null) || (this.mid != null && !this.mid.equals(other.mid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Money[ mid=" + mid + " ]";
    }
    
}
