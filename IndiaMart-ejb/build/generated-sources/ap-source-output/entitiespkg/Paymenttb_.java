package entitiespkg;

import entitiespkg.Ordertb;
import entitiespkg.Sellerpaymenttb;
import entitiespkg.Usertb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Paymenttb.class)
public class Paymenttb_ { 

    public static volatile SingularAttribute<Paymenttb, Date> updateDate;
    public static volatile SingularAttribute<Paymenttb, Double> totalPayment;
    public static volatile SingularAttribute<Paymenttb, Boolean> transferStatus;
    public static volatile CollectionAttribute<Paymenttb, Sellerpaymenttb> sellerpaymenttbCollection;
    public static volatile SingularAttribute<Paymenttb, Ordertb> orderId;
    public static volatile SingularAttribute<Paymenttb, Integer> paymentId;
    public static volatile SingularAttribute<Paymenttb, Boolean> isactive;
    public static volatile SingularAttribute<Paymenttb, Date> paymentDate;
    public static volatile SingularAttribute<Paymenttb, Usertb> userName;
    public static volatile SingularAttribute<Paymenttb, Date> createDate;

}