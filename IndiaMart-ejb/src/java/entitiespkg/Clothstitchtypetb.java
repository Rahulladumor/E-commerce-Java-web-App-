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
@Table(name = "clothstitchtypetb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clothstitchtypetb.findAll", query = "SELECT c FROM Clothstitchtypetb c"),
    @NamedQuery(name = "Clothstitchtypetb.findByClothStichId", query = "SELECT c FROM Clothstitchtypetb c WHERE c.clothStichId = :clothStichId"),
    @NamedQuery(name = "Clothstitchtypetb.findByStitchType", query = "SELECT c FROM Clothstitchtypetb c WHERE c.stitchType = :stitchType"),
    @NamedQuery(name = "Clothstitchtypetb.findByIsActive", query = "SELECT c FROM Clothstitchtypetb c WHERE c.isActive = :isActive")})
public class Clothstitchtypetb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ClothStichId")
    private Integer clothStichId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "StitchType")
    private String stitchType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsActive")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stitchTypeId")
    private Collection<Productclothestb> productclothestbCollection;

    public Clothstitchtypetb() {
    }

    public Clothstitchtypetb(Integer clothStichId) {
        this.clothStichId = clothStichId;
    }

    public Clothstitchtypetb(Integer clothStichId, String stitchType, boolean isActive) {
        this.clothStichId = clothStichId;
        this.stitchType = stitchType;
        this.isActive = isActive;
    }

    public Integer getClothStichId() {
        return clothStichId;
    }

    public void setClothStichId(Integer clothStichId) {
        this.clothStichId = clothStichId;
    }

    public String getStitchType() {
        return stitchType;
    }

    public void setStitchType(String stitchType) {
        this.stitchType = stitchType;
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
        hash += (clothStichId != null ? clothStichId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clothstitchtypetb)) {
            return false;
        }
        Clothstitchtypetb other = (Clothstitchtypetb) object;
        if ((this.clothStichId == null && other.clothStichId != null) || (this.clothStichId != null && !this.clothStichId.equals(other.clothStichId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Clothstitchtypetb[ clothStichId=" + clothStichId + " ]";
    }
    
}
