/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seller;

import entitiespkg.Categorytb;
import entitiespkg.Citytb;
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
@Stateless(mappedName = "Seller/SellerSessionBean")
public class SellerSessionBean implements SellerSessionBeanLocal {

    @PersistenceContext(unitName = "IndiaMart-ejbPU")
    EntityManager em;
    
    ////////////////////// Add Product Data //////////////////////
    @Override
    public void add_SellerStoreInfo(String store_name, String address, int cityid,int stateid, int pincode, String description, String logo, String document, String username) {
         Sellerstoreinfotb sellerinfo=new Sellerstoreinfotb();
        
         Citytb ct = em.find(Citytb.class, cityid);
         Collection<Sellerstoreinfotb> storeObj = ct.getSellerstoreinfotbCollection();
       
         Statetb st = em.find(Statetb.class, stateid);
         Collection<Sellerstoreinfotb> stateeObj = st.getSellerstoreinfotbCollection();
         
         Usertb user = em.find(Usertb.class, username);
         Collection<Sellerstoreinfotb> userObj = user.getSellerstoreinfotbCollection();
        
         Date date = new Date();
         
         sellerinfo.setStoreName(store_name);
         sellerinfo.setAddress(address);
         sellerinfo.setCityId(ct);
         sellerinfo.setStateId(st);
         sellerinfo.setPinCode(pincode);
         sellerinfo.setDescription(description);
         sellerinfo.setLogo(logo);
         sellerinfo.setDocumentPic(document);
         sellerinfo.setUserName(user);
         sellerinfo.setCreateDate(date);
         sellerinfo.setUpdateDate(date);
         sellerinfo.setIsactive(true);
         
         storeObj.add(sellerinfo);
         userObj.add(sellerinfo);
         stateeObj.add(sellerinfo);
         
         ct.setSellerstoreinfotbCollection(storeObj);
         st.setSellerstoreinfotbCollection(stateeObj);
         user.setSellerstoreinfotbCollection(userObj);
         
         em.merge(ct);
         em.merge(st);
         em.merge(user);
       
         em.persist(sellerinfo); 
    }

      @Override
     public void add_SellerBankInfo(String acholder, String acno, String actype, String ifsc, String bankname, String branch, int cityid, int stateid, String username) {
          Sellerbankinfotb bankInfo = new Sellerbankinfotb();
          
          Citytb ct = em.find(Citytb.class, cityid);
         Collection<Sellerbankinfotb> ctObj = ct.getSellerbankinfotbCollection();
       
         Statetb st = em.find(Statetb.class, stateid);
         Collection<Sellerbankinfotb> stateeObj = st.getSellerbankinfotbCollection();
         
         Usertb user = em.find(Usertb.class, username);
         Collection<Sellerbankinfotb> userObj = user.getSellerbankinfotbCollection();
         
         Date date = new Date();
         bankInfo.setACHoldername(acholder);
         bankInfo.setAcNo(acno);
         bankInfo.setAcType(actype);
         bankInfo.setIfsc(ifsc);
         bankInfo.setBankName(bankname);
         bankInfo.setBranch(branch);
         bankInfo.setCityId(ct);
         bankInfo.setStateId(st);
         bankInfo.setUserName(user);
         bankInfo.setCreateDate(date);
         bankInfo.setUpdateDate(date);
         bankInfo.setIsactive(true);
         
         ctObj.add(bankInfo);
         userObj.add(bankInfo);
         stateeObj.add(bankInfo);
         
         ct.setSellerbankinfotbCollection(ctObj);
         st.setSellerbankinfotbCollection(stateeObj);
         user.setSellerbankinfotbCollection(userObj);
         
         em.merge(ct);
         em.merge(st);
         em.merge(user);
       
         em.persist(bankInfo); 
    }

    
    @Override
    public void add_SellerGSTInfo(String GSTIN, String PAN, String GSTdoc, String username) {
        Sellergstinfo sellergst=new Sellergstinfo();
        
         Usertb user = em.find(Usertb.class, username);
         Collection<Sellergstinfo> userObj = user.getSellergstinfoCollection();
         
         Date date = new Date();
         
         sellergst.setGstin(GSTIN);
         sellergst.setPan(PAN);
         sellergst.setGSTDocument(GSTdoc);
         sellergst.setUserName(user);
         sellergst.setCreateDate(date);
         sellergst.setUpdateDate(date);
         sellergst.setIsactive(true);
         
         userObj.add(sellergst);
         user.setSellergstinfoCollection(userObj);
         em.merge(user);
         
         em.persist(sellergst); 
    }

