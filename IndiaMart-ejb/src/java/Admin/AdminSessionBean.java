/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import entitiespkg.Categorytb;
import entitiespkg.Citytb;
import entitiespkg.Grouptb;
import entitiespkg.GrouptbPK;
import entitiespkg.Ordertb;
import entitiespkg.Paymenttb;
import entitiespkg.Productbasicinfotb;
import entitiespkg.Productclothestb;
import entitiespkg.Productelectronicstb;
import entitiespkg.Productsellertb;
import entitiespkg.Productwatchestb;
import entitiespkg.Sellerbankinfotb;
import entitiespkg.Sellergstinfo;
import entitiespkg.Sellerpaymenttb;
import entitiespkg.Sellerpickupaddresstb;
import entitiespkg.Sellerstoreinfotb;
import entitiespkg.Statetb;
import entitiespkg.Subcategorytb;
import entitiespkg.Usertb;
import java.util.Collection;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Rahul
 */
@Stateless(mappedName = "Admin/AdminSessionBean")
public class AdminSessionBean implements AdminSessionBeanLocal {
@PersistenceContext(unitName =  "IndiaMart-ejbPU")
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    EntityManager em;
     
    /////////////////////////// User Methods /////////////////////////
    @Override
    public void add_user(String username, String fname, String lname, String contact, String email, String pwd, String gender, String add, int ctid,int stid, int pincode) {
       
        Usertb user = new Usertb();
        
        Citytb ct = em.find(Citytb.class, ctid);
        Collection<Usertb> userObj = ct.getUsertbCollection();
        
        Statetb st = em.find(Statetb.class, stid);
        Collection<Usertb> stObj = st.getUsertbCollection();
        
        Date date = new Date();
        user.setUserName(username);
        user.setFirstName(fname);
        user.setLastName(lname);
        user.setContactNo(contact);
        user.setEmailId(email);
        user.setPassword(pwd);
        user.setGender(gender);
        user.setAddress(add);
        user.setDob(date);
        user.setCityId(ct);
        user.setStateId(st);
        user.setPincode(pincode);
        user.setCreateDate(date);
        user.setUpdateDate(date);
        user.setIsActive(true);
        
        userObj.add(user);
        ct.setUsertbCollection(userObj);
        em.merge(ct);
        
        stObj.add(user);
        st.setUsertbCollection(stObj);
        em.merge(st);
        
        em.persist(user);
    }

    @Override
    public void update_profile(String username, String fname, String lname, String contact, String email, String gender, String add, int ctid,int stid, int pincode) {
        Usertb user=  (Usertb)em.find(Usertb.class, username);
        
        Citytb ct = em.find(Citytb.class, ctid);
        Collection<Usertb> userObj = ct.getUsertbCollection();
        
        Statetb st = em.find(Statetb.class, stid);
        Collection<Usertb> stObj = st.getUsertbCollection();
        
        Date date = new Date();
        user.setUserName(username);
        user.setFirstName(fname);
        user.setLastName(lname);
        user.setContactNo(contact);
        user.setEmailId(email);
        user.setGender(gender);
        user.setAddress(add);
        user.setDob(date);
        user.setCityId(ct);
        user.setStateId(st);
        user.setPincode(pincode);
        user.setUpdateDate(date);
       
       userObj.add(user);
        ct.setUsertbCollection(userObj);
        em.merge(ct);
        
        stObj.add(user);
        st.setUsertbCollection(stObj);
        em.merge(st);
        
        em.merge(user);
    }

    @Override
    public void change_password(String username, String password) {
        Usertb u= (Usertb)em.find(Usertb.class, username);
        u.setPassword(password); 
        em.merge(u);
    }
    
    @Override
    public Collection<Usertb> getAdminList() {
       Collection<Usertb> userlist = em.createQuery("SELECT u FROM Usertb u , Grouptb g WHERE u.userName = g.grouptbPK.userName AND u.isActive=true AND g.grouptbPK.groupName='Admin'").getResultList();
        return userlist;
    }

