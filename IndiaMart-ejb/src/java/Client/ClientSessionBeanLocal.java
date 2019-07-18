/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import javax.ejb.Local;
import entitiespkg.Productbasicinfotb;
import entitiespkg.Productclothestb;
import entitiespkg.Productelectronicstb;
import entitiespkg.Productwatchestb;
import entitiespkg.Usertb;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author Rahul
 */
@Local
public interface ClientSessionBeanLocal {
    
    Usertb show_Profile(String username);
    
    Collection<Productbasicinfotb> view_ProductBasicInfo();
    Collection<Productclothestb> view_ProductClothes();
    Collection<Productelectronicstb> view_ProductElectronics();
    Collection<Productwatchestb> view_ProductWatches();
    
   
    void addToCart(int qty,int price,int total_price,int productid,String username);
    void removeFromCart(int productid);
    
    void placeOrder(int qty, double price, double total_price, String delivey_status, String bill_add, String ship_add, int ship_pin, int productid, String username);
   
    
    void makePayment(double total_payment,String username,int orderid);
    
}