    @Override
    public void add_SellerPickupAddress(String address, int cityid, int stateid,int pincode, String username, String address_proof) {
        Sellerpickupaddresstb sellerpickup =new Sellerpickupaddresstb();
        
         Citytb ct = em.find(Citytb.class, cityid);
         Collection<Sellerpickupaddresstb> ctObj = ct.getSellerpickupaddresstbCollection();
        
         Statetb st = em.find(Statetb.class, stateid);
         Collection<Sellerpickupaddresstb> stateeObj = st.getSellerpickupaddresstbCollection();
         
         Usertb user = em.find(Usertb.class, username);
         Collection<Sellerpickupaddresstb> userObj = user.getSellerpickupaddresstbCollection();
         
        Date date = new Date();
         
        sellerpickup.setAddress(address);
        sellerpickup.setCityId(ct);
        sellerpickup.setStateId(st);
        sellerpickup.setPincode(pincode);
        sellerpickup.setUserName(user);
        sellerpickup.setAddressProof(address_proof);
        sellerpickup.setCreateDate(date);
        sellerpickup.setUpdateDate(date);
        sellerpickup.setIsactive(true);
         
        ctObj.add(sellerpickup);
        stateeObj.add(sellerpickup);
        userObj.add(sellerpickup);
       
        ct.setSellerpickupaddresstbCollection(ctObj);
        st.setSellerpickupaddresstbCollection(stateeObj);
        user.setSellerpickupaddresstbCollection(userObj);
        
        em.merge(ct);
        em.merge(st);
        em.merge(user);
       
        em.persist(sellerpickup); 
    }

   
    @Override
    public void update_SellerStoreInfo(int sellerstoreinfo_id, String store_name, String address, int cityid, int stateid,int pincode, String description, String logo, String document, String username)
    {
        Sellerstoreinfotb sellerinfo=em.find(Sellerstoreinfotb.class, sellerstoreinfo_id);
        
         Citytb ct = em.find(Citytb.class, cityid);
         Collection<Sellerstoreinfotb> storeObj = ct.getSellerstoreinfotbCollection();
       
         Statetb st = em.find(Statetb.class, stateid);
         Collection<Sellerpickupaddresstb> stateeObj = st.getSellerpickupaddresstbCollection();
         
         Usertb user = em.find(Usertb.class, username);
         Collection<Sellerstoreinfotb> userObj = user.getSellerstoreinfotbCollection();
         
         Date date = new Date();
         
         sellerinfo.setStoreName(store_name);
         sellerinfo.setAddress(address);
         sellerinfo.setCityId(ct);
         sellerinfo.setStateId(st);
         sellerinfo.setPinCode(pincode);
         sellerinfo.setDescription(description);
         sellerinfo.setLogo(logo);
         sellerinfo.setDocumentPic(document);
         sellerinfo.setUserName(user);
         sellerinfo.setUpdateDate(date);
         sellerinfo.setIsactive(true);
         
         storeObj.add(sellerinfo);
         userObj.add(sellerinfo);
         
         ct.setSellerstoreinfotbCollection(storeObj);
          st.setSellerpickupaddresstbCollection(stateeObj);
         user.setSellerstoreinfotbCollection(userObj);
         
         em.merge(ct);
         em.merge(st);
         em.merge(user);
        
         em.merge(sellerinfo);
    }

    @Override
    public void update_SellerBankInfo(int sellerbankid, String acholder, String acno, String actype, String ifsc, String bankname, String branch, int cityid, int stateid, String username) {
         Sellerbankinfotb bankInfo = em.find(Sellerbankinfotb.class, sellerbankid);
          
          Citytb ct = em.find(Citytb.class, cityid);
         Collection<Sellerbankinfotb> ctObj = ct.getSellerbankinfotbCollection();
       
         Statetb st = em.find(Statetb.class, stateid);
         Collection<Sellerbankinfotb> stateeObj = st.getSellerbankinfotbCollection();
         
         Usertb user = em.find(Usertb.class, username);
         Collection<Sellerbankinfotb> userObj = user.getSellerbankinfotbCollection();
         
         Date date = new Date();
         bankInfo.setACHoldername(acholder);
         bankInfo.setAcNo(acno);
         bankInfo.setAcType(actype);
         bankInfo.setIfsc(ifsc);
         bankInfo.setBankName(bankname);
         bankInfo.setBranch(branch);
         bankInfo.setCityId(ct);
         bankInfo.setStateId(st);
         bankInfo.setUserName(user);
         bankInfo.setUpdateDate(date);
         
         
         ctObj.add(bankInfo);
         userObj.add(bankInfo);
         stateeObj.add(bankInfo);
         
         ct.setSellerbankinfotbCollection(ctObj);
         st.setSellerbankinfotbCollection(stateeObj);
         user.setSellerbankinfotbCollection(userObj);
         
         em.merge(ct);
         em.merge(st);
         em.merge(user);
       
         em.merge(bankInfo); 
    }
    
