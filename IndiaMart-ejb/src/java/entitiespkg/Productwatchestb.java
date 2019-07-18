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
@Table(name = "productwatchestb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productwatchestb.findAll", query = "SELECT p FROM Productwatchestb p"),
    @NamedQuery(name = "Productwatchestb.findByProductWatchesId", query = "SELECT p FROM Productwatchestb p WHERE p.productWatchesId = :productWatchesId"),
    @NamedQuery(name = "Productwatchestb.findByModelName", query = "SELECT p FROM Productwatchestb p WHERE p.modelName = :modelName"),
    @NamedQuery(name = "Productwatchestb.findByBrand", query = "SELECT p FROM Productwatchestb p WHERE p.brand = :brand"),
    @NamedQuery(name = "Productwatchestb.findByDisplay", query = "SELECT p FROM Productwatchestb p WHERE p.display = :display"),
    @NamedQuery(name = "Productwatchestb.findByDialShape", query = "SELECT p FROM Productwatchestb p WHERE p.dialShape = :dialShape"),
    @NamedQuery(name = "Productwatchestb.findByStrapMaterial", query = "SELECT p FROM Productwatchestb p WHERE p.strapMaterial = :strapMaterial"),
    @NamedQuery(name = "Productwatchestb.findByCreateDate", query = "SELECT p FROM Productwatchestb p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "Productwatchestb.findByUpdateDate", query = "SELECT p FROM Productwatchestb p WHERE p.updateDate = :updateDate"),
    @NamedQuery(name = "Productwatchestb.findByIsactive", query = "SELECT p FROM Productwatchestb p WHERE p.isactive = :isactive")})
public class Productwatchestb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductWatchesId")
    private Integer productWatchesId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "ModelName")
    private String modelName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Brand")
    private String brand;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Display")
    private String display;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DialShape")
    private String dialShape;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "StrapMaterial")
    private String strapMaterial;
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
    @JoinColumn(name = "ColorId", referencedColumnName = "ColorId")
    @ManyToOne(optional = false)
    private Colortb colorId;
    @JoinColumn(name = "StrapColorId", referencedColumnName = "ColorId")
    @ManyToOne(optional = false)
    private Colortb strapColorId;
    @JoinColumn(name = "CaseColorId", referencedColumnName = "ColorId")
    @ManyToOne(optional = false)
    private Colortb caseColorId;
    @JoinColumn(name = "DialColorId", referencedColumnName = "ColorId")
    @ManyToOne(optional = false)
    private Colortb dialColorId;
    @JoinColumn(name = "ProductId", referencedColumnName = "ProductBasicInfoId")
    @ManyToOne(optional = false)
    private Productbasicinfotb productId;

    public Productwatchestb() {
    }

    public Productwatchestb(Integer productWatchesId) {
        this.productWatchesId = productWatchesId;
    }

    public Productwatchestb(Integer productWatchesId, String modelName, String brand, String display, String dialShape, String strapMaterial, Date createDate, Date updateDate, boolean isactive) {
        this.productWatchesId = productWatchesId;
        this.modelName = modelName;
        this.brand = brand;
        this.display = display;
        this.dialShape = dialShape;
        this.strapMaterial = strapMaterial;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isactive = isactive;
    }

    public Integer getProductWatchesId() {
        return productWatchesId;
    }

    public void setProductWatchesId(Integer productWatchesId) {
        this.productWatchesId = productWatchesId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getDialShape() {
        return dialShape;
    }

    public void setDialShape(String dialShape) {
        this.dialShape = dialShape;
    }

    public String getStrapMaterial() {
        return strapMaterial;
    }

    public void setStrapMaterial(String strapMaterial) {
        this.strapMaterial = strapMaterial;
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

    public Colortb getColorId() {
        return colorId;
    }

    public void setColorId(Colortb colorId) {
        this.colorId = colorId;
    }

    public Colortb getStrapColorId() {
        return strapColorId;
    }

    public void setStrapColorId(Colortb strapColorId) {
        this.strapColorId = strapColorId;
    }

    public Colortb getCaseColorId() {
        return caseColorId;
    }

    public void setCaseColorId(Colortb caseColorId) {
        this.caseColorId = caseColorId;
    }

    public Colortb getDialColorId() {
        return dialColorId;
    }

    public void setDialColorId(Colortb dialColorId) {
        this.dialColorId = dialColorId;
    }

    public Productbasicinfotb getProductId() {
        return productId;
    }

    public void setProductId(Productbasicinfotb productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productWatchesId != null ? productWatchesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productwatchestb)) {
            return false;
        }
        Productwatchestb other = (Productwatchestb) object;
        if ((this.productWatchesId == null && other.productWatchesId != null) || (this.productWatchesId != null && !this.productWatchesId.equals(other.productWatchesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Productwatchestb[ productWatchesId=" + productWatchesId + " ]";
    }
    
}
