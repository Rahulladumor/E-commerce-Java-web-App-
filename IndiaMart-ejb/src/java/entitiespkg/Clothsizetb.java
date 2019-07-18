/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitiespkg;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rahul
 */
@Entity
@Table(name = "clothsizetb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clothsizetb.findAll", query = "SELECT c FROM Clothsizetb c"),
    @NamedQuery(name = "Clothsizetb.findByClothSizeId", query = "SELECT c FROM Clothsizetb c WHERE c.clothSizeId = :clothSizeId"),
    @NamedQuery(name = "Clothsizetb.findBySize", query = "SELECT c FROM Clothsizetb c WHERE c.size = :size"),
    @NamedQuery(name = "Clothsizetb.findByIsActive", query = "SELECT c FROM Clothsizetb c WHERE c.isActive = :isActive")})
public class Clothsizetb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ClothSizeId")
    private Integer clothSizeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Size")
    private String size;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsActive")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sizeId")
    private Collection<Productclothestb> productclothestbCollection;

    public Clothsizetb() {
    }

    public Clothsizetb(Integer clothSizeId) {
        this.clothSizeId = clothSizeId;
    }

    public Clothsizetb(Integer clothSizeId, String size, boolean isActive) {
        this.clothSizeId = clothSizeId;
        this.size = size;
        this.isActive = isActive;
    }

    public Integer getClothSizeId() {
        return clothSizeId;
    }

    public void setClothSizeId(Integer clothSizeId) {
        this.clothSizeId = clothSizeId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @XmlTransient
    public Collection<Productclothestb> getProductclothestbCollection() {
        return productclothestbCollection;
    }

    public void setProductclothestbCollection(Collection<Productclothestb> productclothestbCollection) {
        this.productclothestbCollection = productclothestbCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clothSizeId != null ? clothSizeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clothsizetb)) {
            return false;
        }
        Clothsizetb other = (Clothsizetb) object;
        if ((this.clothSizeId == null && other.clothSizeId != null) || (this.clothSizeId != null && !this.clothSizeId.equals(other.clothSizeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Clothsizetb[ clothSizeId=" + clothSizeId + " ]";
    }
    
}
