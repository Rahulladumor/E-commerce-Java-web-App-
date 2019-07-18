/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;


import entitiespkg.Categorytb;
import entitiespkg.Citytb;
import entitiespkg.Grouptb;
import entitiespkg.Paymenttb;
import entitiespkg.Productbasicinfotb;
import entitiespkg.Productclothestb;
import entitiespkg.Productelectronicstb;
import entitiespkg.Productsellertb;
import entitiespkg.Productwatchestb;
import entitiespkg.Sellerbankinfotb;
import entitiespkg.Sellergstinfo;
import entitiespkg.Sellerpickupaddresstb;
import entitiespkg.Sellerstoreinfotb;
import entitiespkg.Statetb;
import entitiespkg.Subcategorytb;
import entitiespkg.Usertb;
import java.util.Collection;
import javax.ejb.Local;
import javax.ejb.Local;

/**
 *
 * @author Rahul
 */
@Local
public interface AdminSessionBeanLocal {
     // Manage User
    void add_user(String username,String fname,String lname,String contact,String email,String pwd,String gender,String add,int ctid,int stid,int pincode);
    void update_profile(String username,String fname,String lname,String contact,String email,String gender,String add,int ctid,int stid,int pincode);
    void change_password(String username,String password);
    Collection<Usertb> getAdminList();
    Collection<Usertb> findUserByFirstName(String fname);
    Collection<Usertb> findUserByLastName(String lname);
    Collection<Grouptb> getUserByGroupname(String group_name);
    Usertb findUserByContactno(String contact);
    Usertb findUserByEmailid(String email);
    Usertb getbyusername(String username);
    
    //Maanage Group
    void add_grp(String uname,String grpname);
    
    //Manage Category
    void add_product_category(String category_name);
    void remove_category(int category_id);
    void update_category(int category_id,String category_name);
    Collection<Categorytb> getAllProductCategory();
    Categorytb getByCategoryId(int category_id);
    Categorytb getByCategoryName(String category_name);
    
    
     //Manage Subategory
    void add_product_subcategory(String subcategory,int categoryid);
    void remove_subcategory(int subcategory_id);
    void update_subcategory(int subcategory_id,String subcategory_name,int categoryid);
    Collection<Subcategorytb> getAllProductSubCategory();
    Subcategorytb getBySubcategoryId(int subcategory_id);
    Subcategorytb getBySubcategoryName(String subcategory_name);
    
    // Manage Product Of All the Sellers
    Collection<Productbasicinfotb> getAllProductBasicInfo();
    Collection<Productclothestb> getClothsList();
    Collection<Productclothestb> getClothsListById(int prod_id);
    Collection<Productelectronicstb> getElectronicsList();
    Collection<Productelectronicstb> getElectronicsListById(int prod_id);
    Collection<Productwatchestb> getWatchesList();
    Collection<Productwatchestb> getWatchesListById(int prod_id);
    Collection<Productsellertb> getAllProductSeller();
    void ChangeStatusOfProduct(int proid,int status);
    void Block_Product(String username);
    
   ///////// View Seller Information //
    Collection<Usertb> getAllSeller();
    Collection<Sellerstoreinfotb> getSellerStoreInfo(String username);
    Collection<Sellergstinfo> getSellerGSTInfo(String username);
    Collection<Sellerbankinfotb> getSellerBankInfo(String username);
    Collection<Sellerpickupaddresstb> getSellerPickupInfo(String username);
    
    //////// View Seller Information //
    Collection<Usertb> getAllCustomer();
    
    //Manage Payment
    Collection<Paymenttb> ViewPayment();
    void transfer_payment(String uname,double amount,int paymentid,int orderid);
    void chg_paymentStatus(int paymentid,boolean transfer_status);
   
    
    //City
     void add_city(String city_name,int state_id);
     void remove_city(int cityid);
     Collection<Citytb> getCityList();
      Collection<Citytb> getCityByStateId(int stateid);
    //State
     void add_state(String state_name);
     void remove_state(int stateid);
     Collection<Statetb> getStateList();
    
    
}
