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
@Table(name = "usertb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usertb.findAll", query = "SELECT u FROM Usertb u"),
    @NamedQuery(name = "Usertb.findByUserName", query = "SELECT u FROM Usertb u WHERE u.userName = :userName"),
    @NamedQuery(name = "Usertb.findByFirstName", query = "SELECT u FROM Usertb u WHERE u.firstName = :firstName"),
    @NamedQuery(name = "Usertb.findByLastName", query = "SELECT u FROM Usertb u WHERE u.lastName = :lastName"),
    @NamedQuery(name = "Usertb.findByContactNo", query = "SELECT u FROM Usertb u WHERE u.contactNo = :contactNo"),
    @NamedQuery(name = "Usertb.findByEmailId", query = "SELECT u FROM Usertb u WHERE u.emailId = :emailId"),
    @NamedQuery(name = "Usertb.findByPassword", query = "SELECT u FROM Usertb u WHERE u.password = :password"),
    @NamedQuery(name = "Usertb.findByDob", query = "SELECT u FROM Usertb u WHERE u.dob = :dob"),
    @NamedQuery(name = "Usertb.findByGender", query = "SELECT u FROM Usertb u WHERE u.gender = :gender"),
    @NamedQuery(name = "Usertb.findByAddress", query = "SELECT u FROM Usertb u WHERE u.address = :address"),
    @NamedQuery(name = "Usertb.findByPincode", query = "SELECT u FROM Usertb u WHERE u.pincode = :pincode"),
    @NamedQuery(name = "Usertb.findByCreateDate", query = "SELECT u FROM Usertb u WHERE u.createDate = :createDate"),
    @NamedQuery(name = "Usertb.findByUpdateDate", query = "SELECT u FROM Usertb u WHERE u.updateDate = :updateDate"),
    @NamedQuery(name = "Usertb.findByIsActive", query = "SELECT u FROM Usertb u WHERE u.isActive = :isActive")})
public class Usertb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "FirstName")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "LastName")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ContactNo")
    private String contactNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "EmailId")
    private String emailId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DOB")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Pincode")
    private int pincode;
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
    @Column(name = "IsActive")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sellerUsername")
    private Collection<Sellerpaymenttb> sellerpaymenttbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usertb")
    private Collection<Grouptb> grouptbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userName")
    private Collection<Productsellertb> productsellertbCollection;
    @JoinColumn(name = "CityId", referencedColumnName = "CityId")
    @ManyToOne(optional = false)
    private Citytb cityId;
    @JoinColumn(name = "StateId", referencedColumnName = "StateId")
    @ManyToOne(optional = false)
    private Statetb stateId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userName")
    private Collection<Sellerbankinfotb> sellerbankinfotbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userName")
    private Collection<Sellerpickupaddresstb> sellerpickupaddresstbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "username")
    private Collection<Productbasicinfotb> productbasicinfotbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userName")
    private Collection<Sellerstoreinfotb> sellerstoreinfotbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userName")
    private Collection<Paymenttb> paymenttbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userName")
    private Collection<Ordertb> ordertbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userName")
    private Collection<Carttb> carttbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userName")
    private Collection<Sellergstinfo> sellergstinfoCollection;

    public Usertb() {
    }

    public Usertb(String userName) {
        this.userName = userName;
    }

    public Usertb(String userName, String firstName, String lastName, String contactNo, String emailId, String password, Date dob, String gender, String address, int pincode, Date createDate, Date updateDate, boolean isActive) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
        this.emailId = emailId;
        this.password = password;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.pincode = pincode;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isActive = isActive;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
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

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @XmlTransient
    public Collection<Sellerpaymenttb> getSellerpaymenttbCollection() {
        return sellerpaymenttbCollection;
    }

    public void setSellerpaymenttbCollection(Collection<Sellerpaymenttb> sellerpaymenttbCollection) {
        this.sellerpaymenttbCollection = sellerpaymenttbCollection;
    }

    @XmlTransient
    public Collection<Grouptb> getGrouptbCollection() {
        return grouptbCollection;
    }

    public void setGrouptbCollection(Collection<Grouptb> grouptbCollection) {
        this.grouptbCollection = grouptbCollection;
    }

    @XmlTransient
    public Collection<Productsellertb> getProductsellertbCollection() {
        return productsellertbCollection;
    }

    public void setProductsellertbCollection(Collection<Productsellertb> productsellertbCollection) {
        this.productsellertbCollection = productsellertbCollection;
    }

    public Citytb getCityId() {
        return cityId;
    }

    public void setCityId(Citytb cityId) {
        this.cityId = cityId;
    }

    public Statetb getStateId() {
        return stateId;
    }

    public void setStateId(Statetb stateId) {
        this.stateId = stateId;
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
    public Collection<Productbasicinfotb> getProductbasicinfotbCollection() {
        return productbasicinfotbCollection;
    }

    public void setProductbasicinfotbCollection(Collection<Productbasicinfotb> productbasicinfotbCollection) {
        this.productbasicinfotbCollection = productbasicinfotbCollection;
    }

    @XmlTransient
    public Collection<Sellerstoreinfotb> getSellerstoreinfotbCollection() {
        return sellerstoreinfotbCollection;
    }

    public void setSellerstoreinfotbCollection(Collection<Sellerstoreinfotb> sellerstoreinfotbCollection) {
        this.sellerstoreinfotbCollection = sellerstoreinfotbCollection;
    }

    @XmlTransient
    public Collection<Paymenttb> getPaymenttbCollection() {
        return paymenttbCollection;
    }

    public void setPaymenttbCollection(Collection<Paymenttb> paymenttbCollection) {
        this.paymenttbCollection = paymenttbCollection;
    }

    @XmlTransient
    public Collection<Ordertb> getOrdertbCollection() {
        return ordertbCollection;
    }

    public void setOrdertbCollection(Collection<Ordertb> ordertbCollection) {
        this.ordertbCollection = ordertbCollection;
    }

    @XmlTransient
    public Collection<Carttb> getCarttbCollection() {
        return carttbCollection;
    }

    public void setCarttbCollection(Collection<Carttb> carttbCollection) {
        this.carttbCollection = carttbCollection;
    }

    @XmlTransient
    public Collection<Sellergstinfo> getSellergstinfoCollection() {
        return sellergstinfoCollection;
    }

    public void setSellergstinfoCollection(Collection<Sellergstinfo> sellergstinfoCollection) {
        this.sellergstinfoCollection = sellergstinfoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userName != null ? userName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usertb)) {
            return false;
        }
        Usertb other = (Usertb) object;
        if ((this.userName == null && other.userName != null) || (this.userName != null && !this.userName.equals(other.userName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiespkg.Usertb[ userName=" + userName + " ]";
    }
    
}
