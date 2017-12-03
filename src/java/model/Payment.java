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
@Table(name = "Payment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p"),
    @NamedQuery(name = "Payment.findByPid", query = "SELECT p FROM Payment p WHERE p.pid = :pid"),
    @NamedQuery(name = "Payment.findByTotamount", query = "SELECT p FROM Payment p WHERE p.totamount = :totamount"),
    @NamedQuery(name = "Payment.findByTxnId", query = "SELECT p FROM Payment p WHERE p.txnId = :txnId"),
    @NamedQuery(name = "Payment.findByDate", query = "SELECT p FROM Payment p WHERE p.date = :date")})
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "pid")
    private Integer pid;
    @Column(name = "totamount")
    private String totamount;
    @Column(name = "txn_id")
    private String txnId;
    @Basic(optional = false)
    @Column(name = "date")
    private String date;
    @JoinColumn(name = "Login_id", referencedColumnName = "Login_id")
    @ManyToOne
    private Login loginid;
    @JoinColumn(name = "mid", referencedColumnName = "mid")
    @ManyToOne(optional = false)
    private Money mid;

    public Payment() {
    }

    public Payment(Integer pid) {
        this.pid = pid;
    }

    public Payment(Integer pid, String date) {
        this.pid = pid;
        this.date = date;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTotamount() {
        return totamount;
    }

    public void setTotamount(String totamount) {
        this.totamount = totamount;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Login getLoginid() {
        return loginid;
    }

    public void setLoginid(Login loginid) {
        this.loginid = loginid;
    }

    public Money getMid() {
        return mid;
    }

    public void setMid(Money mid) {
        this.mid = mid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Payment[ pid=" + pid + " ]";
    }
    
}
