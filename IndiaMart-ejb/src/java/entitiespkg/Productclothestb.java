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
@Table(name = "productclothestb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productclothestb.findAll", query = "SELECT p FROM Productclothestb p"),
    @NamedQuery(name = "Productclothestb.findByProductClothesId", query = "SELECT p FROM Productclothestb p WHERE p.productClothesId = :productClothesId"),
    @NamedQuery(name = "Productclothestb.findByCreateDate", query = "SELECT p FROM Productclothestb p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "Productclothestb.findByUpdateDate", query = "SELECT p FROM Productclothestb p WHERE p.updateDate = :updateDate"),
    @NamedQuery(name = "Productclothestb.findByIsactive", query = "SELECT p FROM Productclothestb p WHERE p.isactive = :isactive")})
public class Productclothestb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductClothesId")
    private Integer productClothesId;
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
    @JoinColumn(name = "SizeId", referencedColumnName = "ClothSizeId")
    @ManyToOne(optional = false)
    private Clothsizetb sizeId;
    @JoinColumn(name = "ColorId", referencedColumnName = "ColorId")
    @ManyToOne(optional = false)
    private Colortb colorId;
    @JoinColumn(name = "FabricId", referencedColumnName = "ClothFabricId")
    @ManyToOne(optional = false)
    private Clothfabrictb fabricId;
    @JoinColumn(name = "WorkId", referencedColumnName = "ClothWorkId")
    @ManyToOne(optional = false)
    private Clothworktb workId;
    @JoinColumn(name = "StitchTypeId", referencedColumnName = "ClothStichId")
    @ManyToOne(optional = false)
    private Clothstitchtypetb stitchTypeId;
    @JoinColumn(name = "StyleId", referencedColumnName = "ClothStyleId")
    @ManyToOne(optional = false)
    private Clothstyletb styleId;
    @JoinColumn(name = "ProductId", referencedColumnName = "ProductBasicInfoId")
    @ManyToOne(optional = false)
    private Productbasicinfotb productId;

    public Productclothestb() {
    }

    public Productclothestb(Integer productClothesId) {
        this.productClothesId = productClothesId;
    }

    public Productclothestb(Integer productClothesId, Date createDate, Date updateDate, boolean isactive) {
        this.productClothesId = productClothesId;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isactive = isactive;
    }

    public Integer getProductClothesId() {
        return productClothesId;
    }

    public void setProductClothesId(Integer productClothesId) {
        this.productClothesId = productClothesId;
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

    public Clothsizetb getSizeId() {
        return sizeId;
    }

    public void setSizeId(Clothsizetb sizeId) {
        this.sizeId = sizeId;
    }

    public Colortb getColorId() {
        return colorId;
    }

    public void setColorId(Colortb colorId) {
        this.colorId = colorId;
    }

    public Clothfabrictb getFabricId() {
        return fabricId;
    }

    public void setFabricId(Clothfabrictb fabricId) {
        this.fabricId = fabricId;
    }

    public Clothworktb getWorkId() {
        return workId;
    }

    public void setWorkId(Clothworktb workId) {
        this.workId = workId;
    }

    public Clothstitchtypetb getStitchTypeId() {
        return stitchTypeId;
    }

    public void setStitchTypeId(Clothstitchtypetb stitchTypeId) {
        this.stitchTypeId = stitchTypeId;
    }

    public Clothstyletb getStyleId() {
        return styleId;
    }

    public void setStyleId(Clothstyletb styleId) {
        this.styleId = styleId;
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
        hash += (productClothesId != null ? productClothesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productclothestb)) {
            return false;
        }
        Productclothestb other = (Productclothestb) object;
        if ((this.productClothesId == null && other.productClothesId != null) || (this.productClothesId != null && !this.productClothesId.equals(other.productClothesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Productclothestb[ productClothesId=" + productClothesId + " ]";
    }
    
}
