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
@Table(name = "clothstyletb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clothstyletb.findAll", query = "SELECT c FROM Clothstyletb c"),
    @NamedQuery(name = "Clothstyletb.findByClothStyleId", query = "SELECT c FROM Clothstyletb c WHERE c.clothStyleId = :clothStyleId"),
    @NamedQuery(name = "Clothstyletb.findByStyle", query = "SELECT c FROM Clothstyletb c WHERE c.style = :style"),
    @NamedQuery(name = "Clothstyletb.findByIsActive", query = "SELECT c FROM Clothstyletb c WHERE c.isActive = :isActive")})
public class Clothstyletb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ClothStyleId")
    private Integer clothStyleId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "Style")
    private String style;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsActive")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "styleId")
    private Collection<Productclothestb> productclothestbCollection;

    public Clothstyletb() {
    }

    public Clothstyletb(Integer clothStyleId) {
        this.clothStyleId = clothStyleId;
    }

    public Clothstyletb(Integer clothStyleId, String style, boolean isActive) {
        this.clothStyleId = clothStyleId;
        this.style = style;
        this.isActive = isActive;
    }

    public Integer getClothStyleId() {
        return clothStyleId;
    }

    public void setClothStyleId(Integer clothStyleId) {
        this.clothStyleId = clothStyleId;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
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
        hash += (clothStyleId != null ? clothStyleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clothstyletb)) {
            return false;
        }
        Clothstyletb other = (Clothstyletb) object;
        if ((this.clothStyleId == null && other.clothStyleId != null) || (this.clothStyleId != null && !this.clothStyleId.equals(other.clothStyleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Clothstyletb[ clothStyleId=" + clothStyleId + " ]";
    }
    
}
