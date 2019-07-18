/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitiespkg;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rahul
 */
@Entity
@Table(name = "grouptb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grouptb.findAll", query = "SELECT g FROM Grouptb g"),
    @NamedQuery(name = "Grouptb.findByGroupName", query = "SELECT g FROM Grouptb g WHERE g.grouptbPK.groupName = :groupName"),
    @NamedQuery(name = "Grouptb.findByUserName", query = "SELECT g FROM Grouptb g WHERE g.grouptbPK.userName = :userName"),
    @NamedQuery(name = "Grouptb.findByIsActive", query = "SELECT g FROM Grouptb g WHERE g.isActive = :isActive")})
public class Grouptb implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GrouptbPK grouptbPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsActive")
    private boolean isActive;
    @JoinColumn(name = "UserName", referencedColumnName = "UserName", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usertb usertb;

    public Grouptb() {
    }

    public Grouptb(GrouptbPK grouptbPK) {
        this.grouptbPK = grouptbPK;
    }

    public Grouptb(GrouptbPK grouptbPK, boolean isActive) {
        this.grouptbPK = grouptbPK;
        this.isActive = isActive;
    }

    public Grouptb(String groupName, String userName) {
        this.grouptbPK = new GrouptbPK(groupName, userName);
    }

    public GrouptbPK getGrouptbPK() {
        return grouptbPK;
    }

    public void setGrouptbPK(GrouptbPK grouptbPK) {
        this.grouptbPK = grouptbPK;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Usertb getUsertb() {
        return usertb;
    }

    public void setUsertb(Usertb usertb) {
        this.usertb = usertb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grouptbPK != null ? grouptbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grouptb)) {
            return false;
        }
        Grouptb other = (Grouptb) object;
        if ((this.grouptbPK == null && other.grouptbPK != null) || (this.grouptbPK != null && !this.grouptbPK.equals(other.grouptbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Grouptb[ grouptbPK=" + grouptbPK + " ]";
    }
    
}