    @Override
    public void update_SellerGSTInfo(int sellergstinfo_id, String GSTIN, String PAN, String GSTdoc, String username) {
         Sellergstinfo sellergst=em.find(Sellergstinfo.class, sellergstinfo_id);
        
         Usertb user = em.find(Usertb.class, username);
         Collection<Sellergstinfo> userObj = user.getSellergstinfoCollection();
        
        Date date = new Date();
         
         sellergst.setGstin(GSTIN);
         sellergst.setPan(PAN);
         sellergst.setGSTDocument(GSTdoc);
         sellergst.setUserName(user);
         sellergst.setUpdateDate(date);
         sellergst.setIsactive(true);
         
         userObj.add(sellergst);
         user.setSellergstinfoCollection(userObj);
         em.merge(user);
         
         em.merge(sellergst);
      }

    @Override
    public void update_SellerPickupAddress(int sellerpickupaddress_id, String address, int cityid,int stateid, int pincode, String username, String address_proof)
    {
        Sellerpickupaddresstb sellerpickup =em.find(Sellerpickupaddresstb.class, sellerpickupaddress_id);
        
         Citytb ct = em.find(Citytb.class, cityid);
         Collection<Sellerpickupaddresstb> ctObj = ct.getSellerpickupaddresstbCollection();
        
         Statetb st = em.find(Statetb.class, stateid);
         Collection<Sellerpickupaddresstb> stateeObj = st.getSellerpickupaddresstbCollection();
         
         Usertb user = em.find(Usertb.class, username);
         Collection<Sellerpickupaddresstb> userObj = user.getSellerpickupaddresstbCollection();
         
         Date date = new Date();
         
        sellerpickup.setAddress(address);
        sellerpickup.setCityId(ct);
        sellerpickup.setStateId(st);
        sellerpickup.setPincode(pincode);
        sellerpickup.setUserName(user);
        sellerpickup.setAddressProof(address_proof);
        sellerpickup.setCreateDate(date);
        sellerpickup.setUpdateDate(date);
        sellerpickup.setIsactive(true);
         
        ctObj.add(sellerpickup);
        stateeObj.add(sellerpickup);
        userObj.add(sellerpickup);
         
        ct.setSellerpickupaddresstbCollection(ctObj);
        st.setSellerpickupaddresstbCollection(stateeObj);
        user.setSellerpickupaddresstbCollection(userObj);
        
        em.merge(ct);
        em.merge(st);
        em.merge(user);
       
        em.merge(sellerpickup);
    }
    
    ////////////////////////// Product Methods ////////////////////////////

    @Override
    public void add_ProductBasicInfo(String product_name,int catid,int subcatid,double mrp, double selling_price, String description, String warrenty, int stock, String img,int pro_status,String username) 
    {
        Productbasicinfotb probasicinfo =new Productbasicinfotb();
        
         Categorytb cat = em.find(Categorytb.class,catid);
         Collection<Productbasicinfotb> catObj = cat.getProductbasicinfotbCollection();
         
         Subcategorytb subcat = em.find(Subcategorytb.class, subcatid);
         Collection<Productbasicinfotb> ctObj = subcat.getProductbasicinfotbCollection();
        
         Usertb user = em.find(Usertb.class, username);
         Collection<Productbasicinfotb> userObj = user.getProductbasicinfotbCollection();
         
         Date date = new Date();
         
         probasicinfo.setProductName(product_name);
         probasicinfo.setCategoryId(cat);
         probasicinfo.setSubCategoryId(subcat);
         probasicinfo.setMrp(mrp);
         probasicinfo.setSellingPrice(selling_price);
         probasicinfo.setDescription(description);
         probasicinfo.setWarrenty(warrenty);
         probasicinfo.setStock(stock);
         probasicinfo.setProductImage(img);
         probasicinfo.setProductStatus(pro_status);
         probasicinfo.setUsername(user);
         probasicinfo.setCreateDate(date);
         probasicinfo.setUpdateDate(date);
         probasicinfo.setIsactive(true);
         
         catObj.add(probasicinfo);
         ctObj.add(probasicinfo);
         userObj.add(probasicinfo);
        
         cat.setProductbasicinfotbCollection(catObj);
         subcat.setProductbasicinfotbCollection(ctObj);
         user.setProductbasicinfotbCollection(userObj);
         
         em.merge(cat);
         em.merge(subcat);
         em.merge(user);
         
         em.persist(probasicinfo);
         em.flush();
         probasicinfo.setProductBasicInfoId(24);
        }

