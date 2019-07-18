/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SellerBean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import Admin.AdminSessionBeanLocal;
import Seller.SellerSessionBeanLocal;
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
import entitiespkg.Productwatchestb;
import entitiespkg.Sellerbankinfotb;
import entitiespkg.Sellergstinfo;
import entitiespkg.Sellerpaymenttb;
import entitiespkg.Sellerpickupaddresstb;
import entitiespkg.Sellerstoreinfotb;
import entitiespkg.Subcategorytb;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import javax.ejb.EJB;
import javax.servlet.http.Part;

/**
 *
 * @author Rahul
 */
@Named(value = "sellerManagedBean")
@SessionScoped
public class sellerManagedBean implements Serializable {

    /**
     * Creates a new instance of sellerManagedBean
     */
     private String fname,lname,uname,contact,email,password,gender,address;
    private int cityid,stateid,pincode;

    private String storename,storeaddress,desc;
    private int store_id,store_cityid,store_stateid,store_pincode;
    
    private String acholder,acno,actype,ifsc,bankname,branch;
    private int bank_id,bank_cityid,bank_stateid;
    
    private String gst,pan;
    private int gstid;
    
    private String pkupadd;
    private int pkup_id,pkup_cityid,pkuup_stateid,pkup_pin;
   
    
    private String product_name,product_desc,warrenty;
    private int probasicinfoid,procat_id,probasic_subcatid,prostatus,stock;
    private double mrp,sellingprice;
    
    private int procloth_id,sizeid,cloth_colorid,fabricid,workid,stitchtypeid,styleid,cloth_prodid;
    
    private String elec_modelno,elec_modelname,elec_brand,ram,mem_storage,elec_disptype,processor,os;
    private int proelec_id,elec_colorid,elec_prodid;
    private boolean touch_screen;
    
    private String watch_modelname,watch_brand,watch_disp,watch_dial,starp_material;
    private int prowatch_id,watch_colorid,starp_colorid,case_colorid,dial_colorid,watch_proid;
    
    private Part logoImg,docImg,gstDoc,addDoc,proImg;
    private String logo,doc,gstt,add,productImage;
    @EJB
    SellerSessionBeanLocal sbl;
    
    @EJB
    AdminSessionBeanLocal abl;

