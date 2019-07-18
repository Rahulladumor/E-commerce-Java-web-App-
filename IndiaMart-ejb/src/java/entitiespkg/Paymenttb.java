/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitiespkg;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rahul
 */
@Entity
@Table(name = "paymenttb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paymenttb.findAll", query = "SELECT p FROM Paymenttb p"),
    @NamedQuery(name = "Paymenttb.findByPaymentId", query = "SELECT p FROM Paymenttb p WHERE p.paymentId = :paymentId"),
    @NamedQuery(name = "Paymenttb.findByTotalPayment", query = "SELECT p FROM Paymenttb p WHERE p.totalPayment = :totalPayment"),
    @NamedQuery(name = "Paymenttb.findByPaymentDate", query = "SELECT p FROM Paymenttb p WHERE p.paymentDate = :paymentDate"),
    @NamedQuery(name = "Paymenttb.findByTransferStatus", query = "SELECT p FROM Paymenttb p WHERE p.transferStatus = :transferStatus"),
    @NamedQuery(name = "Paymenttb.findByCreateDate", query = "SELECT p FROM Paymenttb p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "Paymenttb.findByUpdateDate", query = "SELECT p FROM Paymenttb p WHERE p.updateDate = :updateDate"),
    @NamedQuery(name = "Paymenttb.findByIsactive", query = "SELECT p FROM Paymenttb p WHERE p.isactive = :isactive")})
public class Paymenttb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PaymentId")
    private Integer paymentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalPayment")
    private double totalPayment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PaymentDate")
    @Temporal(TemporalType.DATE)
    private Date paymentDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TransferStatus")
    private boolean transferStatus;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentId")
    private Collection<Sellerpaymenttb> sellerpaymenttbCollection;
    @JoinColumn(name = "OrderId", referencedColumnName = "OrderId")
    @ManyToOne(optional = false)
    private Ordertb orderId;
    @JoinColumn(name = "UserName", referencedColumnName = "UserName")
    @ManyToOne(optional = false)
    private Usertb userName;

    public Paymenttb() {
    }

    public Paymenttb(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Paymenttb(Integer paymentId, double totalPayment, Date paymentDate, boolean transferStatus, Date createDate, Date updateDate, boolean isactive) {
        this.paymentId = paymentId;
        this.totalPayment = totalPayment;
        this.paymentDate = paymentDate;
        this.transferStatus = transferStatus;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isactive = isactive;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public boolean getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(boolean transferStatus) {
        this.transferStatus = transferStatus;
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

    @XmlTransient
    public Collection<Sellerpaymenttb> getSellerpaymenttbCollection() {
        return sellerpaymenttbCollection;
    }

    public void setSellerpaymenttbCollection(Collection<Sellerpaymenttb> sellerpaymenttbCollection) {
        this.sellerpaymenttbCollection = sellerpaymenttbCollection;
    }

    public Ordertb getOrderId() {
        return orderId;
    }

    public void setOrderId(Ordertb orderId) {
        this.orderId = orderId;
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
        hash += (paymentId != null ? paymentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paymenttb)) {
            return false;
        }
        Paymenttb other = (Paymenttb) object;
        if ((this.paymentId == null && other.paymentId != null) || (this.paymentId != null && !this.paymentId.equals(other.paymentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Paymenttb[ paymentId=" + paymentId + " ]";
    }
    
}
