/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminBean;

import Admin.AdminSessionBeanLocal;
import entitiespkg.Categorytb;
import entitiespkg.Citytb;
import entitiespkg.Paymenttb;
import entitiespkg.Productbasicinfotb;
import entitiespkg.Productclothestb;
import entitiespkg.Productelectronicstb;
import entitiespkg.Productwatchestb;
import entitiespkg.Sellerbankinfotb;
import entitiespkg.Sellergstinfo;
import entitiespkg.Sellerpickupaddresstb;
import entitiespkg.Sellerstoreinfotb;
import entitiespkg.Statetb;
import entitiespkg.Subcategorytb;
import entitiespkg.Usertb;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author Rahul
 */
@Named(value = "adminManagedBean")
@SessionScoped
public class adminManagedBean implements Serializable {

    /**
     * Creates a new instance of adminManagedBean
     */
      private String userName,firstName,lastName,contactNo,emailId,password,gender,address,catname,subcatname;
   private int cityId,stateId,pincode,category_id,subcat_id;
   private String data;
   private int data1;
   private Integer integer;

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }
   
   
   
   FacesContext fc = FacesContext.getCurrentInstance();
      Map<String,String> params = 
        fc.getExternalContext().getRequestParameterMap();
 
      
  public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }
   
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = "Rahul";
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

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getSubcat_id() {
        return subcat_id;
    }

    public void setSubcat_id(int subcat_id) {
        this.subcat_id = subcat_id;
    }

    public String getSubcatname() {
        return subcatname;
    }

    public void setSubcatname(String subcatname) {
        this.subcatname = subcatname;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

   @EJB
   AdminSessionBeanLocal abl;
   
   public String add_seller() {
       abl.add_user(userName, firstName, lastName, contactNo, emailId, password, gender, address, cityId, stateId,pincode);
       abl.add_grp(userName, "Seller");
       return "login.jsf";
   }
   
   public String add_admin(){
       abl.add_user(userName, firstName, lastName, contactNo, emailId, password, gender, address, cityId, stateId,pincode);
       abl.add_grp(userName, "Admin");
       return "view_admin.jsf";
   }
   
    public String add_category(){
       abl.add_product_category(catname);
        return "view_category.jsf";
    }
    
     public String remove_category(int catid){
       abl.remove_category(catid);
        return "view_category.jsf";
    }
    
    public String add_subcat(){
        abl.add_product_subcategory(subcatname,category_id);
        return "view_subcat.xhtml";
    }
    public String remove_subcategory(int subcatid){
       abl.remove_subcategory(subcatid);
        return "view_subcat.jsf";
    }
    
   public Collection<Statetb> getallState(){
       return abl.getStateList();
     
      }
   
  public Collection<Citytb> getCityByStateId(int stateid) {
      return abl.getCityByStateId(stateid);
  }
  
  public Collection<Citytb> getallCity(){
      return abl.getCityList();
  }
    
  public Collection<Usertb> getallAdminList(){
      return abl.getAdminList();
  }
  
  public Collection<Usertb> getallSellerList(){
      return abl.getAllSeller();
  }
  
   public Collection<Sellerstoreinfotb> getallsellerStoreInfo(String username){
       return abl.getSellerStoreInfo(username);
   }
   public Collection<Sellergstinfo> getSellerGSTInfo(String username) {
        return abl.getSellerGSTInfo(username);
    }
   public Collection<Sellerbankinfotb> getSellerBankInfo(String username) {
       return abl.getSellerBankInfo(username);
   }
  public Collection<Usertb> getallClientList(){
      return abl.getAllCustomer();
  }
 public Collection<Sellerpickupaddresstb> getSellerPickupInfo(String username) {
     return abl.getSellerPickupInfo(username);
 }  
 
  public Collection<Categorytb> getallCategoryList(){
      return abl.getAllProductCategory();
  }
  
   public Collection<Subcategorytb> getallSubCategoryList(){
      return abl.getAllProductSubCategory();
  }
  
    public Collection<Productbasicinfotb> getallProductBasicInfo(){
      return abl.getAllProductBasicInfo();
    }
    
    public String chg_Prostatus(int proid,int status){
        abl.ChangeStatusOfProduct(proid,status);
        return "view_productinfo.jsf";
    }
    
    public String block_Product(String username){
        abl.Block_Product(username);
        return "view_seller.jsf";
    }
    
  public Collection<Productwatchestb> getallWatchesInfo(){
      return abl.getWatchesList();
  }
  
  public Collection<Productwatchestb> getallWatchesInfoById(int proid){
       return abl.getWatchesListById(proid);
  }
  
  public Collection<Productclothestb> getallClothsInfo(){
      return abl.getClothsList();
  }
  
   public Collection<Productclothestb> getallClothsInfoById(int proid){
      return abl.getClothsListById(proid);
  }
  
  public Collection<Productelectronicstb> getallElectronicsInfo(){
      return abl.getElectronicsList();
  }
  
  public Collection<Productelectronicstb> getallElectronicsInfoById(int proid){
      return abl.getElectronicsListById(proid);
  }
  
  public Collection<Paymenttb> getpaymentInfo(){
      return abl.ViewPayment();
  }
  
   public void transfer_payment(String username,double amt,int paymentid,int orderid,boolean transfer_status){
      abl.transfer_payment(username,amt,paymentid,orderid);
     chg_paymentStatus(paymentid,transfer_status);
  }
  
   public String chg_paymentStatus(int paymentid,boolean transfer_status){
       abl.chg_paymentStatus(paymentid, transfer_status);
       return "view_payment.jsf";
   }
   
   public String editAdmin(String uname){
      Usertb user = abl.getbyusername(uname);
      firstName = user.getFirstName();
      lastName = user.getLastName();
      contactNo = user.getContactNo();
      emailId = user.getEmailId();
      gender = user.getGender();
      address = user.getAddress();
      stateId = user.getStateId().getStateId();
      cityId = user.getCityId().getCityId();
      pincode = user.getPincode();
      userName = user.getUserName();
      return "edit_admin.jsf";
      
  }
   
    public String editSeller(String uname){
      Usertb user = abl.getbyusername(uname);
      firstName = user.getFirstName();
      lastName = user.getLastName();
      contactNo = user.getContactNo();
      emailId = user.getEmailId();
      gender = user.getGender();
      address = user.getAddress();
      stateId = user.getStateId().getStateId();
      cityId = user.getCityId().getCityId();
      pincode = user.getPincode();
      userName = user.getUserName();
      return "view_profile.jsf";
      
  }
   public String updateAdmin(){
       try{
      abl.update_profile(userName, firstName, lastName, contactNo, emailId, gender, address, cityId,stateId, pincode);
       return "view_admin.jsf";
       }
       catch(Exception e){
       }
      return "view_admin.jsf";
  }
   
   public String editCategory(int catid){ 
      Categorytb categoty  = abl.getByCategoryId(catid);
      category_id = categoty.getCategoryId();
      catname = categoty.getCategoryName();
      return "edit_category.jsf";
      
  }
   
   public String updateCategory(){
      abl.update_category(category_id, catname);
      return "view_category.jsf";
  } 
   
   
    public String editSubCategory(int subcatid){
      Subcategorytb subcat  = abl.getBySubcategoryId(subcatid);
      subcat_id = subcat.getSubCategoryId();
      subcatname = subcat.getSubCategoryName();
      category_id = subcat.getCategoryId().getCategoryId();
      return "edit_subcat.jsf";
    }
   
   public String updateSubCategory(){
       try{
      abl.update_subcategory(subcat_id, subcatname, category_id);
       return "view_subcat.jsf";
       }
       catch(Exception e){
           System.out.println("Cat id " + category_id + "Cat name" + this.catname);
           System.out.println("UPdate Error is  " + e.getMessage());
       }
     return null;
  } 
   
   private Collection<Citytb> allCity;

    public Collection<Citytb> getAllCity() {
        return allCity;
    }
   
   
   public Collection<Citytb> changeState(){
       allCity = abl.getCityByStateId(stateId);
       return allCity;
   }
   
   public Collection<Categorytb> getAllCategory(){
       return abl.getAllProductCategory();
   }
   
   public Collection<Subcategorytb> getAllSubCategory(){
       return abl.getAllProductSubCategory();
   }
   
  public String redirect_page(){
     
      data =  params.get("catname");
      System.out.println("Cat Name is" + data);
     if(data.equalsIgnoreCase("watches"))
            return "view_watchinfo.jsf";
      else if(data.equalsIgnoreCase("electronics"))
          return "view_electroninsinfo.jsf";
      else if(data.equalsIgnoreCase("clothes"))
          return "view_clothsinfo.jsf";
        return null;
  }
  
  
   public void rd() {
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            ExternalContext externalContext = context.getExternalContext();
            String fname = "abc.pdf"; 
            externalContext.responseReset();
            externalContext.setResponseContentType("application/pdf");
            externalContext.setResponseHeader("Content-Disposition", "attachment;filename=" + fname);
 
            
            FileInputStream inputStream = new FileInputStream(new File("E:\\Java Project\\SucartProjectEE\\SucartProjectEE-war\\web\\resources\\imgs\\" + fname));
            OutputStream outputStream = externalContext.getResponseOutputStream();

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            inputStream.close();
            context.responseComplete();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
  
  public adminManagedBean() {
    }
   public void download() {
       System.out.println("Goo");
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            ExternalContext externalContext = context.getExternalContext();
            String fname = "abc.pdf"; 
            externalContext.responseReset();
            externalContext.setResponseContentType("application/pdf");
            externalContext.setResponseHeader("Content-Disposition", "attachment;filename=" + fname);
 
            
            FileInputStream inputStream = new FileInputStream(new File("E:\\Java Project\\SucartProjectEE\\SucartProjectEE-war\\web\\resources\\imgs\\" + fname));
            OutputStream outputStream = externalContext.getResponseOutputStream();

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            inputStream.close();
            context.responseComplete();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
}
