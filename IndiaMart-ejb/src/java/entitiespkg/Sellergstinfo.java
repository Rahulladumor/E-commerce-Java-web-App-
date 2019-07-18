/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitiespkg;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rahul
 */
@Entity
@Table(name = "sellergstinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sellergstinfo.findAll", query = "SELECT s FROM Sellergstinfo s"),
    @NamedQuery(name = "Sellergstinfo.findBySellerGSTId", query = "SELECT s FROM Sellergstinfo s WHERE s.sellerGSTId = :sellerGSTId"),
    @NamedQuery(name = "Sellergstinfo.findByGstin", query = "SELECT s FROM Sellergstinfo s WHERE s.gstin = :gstin"),
    @NamedQuery(name = "Sellergstinfo.findByPan", query = "SELECT s FROM Sellergstinfo s WHERE s.pan = :pan"),
    @NamedQuery(name = "Sellergstinfo.findByGSTDocument", query = "SELECT s FROM Sellergstinfo s WHERE s.gSTDocument = :gSTDocument"),
    @NamedQuery(name = "Sellergstinfo.findByCreateDate", query = "SELECT s FROM Sellergstinfo s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "Sellergstinfo.findByUpdateDate", query = "SELECT s FROM Sellergstinfo s WHERE s.updateDate = :updateDate"),
    @NamedQuery(name = "Sellergstinfo.findByIsactive", query = "SELECT s FROM Sellergstinfo s WHERE s.isactive = :isactive")})
public class Sellergstinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SellerGSTId")
    private Integer sellerGSTId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "GSTIN")
    private String gstin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PAN")
    private String pan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "GSTDocument")
    private String gSTDocument;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CreateDate")
    @Temporal(TemporalType.DATE)
    private Date createDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UpdateDate")
    @Temporal(TemporalType.DATE)
    private Date updateDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Isactive")
    private boolean isactive;
    @JoinColumn(name = "UserName", referencedColumnName = "UserName")
    @ManyToOne(optional = false)
    private Usertb userName;

    public Sellergstinfo() {
    }

    public Sellergstinfo(Integer sellerGSTId) {
        this.sellerGSTId = sellerGSTId;
    }

    public Sellergstinfo(Integer sellerGSTId, String gstin, String pan, String gSTDocument, Date createDate, Date updateDate, boolean isactive) {
        this.sellerGSTId = sellerGSTId;
        this.gstin = gstin;
        this.pan = pan;
        this.gSTDocument = gSTDocument;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isactive = isactive;
    }

    public Integer getSellerGSTId() {
        return sellerGSTId;
    }

    public void setSellerGSTId(Integer sellerGSTId) {
        this.sellerGSTId = sellerGSTId;
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getGSTDocument() {
        return gSTDocument;
    }

    public void setGSTDocument(String gSTDocument) {
        this.gSTDocument = gSTDocument;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public Usertb getUserName() {
        return userName;
    }

    public void setUserName(Usertb userName) {
        this.userName = userName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sellerGSTId != null ? sellerGSTId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sellergstinfo)) {
            return false;
        }
        Sellergstinfo other = (Sellergstinfo) object;
        if ((this.sellerGSTId == null && other.sellerGSTId != null) || (this.sellerGSTId != null && !this.sellerGSTId.equals(other.sellerGSTId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Sellergstinfo[ sellerGSTId=" + sellerGSTId + " ]";
    }
    
}
