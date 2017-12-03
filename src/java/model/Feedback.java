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
@Table(name = "Feedback")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Feedback.findAll", query = "SELECT f FROM Feedback f"),
    @NamedQuery(name = "Feedback.findByFid", query = "SELECT f FROM Feedback f WHERE f.fid = :fid"),
    @NamedQuery(name = "Feedback.findByName", query = "SELECT f FROM Feedback f WHERE f.name = :name"),
    @NamedQuery(name = "Feedback.findByEmailid", query = "SELECT f FROM Feedback f WHERE f.emailid = :emailid"),
    @NamedQuery(name = "Feedback.findByFeedback", query = "SELECT f FROM Feedback f WHERE f.feedback = :feedback"),
    @NamedQuery(name = "Feedback.findByContactno", query = "SELECT f FROM Feedback f WHERE f.contactno = :contactno")})
public class Feedback implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "fid")
    private Integer fid;
    @Column(name = "name")
    private String name;
    @Column(name = "emailid")
    private String emailid;
    @Column(name = "feedback")
    private String feedback;
    @Column(name = "contactno")
    private String contactno;

    public Feedback() {
    }

    public Feedback(Integer fid) {
        this.fid = fid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fid != null ? fid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feedback)) {
            return false;
        }
        Feedback other = (Feedback) object;
        if ((this.fid == null && other.fid != null) || (this.fid != null && !this.fid.equals(other.fid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Feedback[ fid=" + fid + " ]";
    }
    
}
