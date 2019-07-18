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
@Table(name = "productsellertb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productsellertb.findAll", query = "SELECT p FROM Productsellertb p"),
    @NamedQuery(name = "Productsellertb.findByProductISellerId", query = "SELECT p FROM Productsellertb p WHERE p.productISellerId = :productISellerId"),
    @NamedQuery(name = "Productsellertb.findByCreateDate", query = "SELECT p FROM Productsellertb p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "Productsellertb.findByUpdateDate", query = "SELECT p FROM Productsellertb p WHERE p.updateDate = :updateDate"),
    @NamedQuery(name = "Productsellertb.findByIsactive", query = "SELECT p FROM Productsellertb p WHERE p.isactive = :isactive")})
public class Productsellertb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductISellerId")
    private Integer productISellerId;
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

    public Productsellertb() {
    }

    public Productsellertb(Integer productISellerId) {
        this.productISellerId = productISellerId;
    }

    public Productsellertb(Integer productISellerId, Date createDate, Date updateDate, boolean isactive) {
        this.productISellerId = productISellerId;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isactive = isactive;
    }

    public Integer getProductISellerId() {
        return productISellerId;
    }

    public void setProductISellerId(Integer productISellerId) {
        this.productISellerId = productISellerId;
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
        hash += (productISellerId != null ? productISellerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productsellertb)) {
            return false;
        }
        Productsellertb other = (Productsellertb) object;
        if ((this.productISellerId == null && other.productISellerId != null) || (this.productISellerId != null && !this.productISellerId.equals(other.productISellerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Productsellertb[ productISellerId=" + productISellerId + " ]";
    }
    
}
