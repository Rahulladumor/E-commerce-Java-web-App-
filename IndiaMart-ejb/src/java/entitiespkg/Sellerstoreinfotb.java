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
import javax.persistence.Lob;
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
@Table(name = "sellerstoreinfotb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sellerstoreinfotb.findAll", query = "SELECT s FROM Sellerstoreinfotb s"),
    @NamedQuery(name = "Sellerstoreinfotb.findBySellerStoreInfoId", query = "SELECT s FROM Sellerstoreinfotb s WHERE s.sellerStoreInfoId = :sellerStoreInfoId"),
    @NamedQuery(name = "Sellerstoreinfotb.findByStoreName", query = "SELECT s FROM Sellerstoreinfotb s WHERE s.storeName = :storeName"),
    @NamedQuery(name = "Sellerstoreinfotb.findByAddress", query = "SELECT s FROM Sellerstoreinfotb s WHERE s.address = :address"),
    @NamedQuery(name = "Sellerstoreinfotb.findByPinCode", query = "SELECT s FROM Sellerstoreinfotb s WHERE s.pinCode = :pinCode"),
    @NamedQuery(name = "Sellerstoreinfotb.findByLogo", query = "SELECT s FROM Sellerstoreinfotb s WHERE s.logo = :logo"),
    @NamedQuery(name = "Sellerstoreinfotb.findByDocumentPic", query = "SELECT s FROM Sellerstoreinfotb s WHERE s.documentPic = :documentPic"),
    @NamedQuery(name = "Sellerstoreinfotb.findByCreateDate", query = "SELECT s FROM Sellerstoreinfotb s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "Sellerstoreinfotb.findByUpdateDate", query = "SELECT s FROM Sellerstoreinfotb s WHERE s.updateDate = :updateDate"),
    @NamedQuery(name = "Sellerstoreinfotb.findByIsactive", query = "SELECT s FROM Sellerstoreinfotb s WHERE s.isactive = :isactive")})
public class Sellerstoreinfotb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SellerStoreInfoId")
    private Integer sellerStoreInfoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "StoreName")
    private String storeName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PinCode")
    private int pinCode;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Logo")
    private String logo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "DocumentPic")
    private String documentPic;
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
    @JoinColumn(name = "CityId", referencedColumnName = "CityId")
    @ManyToOne(optional = false)
    private Citytb cityId;
    @JoinColumn(name = "UserName", referencedColumnName = "UserName")
    @ManyToOne(optional = false)
    private Usertb userName;
    @JoinColumn(name = "StateId", referencedColumnName = "StateId")
    @ManyToOne(optional = false)
    private Statetb stateId;

    public Sellerstoreinfotb() {
    }

    public Sellerstoreinfotb(Integer sellerStoreInfoId) {
        this.sellerStoreInfoId = sellerStoreInfoId;
    }

    public Sellerstoreinfotb(Integer sellerStoreInfoId, String storeName, String address, int pinCode, String description, String logo, String documentPic, Date createDate, Date updateDate, boolean isactive) {
        this.sellerStoreInfoId = sellerStoreInfoId;
        this.storeName = storeName;
        this.address = address;
        this.pinCode = pinCode;
        this.description = description;
        this.logo = logo;
        this.documentPic = documentPic;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isactive = isactive;
    }

    public Integer getSellerStoreInfoId() {
        return sellerStoreInfoId;
    }

    public void setSellerStoreInfoId(Integer sellerStoreInfoId) {
        this.sellerStoreInfoId = sellerStoreInfoId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDocumentPic() {
        return documentPic;
    }

    public void setDocumentPic(String documentPic) {
        this.documentPic = documentPic;
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

    public Citytb getCityId() {
        return cityId;
    }

    public void setCityId(Citytb cityId) {
        this.cityId = cityId;
    }

    public Usertb getUserName() {
        return userName;
    }

    public void setUserName(Usertb userName) {
        this.userName = userName;
    }

    public Statetb getStateId() {
        return stateId;
    }

    public void setStateId(Statetb stateId) {
        this.stateId = stateId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sellerStoreInfoId != null ? sellerStoreInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sellerstoreinfotb)) {
            return false;
        }
        Sellerstoreinfotb other = (Sellerstoreinfotb) object;
        if ((this.sellerStoreInfoId == null && other.sellerStoreInfoId != null) || (this.sellerStoreInfoId != null && !this.sellerStoreInfoId.equals(other.sellerStoreInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Sellerstoreinfotb[ sellerStoreInfoId=" + sellerStoreInfoId + " ]";
    }
    
}
