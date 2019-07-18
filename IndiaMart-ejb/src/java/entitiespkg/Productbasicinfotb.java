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
import javax.persistence.Lob;
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
@Table(name = "productbasicinfotb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productbasicinfotb.findAll", query = "SELECT p FROM Productbasicinfotb p"),
    @NamedQuery(name = "Productbasicinfotb.findByProductBasicInfoId", query = "SELECT p FROM Productbasicinfotb p WHERE p.productBasicInfoId = :productBasicInfoId"),
    @NamedQuery(name = "Productbasicinfotb.findByProductName", query = "SELECT p FROM Productbasicinfotb p WHERE p.productName = :productName"),
    @NamedQuery(name = "Productbasicinfotb.findByMrp", query = "SELECT p FROM Productbasicinfotb p WHERE p.mrp = :mrp"),
    @NamedQuery(name = "Productbasicinfotb.findBySellingPrice", query = "SELECT p FROM Productbasicinfotb p WHERE p.sellingPrice = :sellingPrice"),
    @NamedQuery(name = "Productbasicinfotb.findByWarrenty", query = "SELECT p FROM Productbasicinfotb p WHERE p.warrenty = :warrenty"),
    @NamedQuery(name = "Productbasicinfotb.findByStock", query = "SELECT p FROM Productbasicinfotb p WHERE p.stock = :stock"),
    @NamedQuery(name = "Productbasicinfotb.findByProductMainImage", query = "SELECT p FROM Productbasicinfotb p WHERE p.productMainImage = :productMainImage"),
    @NamedQuery(name = "Productbasicinfotb.findByProductImage", query = "SELECT p FROM Productbasicinfotb p WHERE p.productImage = :productImage"),
    @NamedQuery(name = "Productbasicinfotb.findByProductStatus", query = "SELECT p FROM Productbasicinfotb p WHERE p.productStatus = :productStatus"),
    @NamedQuery(name = "Productbasicinfotb.findByCreateDate", query = "SELECT p FROM Productbasicinfotb p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "Productbasicinfotb.findByUpdateDate", query = "SELECT p FROM Productbasicinfotb p WHERE p.updateDate = :updateDate"),
    @NamedQuery(name = "Productbasicinfotb.findByIsactive", query = "SELECT p FROM Productbasicinfotb p WHERE p.isactive = :isactive")})
public class Productbasicinfotb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductBasicInfoId")
    private Integer productBasicInfoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "ProductName")
    private String productName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MRP")
    private double mrp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SellingPrice")
    private double sellingPrice;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Warrenty")
    private String warrenty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Stock")
    private int stock;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "ProductMainImage")
    private String productMainImage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "ProductImage")
    private String productImage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductStatus")
    private int productStatus;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private Collection<Productwatchestb> productwatchestbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private Collection<Productclothestb> productclothestbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private Collection<Productelectronicstb> productelectronicstbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private Collection<Productsellertb> productsellertbCollection;
    @JoinColumn(name = "SubCategoryId", referencedColumnName = "SubCategoryId")
    @ManyToOne(optional = false)
    private Subcategorytb subCategoryId;
    @JoinColumn(name = "Username", referencedColumnName = "UserName")
    @ManyToOne(optional = false)
    private Usertb username;
    @JoinColumn(name = "CategoryId", referencedColumnName = "CategoryId")
    @ManyToOne(optional = false)
    private Categorytb categoryId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private Collection<Ordertb> ordertbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private Collection<Carttb> carttbCollection;

    public Productbasicinfotb() {
    }

    public Productbasicinfotb(Integer productBasicInfoId) {
        this.productBasicInfoId = productBasicInfoId;
    }

    public Productbasicinfotb(Integer productBasicInfoId, String productName, double mrp, double sellingPrice, String description, String warrenty, int stock, String productMainImage, String productImage, int productStatus, Date createDate, Date updateDate, boolean isactive) {
        this.productBasicInfoId = productBasicInfoId;
        this.productName = productName;
        this.mrp = mrp;
        this.sellingPrice = sellingPrice;
        this.description = description;
        this.warrenty = warrenty;
        this.stock = stock;
        this.productMainImage = productMainImage;
        this.productImage = productImage;
        this.productStatus = productStatus;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isactive = isactive;
    }

    public Integer getProductBasicInfoId() {
        return productBasicInfoId;
    }

    public void setProductBasicInfoId(Integer productBasicInfoId) {
        this.productBasicInfoId = productBasicInfoId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getMrp() {
        return mrp;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWarrenty() {
        return warrenty;
    }

    public void setWarrenty(String warrenty) {
        this.warrenty = warrenty;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProductMainImage() {
        return productMainImage;
    }

    public void setProductMainImage(String productMainImage) {
        this.productMainImage = productMainImage;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
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
    public Collection<Productwatchestb> getProductwatchestbCollection() {
        return productwatchestbCollection;
    }

    public void setProductwatchestbCollection(Collection<Productwatchestb> productwatchestbCollection) {
        this.productwatchestbCollection = productwatchestbCollection;
    }

    @XmlTransient
    public Collection<Productclothestb> getProductclothestbCollection() {
        return productclothestbCollection;
    }

    public void setProductclothestbCollection(Collection<Productclothestb> productclothestbCollection) {
        this.productclothestbCollection = productclothestbCollection;
    }

    @XmlTransient
    public Collection<Productelectronicstb> getProductelectronicstbCollection() {
        return productelectronicstbCollection;
    }

    public void setProductelectronicstbCollection(Collection<Productelectronicstb> productelectronicstbCollection) {
        this.productelectronicstbCollection = productelectronicstbCollection;
    }

    @XmlTransient
    public Collection<Productsellertb> getProductsellertbCollection() {
        return productsellertbCollection;
    }

    public void setProductsellertbCollection(Collection<Productsellertb> productsellertbCollection) {
        this.productsellertbCollection = productsellertbCollection;
    }

    public Subcategorytb getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Subcategorytb subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public Usertb getUsername() {
        return username;
    }

    public void setUsername(Usertb username) {
        this.username = username;
    }

    public Categorytb getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Categorytb categoryId) {
        this.categoryId = categoryId;
    }

    @XmlTransient
    public Collection<Ordertb> getOrdertbCollection() {
        return ordertbCollection;
    }

    public void setOrdertbCollection(Collection<Ordertb> ordertbCollection) {
        this.ordertbCollection = ordertbCollection;
    }

    @XmlTransient
    public Collection<Carttb> getCarttbCollection() {
        return carttbCollection;
    }

    public void setCarttbCollection(Collection<Carttb> carttbCollection) {
        this.carttbCollection = carttbCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productBasicInfoId != null ? productBasicInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productbasicinfotb)) {
            return false;
        }
        Productbasicinfotb other = (Productbasicinfotb) object;
        if ((this.productBasicInfoId == null && other.productBasicInfoId != null) || (this.productBasicInfoId != null && !this.productBasicInfoId.equals(other.productBasicInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Productbasicinfotb[ productBasicInfoId=" + productBasicInfoId + " ]";
    }
    
}
