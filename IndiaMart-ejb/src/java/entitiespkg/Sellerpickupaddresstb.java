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
@Table(name = "sellerpickupaddresstb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sellerpickupaddresstb.findAll", query = "SELECT s FROM Sellerpickupaddresstb s"),
    @NamedQuery(name = "Sellerpickupaddresstb.findBySellerPickUpId", query = "SELECT s FROM Sellerpickupaddresstb s WHERE s.sellerPickUpId = :sellerPickUpId"),
    @NamedQuery(name = "Sellerpickupaddresstb.findByAddress", query = "SELECT s FROM Sellerpickupaddresstb s WHERE s.address = :address"),
    @NamedQuery(name = "Sellerpickupaddresstb.findByPincode", query = "SELECT s FROM Sellerpickupaddresstb s WHERE s.pincode = :pincode"),
    @NamedQuery(name = "Sellerpickupaddresstb.findByAddressProof", query = "SELECT s FROM Sellerpickupaddresstb s WHERE s.addressProof = :addressProof"),
    @NamedQuery(name = "Sellerpickupaddresstb.findByCreateDate", query = "SELECT s FROM Sellerpickupaddresstb s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "Sellerpickupaddresstb.findByUpdateDate", query = "SELECT s FROM Sellerpickupaddresstb s WHERE s.updateDate = :updateDate"),
    @NamedQuery(name = "Sellerpickupaddresstb.findByIsactive", query = "SELECT s FROM Sellerpickupaddresstb s WHERE s.isactive = :isactive")})
public class Sellerpickupaddresstb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SellerPickUpId")
    private Integer sellerPickUpId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Pincode")
    private int pincode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "AddressProof")
    private String addressProof;
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

    public Sellerpickupaddresstb() {
    }

    public Sellerpickupaddresstb(Integer sellerPickUpId) {
        this.sellerPickUpId = sellerPickUpId;
    }

    public Sellerpickupaddresstb(Integer sellerPickUpId, String address, int pincode, String addressProof, Date createDate, Date updateDate, boolean isactive) {
        this.sellerPickUpId = sellerPickUpId;
        this.address = address;
        this.pincode = pincode;
        this.addressProof = addressProof;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isactive = isactive;
    }

    public Integer getSellerPickUpId() {
        return sellerPickUpId;
    }

    public void setSellerPickUpId(Integer sellerPickUpId) {
        this.sellerPickUpId = sellerPickUpId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getAddressProof() {
        return addressProof;
    }

    public void setAddressProof(String addressProof) {
        this.addressProof = addressProof;
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
        hash += (sellerPickUpId != null ? sellerPickUpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sellerpickupaddresstb)) {
            return false;
        }
        Sellerpickupaddresstb other = (Sellerpickupaddresstb) object;
        if ((this.sellerPickUpId == null && other.sellerPickUpId != null) || (this.sellerPickUpId != null && !this.sellerPickUpId.equals(other.sellerPickUpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Sellerpickupaddresstb[ sellerPickUpId=" + sellerPickUpId + " ]";
    }
    
}