    @Override
    public void add_ProductClothesInfo(int sizeid, int colorid, int fabricid, int workid, int stichtype_id, int styleid, int product_id) {
        Productclothestb procloth =new Productclothestb();
        
         Clothsizetb size = em.find(Clothsizetb.class, sizeid);
         Collection<Productclothestb> sizeObj = size.getProductclothestbCollection();
         
         Colortb color = em.find(Colortb.class, colorid);
         Collection<Productclothestb> colorObj = color.getProductclothestbCollection();
         
         Clothfabrictb fabric = em.find(Clothfabrictb.class, fabricid);
         Collection<Productclothestb> fabricObj = fabric.getProductclothestbCollection();
         
         Clothworktb work = em.find(Clothworktb.class, workid);
         Collection<Productclothestb> workObj = work.getProductclothestbCollection();
         
         Clothstitchtypetb stitch = em.find(Clothstitchtypetb.class, stichtype_id);
         Collection<Productclothestb> stitchObj = stitch.getProductclothestbCollection();
         
         Clothstyletb style = em.find(Clothstyletb.class, styleid);
         Collection<Productclothestb> styleObj = style.getProductclothestbCollection();
         
         Productbasicinfotb product = em.find(Productbasicinfotb.class, product_id);
         Collection<Productclothestb> productObj = product.getProductclothestbCollection();
         
       
         Date date = new Date();
         
         procloth.setSizeId(size);
         procloth.setColorId(color);
         procloth.setFabricId(fabric);
         procloth.setWorkId(work);
         procloth.setStitchTypeId(stitch);
         procloth.setStyleId(style);
         procloth.setProductId(product);
         procloth.setCreateDate(date);
         procloth.setUpdateDate(date);
         procloth.setIsactive(true);
         
        sizeObj.add(procloth);
        colorObj.add(procloth);
        fabricObj.add(procloth);
        workObj.add(procloth);
        stitchObj.add(procloth);
        styleObj.add(procloth);
        productObj.add(procloth);
        
        em.merge(size);
        em.merge(color);
        em.merge(fabric);
        em.merge(work);
        em.merge(stitch);
        em.merge(style);
        em.merge(product);
        
        em.persist(procloth);
    }

    @Override
    public void add_ProductElectronicsInfo(String modelno, String modelname, String brand, int colorid, boolean touch_screen, String ram, String memory_storage, String display_type, String processor, String os,int product_id) {
         Productelectronicstb proelec =new Productelectronicstb();
        
         Colortb color = em.find(Colortb.class, colorid);
         Collection<Productelectronicstb> colorObj = color.getProductelectronicstbCollection();
        
         Productbasicinfotb product = em.find(Productbasicinfotb.class, product_id);
         Collection<Productelectronicstb> productObj = product.getProductelectronicstbCollection();
        
         Date date = new Date();
         
         proelec.setModelNo(modelno);
         proelec.setModelName(modelname);
         proelec.setBrand(brand);
         proelec.setColorId(color);
         proelec.setTouchScreen(touch_screen);
         proelec.setRam(ram);
         proelec.setMemoryStorage(memory_storage);
         proelec.setDisplayType(display_type);
         proelec.setProcessor(processor);
         proelec.setOs(os);
         proelec.setProductId(product);
         proelec.setCreateDate(date);
         proelec.setUpdateDate(date);
         proelec.setIsactive(true);
         
        colorObj.add(proelec);
        productObj.add(proelec);
        
        color.setProductelectronicstbCollection(colorObj);
        product.setProductelectronicstbCollection(productObj);
        
        em.merge(color);
        em.merge(product);
        
     
        em.persist(proelec);
    }

