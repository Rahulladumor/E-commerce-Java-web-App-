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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "citytb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Citytb.findAll", query = "SELECT c FROM Citytb c"),
    @NamedQuery(name = "Citytb.findByCityId", query = "SELECT c FROM Citytb c WHERE c.cityId = :cityId"),
    @NamedQuery(name = "Citytb.findByCityName", query = "SELECT c FROM Citytb c WHERE c.cityName = :cityName"),
    @NamedQuery(name = "Citytb.findByIsActive", query = "SELECT c FROM Citytb c WHERE c.isActive = :isActive")})
public class Citytb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CityId")
    private Integer cityId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CityName")
    private String cityName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsActive")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cityId")
    private Collection<Usertb> usertbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cityId")
    private Collection<Sellerbankinfotb> sellerbankinfotbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cityId")
    private Collection<Sellerpickupaddresstb> sellerpickupaddresstbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cityId")
    private Collection<Sellerstoreinfotb> sellerstoreinfotbCollection;
    @JoinColumn(name = "StateId", referencedColumnName = "StateId")
    @ManyToOne(optional = false)
    private Statetb stateId;

    public Citytb() {
    }

    public Citytb(Integer cityId) {
        this.cityId = cityId;
    }

    public Citytb(Integer cityId, String cityName, boolean isActive) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.isActive = isActive;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @XmlTransient
    public Collection<Usertb> getUsertbCollection() {
        return usertbCollection;
    }

    public void setUsertbCollection(Collection<Usertb> usertbCollection) {
        this.usertbCollection = usertbCollection;
    }

    @XmlTransient
    public Collection<Sellerbankinfotb> getSellerbankinfotbCollection() {
        return sellerbankinfotbCollection;
    }

    public void setSellerbankinfotbCollection(Collection<Sellerbankinfotb> sellerbankinfotbCollection) {
        this.sellerbankinfotbCollection = sellerbankinfotbCollection;
    }

    @XmlTransient
    public Collection<Sellerpickupaddresstb> getSellerpickupaddresstbCollection() {
        return sellerpickupaddresstbCollection;
    }

    public void setSellerpickupaddresstbCollection(Collection<Sellerpickupaddresstb> sellerpickupaddresstbCollection) {
        this.sellerpickupaddresstbCollection = sellerpickupaddresstbCollection;
    }

    @XmlTransient
    public Collection<Sellerstoreinfotb> getSellerstoreinfotbCollection() {
        return sellerstoreinfotbCollection;
    }

    public void setSellerstoreinfotbCollection(Collection<Sellerstoreinfotb> sellerstoreinfotbCollection) {
        this.sellerstoreinfotbCollection = sellerstoreinfotbCollection;
    }

    public Statetb getStateId() {
        return stateId;
    }

    public void setStateId(Statetb stateId) {
        this.stateId = stateId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cityId != null ? cityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Citytb)) {
            return false;
        }
        Citytb other = (Citytb) object;
        if ((this.cityId == null && other.cityId != null) || (this.cityId != null && !this.cityId.equals(other.cityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Citytb[ cityId=" + cityId + " ]";
    }
    
}
