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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rahul
 */
@Entity
@Table(name = "sellerpaymenttb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sellerpaymenttb.findAll", query = "SELECT s FROM Sellerpaymenttb s"),
    @NamedQuery(name = "Sellerpaymenttb.findBySellerPaymentId", query = "SELECT s FROM Sellerpaymenttb s WHERE s.sellerPaymentId = :sellerPaymentId"),
    @NamedQuery(name = "Sellerpaymenttb.findByAmount", query = "SELECT s FROM Sellerpaymenttb s WHERE s.amount = :amount"),
    @NamedQuery(name = "Sellerpaymenttb.findByDate", query = "SELECT s FROM Sellerpaymenttb s WHERE s.date = :date")})
public class Sellerpaymenttb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SellerPaymentId")
    private Integer sellerPaymentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amount")
    private double amount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @JoinColumn(name = "SellerUsername", referencedColumnName = "UserName")
    @ManyToOne(optional = false)
    private Usertb sellerUsername;
    @JoinColumn(name = "OrderId", referencedColumnName = "OrderId")
    @ManyToOne(optional = false)
    private Ordertb orderId;
    @JoinColumn(name = "PaymentId", referencedColumnName = "PaymentId")
    @ManyToOne(optional = false)
    private Paymenttb paymentId;

    public Sellerpaymenttb() {
    }

    public Sellerpaymenttb(Integer sellerPaymentId) {
        this.sellerPaymentId = sellerPaymentId;
    }

    public Sellerpaymenttb(Integer sellerPaymentId, double amount, Date date) {
        this.sellerPaymentId = sellerPaymentId;
        this.amount = amount;
        this.date = date;
    }

    public Integer getSellerPaymentId() {
        return sellerPaymentId;
    }

    public void setSellerPaymentId(Integer sellerPaymentId) {
        this.sellerPaymentId = sellerPaymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Usertb getSellerUsername() {
        return sellerUsername;
    }

    public void setSellerUsername(Usertb sellerUsername) {
        this.sellerUsername = sellerUsername;
    }

    public Ordertb getOrderId() {
        return orderId;
    }

    public void setOrderId(Ordertb orderId) {
        this.orderId = orderId;
    }

    public Paymenttb getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Paymenttb paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sellerPaymentId != null ? sellerPaymentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sellerpaymenttb)) {
            return false;
        }
        Sellerpaymenttb other = (Sellerpaymenttb) object;
        if ((this.sellerPaymentId == null && other.sellerPaymentId != null) || (this.sellerPaymentId != null && !this.sellerPaymentId.equals(other.sellerPaymentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Sellerpaymenttb[ sellerPaymentId=" + sellerPaymentId + " ]";
    }
    
}