    @Override
    public void add_ProductWatchInfo(String model_name, String brand,String display, String dial_shape, String starp_material, int colorid, int starp_colorid, int case_colorid, int dial_coloroid,int product_id)
    {
         Productwatchestb prowatch =new Productwatchestb();
        
         Colortb color = em.find(Colortb.class, colorid);
         Collection<Productwatchestb> colorObj = color.getProductwatchestbCollection();
         
         Colortb starpcolor = em.find(Colortb.class, starp_colorid);
         Collection<Productwatchestb> starpColorObj = starpcolor.getProductwatchestbCollection1();
         
         Colortb casecolor = em.find(Colortb.class, case_colorid);
         Collection<Productwatchestb> casecolorObj = casecolor.getProductwatchestbCollection2();
         
         Colortb dialcolor = em.find(Colortb.class, dial_coloroid);
         Collection<Productwatchestb> dialcolorObj = dialcolor.getProductwatchestbCollection3();
       
         Productbasicinfotb product = em.find(Productbasicinfotb.class, product_id);
         Collection<Productwatchestb> productObj = product.getProductwatchestbCollection();
         
         Date date = new Date();
         
         prowatch.setModelName(model_name);
         prowatch.setBrand(brand);
         prowatch.setDisplay(display);
         prowatch.setDialShape(dial_shape);
         prowatch.setStrapMaterial(starp_material);
         prowatch.setColorId(color);
         prowatch.setStrapColorId(starpcolor);
         prowatch.setCaseColorId(casecolor);
         prowatch.setDialColorId(dialcolor);
         prowatch.setProductId(product);
         prowatch.setCreateDate(date);
         prowatch.setUpdateDate(date);
         prowatch.setIsactive(true);
                 
        colorObj.add(prowatch);
        starpColorObj.add(prowatch);
        casecolorObj.add(prowatch);
        dialcolorObj.add(prowatch);
        productObj.add(prowatch);
       
        color.setProductwatchestbCollection(colorObj);
        starpcolor.setProductwatchestbCollection(starpColorObj);
        casecolor.setProductwatchestbCollection(casecolorObj);
        dialcolor.setProductwatchestbCollection(dialcolorObj);
        product.setProductwatchestbCollection(productObj);
        
        em.merge(color);
        em.merge(starpcolor);
        em.merge(casecolor);
        em.merge(dialcolor);
        em.merge(product);
        
        em.persist(prowatch);
    }

    
    @Override
    public void addProductSeller(int productid, String username) {
        Productsellertb proseller =new Productsellertb();
        
         Productbasicinfotb probasicInfo = em.find(Productbasicinfotb.class, productid);
         Collection<Productsellertb> probasicInfoObj = probasicInfo.getProductsellertbCollection();
         
         Usertb user = em.find(Usertb.class, username);
         Collection<Productsellertb> userObj = user.getProductsellertbCollection();
        
         Date date = new Date();
         
         proseller.setProductId(probasicInfo);
         proseller.setUserName(user);
         proseller.setCreateDate(date);
         proseller.setUpdateDate(date);
         proseller.setIsactive(true);
        
        probasicInfoObj.add(proseller);
        userObj.add(proseller);
       
        em.merge(probasicInfo);
        em.merge(user);
      
         em.persist(proseller);
    }

    /////////////////////////////// Update Product Data //////////////////
    @Override
    public void update_ProductBasicInfo(int prodbasicinfo_id,String product_name,int catid,int subcatid,double mrp,double selling_price,String description,String warrenty,int stock,String img)
    {
        Productbasicinfotb probasicinfo =em.find(Productbasicinfotb.class,prodbasicinfo_id);
        
         Subcategorytb subcat = em.find(Subcategorytb.class, subcatid);
         Collection<Productbasicinfotb> ctObj = subcat.getProductbasicinfotbCollection();
         
         Categorytb cat = em.find(Categorytb.class,catid);
         Collection<Productbasicinfotb> catObj = cat.getProductbasicinfotbCollection();
        
         Date date = new Date();
         
         probasicinfo.setProductName(product_name);
         probasicinfo.setCategoryId(cat);
         probasicinfo.setSubCategoryId(subcat);
         probasicinfo.setMrp(mrp);
         probasicinfo.setSellingPrice(selling_price);
         probasicinfo.setDescription(description);
         probasicinfo.setWarrenty(warrenty);
         probasicinfo.setStock(stock);
         probasicinfo.setProductImage(img);
         probasicinfo.setUpdateDate(date);
         probasicinfo.setIsactive(true);
         
         catObj.add(probasicinfo);
         ctObj.add(probasicinfo);
        
         cat.setProductbasicinfotbCollection(catObj);
         subcat.setProductbasicinfotbCollection(ctObj);
         
         em.merge(cat);
         em.merge(subcat);
        
         em.merge(probasicinfo);
    }

