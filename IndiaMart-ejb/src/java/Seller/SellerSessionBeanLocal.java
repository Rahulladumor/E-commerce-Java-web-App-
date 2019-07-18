/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seller;

import entitiespkg.Clothfabrictb;
import entitiespkg.Clothsizetb;
import entitiespkg.Clothstitchtypetb;
import entitiespkg.Clothstyletb;
import entitiespkg.Clothworktb;
import entitiespkg.Colortb;
import entitiespkg.Ordertb;
import entitiespkg.Productbasicinfotb;
import entitiespkg.Productclothestb;
import entitiespkg.Productelectronicstb;
import entitiespkg.Productwatchestb;
import entitiespkg.Sellerpaymenttb;
import entitiespkg.Subcategorytb;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author Rahul
 */
@Local
public interface SellerSessionBeanLocal {
    
        //Seller Information
    void add_SellerStoreInfo(String store_name,String address,int cityid,int stateid,int pincode,String description,String logo,String document,String username);
    void add_SellerBankInfo(String acholder,String acno,String actype,String ifsc,String bankname,String branch,int cityid,int stateid,String username);
    void add_SellerGSTInfo(String GSTIN,String PAN,String GSTdoc,String username);
    void add_SellerPickupAddress(String address,int cityid,int stateid,int pincode,String username,String address_proof);
    
    
    void update_SellerStoreInfo(int sellerstoreinfo_id,String store_name,String address,int cityid,int stateid,int pincode,String description,String logo,String document,String username);
    void update_SellerBankInfo(int sellerbankid,String acholder,String acno,String actype,String ifsc,String bankname,String branch,int cityid,int stateid,String username);
    void update_SellerGSTInfo(int sellergstinfo_id,String GSTIN,String PAN,String GSTdoc,String username);
    void update_SellerPickupAddress(int sellerpickupaddress_id,String address,int cityid,int stateid,int pincode,String username,String address_proof);

    //Product Information
    void add_ProductBasicInfo(String product_name,int catid,int subcatid,double mrp,double selling_price,String description,String warrenty,int stock,String img,int pro_status,String username);
    void add_ProductClothesInfo(int sizeid,int colorid,int fabricid,int workid,int stichtype_id,int styleid,int product_id);
    void add_ProductElectronicsInfo(String modelno,String modelname,String brand,int colorid,boolean touch_screen,String ram,String memory_storage,String display_type,String processor,String os,int product_id);
    void add_ProductWatchInfo(String model_name,String brand,String display,String dial_shape,String starp_material,int colorid,int starp_colorid,int case_colorid,int dial_coloroid,int product_id);
    void addProductSeller(int productid,String username);
    
    void update_ProductBasicInfo(int prodbasicinfo_id,String product_name,int catid,int subcatid,double mrp,double selling_price,String description,String warrenty,int stock,String img);
    void update_ProductClothesInfo(int prodclothsinfo_id,int sizeid,int colorid,int fabricid,int workid,int stichtype_id,int styleid,int product_id);
    void update_ProductElectronicsInfo(int prodelecinfo_id,String modelno,String modelname,String brand,int colorid,boolean touch_screen,String ram,String memory_storage,String display_type,String processor,String os,int product_id);
    void update_ProductWatchInfo(int prodwatchinfo_id,String model_name,String diaplay,String brand,String dial_shape,String starp_material,int colorid,int starp_colorid,int case_colorid,int dial_coloroid,int product_id);
    void updateProductSeller(int prodseller_id,int productid,String username);
    
    void change_ProductStatus(int prouctid, String username,int prostatus);
    
    //View Product
    Collection<Productbasicinfotb> getAllProductBasicInfoList(String username);
    Productbasicinfotb getProductBasicInfoById(int productid);
    
    Collection<Productclothestb> getAllProductClothesInfo(String username);
    Collection<Productclothestb> getProductClothById(int productid);
    
    Collection<Productelectronicstb> getAllProductElectronicsInfo(String username);
    Collection<Productelectronicstb> getProductElecById(int productid);
    
    Collection<Productwatchestb> getAllProductWatchInfo(String username);
    Collection<Productwatchestb> getProductWatchById(int productid); 
    
     public Collection<Productbasicinfotb> getProductId(String proname,double mrp,double sellprice,int stock,String username);
             
   
    Collection<Colortb> getAllColor();
    Collection<Clothsizetb> getAllSize();
    Collection<Clothfabrictb> getAllFabric();
    Collection<Clothworktb> getAllWorktype();
    Collection<Clothstitchtypetb> getAllStichtype();
    Collection<Clothstyletb> getAllStyle();
    
    Collection<Productbasicinfotb> getProductByName(String product_name,String username);
    Collection<Productbasicinfotb> getProductByStatus(int status,String username);
    
    // Show Order
    Collection<Ordertb> getNewOrderList(String username);
    Collection<Ordertb> getManifastedOrderList(String username);
    void chg_OrderStatus(int orderid);
   
    //Show Payment
    Collection<Sellerpaymenttb> getSellerPayment(String username);
    
    //Category
    Collection<Subcategorytb> getSubcatByCatId(int catid);
    
}
