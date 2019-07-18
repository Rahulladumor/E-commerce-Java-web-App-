package entitiespkg;

import entitiespkg.Paymenttb;
import entitiespkg.Productbasicinfotb;
import entitiespkg.Sellerpaymenttb;
import entitiespkg.Usertb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Ordertb.class)
public class Ordertb_ { 

    public static volatile SingularAttribute<Ordertb, Date> updateDate;
    public static volatile SingularAttribute<Ordertb, Integer> quantity;
    public static volatile CollectionAttribute<Ordertb, Sellerpaymenttb> sellerpaymenttbCollection;
    public static volatile SingularAttribute<Ordertb, Productbasicinfotb> productId;
    public static volatile SingularAttribute<Ordertb, Integer> orderId;
    public static volatile SingularAttribute<Ordertb, Double> totalPrice;
    public static volatile SingularAttribute<Ordertb, Boolean> isactive;
    public static volatile SingularAttribute<Ordertb, Integer> shippingPinCode;
    public static volatile SingularAttribute<Ordertb, Usertb> userName;
    public static volatile SingularAttribute<Ordertb, String> billAddress;
    public static volatile CollectionAttribute<Ordertb, Paymenttb> paymenttbCollection;
    public static volatile SingularAttribute<Ordertb, Double> price;
    public static volatile SingularAttribute<Ordertb, String> shippingAddress;
    public static volatile SingularAttribute<Ordertb, Date> orderDate;
    public static volatile SingularAttribute<Ordertb, String> deliveryStatus;
    public static volatile SingularAttribute<Ordertb, Date> createDate;

}