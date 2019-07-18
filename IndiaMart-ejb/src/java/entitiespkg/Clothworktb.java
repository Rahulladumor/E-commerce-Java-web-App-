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
@Table(name = "clothworktb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clothworktb.findAll", query = "SELECT c FROM Clothworktb c"),
    @NamedQuery(name = "Clothworktb.findByClothWorkId", query = "SELECT c FROM Clothworktb c WHERE c.clothWorkId = :clothWorkId"),
    @NamedQuery(name = "Clothworktb.findByWork", query = "SELECT c FROM Clothworktb c WHERE c.work = :work"),
    @NamedQuery(name = "Clothworktb.findByIsActive", query = "SELECT c FROM Clothworktb c WHERE c.isActive = :isActive")})
public class Clothworktb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ClothWorkId")
    private Integer clothWorkId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "Work")
    private String work;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsActive")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workId")
    private Collection<Productclothestb> productclothestbCollection;

    public Clothworktb() {
    }

    public Clothworktb(Integer clothWorkId) {
        this.clothWorkId = clothWorkId;
    }

    public Clothworktb(Integer clothWorkId, String work, boolean isActive) {
        this.clothWorkId = clothWorkId;
        this.work = work;
        this.isActive = isActive;
    }

    public Integer getClothWorkId() {
        return clothWorkId;
    }

    public void setClothWorkId(Integer clothWorkId) {
        this.clothWorkId = clothWorkId;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
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
        hash += (clothWorkId != null ? clothWorkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clothworktb)) {
            return false;
        }
        Clothworktb other = (Clothworktb) object;
        if ((this.clothWorkId == null && other.clothWorkId != null) || (this.clothWorkId != null && !this.clothWorkId.equals(other.clothWorkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Clothworktb[ clothWorkId=" + clothWorkId + " ]";
    }
    
}
