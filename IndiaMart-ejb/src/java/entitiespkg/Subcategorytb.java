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
@Table(name = "subcategorytb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subcategorytb.findAll", query = "SELECT s FROM Subcategorytb s"),
    @NamedQuery(name = "Subcategorytb.findBySubCategoryId", query = "SELECT s FROM Subcategorytb s WHERE s.subCategoryId = :subCategoryId"),
    @NamedQuery(name = "Subcategorytb.findBySubCategoryName", query = "SELECT s FROM Subcategorytb s WHERE s.subCategoryName = :subCategoryName"),
    @NamedQuery(name = "Subcategorytb.findByCreateDate", query = "SELECT s FROM Subcategorytb s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "Subcategorytb.findByUpdateDate", query = "SELECT s FROM Subcategorytb s WHERE s.updateDate = :updateDate"),
    @NamedQuery(name = "Subcategorytb.findByIsactive", query = "SELECT s FROM Subcategorytb s WHERE s.isactive = :isactive")})
public class Subcategorytb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SubCategoryId")
    private Integer subCategoryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "SubCategoryName")
    private String subCategoryName;
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
    @JoinColumn(name = "CategoryId", referencedColumnName = "CategoryId")
    @ManyToOne(optional = false)
    private Categorytb categoryId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subCategoryId")
    private Collection<Productbasicinfotb> productbasicinfotbCollection;

    public Subcategorytb() {
    }

    public Subcategorytb(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public Subcategorytb(Integer subCategoryId, String subCategoryName, Date createDate, Date updateDate, boolean isactive) {
        this.subCategoryId = subCategoryId;
        this.subCategoryName = subCategoryName;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isactive = isactive;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
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

    public Categorytb getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Categorytb categoryId) {
        this.categoryId = categoryId;
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
        hash += (subCategoryId != null ? subCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subcategorytb)) {
            return false;
        }
        Subcategorytb other = (Subcategorytb) object;
        if ((this.subCategoryId == null && other.subCategoryId != null) || (this.subCategoryId != null && !this.subCategoryId.equals(other.subCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Subcategorytb[ subCategoryId=" + subCategoryId + " ]";
    }
    
}
