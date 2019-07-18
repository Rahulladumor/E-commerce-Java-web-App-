package entitiespkg;

import entitiespkg.Productbasicinfotb;
import entitiespkg.Usertb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Carttb.class)
public class Carttb_ { 

    public static volatile SingularAttribute<Carttb, Date> updateDate;
    public static volatile SingularAttribute<Carttb, Integer> quantity;
    public static volatile SingularAttribute<Carttb, Productbasicinfotb> productId;
    public static volatile SingularAttribute<Carttb, Double> totalPrice;
    public static volatile SingularAttribute<Carttb, Double> price;
    public static volatile SingularAttribute<Carttb, Integer> cartId;
    public static volatile SingularAttribute<Carttb, Boolean> isactive;
    public static volatile SingularAttribute<Carttb, Usertb> userName;
    public static volatile SingularAttribute<Carttb, Date> createDate;

}