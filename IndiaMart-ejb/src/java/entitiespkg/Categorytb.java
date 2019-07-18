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
@Table(name = "categorytb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorytb.findAll", query = "SELECT c FROM Categorytb c"),
    @NamedQuery(name = "Categorytb.findByCategoryId", query = "SELECT c FROM Categorytb c WHERE c.categoryId = :categoryId"),
    @NamedQuery(name = "Categorytb.findByCategoryName", query = "SELECT c FROM Categorytb c WHERE c.categoryName = :categoryName"),
    @NamedQuery(name = "Categorytb.findByCreateDate", query = "SELECT c FROM Categorytb c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "Categorytb.findByUpdateDate", query = "SELECT c FROM Categorytb c WHERE c.updateDate = :updateDate"),
    @NamedQuery(name = "Categorytb.findByIsactive", query = "SELECT c FROM Categorytb c WHERE c.isactive = :isactive")})
public class Categorytb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CategoryId")
    private Integer categoryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CategoryName")
    private String categoryName;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoryId")
    private Collection<Subcategorytb> subcategorytbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoryId")
    private Collection<Productbasicinfotb> productbasicinfotbCollection;

    public Categorytb() {
    }

    public Categorytb(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Categorytb(Integer categoryId, String categoryName, Date createDate, Date updateDate, boolean isactive) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isactive = isactive;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
    public Collection<Subcategorytb> getSubcategorytbCollection() {
        return subcategorytbCollection;
    }

    public void setSubcategorytbCollection(Collection<Subcategorytb> subcategorytbCollection) {
        this.subcategorytbCollection = subcategorytbCollection;
    }

    @XmlTransient
    public Collection<Productbasicinfotb> getProductbasicinfotbCollection() {
        return productbasicinfotbCollection;
    }

    public void setProductbasicinfotbCollection(Collection<Productbasicinfotb> productbasicinfotbCollection) {
        this.productbasicinfotbCollection = productbasicinfotbCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryId != null ? categoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorytb)) {
            return false;
        }
        Categorytb other = (Categorytb) object;
        if ((this.categoryId == null && other.categoryId != null) || (this.categoryId != null && !this.categoryId.equals(other.categoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Categorytb[ categoryId=" + categoryId + " ]";
    }
    
}