    @Override
    public void update_ProductClothesInfo(int prodclothsinfo_id, int sizeid, int colorid, int fabricid, int workid, int stichtype_id, int styleid, int product_id) {
        Productclothestb procloth =em.find(Productclothestb.class, prodclothsinfo_id);
        
         Clothsizetb size = em.find(Clothsizetb.class, sizeid);
         Collection<Productclothestb> sizeObj = size.getProductclothestbCollection();
         
         Colortb color = em.find(Colortb.class, colorid);
         Collection<Productclothestb> colorObj = color.getProductclothestbCollection();
         
         Clothfabrictb fabric = em.find(Clothfabrictb.class, fabricid);
         Collection<Productclothestb> fabricObj = fabric.getProductclothestbCollection();
         
         Clothworktb work = em.find(Clothworktb.class, workid);
         Collection<Productclothestb> workObj = work.getProductclothestbCollection();
         
         Clothstitchtypetb stitch = em.find(Clothstitchtypetb.class, stichtype_id);
         Collection<Productclothestb> stitchObj = stitch.getProductclothestbCollection();
         
         Clothstyletb style = em.find(Clothstyletb.class, styleid);
         Collection<Productclothestb> styleObj = style.getProductclothestbCollection();
         
         Productbasicinfotb product = em.find(Productbasicinfotb.class, product_id);
         Collection<Productclothestb> productObj = product.getProductclothestbCollection();
         
         Date date = new Date();
         
         procloth.setSizeId(size);
         procloth.setColorId(color);
         procloth.setFabricId(fabric);
         procloth.setWorkId(work);
         procloth.setStitchTypeId(stitch);
         procloth.setStyleId(style);
         procloth.setProductId(product);
         procloth.setUpdateDate(date);
         procloth.setIsactive(true);
         
        sizeObj.add(procloth);
        colorObj.add(procloth);
        fabricObj.add(procloth);
        workObj.add(procloth);
        stitchObj.add(procloth);
        styleObj.add(procloth);
        productObj.add(procloth);
      
        size.setProductclothestbCollection(sizeObj);
        color.setProductclothestbCollection(colorObj);
        fabric.setProductclothestbCollection(fabricObj);
        work.setProductclothestbCollection(workObj);
        stitch.setProductclothestbCollection(stitchObj);
        style.setProductclothestbCollection(styleObj);
        product.setProductclothestbCollection(productObj);
        
         em.merge(size);
        em.merge(color);
        em.merge(fabric);
        em.merge(work);
        em.merge(stitch);
        em.merge(style);
        em.merge(product);
        
         em.merge(procloth);
    }

    @Override
    public void update_ProductElectronicsInfo(int prodelecinfo_id, String modelno, String modelname, String brand, int colorid, boolean touch_screen, String ram, String memory_storage, String display_type, String processor, String os,int product_id)
    {
         Productelectronicstb proelec =em.find(Productelectronicstb.class, prodelecinfo_id);
                 
         Colortb color = em.find(Colortb.class, colorid);
         Collection<Productelectronicstb> colorObj = color.getProductelectronicstbCollection();
        
         Productbasicinfotb product = em.find(Productbasicinfotb.class, product_id);
         Collection<Productelectronicstb> productObj = product.getProductelectronicstbCollection();
         
         Date date = new Date();
         
         proelec.setModelNo(modelno);
         proelec.setModelName(modelname);
         proelec.setBrand(brand);
         proelec.setColorId(color);
         proelec.setTouchScreen(touch_screen);
         proelec.setRam(ram);
         proelec.setMemoryStorage(memory_storage);
         proelec.setDisplayType(display_type);
         proelec.setProcessor(processor);
         proelec.setOs(os);
         proelec.setProductId(product);
         proelec.setUpdateDate(date);
         proelec.setIsactive(true);
         
        colorObj.add(proelec);
        color.setProductelectronicstbCollection(colorObj);
        em.merge(color);
        
        productObj.add(proelec);
        product.setProductelectronicstbCollection(productObj);
        em.merge(product);
       
        em.merge(proelec);   
    }

