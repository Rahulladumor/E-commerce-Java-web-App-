/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import entitiespkg.Carttb;
import entitiespkg.Citytb;
import entitiespkg.Ordertb;
import entitiespkg.Paymenttb;
import entitiespkg.Productbasicinfotb;
import entitiespkg.Productclothestb;
import entitiespkg.Productelectronicstb;
import entitiespkg.Productwatchestb;
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
@Stateless
public class ClientSessionBean implements ClientSessionBeanLocal {

    @PersistenceContext(unitName = "IndiaMart-ejbPU")
    EntityManager em;
    
   

    @Override
    public Usertb show_Profile(String username) {
        Usertb user=(Usertb)em.find(Usertb.class, username);
         return user;  
    }

    @Override
    public Collection<Productbasicinfotb> view_ProductBasicInfo() {
        Collection<Productbasicinfotb> probasicInfoList = em.createNamedQuery("Productbasicinfotb.findAll").getResultList();
         return probasicInfoList;
    }

    @Override
    public Collection<Productclothestb> view_ProductClothes() {
        Collection<Productclothestb> proclothList = em.createNamedQuery("Productclothestb.findAll").getResultList();
          return proclothList;
    }

    @Override
    public Collection<Productelectronicstb> view_ProductElectronics() {
         Collection<Productelectronicstb> proelecList = em.createNamedQuery("Productelectronicstb.findAll").getResultList();
          return proelecList;
    }

    @Override
    public Collection<Productwatchestb> view_ProductWatches() {
         Collection<Productwatchestb> proWatchList = em.createNamedQuery("Productwatchestb.findAll").getResultList();
          return proWatchList;
    }

    @Override
    public void addToCart(int qty, int price, int total_price, int productid, String username)
    {
        Carttb cart = new Carttb();
        
        Productbasicinfotb probasicInfo = em.find(Productbasicinfotb.class, productid);
        Collection<Carttb> probasicInfoObj = probasicInfo.getCarttbCollection();
        
        Usertb user = em.find(Usertb.class, username);
        Collection<Carttb> cartObj = user.getCarttbCollection();
        
      cart.setQuantity(qty);
        cart.setPrice(price);
        cart.setTotalPrice(total_price);
        cart.setProductId(probasicInfo);
        cart.setUserName(user);
        cart.setIsactive(true);
        
        probasicInfoObj.add(cart);
        cartObj.add(cart);
      
        probasicInfo.setCarttbCollection(probasicInfoObj);
        user.setCarttbCollection(cartObj);
       
        em.merge(probasicInfo);
        em.merge(user);
       
        em.persist(cart);
    }

    @Override
    public void removeFromCart(int productid) {
        Carttb cart = em.find(Carttb.class, productid);
        
        Date date = new Date();
        
        cart.setIsactive(false);
        cart.setUpdateDate(date);
       
         em.merge(cart);
    }

    @Override
    public void placeOrder(int qty, double price, double total_price, String delivey_status, String bill_add, String ship_add, int ship_pin, int productid, String username)
    {
        Ordertb order = new Ordertb();
        
        Productbasicinfotb probasicInfo = em.find(Productbasicinfotb.class, productid);
        Collection<Ordertb> probasicInfoObj = probasicInfo.getOrdertbCollection();
        
        Usertb user = em.find(Usertb.class, username);
        Collection<Ordertb> userObj = user.getOrdertbCollection();
        
        Date date = new Date();
        
        order.setQuantity(qty);
        order.setPrice(price);
        order.setTotalPrice(total_price);
        order.setDeliveryStatus(delivey_status);
        order.setBillAddress(bill_add);
        order.setShippingAddress(ship_add);
        order.setShippingPinCode(ship_pin);
        order.setProductId(probasicInfo);
        order.setUserName(user);
        order.setCreateDate(date);
        order.setUpdateDate(date);
        order.setIsactive(true);
        
        probasicInfoObj.add(order);
        userObj.add(order);
       
        probasicInfo.setOrdertbCollection(probasicInfoObj);
        user.setOrdertbCollection(userObj);
       
        em.merge(probasicInfo);
        em.merge(user);
       
        em.persist(order);
    }

    @Override
    public void makePayment(double total_payment,String username,int orderid) {
        Paymenttb payment = new Paymenttb();
        
        Ordertb order = em.find(Ordertb.class, orderid);
        Collection<Paymenttb> orderObj = order.getPaymenttbCollection();
        
        Usertb user = em.find(Usertb.class, username);
        Collection<Paymenttb> userObj = user.getPaymenttbCollection();
        
       Date date = new Date();
        
        payment.setTotalPayment(total_payment);
        payment.setPaymentDate(date);
        payment.setUserName(user);
        payment.setOrderId(order);
        payment.setCreateDate(date);
        payment.setUpdateDate(date);
        payment.setIsactive(true);
        
        orderObj.add(payment);
        userObj.add(payment);
       
        order.setPaymenttbCollection(orderObj);
        user.setPaymenttbCollection(userObj);
       
        em.merge(orderObj);
        em.merge(user);
        
        em.persist(order);
    }

}
