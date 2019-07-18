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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rahul
 */
@Entity
@Table(name = "ordertb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordertb.findAll", query = "SELECT o FROM Ordertb o"),
    @NamedQuery(name = "Ordertb.findByOrderId", query = "SELECT o FROM Ordertb o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "Ordertb.findByQuantity", query = "SELECT o FROM Ordertb o WHERE o.quantity = :quantity"),
    @NamedQuery(name = "Ordertb.findByPrice", query = "SELECT o FROM Ordertb o WHERE o.price = :price"),
    @NamedQuery(name = "Ordertb.findByTotalPrice", query = "SELECT o FROM Ordertb o WHERE o.totalPrice = :totalPrice"),
    @NamedQuery(name = "Ordertb.findByDeliveryStatus", query = "SELECT o FROM Ordertb o WHERE o.deliveryStatus = :deliveryStatus"),
    @NamedQuery(name = "Ordertb.findByBillAddress", query = "SELECT o FROM Ordertb o WHERE o.billAddress = :billAddress"),
    @NamedQuery(name = "Ordertb.findByShippingAddress", query = "SELECT o FROM Ordertb o WHERE o.shippingAddress = :shippingAddress"),
    @NamedQuery(name = "Ordertb.findByShippingPinCode", query = "SELECT o FROM Ordertb o WHERE o.shippingPinCode = :shippingPinCode"),
    @NamedQuery(name = "Ordertb.findByOrderDate", query = "SELECT o FROM Ordertb o WHERE o.orderDate = :orderDate"),
    @NamedQuery(name = "Ordertb.findByCreateDate", query = "SELECT o FROM Ordertb o WHERE o.createDate = :createDate"),
    @NamedQuery(name = "Ordertb.findByUpdateDate", query = "SELECT o FROM Ordertb o WHERE o.updateDate = :updateDate"),
    @NamedQuery(name = "Ordertb.findByIsactive", query = "SELECT o FROM Ordertb o WHERE o.isactive = :isactive")})
public class Ordertb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "OrderId")
    private Integer orderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Price")
    private double price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalPrice")
    private double totalPrice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DeliveryStatus")
    private String deliveryStatus;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "BillAddress")
    private String billAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "ShippingAddress")
    private String shippingAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ShippingPinCode")
    private int shippingPinCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderDate")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderId")
    private Collection<Sellerpaymenttb> sellerpaymenttbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderId")
    private Collection<Paymenttb> paymenttbCollection;
    @JoinColumn(name = "ProductId", referencedColumnName = "ProductBasicInfoId")
    @ManyToOne(optional = false)
    private Productbasicinfotb productId;
    @JoinColumn(name = "UserName", referencedColumnName = "UserName")
    @ManyToOne(optional = false)
    private Usertb userName;

    public Ordertb() {
    }

    public Ordertb(Integer orderId) {
        this.orderId = orderId;
    }

    public Ordertb(Integer orderId, int quantity, double price, double totalPrice, String deliveryStatus, String billAddress, String shippingAddress, int shippingPinCode, Date orderDate, Date createDate, Date updateDate, boolean isactive) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
        this.deliveryStatus = deliveryStatus;
        this.billAddress = billAddress;
        this.shippingAddress = shippingAddress;
        this.shippingPinCode = shippingPinCode;
        this.orderDate = orderDate;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isactive = isactive;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(String billAddress) {
        this.billAddress = billAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public int getShippingPinCode() {
        return shippingPinCode;
    }

    public void setShippingPinCode(int shippingPinCode) {
        this.shippingPinCode = shippingPinCode;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
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

    @XmlTransient
    public Collection<Paymenttb> getPaymenttbCollection() {
        return paymenttbCollection;
    }

    public void setPaymenttbCollection(Collection<Paymenttb> paymenttbCollection) {
        this.paymenttbCollection = paymenttbCollection;
    }

    public Productbasicinfotb getProductId() {
        return productId;
    }

    public void setProductId(Productbasicinfotb productId) {
        this.productId = productId;
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
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordertb)) {
            return false;
        }
        Ordertb other = (Ordertb) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Ordertb[ orderId=" + orderId + " ]";
    }
    
}