    @Override
    public void update_ProductWatchInfo(int prodwatchinfo_id, String model_name, String brand,String display, String dial_shape, String starp_material, int colorid, int starp_colorid, int case_colorid, int dial_coloroid,int product_id) {
        Productwatchestb prowatch =em.find(Productwatchestb.class, prodwatchinfo_id);
        
         Colortb color = em.find(Colortb.class, colorid);
         Collection<Productwatchestb> colorObj = color.getProductwatchestbCollection();
         
         Colortb starpcolor = em.find(Colortb.class, starp_colorid);
         Collection<Productwatchestb> starpColorObj = starpcolor.getProductwatchestbCollection1();
         
         Colortb casecolor = em.find(Colortb.class, case_colorid);
         Collection<Productwatchestb> casecolorObj = casecolor.getProductwatchestbCollection2();
         
         Colortb dialcolor = em.find(Colortb.class, dial_coloroid);
         Collection<Productwatchestb> dialcolorObj = dialcolor.getProductwatchestbCollection3();
         
         Productbasicinfotb product = em.find(Productbasicinfotb.class, product_id);
         Collection<Productwatchestb> productObj = product.getProductwatchestbCollection();
         
         Date date = new Date();
         
         prowatch.setModelName(model_name);
         prowatch.setBrand(brand);
         prowatch.setDisplay(display);
         prowatch.setDialShape(dial_shape);
         prowatch.setStrapMaterial(starp_material);
         prowatch.setColorId(color);
         prowatch.setStrapColorId(starpcolor);
         prowatch.setCaseColorId(casecolor);
         prowatch.setDialColorId(dialcolor);
         prowatch.setProductId(product);
         prowatch.setUpdateDate(date);
         prowatch.setIsactive(true);
                 
        colorObj.add(prowatch);
        starpColorObj.add(prowatch);
        casecolorObj.add(prowatch);
        dialcolorObj.add(prowatch);
        productObj.add(prowatch);
         
        color.setProductwatchestbCollection(colorObj);
        starpcolor.setProductwatchestbCollection(starpColorObj);
        casecolor.setProductwatchestbCollection(casecolorObj);
        dialcolor.setProductwatchestbCollection(dialcolorObj);
        product.setProductwatchestbCollection(productObj);
        
        em.merge(color);
        em.merge(starpcolor);
        em.merge(casecolor);
        em.merge(dialcolor);
        em.merge(product);
        
        em.merge(prowatch);
    }

   

    @Override
    public void updateProductSeller(int prodseller_id,int productid,String username) {
        Productsellertb proseller =em.find(Productsellertb.class, prodseller_id);
        
         Productbasicinfotb probasicInfo = em.find(Productbasicinfotb.class, productid);
         Collection<Productsellertb> probasicInfoObj = probasicInfo.getProductsellertbCollection();
         
         Usertb user = em.find(Usertb.class, username);
         Collection<Productsellertb> userObj = user.getProductsellertbCollection();
         
         Date date = new Date();
         
         proseller.setProductId(probasicInfo);
         proseller.setUserName(user);
         proseller.setUpdateDate(date);
         proseller.setIsactive(true);
        
        probasicInfoObj.add(proseller);
        userObj.add(proseller);
        
        em.merge(probasicInfo);
        em.merge(user);
       
        em.persist(proseller);
    }

    @Override
    public void change_ProductStatus(int prouctid, String username,int prostatus) {
        Productbasicinfotb probasicinfo =em.find(Productbasicinfotb.class,prouctid);
        
         Usertb user = em.find(Usertb.class, username);
         Collection<Productbasicinfotb> userObj = user.getProductbasicinfotbCollection();
        
        
         Date date = new Date();
         
         probasicinfo.setProductStatus(prostatus);
         probasicinfo.setUpdateDate(date);
         probasicinfo.setIsactive(true);
         
         userObj.add(probasicinfo);
         user.setProductbasicinfotbCollection(userObj);
         em.merge(user);
        
         
         em.merge(probasicinfo);
    }

    
  //// GET Product Info
    
