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
@Table(name = "colortb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colortb.findAll", query = "SELECT c FROM Colortb c"),
    @NamedQuery(name = "Colortb.findByColorId", query = "SELECT c FROM Colortb c WHERE c.colorId = :colorId"),
    @NamedQuery(name = "Colortb.findByColor", query = "SELECT c FROM Colortb c WHERE c.color = :color"),
    @NamedQuery(name = "Colortb.findByIsActive", query = "SELECT c FROM Colortb c WHERE c.isActive = :isActive")})
public class Colortb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ColorId")
    private Integer colorId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Color")
    private String color;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsActive")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colorId")
    private Collection<Productwatchestb> productwatchestbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "strapColorId")
    private Collection<Productwatchestb> productwatchestbCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caseColorId")
    private Collection<Productwatchestb> productwatchestbCollection2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dialColorId")
    private Collection<Productwatchestb> productwatchestbCollection3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colorId")
    private Collection<Productclothestb> productclothestbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colorId")
    private Collection<Productelectronicstb> productelectronicstbCollection;

    public Colortb() {
    }

    public Colortb(Integer colorId) {
        this.colorId = colorId;
    }

    public Colortb(Integer colorId, String color, boolean isActive) {
        this.colorId = colorId;
        this.color = color;
        this.isActive = isActive;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @XmlTransient
    public Collection<Productwatchestb> getProductwatchestbCollection() {
        return productwatchestbCollection;
    }

    public void setProductwatchestbCollection(Collection<Productwatchestb> productwatchestbCollection) {
        this.productwatchestbCollection = productwatchestbCollection;
    }

    @XmlTransient
    public Collection<Productwatchestb> getProductwatchestbCollection1() {
        return productwatchestbCollection1;
    }

    public void setProductwatchestbCollection1(Collection<Productwatchestb> productwatchestbCollection1) {
        this.productwatchestbCollection1 = productwatchestbCollection1;
    }

    @XmlTransient
    public Collection<Productwatchestb> getProductwatchestbCollection2() {
        return productwatchestbCollection2;
    }

    public void setProductwatchestbCollection2(Collection<Productwatchestb> productwatchestbCollection2) {
        this.productwatchestbCollection2 = productwatchestbCollection2;
    }

    @XmlTransient
    public Collection<Productwatchestb> getProductwatchestbCollection3() {
        return productwatchestbCollection3;
    }

    public void setProductwatchestbCollection3(Collection<Productwatchestb> productwatchestbCollection3) {
        this.productwatchestbCollection3 = productwatchestbCollection3;
    }

    @XmlTransient
    public Collection<Productclothestb> getProductclothestbCollection() {
        return productclothestbCollection;
    }

    public void setProductclothestbCollection(Collection<Productclothestb> productclothestbCollection) {
        this.productclothestbCollection = productclothestbCollection;
    }

    @XmlTransient
    public Collection<Productelectronicstb> getProductelectronicstbCollection() {
        return productelectronicstbCollection;
    }

    public void setProductelectronicstbCollection(Collection<Productelectronicstb> productelectronicstbCollection) {
        this.productelectronicstbCollection = productelectronicstbCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (colorId != null ? colorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colortb)) {
            return false;
        }
        Colortb other = (Colortb) object;
        if ((this.colorId == null && other.colorId != null) || (this.colorId != null && !this.colorId.equals(other.colorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Colortb[ colorId=" + colorId + " ]";
    }
    
}
