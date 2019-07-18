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
@Table(name = "productelectronicstb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productelectronicstb.findAll", query = "SELECT p FROM Productelectronicstb p"),
    @NamedQuery(name = "Productelectronicstb.findByProductElectronicsId", query = "SELECT p FROM Productelectronicstb p WHERE p.productElectronicsId = :productElectronicsId"),
    @NamedQuery(name = "Productelectronicstb.findByModelNo", query = "SELECT p FROM Productelectronicstb p WHERE p.modelNo = :modelNo"),
    @NamedQuery(name = "Productelectronicstb.findByModelName", query = "SELECT p FROM Productelectronicstb p WHERE p.modelName = :modelName"),
    @NamedQuery(name = "Productelectronicstb.findByBrand", query = "SELECT p FROM Productelectronicstb p WHERE p.brand = :brand"),
    @NamedQuery(name = "Productelectronicstb.findByTouchScreen", query = "SELECT p FROM Productelectronicstb p WHERE p.touchScreen = :touchScreen"),
    @NamedQuery(name = "Productelectronicstb.findByRam", query = "SELECT p FROM Productelectronicstb p WHERE p.ram = :ram"),
    @NamedQuery(name = "Productelectronicstb.findByMemoryStorage", query = "SELECT p FROM Productelectronicstb p WHERE p.memoryStorage = :memoryStorage"),
    @NamedQuery(name = "Productelectronicstb.findByDisplayType", query = "SELECT p FROM Productelectronicstb p WHERE p.displayType = :displayType"),
    @NamedQuery(name = "Productelectronicstb.findByProcessor", query = "SELECT p FROM Productelectronicstb p WHERE p.processor = :processor"),
    @NamedQuery(name = "Productelectronicstb.findByOs", query = "SELECT p FROM Productelectronicstb p WHERE p.os = :os"),
    @NamedQuery(name = "Productelectronicstb.findByCreateDate", query = "SELECT p FROM Productelectronicstb p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "Productelectronicstb.findByUpdateDate", query = "SELECT p FROM Productelectronicstb p WHERE p.updateDate = :updateDate"),
    @NamedQuery(name = "Productelectronicstb.findByIsactive", query = "SELECT p FROM Productelectronicstb p WHERE p.isactive = :isactive")})
public class Productelectronicstb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductElectronicsId")
    private Integer productElectronicsId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ModelNo")
    private String modelNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "ModelName")
    private String modelName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Brand")
    private String brand;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TouchScreen")
    private boolean touchScreen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "RAM")
    private String ram;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "MemoryStorage")
    private String memoryStorage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DisplayType")
    private String displayType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Processor")
    private String processor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "OS")
    private String os;
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
    @JoinColumn(name = "ProductId", referencedColumnName = "ProductBasicInfoId")
    @ManyToOne(optional = false)
    private Productbasicinfotb productId;

    public Productelectronicstb() {
    }

    public Productelectronicstb(Integer productElectronicsId) {
        this.productElectronicsId = productElectronicsId;
    }

    public Productelectronicstb(Integer productElectronicsId, String modelNo, String modelName, String brand, boolean touchScreen, String ram, String memoryStorage, String displayType, String processor, String os, Date createDate, Date updateDate, boolean isactive) {
        this.productElectronicsId = productElectronicsId;
        this.modelNo = modelNo;
        this.modelName = modelName;
        this.brand = brand;
        this.touchScreen = touchScreen;
        this.ram = ram;
        this.memoryStorage = memoryStorage;
        this.displayType = displayType;
        this.processor = processor;
        this.os = os;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isactive = isactive;
    }

    public Integer getProductElectronicsId() {
        return productElectronicsId;
    }

    public void setProductElectronicsId(Integer productElectronicsId) {
        this.productElectronicsId = productElectronicsId;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
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

    public boolean getTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMemoryStorage() {
        return memoryStorage;
    }

    public void setMemoryStorage(String memoryStorage) {
        this.memoryStorage = memoryStorage;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
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

    public Productbasicinfotb getProductId() {
        return productId;
    }

    public void setProductId(Productbasicinfotb productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productElectronicsId != null ? productElectronicsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productelectronicstb)) {
            return false;
        }
        Productelectronicstb other = (Productelectronicstb) object;
        if ((this.productElectronicsId == null && other.productElectronicsId != null) || (this.productElectronicsId != null && !this.productElectronicsId.equals(other.productElectronicsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Productelectronicstb[ productElectronicsId=" + productElectronicsId + " ]";
    }
    
}
