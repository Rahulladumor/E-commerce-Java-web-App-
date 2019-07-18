package entitiespkg;

import entitiespkg.Ordertb;
import entitiespkg.Paymenttb;
import entitiespkg.Usertb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Sellerpaymenttb.class)
public class Sellerpaymenttb_ { 

    public static volatile SingularAttribute<Sellerpaymenttb, Integer> sellerPaymentId;
    public static volatile SingularAttribute<Sellerpaymenttb, Date> date;
    public static volatile SingularAttribute<Sellerpaymenttb, Double> amount;
    public static volatile SingularAttribute<Sellerpaymenttb, Usertb> sellerUsername;
    public static volatile SingularAttribute<Sellerpaymenttb, Ordertb> orderId;
    public static volatile SingularAttribute<Sellerpaymenttb, Paymenttb> paymentId;

}