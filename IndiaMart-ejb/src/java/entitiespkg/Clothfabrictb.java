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
@Table(name = "clothfabrictb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clothfabrictb.findAll", query = "SELECT c FROM Clothfabrictb c"),
    @NamedQuery(name = "Clothfabrictb.findByClothFabricId", query = "SELECT c FROM Clothfabrictb c WHERE c.clothFabricId = :clothFabricId"),
    @NamedQuery(name = "Clothfabrictb.findByFabric", query = "SELECT c FROM Clothfabrictb c WHERE c.fabric = :fabric"),
    @NamedQuery(name = "Clothfabrictb.findByIsActive", query = "SELECT c FROM Clothfabrictb c WHERE c.isActive = :isActive")})
public class Clothfabrictb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ClothFabricId")
    private Integer clothFabricId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "Fabric")
    private String fabric;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsActive")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fabricId")
    private Collection<Productclothestb> productclothestbCollection;

    public Clothfabrictb() {
    }

    public Clothfabrictb(Integer clothFabricId) {
        this.clothFabricId = clothFabricId;
    }

    public Clothfabrictb(Integer clothFabricId, String fabric, boolean isActive) {
        this.clothFabricId = clothFabricId;
        this.fabric = fabric;
        this.isActive = isActive;
    }

    public Integer getClothFabricId() {
        return clothFabricId;
    }

    public void setClothFabricId(Integer clothFabricId) {
        this.clothFabricId = clothFabricId;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
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
        hash += (clothFabricId != null ? clothFabricId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clothfabrictb)) {
            return false;
        }
        Clothfabrictb other = (Clothfabrictb) object;
        if ((this.clothFabricId == null && other.clothFabricId != null) || (this.clothFabricId != null && !this.clothFabricId.equals(other.clothFabricId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Clothfabrictb[ clothFabricId=" + clothFabricId + " ]";
    }
    
}