    @Override
    public Collection<Productbasicinfotb> getAllProductBasicInfoList(String username) {
        return em.createQuery("SELECT p FROM Productbasicinfotb p WHERE p.isactive=true AND p.username.userName = ?1").setParameter(1, username).getResultList();
    }

     @Override
    public Productbasicinfotb getProductBasicInfoById(int productid) {
        return em.find(Productbasicinfotb.class, productid);
    }
    
     @Override
    public Collection<Productclothestb> getProductClothById(int productid) {
         return em.createQuery("SELECT c FROM Productclothestb c WHERE c.productId.productBasicInfoId = ?1").setParameter(1, productid).getResultList();
    }

    @Override
    public Collection<Productelectronicstb> getProductElecById(int productid) {
       return em.createQuery("SELECT e FROM Productelectronicstb e WHERE e.productId.productBasicInfoId = ?1").setParameter(1, productid).getResultList();
    }

    @Override
    public Collection<Productwatchestb> getProductWatchById(int productid) {
        return em.createQuery("SELECT w FROM Productwatchestb w WHERE w.productId.productBasicInfoId = ?1").setParameter(1, productid).getResultList();
    }	 
    
    @Override
    public Collection<Productbasicinfotb> getProductId(String proname,double mrp,double sellprice,int stock,String username) {
        return em.createQuery("SELECT p FROM Productbasicinfotb p WHERE p.productName = ?1 AND p.mrp = ?2 AND p.sellingPrice = ?3 AND p.stock = ?4 AND p.username.userName = ?5").setParameter(1, proname).setParameter(2, mrp).setParameter(3, sellprice).setParameter(4, stock).setParameter(5, username).getResultList();
    }

    @Override
    public Collection<Productclothestb> getAllProductClothesInfo(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Productelectronicstb> getAllProductElectronicsInfo(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Productwatchestb> getAllProductWatchInfo(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    @Override
    public Collection<Clothsizetb> getAllSize() {
        return em.createNamedQuery("Clothsizetb.findAll").getResultList();
    }

    @Override
    public Collection<Clothfabrictb> getAllFabric() {
        return em.createNamedQuery("Clothfabrictb.findAll").getResultList();
    }

    @Override
    public Collection<Clothworktb> getAllWorktype() {
        return em.createNamedQuery("Clothworktb.findAll").getResultList();
    }

    @Override
    public Collection<Clothstitchtypetb> getAllStichtype() {
        return em.createNamedQuery("Clothstitchtypetb.findAll").getResultList();
    }

    @Override
    public Collection<Clothstyletb> getAllStyle() {
        return em.createNamedQuery("Clothstyletb.findAll").getResultList();
    }
    
    
    @Override
    public Collection<Colortb> getAllColor() {
        return em.createNamedQuery("Colortb.findAll").getResultList();
    }
    
    @Override
    public Collection<Productbasicinfotb> getProductByName(String product_name,String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Productbasicinfotb> getProductByStatus(int status, String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Ordertb> getNewOrderList(String username) {
        return em.createQuery("SELECT o FROM Ordertb o WHERE o.deliveryStatus = 'New' AND o.userName.userName = ?1").setParameter(1, username).getResultList();
    }

     @Override
    public Collection<Ordertb> getManifastedOrderList(String username) {
        return em.createQuery("SELECT o FROM Ordertb o WHERE o.deliveryStatus = 'Manifasted' AND o.userName.userName = ?1").setParameter(1, username).getResultList();
    }
    
    @Override
    public void chg_OrderStatus(int orderid) {
        Ordertb order = em.find(Ordertb.class, orderid);
        
        Date date = new Date();
        order.setDeliveryStatus("Manifasted");
        order.setUpdateDate(date);
        
        em.merge(order);
    }

    // Payment Data
    @Override
    public Collection<Sellerpaymenttb> getSellerPayment(String username) {
        try
        {
        return em.createQuery("SELECT s FROM Sellerpaymenttb s WHERE s.sellerUsername.userName = ?1").setParameter(1, username).getResultList();
        }
        catch(Exception e){
            System.out.println("Error is " + e.getMessage());
        }
        return null;
    }

    @Override
    public Collection<Subcategorytb> getSubcatByCatId(int catid) {
       return em.createNamedQuery("Subcategorytb.findByCategoryId").setParameter("categoryId", catid).getResultList();
    }

    
}