    public Part getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(Part logoImg) {
        this.logoImg = logoImg;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Part getDocImg() {
        return docImg;
    }

    public void setDocImg(Part docImg) {
        this.docImg = docImg;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public Part getGstDoc() {
        return gstDoc;
    }

    public void setGstDoc(Part gstDoc) {
        this.gstDoc = gstDoc;
    }

    public String getGstt() {
        return gstt;
    }

    public void setGstt(String gstt) {
        this.gstt = gstt;
    }

    public Part getProImg() {
        return proImg;
    }

    public void setProImg(Part proImg) {
        this.proImg = proImg;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
    
    

    public Part getAddDoc() {
        return addDoc;
    }

    public void setAddDoc(Part addDoc) {
        this.addDoc = addDoc;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
    
    
    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public int getStateid() {
        return stateid;
    }

    public void setStateid(int stateid) {
        this.stateid = stateid;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public int getProbasicinfoid() {
        return probasicinfoid;
    }

    public void setProbasicinfoid(int probasicinfoid) {
        this.probasicinfoid = probasicinfoid;
    }

    public int getProcat_id() {
        return procat_id;
    }

    public void setProcat_id(int procat_id) {
        this.procat_id = procat_id;
    }

   

    public int getProbasic_subcatid() {
        return probasic_subcatid;
    }

    public void setProbasic_subcatid(int probasic_subcatid) {
        this.probasic_subcatid = probasic_subcatid;
    }

    public String getWarrenty() {
        return warrenty;
    }

    public void setWarrenty(String warrenty) {
        this.warrenty = warrenty;
    }

    public int getProstatus() {
        return prostatus;
    }

    public void setProstatus(int prostatus) {
        this.prostatus = prostatus;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getMrp() {
        return mrp;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public double getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(double sellingprice) {
        this.sellingprice = sellingprice;
    }

    
    
    
    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getStoreaddress() {
        return storeaddress;
    }

    public void setStoreaddress(String storeaddress) {
        this.storeaddress = storeaddress;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStore_cityid() {
        return store_cityid;
    }

    public void setStore_cityid(int store_cityid) {
        this.store_cityid = store_cityid;
    }

    public int getStore_stateid() {
        return store_stateid;
    }

    public void setStore_stateid(int store_stateid) {
        this.store_stateid = store_stateid;
    }

    public int getStore_pincode() {
        return store_pincode;
    }

    public void setStore_pincode(int store_pincode) {
        this.store_pincode = store_pincode;
    }

    public String getAcholder() {
        return acholder;
    }

    public void setAcholder(String acholder) {
        this.acholder = acholder;
    }

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public String getActype() {
        return actype;
    }

    public void setActype(String actype) {
        this.actype = actype;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    
    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getBank_cityid() {
        return bank_cityid;
    }

    public void setBank_cityid(int bank_cityid) {
        this.bank_cityid = bank_cityid;
    }

    public int getBank_stateid() {
        return bank_stateid;
    }

    public void setBank_stateid(int bank_stateid) {
        this.bank_stateid = bank_stateid;
    }

    public int getGstid() {
        return gstid;
    }

    public void setGstid(int gstid) {
        this.gstid = gstid;
    }

    
    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public int getPkup_id() {
        return pkup_id;
    }

    public void setPkup_id(int pkup_id) {
        this.pkup_id = pkup_id;
    }

    
    public String getPkupadd() {
        return pkupadd;
    }

    public void setPkupadd(String pkupadd) {
        this.pkupadd = pkupadd;
    }

    public int getPkup_cityid() {
        return pkup_cityid;
    }

    public void setPkup_cityid(int pkup_cityid) {
        this.pkup_cityid = pkup_cityid;
    }

    public int getPkuup_stateid() {
        return pkuup_stateid;
    }

    public void setPkuup_stateid(int pkuup_stateid) {
        this.pkuup_stateid = pkuup_stateid;
    }

    public int getPkup_pin() {
        return pkup_pin;
    }

    public void setPkup_pin(int pkup_pin) {
        this.pkup_pin = pkup_pin;
    }
    
   // Product Tables Getter & Setter

    public int getSizeid() {
        return sizeid;
    }

    public void setSizeid(int sizeid) {
        this.sizeid = sizeid;
    }

    public int getProcloth_id() {
        return procloth_id;
    }

    public void setProcloth_id(int procloth_id) {
        this.procloth_id = procloth_id;
    }

    
    public int getCloth_colorid() {
        return cloth_colorid;
    }

    public void setCloth_colorid(int cloth_colorid) {
        this.cloth_colorid = cloth_colorid;
    }

   

    public int getFabricid() {
        return fabricid;
    }

    public void setFabricid(int fabricid) {
        this.fabricid = fabricid;
    }

    public int getWorkid() {
        return workid;
    }

    public void setWorkid(int workid) {
        this.workid = workid;
    }

    public int getStitchtypeid() {
        return stitchtypeid;
    }

    public void setStitchtypeid(int stitchtypeid) {
        this.stitchtypeid = stitchtypeid;
    }

    public int getStyleid() {
        return styleid;
    }

    public void setStyleid(int styleid) {
        this.styleid = styleid;
    }

    public int getProelec_id() {
        return proelec_id;
    }

    public void setProelec_id(int proelec_id) {
        this.proelec_id = proelec_id;
    }

    public int getProwatch_id() {
        return prowatch_id;
    }

    public void setProwatch_id(int prowatch_id) {
        this.prowatch_id = prowatch_id;
    }

    
    public int getCloth_prodid() {
        return cloth_prodid;
    }

    public void setCloth_prodid(int cloth_prodid) {
        this.cloth_prodid = cloth_prodid;
    }

    public String getElec_modelno() {
        return elec_modelno;
    }

    public void setElec_modelno(String elec_modelno) {
        this.elec_modelno = elec_modelno;
    }

    public String getElec_modelname() {
        return elec_modelname;
    }

    public void setElec_modelname(String elec_modelname) {
        this.elec_modelname = elec_modelname;
    }

    public String getElec_brand() {
        return elec_brand;
    }

    public void setElec_brand(String elec_brand) {
        this.elec_brand = elec_brand;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMem_storage() {
        return mem_storage;
    }

    public void setMem_storage(String mem_storage) {
        this.mem_storage = mem_storage;
    }

    public String getElec_disptype() {
        return elec_disptype;
    }

    public void setElec_disptype(String elec_disptype) {
        this.elec_disptype = elec_disptype;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getElec_colorid() {
        return elec_colorid;
    }

    public void setElec_colorid(int elec_colorid) {
        this.elec_colorid = elec_colorid;
    }

    public int getElec_prodid() {
        return elec_prodid;
    }

    public void setElec_prodid(int elec_prodid) {
        this.elec_prodid = elec_prodid;
    }

    public boolean isTouch_screen() {
        return touch_screen;
    }

    public void setTouch_screen(boolean touch_screen) {
        this.touch_screen = touch_screen;
    }

    public String getWatch_modelname() {
        return watch_modelname;
    }

    public void setWatch_modelname(String watch_modelname) {
        this.watch_modelname = watch_modelname;
    }

    public String getWatch_brand() {
        return watch_brand;
    }

    public void setWatch_brand(String watch_brand) {
        this.watch_brand = watch_brand;
    }

    public String getWatch_disp() {
        return watch_disp;
    }

    public void setWatch_disp(String watch_disp) {
        this.watch_disp = watch_disp;
    }

    public String getWatch_dial() {
        return watch_dial;
    }

    public void setWatch_dial(String watch_dial) {
        this.watch_dial = watch_dial;
    }

    public String getStarp_material() {
        return starp_material;
    }

    public void setStarp_material(String starp_material) {
        this.starp_material = starp_material;
    }

    public int getWatch_colorid() {
        return watch_colorid;
    }

    public void setWatch_colorid(int watch_colorid) {
        this.watch_colorid = watch_colorid;
    }

    public int getStarp_colorid() {
        return starp_colorid;
    }

    public void setStarp_colorid(int starp_colorid) {
        this.starp_colorid = starp_colorid;
    }

    public int getCase_colorid() {
        return case_colorid;
    }

    public void setCase_colorid(int case_colorid) {
        this.case_colorid = case_colorid;
    }

    public int getDial_colorid() {
        return dial_colorid;
    }

    public void setDial_colorid(int dial_colorid) {
        this.dial_colorid = dial_colorid;
    }

    public int getWatch_proid() {
        return watch_proid;
    }

    public void setWatch_proid(int watch_proid) {
        this.watch_proid = watch_proid;
    }

    public AdminSessionBeanLocal getAbl() {
        return abl;
    }

    public void setAbl(AdminSessionBeanLocal abl) {
        this.abl = abl;
    }
    
    
    
    
    
    
           
   public String add_Seller(){
       try
       {
        abl.add_user(uname, fname, lname, contact, email, password, gender, address, cityid, stateid, pincode);
        abl.add_grp(uname, "Seller");
        return "seller_storeinfo.jsf";
       }
       catch(Exception e){
          System.out.println("Errorrrrr isss " + e.getMessage());
       }
       return null;
   }
   
      public String add_sellerStoreInfo(){
         
        try{
          InputStream input = logoImg.getInputStream();
           InputStream input1 = docImg.getInputStream();
           FileOutputStream output,output1;
              File f = new File("E:\\Java Project\\SucartProjectEE\\SucartProjectEE-war\\web\\resources\\imgs\\"+getFilename(logoImg));
                logo = logoImg.getSubmittedFileName();
                if(!f.exists()){
                    f.createNewFile();
                }      output = new FileOutputStream(f);
                byte[] buffer = new byte[5120];
                int length;
                while((length = input.read(buffer)) > 0)
                {
                    output.write(buffer,0,length);
                } 
                
                File f1 = new File("E:\\Java Project\\SucartProjectEE\\SucartProjectEE-war\\web\\resources\\docs\\"+getFilename(docImg));
                doc = docImg.getSubmittedFileName();
                if(!f1.exists()){
                    f1.createNewFile();
                }      output1 = new FileOutputStream(f1);
                byte[] buffer1 = new byte[5120];
                int length1;
                while((length1 = input1.read(buffer1)) > 0)
                {
                    output.write(buffer1,0,length1);
                } 
           
         output.close();
         output1.close();
         System.out.println("Hello " + uname);
         System.out.println("Photo " + logo);
         System.out.println("DOC " + doc);
         sbl.add_SellerStoreInfo(storename, storeaddress, store_cityid, store_stateid, store_pincode, desc, logo, "doc", uname);
         return "seller_bankinfo.jsf";
       }
       catch(IOException e){
           System.out.println("Username is "+uname);
          System.out.println("Errorrrrr isss " + e.getMessage());
      }
     return null;
   }
      
    private static String getFilename(Part part){
       for(String cd : part.getHeader("content-disposition").split(";"))
       {
           if(cd.trim().startsWith("filename"))
           {
              String filename = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
              return filename.substring(filename.lastIndexOf('/') + 1).substring(filename.lastIndexOf('\\') + 1);
           }
       }
       return null;
    }
    
      public String add_SellerBankInfo(){
       try{
           sbl.add_SellerBankInfo(acholder, acno, actype, ifsc, bankname, branch, bank_cityid, bank_stateid, uname);
           return "seller_gstinfo.jsf";
       }
       catch(Exception e){
          System.out.println("Errorrrrr isss " + e.getMessage());
      }
         return null;
      }
      
       public String add_SellerGSTInfo(){
       try{
           InputStream input = gstDoc.getInputStream();
           FileOutputStream output;
              File f = new File("E:\\Java Project\\SucartProjectEE\\SucartProjectEE-war\\web\\resources\\gst\\"+getFilename(gstDoc));
                gstt = gstDoc.getSubmittedFileName();
                if(!f.exists()){
                    f.createNewFile();
                }      output = new FileOutputStream(f);
                byte[] buffer = new byte[5120];
                int length;
                while((length = input.read(buffer)) > 0)
                {
                    output.write(buffer,0,length);
                } 
             output.close();
           sbl.add_SellerGSTInfo(gst, pan, gstt, uname);
           return "seller_pkupadd.jsf";
       }
       catch(IOException e){
          System.out.println("Errorrrrr isss " + e.getMessage());
        }
         return null;
      }
      
       public String add_SellerPkupInfo(){
       try{
           InputStream input = addDoc.getInputStream();
           FileOutputStream output;
              File f = new File("E:\\Java Project\\SucartProjectEE\\SucartProjectEE-war\\web\\resources\\pkup\\"+getFilename(addDoc));
                add = addDoc.getSubmittedFileName();
                if(!f.exists()){
                    f.createNewFile();
                }      output = new FileOutputStream(f);
                byte[] buffer = new byte[5120];
                int length;
                while((length = input.read(buffer)) > 0)
                {
                    output.write(buffer,0,length);
                } 
           sbl.add_SellerPickupAddress(pkupadd, pkup_cityid, pkuup_stateid, pkup_pin, uname, add);
           return "index.jsf";
       }
       catch(IOException e){
          System.out.println("Errorrrrr isss " + e.getMessage());
        }
         return null;
      }
       
     public String editSellerStoreInfo(String username){
         try{
              System.out.println("User Name is iss"+username);
      Collection<Sellerstoreinfotb> seller = abl.getSellerStoreInfo(username);
      for(Sellerstoreinfotb sellerstore : seller)
       {
           storename = sellerstore.getStoreName();
           store_id = sellerstore.getSellerStoreInfoId();
           storeaddress = sellerstore.getAddress();
           store_cityid = sellerstore.getCityId().getCityId();
           store_stateid = sellerstore.getStateId().getStateId();
           store_pincode = sellerstore.getPinCode();
           desc  = sellerstore.getDescription();
           logo = sellerstore.getLogo();
           doc = sellerstore.getDocumentPic();
           uname = sellerstore.getUserName().getUserName();
        }
         }
         catch(Exception e){
             System.out.println("Store Name is iss"+storename);
             System.out.println("Error iss"+e.getMessage());
         }
      return "view_storeinfo.jsf";
      
  }
   public String updateSellerStoreInfo(){
        System.out.println("Called");
       try{
         sbl.update_SellerStoreInfo(store_id, storename, storeaddress, store_cityid, store_stateid, store_pincode, desc, logo, doc, uname);
         System.out.println("Updatedd");
       }
       catch(Exception e){
           System.out.println("Store Name is iss "+storename);
           System.out.println("City "+store_cityid);
           System.out.println("State "+store_stateid);
           System.out.println("Logo  "+logo);
           System.out.println("Doc  "+doc);
           System.out.println("Uname  "+uname);
          System.out.println("Error is that" + e.getMessage());
       }
      return "view_storeinfo.jsf";
   }
     
     public String editSellerBankInfo(String username){
         try{
              System.out.println("User Name is iss"+username);
      Collection<Sellerbankinfotb> seller = abl.getSellerBankInfo(username);
      for(Sellerbankinfotb sellerbank : seller)
       {
          bank_id = sellerbank.getSellerBankId();
          acholder = sellerbank.getACHoldername();
          acno = sellerbank.getAcNo();
          actype = sellerbank.getAcType();
          ifsc = sellerbank.getIfsc();
          bankname = sellerbank.getBankName();
          branch = sellerbank.getBranch();
          bank_cityid = sellerbank.getCityId().getCityId();
          bank_stateid = sellerbank.getStateId().getStateId();
          uname = sellerbank.getUserName().getUserName();
          }
         }
         catch(Exception e){
            System.out.println("Error iss"+e.getMessage());
         }
      return "view_bankinfo.jsf";
     }
     
     public String updateSellerBankInfo(){
       try{
          sbl.update_SellerBankInfo(bank_id, acholder, acno, actype, ifsc, bankname, branch, bank_cityid, bank_stateid, uname);
       }
       catch(Exception e){
          System.out.println("Error is that" + e.getMessage());
       }
      return "view_bankinfo.jsf";
   }
     
   public String editSellerGSTInfo(String username){
       try{
           System.out.println("User Name is iss"+username);
      Collection<Sellergstinfo> seller = abl.getSellerGSTInfo(username);
      for(Sellergstinfo sellergst : seller)
       {
          gstid = sellergst.getSellerGSTId();
          gst = sellergst.getGstin();
          pan = sellergst.getPan();
          gstt  = sellergst.getGSTDocument();
          uname = sellergst.getUserName().getUserName();
        }
       }
         catch(Exception e){
            System.out.println("Error iss"+e.getMessage());
         }
      return "view_gstinfo.jsf";
      
  }   
     
   public String updateSellerGSTInfo(){
       try{
          sbl.update_SellerGSTInfo(gstid, gst, pan, gstt, uname);
       }
       catch(Exception e){
          System.out.println("Error is that" + e.getMessage());
       }
      return "view_gstinfo.jsf";
   }
   
   public String editSellerPkupInfo(String username){
       try{
           System.out.println("User Name is iss"+username);
      Collection<Sellerpickupaddresstb> seller = abl.getSellerPickupInfo(username);
      for(Sellerpickupaddresstb sellerpkup : seller)
       {
          pkup_id = sellerpkup.getSellerPickUpId();
          pkupadd = sellerpkup.getAddress();
          pkup_cityid = sellerpkup.getCityId().getCityId();
          pkuup_stateid = sellerpkup.getStateId().getStateId();
          pkup_pin = sellerpkup.getPincode();
          uname = sellerpkup.getUserName().getUserName();
          add = sellerpkup.getAddressProof();
        }
       }
         catch(Exception e){
            System.out.println("Error iss"+e.getMessage());
         }
      return "view_pkupinfo.jsf";
    }
   
   public String updateSellerPkupInfo(){
       try{
          sbl.update_SellerPickupAddress(pkup_id, pkupadd, pkup_cityid,pkuup_stateid, pkup_pin, uname, add);
       }
       catch(Exception e){
          System.out.println("Error is that" + e.getMessage());
       }
      return "view_pkupinfo.jsf";
   }
   
   public Collection<Sellerpaymenttb> getSellerPayment(String username){
       return sbl.getSellerPayment(username);
   }
   
   public Collection<Ordertb> getNewOrder(String username){
       return sbl.getNewOrderList(username);
   }
   
   public Collection<Ordertb> getManifastOrder(String username){
       return sbl.getManifastedOrderList(username);
   }
   
   public String chg_OrderStatus(int order_id){
       sbl.chg_OrderStatus(order_id);
       return "add_watchesinfo.jsf";
   }
   
   public Collection<Colortb> getallColor(){
       return sbl.getAllColor();
   }
   
   public Collection<Clothsizetb> getallSize(){
       return sbl.getAllSize();
   }
   
   public Collection<Clothfabrictb> getallFabric(){
       return sbl.getAllFabric();
   }
   
   public Collection<Clothworktb> getallWork(){
       return sbl.getAllWorktype();
   }
   
   public Collection<Clothstitchtypetb> getallStitchtype(){
       return sbl.getAllStichtype();
   }
   
   public Collection<Clothstyletb> getallStyle(){
       return sbl.getAllStyle();
   }
   
   public String add_ProductBasicInfo(String username){
       
       try{
           
          InputStream input = proImg.getInputStream();
          FileOutputStream output;
              File f = new File("D:\\MyProject\\IndiaMart.in\\IndiaMart-war\\web\\resources\\product_images"+getFilename(proImg));
                productImage = proImg.getSubmittedFileName();
                if(!f.exists()){
                    f.createNewFile();
                }      output = new FileOutputStream(f);
                byte[] buffer = new byte[5120];
                int length;
                while((length = input.read(buffer)) > 0)
                {
                    output.write(buffer,0,length);
                } 
                
               
         output.close();
         System.out.println("Image is " + productImage);
         
         sbl.add_ProductBasicInfo(product_name, procat_id, probasic_subcatid, mrp, sellingprice, product_desc, warrenty , stock,productImage, 1,username);
            
            Categorytb cat = abl.getByCategoryId(procat_id);
            String catname = cat.getCategoryName();
            
            Collection<Productbasicinfotb> product = sbl.getProductId(product_name, mrp, sellingprice, stock, username);
            for (Productbasicinfotb productbasicinfotb : product) {
               watch_proid = productbasicinfotb.getProductBasicInfoId();
               elec_prodid = productbasicinfotb.getProductBasicInfoId();
               cloth_prodid = productbasicinfotb.getProductBasicInfoId();
           }
            
             if(catname.equalsIgnoreCase("watches")) {
                return "add_watchesinfo.jsf";
            }
            else if(catname.equalsIgnoreCase("clothes")){
                return "add_clothesinfo.jsf";
            }
            else if(catname.equalsIgnoreCase("electronics")){
                return "add_electronicsinfo.jsf";
            }
        }
       catch(Exception e){
          System.out.println("Error is " + e.getMessage());
       }
       return null;
   }
   
   public String add_ProductWatchinfo(){
       sbl.add_ProductWatchInfo(watch_modelname, watch_brand, watch_disp, watch_dial, starp_material, watch_colorid, starp_colorid, case_colorid, dial_colorid, watch_proid);
       return "view_productbasicinfo.jsf";
   }
   
    public String add_ProductElecinfo(){
       sbl.add_ProductElectronicsInfo(elec_modelno, elec_modelname, elec_brand, elec_colorid, touch_screen, ram, mem_storage, elec_disptype, processor, os, elec_prodid);
       return "view_productbasicinfo.jsf";
   }
    
     public String add_ProductClothinfo(){
       sbl.add_ProductClothesInfo(sizeid, cloth_colorid, fabricid, workid, stitchtypeid, styleid, cloth_prodid);
       return "view_productbasicinfo.jsf";
   }
  
   public Collection<Productbasicinfotb> getproductBasicInfo(String username){
       return sbl.getAllProductBasicInfoList(username);
   }
   
   public String edit_ProductBasicInfo(int productid){
       Productbasicinfotb  product = sbl.getProductBasicInfoById(productid);
       probasicinfoid = product.getProductBasicInfoId();
       product_name = product.getProductName();
       procat_id = product.getCategoryId().getCategoryId();
       probasic_subcatid = product.getSubCategoryId().getSubCategoryId();
       mrp = product.getMrp();
       sellingprice = product.getSellingPrice();
       product_desc = product.getDescription();
       warrenty = product.getWarrenty();
       stock = product.getStock();
       productImage = product.getProductImage();
       uname = product.getUsername().getUserName();
       return "edit_productbasicinfo.jsf";
   }
   
   public String update_ProductBasicInfo(){
      
      try{ 
          InputStream input = proImg.getInputStream();
          FileOutputStream output;
              File f = new File("E:\\Java Project\\SucartProjectEE\\SucartProjectEE-war\\web\\resources\\ProductImages\\"+getFilename(proImg));
                productImage = proImg.getSubmittedFileName();
                
                if(!f.exists()){
                    f.createNewFile();
                }      output = new FileOutputStream(f);
                byte[] buffer = new byte[5120];
                int length;
                while((length = input.read(buffer)) > 0)
                {
                    output.write(buffer,0,length);
                } 
                
               
         output.close();
         System.out.println("Image is " + productImage);
        
         
       sbl.update_ProductBasicInfo(probasicinfoid, product_name, procat_id, probasic_subcatid, mrp, sellingprice, product_desc, warrenty, stock,productImage);
      
       Categorytb cat = abl.getByCategoryId(procat_id);
        String catname = cat.getCategoryName();
       
        System.out.println(catname);
        if(catname.equalsIgnoreCase("watches"))
        {
            Collection<Productwatchestb> watches = sbl.getProductWatchById(probasicinfoid);
       
            for (Productwatchestb watch : watches) {
                 prowatch_id = watch.getProductWatchesId();
                 watch_modelname = watch.getModelName();
                 watch_brand = watch.getBrand();
                 watch_disp = watch.getDisplay();
                 watch_dial = watch.getDialShape();
                 starp_material = watch.getStrapMaterial();
                 watch_colorid = watch.getColorId().getColorId();
                 starp_colorid = watch.getStrapColorId().getColorId();
                 case_colorid = watch.getCaseColorId().getColorId();
                 dial_colorid = watch.getDialColorId().getColorId();
                 watch_proid = watch.getProductId().getProductBasicInfoId();
                  return "edit_watchesinfo.jsf";
            }
       }
      else if(catname.equalsIgnoreCase("electronics"))
      {
        Collection<Productelectronicstb> electrics = sbl.getProductElecById(probasicinfoid);
          for (Productelectronicstb elec : electrics) {
              proelec_id = elec.getProductElectronicsId();
              elec_modelno = elec.getModelNo();
              elec_modelname = elec.getModelName();
              elec_brand = elec.getBrand();
              elec_colorid = elec.getColorId().getColorId();
              touch_screen = elec.getTouchScreen();
              ram = elec.getRam();
              mem_storage = elec.getMemoryStorage();
              elec_disptype = elec.getDisplayType();
              processor = elec.getProcessor();
              os = elec.getOs();
              elec_prodid = elec.getProductId().getProductBasicInfoId();
              return "edit_electronicsinfo.jsf";
          }
       }
      else if(catname.equalsIgnoreCase("clothes"))
      {
        Collection<Productclothestb> cloth = sbl.getProductClothById(probasicinfoid);
          for (Productclothestb cloths : cloth) {
               procloth_id = cloths.getProductClothesId();
       sizeid = cloths.getSizeId().getClothSizeId();
       cloth_colorid = cloths.getColorId().getColorId();
       fabricid = cloths.getFabricId().getClothFabricId();
       workid  = cloths.getWorkId().getClothWorkId();
       stitchtypeid = cloths.getStitchTypeId().getClothStichId();
       styleid = cloths.getStyleId().getClothStyleId();
       cloth_prodid = cloths.getProductId().getProductBasicInfoId();
       return "edit_clothesinfo.jsf";
          }
      }
      }
      catch(Exception e){
          System.out.println("Error is " + e.getMessage());
      }
      return null;
   }
   
   public String update_ProductWatchesinfo(){
       System.out.println("Pro Watch Id " +prowatch_id );
       System.out.println("Watch Model " +watch_modelname ); 
       System.out.println("Watch Disp " +watch_disp );
       System.out.println("Watch Brand " +watch_brand );
       System.out.println("Watch Dial " +watch_dial );
       System.out.println("Starp Metrial " +starp_material );
       System.out.println("Watch COlor Id " +watch_colorid );
       System.out.println("Starp Color " +starp_colorid ); 
       System.out.println("Case cOLOR Id " +case_colorid );
       System.out.println("Watch Brand " +watch_brand );
       System.out.println("Dial Color Id " +dial_colorid );
       System.out.println("Watch Pro Id " +watch_proid );
        
       sbl.update_ProductWatchInfo(prowatch_id, watch_modelname, watch_disp, watch_brand, watch_dial, starp_material, watch_colorid, starp_colorid, case_colorid, dial_colorid, watch_proid);
       return "view_productbasicinfo.jsf";
   }
 
   public String update_ProductClothsinfo(){
       sbl.update_ProductClothesInfo(procloth_id, sizeid,cloth_colorid, fabricid, workid, stitchtypeid, styleid, cloth_prodid);
       return "view_productbasicinfo.jsf";
   }
   
   public String update_ProductElecinfo(){
       sbl.update_ProductElectronicsInfo(proelec_id, elec_modelno, elec_modelname, elec_brand, elec_colorid, touch_screen, ram, mem_storage, elec_disptype, processor, os, elec_prodid);
       return "view_productbasicinfo.jsf";
   }
   
   private Collection<Citytb> allCity;
   private Collection<Subcategorytb> allSubcategory;
   
   public Collection<Citytb> getAllCity() {
        return allCity;
    }

    public Collection<Subcategorytb> getAllSubcategory() {
        return allSubcategory;
    }
   
   
   public Collection<Citytb> changeState(){
       allCity = abl.getCityByStateId(stateid);
       return allCity;
   }
   
    public Collection<Citytb> bankchangeState(){
       allCity = abl.getCityByStateId(bank_stateid);
       return allCity;
   }
   public Collection<Citytb> pkupchangeState(){
       allCity = abl.getCityByStateId(pkuup_stateid);
       return allCity;
   }
    public Collection<Citytb> storechangeState(){
       allCity = abl.getCityByStateId(store_stateid);
       return allCity;
   }
   
   public Collection<Subcategorytb> changeCategory(){
       allSubcategory = sbl.getSubcatByCatId(procat_id);
       return allSubcategory;
   }
    
    public sellerManagedBean() {
    }
    
}