    @Override
    public Collection<Usertb> findUserByFirstName(String fname) {
        Collection<Usertb> users=em.createNamedQuery("Usertb.findByFirsttName").setParameter("firstName", fname).getResultList();
        return users; 
    }

    @Override
    public Collection<Usertb> findUserByLastName(String lname) {
        Collection<Usertb> users=em.createNamedQuery("Usertb.findByLastName").setParameter("LastName", lname).getResultList();
        return users;
    }

    @Override
    public Collection<Grouptb> getUserByGroupname(String group_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usertb findUserByContactno(String contact) {
         Usertb user=(Usertb)em.find(Usertb.class, contact);
         return user;  
    }

    @Override
    public Usertb findUserByEmailid(String email) {
        Usertb user=(Usertb)em.find(Usertb.class, email);
        return user;      
    }

    @Override
    public Usertb getbyusername(String username) {
         Usertb user=(Usertb)em.find(Usertb.class, username);
         return user;  
    }

    /////////////////////////// Category Methods /////////////////////////
    @Override
    public void add_product_category(String category_name) {
        Categorytb cat = new Categorytb();
        
        Date date = new Date();
        cat.setCategoryName(category_name);
        cat.setCreateDate(date);
        cat.setUpdateDate(date);
        cat.setIsactive(true);
        
        em.persist(cat);
    }

    @Override
    public void remove_category(int category_id) {
        Categorytb cat = (Categorytb)em.find(Categorytb.class, category_id);
        Date date = new Date();
         
         Collection<Subcategorytb> subcatList = cat.getSubcategorytbCollection();
        for(Subcategorytb sc : subcatList){
            sc.setIsactive(false);
            em.merge(sc);
         }
         
      Collection<Productbasicinfotb> probasicinfo = cat.getProductbasicinfotbCollection();
       for(Productbasicinfotb product : probasicinfo){
            product.setIsactive(false);
            em.merge(product);
        }
         cat.setIsactive(false);
         cat.setUpdateDate(date);
         
       
         em.merge(cat);
         em.remove(cat);
    }

    @Override
    public void update_category(int category_id, String category_name) {
       Categorytb cat = (Categorytb)em.find(Categorytb.class, category_id);
       
        Date date = new Date();
        cat.setCategoryName(category_name);
        cat.setUpdateDate(date);
        cat.setIsactive(true);
        
        em.merge(cat);
    }
    //.setParameter("isActive", true)
    @Override
    public Collection<Categorytb> getAllProductCategory() {
        Collection<Categorytb> catList = (Collection<Categorytb>) em.createNamedQuery("Categorytb.findAll").getResultList();
        return catList;  
    }

    @Override
    public Categorytb getByCategoryId(int category_id) {
        Categorytb cat=(Categorytb) em.find(Categorytb.class, category_id);
        return cat; 
    }

    @Override
    public Categorytb getByCategoryName(String category_name) {
       Categorytb cat=(Categorytb) em.find(Categorytb.class, category_name);
        return cat; 
    }

    /////////////////////////// Subcategory Methods /////////////////////////
    @Override
    public void add_product_subcategory(String subcategory, int categoryid) {
       Subcategorytb subcat = new Subcategorytb();
       Date date = new Date();
       
       Categorytb cat = em.find(Categorytb.class, categoryid);
       Collection<Subcategorytb> subcatObj = cat.getSubcategorytbCollection();
      
       subcat.setSubCategoryName(subcategory);
       subcat.setCategoryId(cat);
       subcat.setCreateDate(date);
       subcat.setUpdateDate(date);
       subcat.setIsactive(true);
       
       subcatObj.add(subcat);
       cat.setSubcategorytbCollection(subcatObj);
       em.merge(cat);
       
       em.persist(subcat);
       
    }

    @Override
    public void remove_subcategory(int subcategory_id) {
       Subcategorytb subcat = em.find(Subcategorytb.class, subcategory_id);
       
        Date date = new Date();
        Collection<Productbasicinfotb> probasicinfo = subcat.getProductbasicinfotbCollection();
       for(Productbasicinfotb product : probasicinfo){
            product.setIsactive(false);
            em.merge(product);
        }
        
       
      
        subcat.setIsactive(false);
        subcat.setUpdateDate(date);
                
        em.merge(subcat);
        em.remove(subcat);
    }

    @Override
    public void update_subcategory(int subcategory_id, String subcategory_name, int categoryid) {
        Subcategorytb subcat = (Subcategorytb) em.find(Subcategorytb.class, subcategory_id);
       Date date = new Date();
       
       Categorytb cat = em.find(Categorytb.class, categoryid);
       Collection<Subcategorytb> subcatObj = cat.getSubcategorytbCollection();
       
       subcat.setSubCategoryName(subcategory_name);
       subcat.setCategoryId(cat);
       subcat.setUpdateDate(date);
       subcat.setIsactive(true);
       
       subcatObj.add(subcat);
       cat.setSubcategorytbCollection(subcatObj);
       em.merge(cat);
      
       em.merge(subcat);
    }
//.setParameter("isActive", true)
    @Override
    public Collection<Subcategorytb> getAllProductSubCategory() {
        Collection<Subcategorytb> subcatList = (Collection<Subcategorytb>) em.createNamedQuery("Subcategorytb.findAll").getResultList();
        return subcatList; 
    }

    @Override
    public Subcategorytb getBySubcategoryId(int subcategory_id) {
        Subcategorytb sucat=(Subcategorytb)em.find(Subcategorytb.class, subcategory_id);
         return sucat;   
    }

    @Override
    public Subcategorytb getBySubcategoryName(String subcategory_name) {
        Subcategorytb sucat=(Subcategorytb)em.find(Subcategorytb.class, subcategory_name);
         return sucat;   
    }

    /////////////////////////// Product Methods /////////////////////////
    //.setParameter("isActive", true)
    @Override
    public Collection<Productbasicinfotb> getAllProductBasicInfo() {
         Collection<Productbasicinfotb> probasicInfotList = (Collection<Productbasicinfotb>) em.createNamedQuery("Productbasicinfotb.findAll").getResultList();
         return probasicInfotList; 
    }

    @Override
    public Collection<Productclothestb> getClothsList() {
         Collection<Productclothestb> proClothsList = (Collection<Productclothestb>) em.createNamedQuery("Productclothestb.findAll").getResultList();
         return proClothsList;  
    }

    @Override
    public Collection<Productelectronicstb> getElectronicsList() {
        Collection<Productelectronicstb> proEleList = (Collection<Productelectronicstb>) em.createNamedQuery("Productelectronicstb.findAll").getResultList();
         return proEleList; 
    }

    @Override
    public Collection<Productwatchestb> getWatchesList() {
         Collection<Productwatchestb> proWatchList = (Collection<Productwatchestb>) em.createNamedQuery("Productwatchestb.findAll").getResultList();
         return proWatchList; 
    }
    
    @Override
    public void ChangeStatusOfProduct(int proid,int status) {
         Productbasicinfotb proinfo = (Productbasicinfotb) em.find(Productbasicinfotb.class, proid);
         
         Date date = new Date();
         proinfo.setProductStatus(status);
         proinfo.setUpdateDate(date);
        
         em.merge(proinfo);
    }
    
   
    @Override
    public Collection<Productsellertb> getAllProductSeller() {
         Collection<Productsellertb> prosellerList = (Collection<Productsellertb>) em.createNamedQuery("Productsellertb.findAll").getResultList();
         return prosellerList; 
    }

    /////////////////////////// Paument Methods /////////////////////////
    @Override
    public Collection<Paymenttb> ViewPayment() {
        Collection<Paymenttb> paymentList = (Collection<Paymenttb>) em.createNamedQuery("Paymenttb.findAll").setParameter("isActive", true).getResultList();
         return paymentList; 
    }

   @Override
    public void transfer_payment(String uname, double amount, int paymentid, int orderid) {
        Sellerpaymenttb payment = new Sellerpaymenttb();
        
        Usertb user = em.find(Usertb.class, uname);
        Collection<Sellerpaymenttb> userObj = user.getSellerpaymenttbCollection();
        
        Paymenttb pmt = em.find(Paymenttb.class, paymentid);
        Collection<Sellerpaymenttb> pmtObj = pmt.getSellerpaymenttbCollection();
        
        Ordertb order = em.find(Ordertb.class, orderid);
        Collection<Sellerpaymenttb> orderObj = order.getSellerpaymenttbCollection();
        
        Date date = new Date();
        payment.setSellerUsername(user);
        payment.setAmount(amount);
        payment.setPaymentId(pmt);
        payment.setOrderId(order);
        payment.setDate(date);
        
        userObj.add(payment);
        user.setSellerpaymenttbCollection(userObj);
        em.merge(user);
        
        pmtObj.add(payment);
        pmt.setSellerpaymenttbCollection(pmtObj);
        em.merge(pmt);
        
        orderObj.add(payment);
        order.setSellerpaymenttbCollection(orderObj);
        em.merge(order);
        
        em.persist(payment);
    }

     @Override
    public void chg_paymentStatus(int paymentid, boolean transfer_status) {
        Paymenttb payment = em.find(Paymenttb.class, paymentid);
        payment.setTransferStatus(transfer_status);
        em.merge(payment);
    }
    /////////////////////////// City Methods /////////////////////////
    @Override
    public void add_city(String city_name, int state_id) {
        Citytb ct = new Citytb();
        
        Statetb st = em.find(Statetb.class,state_id);
        Collection<Citytb> stObj = st.getCitytbCollection();
        
        ct.setCityName(city_name);
        ct.setStateId(st);
        ct.setIsActive(true);
        
        stObj.add(ct);
        st.setCitytbCollection(stObj);
        em.merge(st);
        
        em.persist(ct);
    }

    @Override
    public Collection<Citytb> getCityList() {
         Collection<Citytb> ctlist = em.createNamedQuery("Citytb.findAll").getResultList();
          return ctlist;
    }
    
    @Override
    public void remove_city(int cityid) {
        Citytb city = (Citytb)em.find(Citytb.class, cityid);
        Date date = new Date();
        Collection<Sellerbankinfotb> sellerbank = city.getSellerbankinfotbCollection();
        for(Sellerbankinfotb sbank : sellerbank){
            sbank.setIsactive(false);
            sbank.setUpdateDate(date);
            em.merge(sbank);
        }
        
        Collection<Sellerpickupaddresstb> sellerpickup = city.getSellerpickupaddresstbCollection();
        for(Sellerpickupaddresstb spickup : sellerpickup){
            spickup.setIsactive(false);
            spickup.setUpdateDate(date);
            em.merge(spickup);
        }
        
        Collection<Sellerstoreinfotb> sellerstore = city.getSellerstoreinfotbCollection();
        for(Sellerstoreinfotb sstore : sellerstore){
            sstore.setIsactive(false);
            sstore.setUpdateDate(date);
            em.merge(sstore);
        }
        
        Collection<Usertb> usertb = city.getUsertbCollection();
        for(Usertb usr : usertb){
           // usr.setIsactive(false);
           // usr.setUpdateDate(date);
            em.merge(usr);
        }
        
        city.setIsActive(false);
        em.merge(city);
    }

    ////////////////////////////// State Methods ///////////////////////////////
   @Override
    public void add_state(String state_name) {
        Statetb st = new Statetb();
        st.setStateName(state_name);
        st.setIsActive(true);
        em.persist(st);
     }

    @Override
    public Collection<Statetb> getStateList() {
         Collection<Statetb> stlist = em.createNamedQuery("Statetb.findAll").getResultList();
         return stlist;
    }
    
    @Override
    public void remove_state(int stateid) {
        Statetb state = (Statetb)em.find(Statetb.class, stateid);
        Collection<Citytb> cities = state.getCitytbCollection();
      
        for(Citytb ct : cities){
             ct.setIsActive(false);
             em.merge(ct);
        }
        state.setIsActive(false);
        em.merge(state);    
    }

   ///////////// Seller Store Information Data /////////////////

    @Override
    public Collection<Sellerstoreinfotb> getSellerStoreInfo(String username) {
          return em.createQuery("SELECT s FROM Sellerstoreinfotb s WHERE s.userName.userName = ?1").setParameter(1, username).getResultList(); 
    }

    @Override
    public Collection<Sellergstinfo> getSellerGSTInfo(String username) {
         return em.createQuery("SELECT s FROM Sellergstinfo s WHERE s.userName.userName = ?1").setParameter(1, username).getResultList(); 
    }

    @Override
    public Collection<Sellerbankinfotb> getSellerBankInfo(String username) {
        return em.createQuery("SELECT s FROM Sellerbankinfotb s WHERE s.userName.userName = ?1").setParameter(1, username).getResultList(); 
    }

    @Override
    public Collection<Sellerpickupaddresstb> getSellerPickupInfo(String username) {
        return em.createQuery("SELECT s FROM Sellerpickupaddresstb s WHERE s.userName.userName = ?1").setParameter(1, username).getResultList(); 
    }
    
   @Override
    public Collection<Usertb> getAllSeller() {
       Collection<Usertb> userlist = em.createQuery("SELECT u FROM Usertb u , Grouptb g WHERE u.userName = g.grouptbPK.userName AND u.isActive=true AND g.grouptbPK.groupName='Seller'").getResultList();
        return userlist;
    }

    @Override
    public Collection<Usertb> getAllCustomer() {
        Collection<Usertb> userlist = em.createQuery("SELECT u FROM Usertb u , Grouptb g WHERE u.userName = g.grouptbPK.userName AND u.isActive=true AND g.grouptbPK.groupName='Client'").getResultList();
        return userlist;
    }

    // Group Methods
    @Override
    public void add_grp(String uname, String grpname) {
        
        Grouptb grp = new Grouptb();
        GrouptbPK grp_pk = new GrouptbPK();
        grp_pk.setUserName(uname);
        grp_pk.setGroupName(grpname);
        grp.setGrouptbPK(grp_pk);
        grp.setIsActive(true);
       
         em.persist(grp);
    }

    @Override
    public Collection<Citytb> getCityByStateId(int stateid) {
        Collection<Citytb> ctList = em.createNamedQuery("Citytb.findByStateId").setParameter("stateId", stateid).getResultList();
        return ctList;
    }

    @Override
    public Collection<Productwatchestb> getWatchesListById(int prod_id) {
       return em.createQuery("SELECT w FROM Productwatchestb w WHERE w.productId.productBasicInfoId = ?1").setParameter(1, prod_id).getResultList();
   }

    @Override
    public Collection<Productclothestb> getClothsListById(int prod_id) {
        return em.createQuery("SELECT c FROM Productclothestb c WHERE c.productId.productBasicInfoId = ?1").setParameter(1, prod_id).getResultList();
    }

    @Override
    public Collection<Productelectronicstb> getElectronicsListById(int prod_id) {
        return em.createQuery("SELECT e FROM Productelectronicstb e WHERE e.productId.productBasicInfoId = ?1").setParameter(1, prod_id).getResultList();
    }

    @Override
    public void Block_Product(String username) {
       em.createQuery("UPDATE Productbasicinfotb p set p.productStatus = 0 WHERE p.username.userName = ?1").setParameter(1, username).executeUpdate();
    }

    public void persist(Object object) {
        em.persist(object);
    }
}
