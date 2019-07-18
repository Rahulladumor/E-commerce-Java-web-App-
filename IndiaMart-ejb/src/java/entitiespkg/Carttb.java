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
@Table(name = "carttb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carttb.findAll", query = "SELECT c FROM Carttb c"),
    @NamedQuery(name = "Carttb.findByCartId", query = "SELECT c FROM Carttb c WHERE c.cartId = :cartId"),
    @NamedQuery(name = "Carttb.findByQuantity", query = "SELECT c FROM Carttb c WHERE c.quantity = :quantity"),
    @NamedQuery(name = "Carttb.findByPrice", query = "SELECT c FROM Carttb c WHERE c.price = :price"),
    @NamedQuery(name = "Carttb.findByTotalPrice", query = "SELECT c FROM Carttb c WHERE c.totalPrice = :totalPrice"),
    @NamedQuery(name = "Carttb.findByCreateDate", query = "SELECT c FROM Carttb c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "Carttb.findByUpdateDate", query = "SELECT c FROM Carttb c WHERE c.updateDate = :updateDate"),
    @NamedQuery(name = "Carttb.findByIsactive", query = "SELECT c FROM Carttb c WHERE c.isactive = :isactive")})
public class Carttb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CartId")
    private Integer cartId;
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
    @JoinColumn(name = "ProductId", referencedColumnName = "ProductBasicInfoId")
    @ManyToOne(optional = false)
    private Productbasicinfotb productId;
    @JoinColumn(name = "UserName", referencedColumnName = "UserName")
    @ManyToOne(optional = false)
    private Usertb userName;

    public Carttb() {
    }

    public Carttb(Integer cartId) {
        this.cartId = cartId;
    }

    public Carttb(Integer cartId, int quantity, double price, double totalPrice, Date createDate, Date updateDate, boolean isactive) {
        this.cartId = cartId;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isactive = isactive;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
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
        hash += (cartId != null ? cartId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carttb)) {
            return false;
        }
        Carttb other = (Carttb) object;
        if ((this.cartId == null && other.cartId != null) || (this.cartId != null && !this.cartId.equals(other.cartId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Carttb[ cartId=" + cartId + " ]";
    }
    
}
