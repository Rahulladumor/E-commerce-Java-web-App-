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
@Table(name = "statetb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Statetb.findAll", query = "SELECT s FROM Statetb s"),
    @NamedQuery(name = "Statetb.findByStateId", query = "SELECT s FROM Statetb s WHERE s.stateId = :stateId"),
    @NamedQuery(name = "Statetb.findByStateName", query = "SELECT s FROM Statetb s WHERE s.stateName = :stateName"),
    @NamedQuery(name = "Statetb.findByIsActive", query = "SELECT s FROM Statetb s WHERE s.isActive = :isActive")})
public class Statetb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "StateId")
    private Integer stateId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "StateName")
    private String stateName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsActive")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stateId")
    private Collection<Usertb> usertbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stateId")
    private Collection<Sellerbankinfotb> sellerbankinfotbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stateId")
    private Collection<Sellerpickupaddresstb> sellerpickupaddresstbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stateId")
    private Collection<Sellerstoreinfotb> sellerstoreinfotbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stateId")
    private Collection<Citytb> citytbCollection;

    public Statetb() {
    }

    public Statetb(Integer stateId) {
        this.stateId = stateId;
    }

    public Statetb(Integer stateId, String stateName, boolean isActive) {
        this.stateId = stateId;
        this.stateName = stateName;
        this.isActive = isActive;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
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

    @XmlTransient
    public Collection<Citytb> getCitytbCollection() {
        return citytbCollection;
    }

    public void setCitytbCollection(Collection<Citytb> citytbCollection) {
        this.citytbCollection = citytbCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stateId != null ? stateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statetb)) {
            return false;
        }
        Statetb other = (Statetb) object;
        if ((this.stateId == null && other.stateId != null) || (this.stateId != null && !this.stateId.equals(other.stateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Statetb[ stateId=" + stateId + " ]";
    }
    
}
