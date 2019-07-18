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
@Table(name = "sellerbankinfotb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sellerbankinfotb.findAll", query = "SELECT s FROM Sellerbankinfotb s"),
    @NamedQuery(name = "Sellerbankinfotb.findBySellerBankId", query = "SELECT s FROM Sellerbankinfotb s WHERE s.sellerBankId = :sellerBankId"),
    @NamedQuery(name = "Sellerbankinfotb.findByACHoldername", query = "SELECT s FROM Sellerbankinfotb s WHERE s.aCHoldername = :aCHoldername"),
    @NamedQuery(name = "Sellerbankinfotb.findByAcNo", query = "SELECT s FROM Sellerbankinfotb s WHERE s.acNo = :acNo"),
    @NamedQuery(name = "Sellerbankinfotb.findByAcType", query = "SELECT s FROM Sellerbankinfotb s WHERE s.acType = :acType"),
    @NamedQuery(name = "Sellerbankinfotb.findByIfsc", query = "SELECT s FROM Sellerbankinfotb s WHERE s.ifsc = :ifsc"),
    @NamedQuery(name = "Sellerbankinfotb.findByBankName", query = "SELECT s FROM Sellerbankinfotb s WHERE s.bankName = :bankName"),
    @NamedQuery(name = "Sellerbankinfotb.findByBranch", query = "SELECT s FROM Sellerbankinfotb s WHERE s.branch = :branch"),
    @NamedQuery(name = "Sellerbankinfotb.findByCreateDate", query = "SELECT s FROM Sellerbankinfotb s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "Sellerbankinfotb.findByUpdateDate", query = "SELECT s FROM Sellerbankinfotb s WHERE s.updateDate = :updateDate"),
    @NamedQuery(name = "Sellerbankinfotb.findByIsactive", query = "SELECT s FROM Sellerbankinfotb s WHERE s.isactive = :isactive")})
public class Sellerbankinfotb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SellerBankId")
    private Integer sellerBankId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ACHoldername")
    private String aCHoldername;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AcNo")
    private String acNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "AcType")
    private String acType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "IFSC")
    private String ifsc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "BankName")
    private String bankName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Branch")
    private String branch;
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

    public Sellerbankinfotb() {
    }

    public Sellerbankinfotb(Integer sellerBankId) {
        this.sellerBankId = sellerBankId;
    }

    public Sellerbankinfotb(Integer sellerBankId, String aCHoldername, String acNo, String acType, String ifsc, String bankName, String branch, Date createDate, Date updateDate, boolean isactive) {
        this.sellerBankId = sellerBankId;
        this.aCHoldername = aCHoldername;
        this.acNo = acNo;
        this.acType = acType;
        this.ifsc = ifsc;
        this.bankName = bankName;
        this.branch = branch;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isactive = isactive;
    }

    public Integer getSellerBankId() {
        return sellerBankId;
    }

    public void setSellerBankId(Integer sellerBankId) {
        this.sellerBankId = sellerBankId;
    }

    public String getACHoldername() {
        return aCHoldername;
    }

    public void setACHoldername(String aCHoldername) {
        this.aCHoldername = aCHoldername;
    }

    public String getAcNo() {
        return acNo;
    }

    public void setAcNo(String acNo) {
        this.acNo = acNo;
    }

    public String getAcType() {
        return acType;
    }

    public void setAcType(String acType) {
        this.acType = acType;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
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
        hash += (sellerBankId != null ? sellerBankId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sellerbankinfotb)) {
            return false;
        }
        Sellerbankinfotb other = (Sellerbankinfotb) object;
        if ((this.sellerBankId == null && other.sellerBankId != null) || (this.sellerBankId != null && !this.sellerBankId.equals(other.sellerBankId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Sellerbankinfotb[ sellerBankId=" + sellerBankId + " ]";
    }
    
}
